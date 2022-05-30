package tech.tresearchgroup.wrappers.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class AdvancedGlobalOptions {
    @CommandLine.Option(names = "-cpuflags", description = "Force specific cpu flags")
    private String cpuFlags;

    @CommandLine.Option(names = "-cpucount", description = "Force specific cpu count")
    private String cpuCount;

    @CommandLine.Option(names = "-hide_banner", description = "Do not show program banner")
    private boolean hideBanner;

    @CommandLine.Option(names = "-copy_unknown", description = "Copy unknown stream types")
    private boolean copyUnknown;

    @CommandLine.Option(names = "-recast_media", description = "Allow recasting stream type in order to force a decoder of different media type")
    private boolean recastMedia;

    @CommandLine.Option(names = "-benchmark", description = "Add timings for benchmarking")
    private boolean benchmark;

    @CommandLine.Option(names = "-benchmark_all", description = "Add timings for each task")
    private boolean benchmarkAll;

    @CommandLine.Option(names = "-progress", description = "Write program-readable progress information")
    private String progressUrl;

    @CommandLine.Option(names = "-stdin", description = "Enable or disable interaction on standard input")
    private boolean stdin;

    @CommandLine.Option(names = "-timelimit", description = "Set max runtime in seconds in CPU user time")
    private String timeLimit;

    @CommandLine.Option(names = "-dump", description = "Dump each input packet")
    private boolean dump;

    @CommandLine.Option(names = "-hex", description = "When dumping packets, also dump the payload")
    private boolean hex;

    @CommandLine.Option(names = "-vsync", description = "Video sync method")
    private boolean vsync;

    @CommandLine.Option(names = "-frame_drop_threshold", description = "Frame drop threshold")
    private String frameDropThreshold;

    @CommandLine.Option(names = "-async", description = "Audio sync method")
    private boolean async;

    @CommandLine.Option(names = "-adrift_threshold", description = "Audio drift threshold")
    private String audioDriftThreshold;

    @CommandLine.Option(names = "-copyts", description = "Copy timestamps")
    private boolean copyTimestamps;

    @CommandLine.Option(names = "-start_at_zero", description = "Shift input timestamps to start at 0 when using copyts")
    private boolean startAtZero;

    @CommandLine.Option(names = "-copytb", description = "Copy input stream time base when stream copying")
    private String copyTb;

    @CommandLine.Option(names = "-dts_delta_threshold", description = "Timestamp discontinuity delta threshold")
    private String dtsDeltaThreshold;

    @CommandLine.Option(names = "-dts_error_threshold", description = "Timestamp error delta threshold")
    private String dtsErrorThreshold;

    @CommandLine.Option(names = "-xerror", description = "Exit on error")
    private String xError;

    @CommandLine.Option(names = "-abort_on", description = "Abort on the specified condition flags")
    private String abortOn;

    @CommandLine.Option(names = "-filter_complex", description = "Create a complex filter graph")
    private String filterComplex;

    @CommandLine.Option(names = "-lavfi", description = "Create a complex filter graph")
    private String lavfi;

    @CommandLine.Option(names = "-filter_complex_script", description = "Read complex filter graph description from a file")
    private String filterComplexScript;

    @CommandLine.Option(names = "-auto_conversion_filters", description = "Enable automatic conversion filters globally")
    private String autoConversionFilters;

    @CommandLine.Option(names = "-stats_period", description = "Set the period at which ffmpeg updates stats and -progress output")
    private String statsPeriod;

    @CommandLine.Option(names = "-debug_ts", description = "Print timestamp debugging info")
    private boolean debugTs;

    @CommandLine.Option(names = "-psnr", description = "Calculate PSNR of compressed frames")
    private boolean psnr;

    @CommandLine.Option(names = "-vstats", description = "Dump video coding statistics file")
    private boolean vStats;

    @CommandLine.Option(names = "-vstats_file", description = "Dump video coding statistics to file")
    private String vStatsFile;

    @CommandLine.Option(names = "-vstats_version", description = "Version of the vstats format to use")
    private boolean vStatsVersion;

    @CommandLine.Option(names = "-qphist", description = "Show QP histogram")
    private boolean qpHist;

    @CommandLine.Option(names = "-sdp_file", description = "Specify a file in which to print sdp information")
    private String sdpFile;

    @CommandLine.Option(names = "-qsv_device", description = "Set QSV hardware device")
    private String qsvDevice;

    @CommandLine.Option(names = "-init_hw_device", description = "Initialise hardware device")
    private String initHwDevice;

    @CommandLine.Option(names = "-filter_hw_device", description = "Set hardware device used when filtering")
    private String filterHwDevice;

    @CommandLine.Option(names = "-s", description = "Set frame size (WxH or abbreviation")
    private String s;
}
