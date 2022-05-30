package tech.tresearchgroup.wrappers.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class InformationOptions {
    @CommandLine.Option(names = "-L", description = "Show license")
    private boolean showLicense;

    @CommandLine.Option(names = {"-h", "-?", "-help", "--help"}, description = "Show help")
    private boolean showHelp;

    @CommandLine.Option(names = "-version", description = "Show version")
    private boolean showVersion;

    @CommandLine.Option(names = "-buildconf", description = "Show build configuration")
    private boolean showBuildConf;

    @CommandLine.Option(names = "-formats", description = "Show available formats")
    private boolean showFormats;

    @CommandLine.Option(names = "-muxers", description = "Show available muxers")
    private boolean showMuxers;

    @CommandLine.Option(names = "-demuxers", description = "Show available demuxers")
    private boolean showDemuxers;

    @CommandLine.Option(names = "-devices", description = "Show available devices")
    private boolean showAvailableDevices;

    @CommandLine.Option(names = "-codecs", description = "Show available codecs")
    private boolean showCodecs;

    @CommandLine.Option(names = "-decoders", description = "Show available decoders")
    private boolean showDecoders;

    @CommandLine.Option(names = "-encoders", description = "Show available encoders")
    private boolean showEncoders;

    @CommandLine.Option(names = "-bsfs", description = "Show available bit stream filters")
    private boolean showAvailableBitStreamFilters;

    @CommandLine.Option(names = "-protocols", description = "Show available protocols")
    private boolean showProtocols;

    @CommandLine.Option(names = "-filters", description = "Show available filters")
    private boolean showFilters;

    @CommandLine.Option(names = "-pix_fmts", description = "Show available pixel formats")
    private boolean showPixelFormats;

    @CommandLine.Option(names = "-layouts", description = "Show standard channel layouts")
    private boolean showChannelLayouts;

    @CommandLine.Option(names = "-sample_fmts", description = "Show available audio sample formats")
    private boolean showAudioFormats;

    @CommandLine.Option(names = "-dispositions", description = "Show available stream dispositions")
    private boolean showDispositions;

    @CommandLine.Option(names = "-colors", description = "Show available color names")
    private boolean showColors;

    @CommandLine.Option(names = "-sources", description = "List sources of the input device")
    private String inputDeviceSources;

    @CommandLine.Option(names = "-sinks", description = "List sinks of the output device")
    private String outputDeviceSinks;

    @CommandLine.Option(names = "-hwaccels", description = "Show available hardware acceleration methods")
    private boolean showHardwareAccelerators;
}
