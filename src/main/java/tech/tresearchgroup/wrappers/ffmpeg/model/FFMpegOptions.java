package tech.tresearchgroup.wrappers.ffmpeg.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class FFMpegOptions {
    //Advanced Audio Options
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

    //Advanced Global Options
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

    //Advaned Per File Options
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

    //Advaned Video Options
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

    //Audio Options
    @CommandLine.Option(names = "-aframes", description = "Set the number of audio frames to output")
    private String aFrames;

    @CommandLine.Option(names = "-aq", description = "Set the audio quality (codec specific)")
    private String aq;

    @CommandLine.Option(names = "-ar", description = "Set audio sampling rate (in Hz)")
    private String ar;

    @CommandLine.Option(names = "-ac", description = "Set number of audio channels")
    private String ac;

    @CommandLine.Option(names = "-an", description = "Disable audio")
    private boolean an;

    @CommandLine.Option(names = "-acodec", description = "Force audio codec")
    private String acodec;

    @CommandLine.Option(names = "-af", description = "Set audio filters")
    private String af;

    //Global Options
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
    private boolean filterComplexThreads;

    @CommandLine.Option(names = "-stats", description = "Print progress report during encoding")
    private boolean printStats;

    @CommandLine.Option(names = "-max_error_rate", description = "Maximum error rate ratio of decoding errors")
    private String maxErrorRate;

    @CommandLine.Option(names = "-vol", description = "Change audio volume")
    private String volume;

    @CommandLine.Option(names = "-i", description = "Set input file")
    private String input;

    //Information Options
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

    //Per File Options
    @CommandLine.Option(names = "-f", description = "Force format")
    private String forceFormat;

    @CommandLine.Option(names = {"-c", "-codec"}, description = "Codec name")
    private String codecName;

    @CommandLine.Option(names = "-pre", description = "Preset name")
    private String pre;

    @CommandLine.Option(names = "-map_metadata", description = "Set metadata information of out file from in file")
    private String mapMetadata;

    @CommandLine.Option(names = "-t", description = "Record or transcode duration seconds of audio / video")
    private String t;

    @CommandLine.Option(names = "-to", description = "Record or transcode stop time")
    private String to;

    @CommandLine.Option(names = "-fs", description = "Set the limit file size in bytes")
    private String fs;

    @CommandLine.Option(names = "-ss", description = "Set the start time offset")
    private String ss;

    @CommandLine.Option(names = "-sseof", description = "Set the start time offset relative to EOF")
    private String sseof;

    @CommandLine.Option(names = "-seek_timestamp", description = "Enable / disable seeking by timestamp with -ss")
    private String seekTimestamp;

    @CommandLine.Option(names = "-timestamp", description = "Set the recording timestamp")
    private String timestamp;

    @CommandLine.Option(names = "-metadata", description = "Add metadata")
    private String metadata;

    @CommandLine.Option(names = "-program", description = "Add program with specified streams")
    private String program;

    @CommandLine.Option(names = "-target", description = "Specify target file type")
    private String target;

    @CommandLine.Option(names = "-apad", description = "Audio pad")
    private boolean apad;

    @CommandLine.Option(names = "-frames", description = "Set the number of frames to output")
    private String frames;

    @CommandLine.Option(names = "-filter", description = "Set stream filter graph")
    private String filter;

    @CommandLine.Option(names = "-filter_script", description = "Read stream filter graph description from a file")
    private String filterScript;

    @CommandLine.Option(names = "-reinit_filter", description = "Reinit filter graph on input parameter changes")
    private boolean reinitFilter;

    @CommandLine.Option(names = "-discard", description = "Discard")
    private boolean discard;

    @CommandLine.Option(names = "-disposition", description = "Disposition")
    private boolean disposition;

    //Subtitle Options
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

    //Video Options
    @CommandLine.Option(names = "-vframes", description = "Set the number of video frames to output")
    private String vFrames;

    @CommandLine.Option(names = "-r", description = "Set frame rate (Hz value, fraction or abbreviation)")
    private String r;

    @CommandLine.Option(names = "-fpsmax", description = "Set max frame rate (Hz value, fraction or abbreviation)")
    private String fpsMax;

    @CommandLine.Option(names = "-aspect", description = "Set aspect ratio")
    private String aspect;

    @CommandLine.Option(names = "-vn", description = "Disable video")
    private boolean vn;

    @CommandLine.Option(names = "-vcodec", description = "Force video codec")
    private String vCodec;

    @CommandLine.Option(names = "-timecode", description = "Set initial timecode value")
    private String timeCode;

    @CommandLine.Option(names = "-pass", description = "Select the pass number (1 to 3)")
    private String pass;

    @CommandLine.Option(names = "-vf", description = "Set video filters")
    private String vf;

    @CommandLine.Option(names = "-ab", description = "Audio bitrate")
    private String ab;

    @CommandLine.Option(names = "-b", description = "Video bitrate")
    private String b;

    @CommandLine.Option(names = "-dn", description = "Disable data")
    private boolean dn;
}
