package ca.tresearchgroup.ffmpeg.view.options;

import lombok.Data;
import picocli.CommandLine;

@Data
public class GlobalOptions {
    @CommandLine.Option(names = {"-loglevel", "-v"}, description = "Set logging level")
    private String logLevel;

    @CommandLine.Option(names = "-report", description = "Generate a report")
    private boolean generateReport;

    @CommandLine.Option(names = "-max_alloc", description = "Set maximum size of a single allocated block")
    private String maxAlloc;

    @CommandLine.Option(names = "-y", description = "Overwrite output files")
    private boolean overwriteOutput;

    @CommandLine.Option(names = "-ignore_unknown", description = "Ignore unknown stream types")
    private boolean ignoreUnknown;

    @CommandLine.Option(names = "-filter_threads", description = "Number of non-complex filter threads")
    private boolean filterThreads;

    @CommandLine.Option(names = "-filter_complex_threads", description = "Number of threads for -filter_complex")
    private boolean showLicense;

    @CommandLine.Option(names = "-stats", description = "Print progress report during encoding")
    private boolean printStats;

    @CommandLine.Option(names = "-max_error_rate", description = "Maximum error rate ratio of decoding errors")
    private String maxErrorRate;

    @CommandLine.Option(names = "-vol", description = "Change audio volume")
    private String volume;
}
