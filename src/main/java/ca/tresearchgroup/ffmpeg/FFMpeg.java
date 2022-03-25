package ca.tresearchgroup.ffmpeg;

import ca.tresearchgroup.ffmpeg.controller.*;
import ca.tresearchgroup.ffmpeg.model.*;
import picocli.CommandLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "ffmpeg",
        version = "1.0",
        mixinStandardHelpOptions = true,
        description = "TRG FFMpeg wrapper")
public class FFMpeg implements Callable<Integer> {
    @CommandLine.Parameters(index = "0")
    private String file;

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
        List<String> options = new ArrayList<>();
        options.add("ffmpeg");
        options.addAll(AdvancedAudioController.getOptions(advancedAudioOptions));
        options.addAll(AdvancedGlobalController.getOptions(advancedGlobalOptions));
        options.addAll(AdvancedPerFileController.getOptions(advancedPerFileOptions));
        options.addAll(AdvancedVideoController.getOptions(advancedVideoOptions));
        options.addAll(AudioController.getOptions(audioOptions));
        options.addAll(GlobalController.getOptions(globalOptions));
        options.addAll(InformationController.getOptions(informationOptions));
        options.addAll(PerFileController.getOptions(perFileOptions));
        options.addAll(SubtitleController.getOptions(subtitleOptions));
        options.addAll(VideoController.getOptions(videoOptions));
        options.add(file);
        return execute(options);
    }

    public static int execute(List<String> options) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(options);
        System.out.println(options);
        try {
            Process process = processBuilder.start();
            String line;
            /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
             */
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                System.out.println(line);
            }
            errorReader.close();
            return process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void main(String[] args) {
        if(args.length > 0) {
            int exitCode = new CommandLine(new FFMpeg()).execute(args);
            System.exit(exitCode);
        }
        List<String> options = new ArrayList<>();
        options.add("ffmpeg");
        GlobalOptions globalOptions = new GlobalOptions();
        globalOptions.setInput("test.mp4");
        VideoOptions videoOptions = new VideoOptions();
        videoOptions.setVCodec("h264");
        options.addAll(VideoController.getOptions(videoOptions));
        options.addAll(GlobalController.getOptions(globalOptions));
        String file = "output.mp4";
        options.add(file);
        execute(options);
    }
}
