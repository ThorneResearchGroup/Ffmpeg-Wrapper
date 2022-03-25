package ca.tresearchgroup.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class AdvancedAudioOptions {
    @CommandLine.Option(names = "-atag", description = "Force audio tag / fourcc")
    private String aTag;

    @CommandLine.Option(names = "-sample_fmt", description = "Set sample format")
    private String sampleFmt;

    @CommandLine.Option(names = "-channel_layout", description = "Set channel layout")
    private String channelLayout;

    @CommandLine.Option(names = "-guess_layout_max", description = "Set the maximum number of channels to try to guess the channel layout")
    private String guessLayoutMax;

    @CommandLine.Option(names = "-absf", description = "Bitstream filters")
    private String absf;

    @CommandLine.Option(names = "-apre", description = "Set the audio options to the indicated preset")
    private String aPre;
}
