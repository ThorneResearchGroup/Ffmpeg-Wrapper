package ca.tresearchgroup.ffmpeg.view;

import ca.tresearchgroup.ffmpeg.view.options.*;
import picocli.CommandLine;

import java.io.File;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "ffmpeg",
        version = "1.0",
        mixinStandardHelpOptions = true,
        description = "TRG FFMpeg wrapper")
public class FFMpeg implements Callable<Integer> {
    @CommandLine.Parameters(index = "0")
    private File file;

    @CommandLine.ArgGroup
    private InformationOptions informationOptions;

    @CommandLine.ArgGroup
    private GlobalOptions globalOptions;

    @CommandLine.ArgGroup
    private AdvancedGlobalOptions advancedGlobalOptions;

    @CommandLine.ArgGroup
    private PerFileOptions perFileOptions;

    @CommandLine.ArgGroup
    private AdvancedPerFileOptions advancedPerFileOptions;

    @CommandLine.ArgGroup
    private VideoOptions videoOptions;

    @CommandLine.ArgGroup
    private AdvancedVideoOptions advancedVideoOptions;

    @CommandLine.ArgGroup
    private AudioOptions audioOptions;

    @CommandLine.ArgGroup
    private AdvancedAudioOptions advancedAudioOptions;

    @CommandLine.ArgGroup
    private SubtitleOptions subtitleOptions;

    @Override
    public Integer call() {
        return 0;
    }
}
