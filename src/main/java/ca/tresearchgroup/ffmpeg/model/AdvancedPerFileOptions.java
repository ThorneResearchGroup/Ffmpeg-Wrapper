package ca.tresearchgroup.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class AdvancedPerFileOptions {
    @CommandLine.Option(names = "-map", description = "Set input stream mapping")
    private String map;

    @CommandLine.Option(names = "-map_channel", description = "Map an audio channel from one stream to another")
    private String mapChannel;

    @CommandLine.Option(names = "-map_chapters", description = "Set chapters mapping")
    private String mapChapters;

    @CommandLine.Option(names = "-accurate_seek", description = "Enable / disable accurate seeking with -ss")
    private boolean accurateSeek;

    @CommandLine.Option(names = "-itsoffset", description = "Set the input ts offset")
    private String itsOffset;

    @CommandLine.Option(names = "-itsscale", description = "Set the input ts scale")
    private String itsScale;

    @CommandLine.Option(names = "-dframes", description = "Set the number of data frames to output")
    private String dFrames;

    @CommandLine.Option(names = "-re", description = "Read input at native frame rate")
    private boolean re;

    @CommandLine.Option(names = "-readrate", description = "Read input at specified rate")
    private String readRate;

    @CommandLine.Option(names = "-shortest", description = "Finish encoding within shortest input")
    private boolean shortest;

    @CommandLine.Option(names = "-bitexact", description = "Bitexact mode")
    private boolean bitExact;

    @CommandLine.Option(names = "-copyinkf", description = "Copy initial non-keyframes")
    private boolean copyInkF;

    @CommandLine.Option(names = "-copypriorss", description = "Copy or discard frames before start time")
    private boolean copyPriorSS;

    @CommandLine.Option(names = "-tag", description = "Force codec tag / fourcc")
    private String tag;

    @CommandLine.Option(names = "-q", description = "Used fixed quaity scale (VBR)")
    private String q;

    @CommandLine.Option(names = "-qscale", description = "Use fixed quality scale (VBR)")
    private String qScale;

    @CommandLine.Option(names = "-profile", description = "Set profile")
    private String profile;

    @CommandLine.Option(names = "-attach", description = "Add an attachment to the output file")
    private String attach;

    @CommandLine.Option(names = "-dump_attachment", description = "Extract an attachment into a file")
    private String dumpAttachment;

    @CommandLine.Option(names = "-stream_loop", description = "Set number of times input stream shall be looped")
    private String streamLoop;

    @CommandLine.Option(names = "-thread_queue_size", description = "Set the maximum number of queued packets from the demuxer")
    private String threadQueueSize;

    @CommandLine.Option(names = "-find_stream_info", description = "Read and decode the streams to fill missing information with heuristics")
    private String findStreamInfo;

    @CommandLine.Option(names = "-bits_per_raw_sample", description = "Set the number of bits per raw sample")
    private String bitsPerRawSample;

    @CommandLine.Option(names = "-autorotate", description = "Automatically insert correct rotate filters")
    private boolean autoRotate;

    @CommandLine.Option(names = "-autoscale", description = "Automatically insert a scale filter at the end of the filter graph")
    private boolean autoScale;

    @CommandLine.Option(names = "-muxdelay", description = "Set the maximum demux-decode delay")
    private String muxDelay;

    @CommandLine.Option(names = "-muxpreload", description = "Set the initial demux-decode delay")
    private String muxPreload;

    @CommandLine.Option(names = "-time_base", description = "Set the desired time base hint for output stream")
    private String timeBase;

    @CommandLine.Option(names = "-encTimeBase", description = "Set the desired tiem base for the encoder")
    private String encTimeBase;

    @CommandLine.Option(names = "-bsf", description = "A comma-seperate list of bitstream filters")
    private String bsf;

    @CommandLine.Option(names = "-fpre", description = "Set options from indicated preset file")
    private String fpre;

    @CommandLine.Option(names = "-maxMuxingQueueSize", description = "Maximum number of packets that can be buffered while waiting for all streams to initialise")
    private String maxMuxingQueueSize;

    @CommandLine.Option(names = "-muxing_queue_data_threshold", description = "Set the threshold after which max_muxing_queue_size is taken into account")
    private String muxingQueueDataThreshold;

    @CommandLine.Option(names = "-dcodec", description = "Force data codec")
    private String dCodec;
}
