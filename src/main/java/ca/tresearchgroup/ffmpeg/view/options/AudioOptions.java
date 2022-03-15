package ca.tresearchgroup.ffmpeg.view.options;

import lombok.Data;
import picocli.CommandLine;

@Data
public class AudioOptions {
    @CommandLine.Option(names = "-aframes", description = "Set the number of audio frames to output")
    private String aFrames;

    @CommandLine.Option(names = "-aq", description = "Set the audio quality (codec specific)")
    private String aq;

    @CommandLine.Option(names = "-ar", description = "Set audio sampling rate (in Hz)")
    private String ar;

    @CommandLine.Option(names = "-ac", description = "Set number of audio channels")
    private String ac;

    @CommandLine.Option(names = "-an", description = "Disable audio")
    private String an;

    @CommandLine.Option(names = "-acodec", description = "Force audio codec")
    private String acodec;

    @CommandLine.Option(names = "-vol", description = "Change audio volume (256 = normal)")
    private String vol;

    @CommandLine.Option(names = "-af", description = "Set audio filters")
    private String af;
}
