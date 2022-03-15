package ca.tresearchgroup.ffmpeg.view.options;

import lombok.Data;
import picocli.CommandLine;

@Data
public class SubtitleOptions {
    @CommandLine.Option(names = "-s", description = "Set frame size (WxH or abbreviation")
    private String s;

    @CommandLine.Option(names = "-sn", description = "Disable subtitle")
    private String sn;

    @CommandLine.Option(names = "-scodec", description = "Force subtitle codec")
    private String sCodec;

    @CommandLine.Option(names = "-stag", description = "Force subtitle tag / fourcc")
    private String sTag;

    @CommandLine.Option(names = "-fix_sub_duration", description = "Fix subtitle duration")
    private String fixSubDuration;

    @CommandLine.Option(names = "-canvas_size", description = "Set canvas size (WxH or abbreviation)")
    private String canvasSize;

    @CommandLine.Option(names = "-spre", description = "Set the subtitle options to the indicated preset")
    private String sPre;
}
