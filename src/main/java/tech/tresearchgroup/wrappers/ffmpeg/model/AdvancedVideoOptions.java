package tech.tresearchgroup.wrappers.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class AdvancedVideoOptions {
    @CommandLine.Option(names = "-pix_fmt", description = "Set pixel format")
    private String pixFmt;

    @CommandLine.Option(names = "-rc_override", description = "Rate control override for specific intervals")
    private String rcOverride;

    @CommandLine.Option(names = "-passlogfile", description = "Select two pass log file name prefix")
    private String passLogFile;

    @CommandLine.Option(names = "-intra_matrix", description = "Specify inter matrix coefficients")
    private String intraMatrix;

    @CommandLine.Option(names = "-chroma_intra_matrix", description = "Specify intra matrix coefficients")
    private String chromaIntraMatrix;

    @CommandLine.Option(names = "-top", description = "Field first")
    private String top;

    @CommandLine.Option(names = "-vtag", description = "force video tag / fourcc")
    private String vTag;

    @CommandLine.Option(names = "-force_fps", description = "Force the selected framerate, disable the best supported framerate selection")
    private boolean forceFps;

    @CommandLine.Option(names = "-streamid", description = "Set the value of an out file stream id")
    private String streamId;

    @CommandLine.Option(names = "-force_key_frames", description = "Force key frames at specified timestamps")
    private String forceKeyFrames;

    @CommandLine.Option(names = "-hwaccel", description = "Select a device for hardware acceleration")
    private String hwAccel;

    @CommandLine.Option(names = "-hwaccel_device", description = "Select a device for hardware acceleration")
    private String hwAccelDevice;

    @CommandLine.Option(names = "-hwaccel_output_format", description = "Select output format used with hardware accelerated decoding")
    private String hwAccelOutputFormat;

    @Deprecated
    @CommandLine.Option(names = "-vbsf", description = "Bitstream filters")
    private String vbsf;

    @CommandLine.Option(names = "-vpre", description = "Set the video options to the indicated preset")
    private String vPre;
}
