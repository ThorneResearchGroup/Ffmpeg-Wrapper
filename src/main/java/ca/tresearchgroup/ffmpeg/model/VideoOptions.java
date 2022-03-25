package ca.tresearchgroup.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class VideoOptions {
    @CommandLine.Option(names = "-vframes", description = "Set the number of video frames to output")
    private String vFrames;

    @CommandLine.Option(names = "-r", description = "Set frame rate (Hz value, fraction or abbreviation)")
    private String r;

    @CommandLine.Option(names = "-fpsmax", description = "Set max frame rate (Hz value, fraction or abbreviation)")
    private String fpsMax;

    @CommandLine.Option(names = "-aspect", description = "Set aspect ratio")
    private String aspect;

    @CommandLine.Option(names = "-vn", description = "Disable video")
    private boolean vn;

    @CommandLine.Option(names = "-vcodec", description = "Force video codec")
    private String vCodec;

    @CommandLine.Option(names = "-timecode", description = "Set initial timecode value")
    private String timeCode;

    @CommandLine.Option(names = "-pass", description = "Select the pass number (1 to 3)")
    private String pass;

    @CommandLine.Option(names = "-vf", description = "Set video filters")
    private String vf;

    @CommandLine.Option(names = "-ab", description = "Audio bitrate")
    private String ab;

    @CommandLine.Option(names = "-b", description = "Video bitrate")
    private String b;

    @CommandLine.Option(names = "-dn", description = "Disable data")
    private boolean dn;
}
