package ca.tresearchgroup.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class PerFileOptions {
    @CommandLine.Option(names = "-f", description = "Force format")
    private String forceFormat;

    @CommandLine.Option(names = {"-c", "-codec"}, description = "Codec name")
    private String codecName;

    @CommandLine.Option(names = "-pre", description = "Preset name")
    private String pre;

    @CommandLine.Option(names = "-map_metadata", description = "Set metadata information of out file from in file")
    private String mapMetadata;

    @CommandLine.Option(names = "-t", description = "Record or transcode duration seconds of audio / video")
    private String t;

    @CommandLine.Option(names = "-to", description = "Record or transcode stop time")
    private String to;

    @CommandLine.Option(names = "-fs", description = "Set the limit file size in bytes")
    private String fs;

    @CommandLine.Option(names = "-ss", description = "Set the start time offset")
    private String ss;

    @CommandLine.Option(names = "-sseof", description = "Set the start time offset relative to EOF")
    private String sseof;

    @CommandLine.Option(names = "-seek_timestamp", description = "Enable / disable seeking by timestamp with -ss")
    private String seekTimestamp;

    @CommandLine.Option(names = "-timestamp", description = "Set the recording timestamp")
    private String timestamp;

    @CommandLine.Option(names = "-metadata", description = "Add metadata")
    private String metadata;

    @CommandLine.Option(names = "-program", description = "Add program with specified streams")
    private String program;

    @CommandLine.Option(names = "-target", description = "Specify target file type")
    private String target;

    @CommandLine.Option(names = "-apad", description = "Audio pad")
    private boolean apad;

    @CommandLine.Option(names = "-frames", description = "Set the number of frames to output")
    private String frames;

    @CommandLine.Option(names = "-filter", description = "Set stream filter graph")
    private String filter;

    @CommandLine.Option(names = "-filter_script", description = "Read stream filter graph description from a file")
    private String filterScript;

    @CommandLine.Option(names = "-reinit_filter", description = "Reinit filter graph on input parameter changes")
    private boolean reinitFilter;

    @CommandLine.Option(names = "-discard", description = "Discard")
    private boolean discard;

    @CommandLine.Option(names = "-disposition", description = "Disposition")
    private boolean disposition;
}
