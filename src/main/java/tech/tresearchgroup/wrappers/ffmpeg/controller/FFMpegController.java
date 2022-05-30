package tech.tresearchgroup.wrappers.ffmpeg.controller;

import tech.tresearchgroup.wrappers.ffmpeg.model.FFMpegOptions;

import java.util.ArrayList;
import java.util.List;

public class FFMpegController {
    public static List<String> getOptions(FFMpegOptions ffMpegOptions) {
        List<String> optionsList = new ArrayList<>();
        if(ffMpegOptions != null) {
            if(ffMpegOptions.getInput() != null) {
                optionsList.add("-i");
                optionsList.add(ffMpegOptions.getInput());
            }

            //Advanced Audio Options
            if (ffMpegOptions.getATag() != null) {
                optionsList.add("-atag");
                optionsList.add(ffMpegOptions.getATag());
            }
            if (ffMpegOptions.getSampleFmt() != null) {
                optionsList.add("-sample_fmt");
                optionsList.add(ffMpegOptions.getSampleFmt());
            }
            if (ffMpegOptions.getChannelLayout() != null) {
                optionsList.add("-channel_layout");
                optionsList.add(ffMpegOptions.getChannelLayout());
            }
            if (ffMpegOptions.getGuessLayoutMax() != null) {
                optionsList.add("-guess_layout_max");
                optionsList.add(ffMpegOptions.getGuessLayoutMax());
            }
            if (ffMpegOptions.getAbsf() != null) {
                optionsList.add("-absf");
                optionsList.add(ffMpegOptions.getAbsf());
            }
            if (ffMpegOptions.getAPre() != null) {
                optionsList.add("-apre");
                optionsList.add(ffMpegOptions.getAPre());
            }
            
            //Advaned Global Options
            if (ffMpegOptions.getCpuFlags() != null) {
                optionsList.add("-cpuflags");
                optionsList.add(ffMpegOptions.getCpuFlags());
            }
            if (ffMpegOptions.getCpuCount() != null) {
                optionsList.add("-cpucount");
                optionsList.add(ffMpegOptions.getCpuCount());
            }
            if (ffMpegOptions.isHideBanner()) {
                optionsList.add("-hide_banner");
            }
            if (ffMpegOptions.isCopyUnknown()) {
                optionsList.add("-copy_unknown");
            }
            if (ffMpegOptions.isRecastMedia()) {
                optionsList.add("-recast_media");
            }
            if (ffMpegOptions.isBenchmark()) {
                optionsList.add("-benchmark");
            }
            if (ffMpegOptions.isBenchmarkAll()) {
                optionsList.add("-benchmark_all");
            }
            if (ffMpegOptions.getProgressUrl() != null) {
                optionsList.add("-progress");
                optionsList.add(ffMpegOptions.getProgressUrl());
            }
            if (ffMpegOptions.isStdin()) {
                optionsList.add("-stdin");
            }
            if (ffMpegOptions.getTimeLimit() != null) {
                optionsList.add("-timelimit");
                optionsList.add(ffMpegOptions.getTimeLimit());
            }
            if (ffMpegOptions.isDump()) {
                optionsList.add("-dump");
            }
            if (ffMpegOptions.isHex()) {
                optionsList.add("-hex");
            }
            if (ffMpegOptions.isVsync()) {
                optionsList.add("-vsync");
            }
            if (ffMpegOptions.getFrameDropThreshold() != null) {
                optionsList.add("-frame_drop_threshold");
                optionsList.add(ffMpegOptions.getFrameDropThreshold());
            }
            if (ffMpegOptions.isAsync()) {
                optionsList.add("-async");
            }
            if (ffMpegOptions.getAudioDriftThreshold() != null) {
                optionsList.add("-adrift_threshold");
                optionsList.add(ffMpegOptions.getAudioDriftThreshold());
            }
            if (ffMpegOptions.isCopyTimestamps()) {
                optionsList.add("-copyts");
            }
            if (ffMpegOptions.isStartAtZero()) {
                optionsList.add("-start_at_zero");
            }
            if (ffMpegOptions.getCopyTb() != null) {
                optionsList.add("-copytb");
                optionsList.add(ffMpegOptions.getCopyTb());
            }
            if (ffMpegOptions.getDtsDeltaThreshold() != null) {
                optionsList.add("-dts_delta_threshold");
                optionsList.add(ffMpegOptions.getDtsDeltaThreshold());
            }
            if (ffMpegOptions.getDtsErrorThreshold() != null) {
                optionsList.add("-dts_error_threshold");
                optionsList.add(ffMpegOptions.getDtsErrorThreshold());
            }
            if (ffMpegOptions.getXError() != null) {
                optionsList.add("-xerror");
                optionsList.add(ffMpegOptions.getXError());
            }
            if (ffMpegOptions.getAbortOn() != null) {
                optionsList.add("-abort_on");
                optionsList.add(ffMpegOptions.getAbortOn());
            }
            if (ffMpegOptions.getFilterComplex() != null) {
                optionsList.add("-filter_complex");
                optionsList.add(ffMpegOptions.getFilterComplex());
            }
            if (ffMpegOptions.getLavfi() != null) {
                optionsList.add("-lavfi");
                optionsList.add(ffMpegOptions.getLavfi());
            }
            if (ffMpegOptions.getFilterComplexScript() != null) {
                optionsList.add("-filter_complex_script");
                optionsList.add(ffMpegOptions.getFilterComplexScript());
            }
            if (ffMpegOptions.getAutoConversionFilters() != null) {
                optionsList.add("-auto_conversion_filters");
                optionsList.add(ffMpegOptions.getAutoConversionFilters());
            }
            if (ffMpegOptions.getStatsPeriod() != null) {
                optionsList.add("-stats_period");
                optionsList.add(ffMpegOptions.getStatsPeriod());
            }
            if (ffMpegOptions.isDebugTs()) {
                optionsList.add("-debug_ts");
            }
            if (ffMpegOptions.isPsnr()) {
                optionsList.add("-psnr");
            }
            if (ffMpegOptions.isVStats()) {
                optionsList.add("-vstats");
            }
            if (ffMpegOptions.getVStatsFile() != null) {
                optionsList.add("-vstats_file");
                optionsList.add(ffMpegOptions.getVStatsFile());
            }
            if (ffMpegOptions.isVStatsVersion()) {
                optionsList.add("-vstats_version");
            }
            if (ffMpegOptions.isQpHist()) {
                optionsList.add("-qphist");
            }
            if (ffMpegOptions.getSdpFile() != null) {
                optionsList.add("-sdp_file");
                optionsList.add(ffMpegOptions.getSdpFile());
            }
            if (ffMpegOptions.getQsvDevice() != null) {
                optionsList.add("-qsv_device");
                optionsList.add(ffMpegOptions.getQsvDevice());
            }
            if (ffMpegOptions.getInitHwDevice() != null) {
                optionsList.add("-init_hw_device");
                optionsList.add(ffMpegOptions.getInitHwDevice());
            }
            if (ffMpegOptions.getFilterHwDevice() != null) {
                optionsList.add("-filter_hw_device");
                optionsList.add(ffMpegOptions.getFilterHwDevice());
            }
            if (ffMpegOptions.getS() != null) {
                optionsList.add("-s");
                optionsList.add(ffMpegOptions.getS());
            }
            
            //Advaned Per File Options
            if (ffMpegOptions.getMap() != null) {
                optionsList.add("-map");
                optionsList.add(ffMpegOptions.getMap());
            }
            if (ffMpegOptions.getMapChannel() != null) {
                optionsList.add("-map_channel");
                optionsList.add(ffMpegOptions.getMapChannel());
            }
            if (ffMpegOptions.getMapChapters() != null) {
                optionsList.add("-map_chapters");
                optionsList.add(ffMpegOptions.getMapChapters());
            }
            if (ffMpegOptions.isAccurateSeek()) {
                optionsList.add("-accurate_seek");
            }
            if (ffMpegOptions.getItsOffset() != null) {
                optionsList.add("-itsoffset");
                optionsList.add(ffMpegOptions.getItsOffset());
            }
            if (ffMpegOptions.getItsScale() != null) {
                optionsList.add("-itsscale");
                optionsList.add(ffMpegOptions.getItsScale());
            }
            if (ffMpegOptions.getDFrames() != null) {
                optionsList.add("-dframes");
                optionsList.add(ffMpegOptions.getDFrames());
            }
            if (ffMpegOptions.isRe()) {
                optionsList.add("-re");
            }
            if (ffMpegOptions.getReadRate() != null) {
                optionsList.add("-readrate");
                optionsList.add(ffMpegOptions.getReadRate());
            }
            if (ffMpegOptions.isShortest()) {
                optionsList.add("-shortest");
            }
            if (ffMpegOptions.isBitExact()) {
                optionsList.add("-bitexact");
            }
            if (ffMpegOptions.isCopyInkF()) {
                optionsList.add("-copyinkf");
            }
            if (ffMpegOptions.isCopyPriorSS()) {
                optionsList.add("-copypriorss");
            }
            if (ffMpegOptions.getTag() != null) {
                optionsList.add("-tag");
                optionsList.add(ffMpegOptions.getTag());
            }
            if (ffMpegOptions.getQ() != null) {
                optionsList.add("-q");
                optionsList.add(ffMpegOptions.getQ());
            }
            if (ffMpegOptions.getQScale() != null) {
                optionsList.add("-qscale");
                optionsList.add(ffMpegOptions.getQScale());
            }
            if (ffMpegOptions.getProfile() != null) {
                optionsList.add("-profile");
                optionsList.add(ffMpegOptions.getProfile());
            }
            if (ffMpegOptions.getAttach() != null) {
                optionsList.add("-attach");
                optionsList.add(ffMpegOptions.getAttach());
            }
            if (ffMpegOptions.getDumpAttachment() != null) {
                optionsList.add("-dump_attachment");
                optionsList.add(ffMpegOptions.getDumpAttachment());
            }
            if (ffMpegOptions.getStreamLoop() != null) {
                optionsList.add("stream_loop");
                optionsList.add(ffMpegOptions.getStreamLoop());
            }
            if (ffMpegOptions.getThreadQueueSize() != null) {
                optionsList.add("-thread_queue_size");
                optionsList.add(ffMpegOptions.getThreadQueueSize());
            }
            if (ffMpegOptions.getFindStreamInfo() != null) {
                optionsList.add("-find_stream_info");
                optionsList.add(ffMpegOptions.getFindStreamInfo());
            }
            if (ffMpegOptions.getBitsPerRawSample() != null) {
                optionsList.add("-bits_per_raw_sample");
                optionsList.add(ffMpegOptions.getBitsPerRawSample());
            }
            if (ffMpegOptions.isAutoRotate()) {
                optionsList.add("-autorotate");
            }
            if (ffMpegOptions.isAutoScale()) {
                optionsList.add("-autoscale");
            }
            if (ffMpegOptions.getMuxDelay() != null) {
                optionsList.add("-muxdelay");
                optionsList.add(ffMpegOptions.getMuxDelay());
            }
            if (ffMpegOptions.getMuxPreload() != null) {
                optionsList.add("-muxpreload");
                optionsList.add(ffMpegOptions.getMuxPreload());
            }
            if (ffMpegOptions.getTimeBase() != null) {
                optionsList.add("-time_base");
                optionsList.add(ffMpegOptions.getTimeBase());
            }
            if (ffMpegOptions.getEncTimeBase() != null) {
                optionsList.add("-encTimeBase");
                optionsList.add(ffMpegOptions.getEncTimeBase());
            }
            if (ffMpegOptions.getBsf() != null) {
                optionsList.add("-bsf");
                optionsList.add(ffMpegOptions.getBsf());
            }
            if (ffMpegOptions.getFpre() != null) {
                optionsList.add("-fpre");
                optionsList.add(ffMpegOptions.getFpre());
            }
            if (ffMpegOptions.getMaxMuxingQueueSize() != null) {
                optionsList.add("maxMuxingQueueSize");
                optionsList.add(ffMpegOptions.getMaxMuxingQueueSize());
            }
            if (ffMpegOptions.getMuxingQueueDataThreshold() != null) {
                optionsList.add("-muxing_queue_data_threshold");
                optionsList.add(ffMpegOptions.getMuxingQueueDataThreshold());
            }
            if (ffMpegOptions.getDCodec() != null) {
                optionsList.add("-dcodec");
                optionsList.add(ffMpegOptions.getDCodec());
            }
            
            //Advanced Video Options
            if (ffMpegOptions.getPixFmt() != null) {
                optionsList.add("-pix_fmt");
                optionsList.add(ffMpegOptions.getPixFmt());
            }
            if (ffMpegOptions.getRcOverride() != null) {
                optionsList.add("-rc_override");
                optionsList.add(ffMpegOptions.getRcOverride());
            }
            if (ffMpegOptions.getPassLogFile() != null) {
                optionsList.add("-passlogfile");
                optionsList.add(ffMpegOptions.getPassLogFile());
            }
            if (ffMpegOptions.getIntraMatrix() != null) {
                optionsList.add("-intra_matrix");
                optionsList.add(ffMpegOptions.getIntraMatrix());
            }
            if (ffMpegOptions.getChromaIntraMatrix() != null) {
                optionsList.add("-chroma_intra_matrix");
                optionsList.add(ffMpegOptions.getChromaIntraMatrix());
            }
            if (ffMpegOptions.getTop() != null) {
                optionsList.add("-top");
                optionsList.add(ffMpegOptions.getTop());
            }
            if (ffMpegOptions.getVTag() != null) {
                optionsList.add("-vtag");
                optionsList.add(ffMpegOptions.getVTag());
            }
            if (ffMpegOptions.isForceFps()) {
                optionsList.add("-force_fps");
            }
            if (ffMpegOptions.getStreamId() != null) {
                optionsList.add("-streamid");
                optionsList.add(ffMpegOptions.getStreamId());
            }
            if (ffMpegOptions.getForceKeyFrames() != null) {
                optionsList.add("-force_key_frames");
                optionsList.add(ffMpegOptions.getForceKeyFrames());
            }
            if (ffMpegOptions.getHwAccel() != null) {
                optionsList.add("-hwaccel");
                optionsList.add(ffMpegOptions.getHwAccel());
            }
            if (ffMpegOptions.getHwAccelDevice() != null) {
                optionsList.add("-hwaccel_device");
                optionsList.add(ffMpegOptions.getHwAccelDevice());
            }
            if (ffMpegOptions.getHwAccelOutputFormat() != null) {
                optionsList.add("-hwaccel_output_format");
                optionsList.add(ffMpegOptions.getHwAccelOutputFormat());
            }
            if (ffMpegOptions.getVbsf() != null) {
                optionsList.add("-vbsf");
                optionsList.add(ffMpegOptions.getVbsf());
            }
            if (ffMpegOptions.getVPre() != null) {
                optionsList.add("-vpre");
                optionsList.add(ffMpegOptions.getVPre());
            }
            
            //Audio Options
            if (ffMpegOptions.getAFrames() != null) {
                optionsList.add("-aframes");
                optionsList.add(ffMpegOptions.getAFrames());
            }
            if (ffMpegOptions.getAq() != null) {
                optionsList.add("-aq");
                optionsList.add(ffMpegOptions.getAq());
            }
            if (ffMpegOptions.getAr() != null) {
                optionsList.add("-ar");
                optionsList.add(ffMpegOptions.getAr());
            }
            if (ffMpegOptions.getAc() != null) {
                optionsList.add("-ac");
                optionsList.add(ffMpegOptions.getAc());
            }
            if (ffMpegOptions.isAn()) {
                optionsList.add("-an");
            }
            if (ffMpegOptions.getAf() != null) {
                optionsList.add("-af");
                optionsList.add(ffMpegOptions.getAf());
            }
            
            //Global Options
            if (ffMpegOptions.getLogLevel() != null) {
                optionsList.add("-loglevel");
                optionsList.add(ffMpegOptions.getLogLevel());
            }
            if (ffMpegOptions.isGenerateReport()) {
                optionsList.add("-report");
            }
            if (ffMpegOptions.getMaxAlloc() != null) {
                optionsList.add("-max_alloc");
                optionsList.add(ffMpegOptions.getMaxAlloc());
            }
            if (ffMpegOptions.isOverwriteOutput()) {
                optionsList.add("-y");
            }
            if (ffMpegOptions.isIgnoreUnknown()) {
                optionsList.add("-ignore_unknown");
            }
            if (ffMpegOptions.isFilterThreads()) {
                optionsList.add("-filter_threads");
            }
            if (ffMpegOptions.isFilterComplexThreads()) {
                optionsList.add("-filter_complex_threads");
            }
            if (ffMpegOptions.isPrintStats()) {
                optionsList.add("-stats");
            }
            if (ffMpegOptions.getMaxErrorRate() != null) {
                optionsList.add("-max_error_rate");
                optionsList.add(ffMpegOptions.getMaxErrorRate());
            }
            if (ffMpegOptions.getVolume() != null) {
                optionsList.add("-vol");
                optionsList.add(ffMpegOptions.getVolume());
            }
            
            //Information Options
            if (ffMpegOptions.isShowLicense()) {
                optionsList.add("-L");
            }
            if (ffMpegOptions.isShowHelp()) {
                optionsList.add("-h");
            }
            if (ffMpegOptions.isShowVersion()) {
                optionsList.add("-version");
            }
            if (ffMpegOptions.isShowBuildConf()) {
                optionsList.add("-buildconf");
            }
            if (ffMpegOptions.isShowFormats()) {
                optionsList.add("-formats");
            }
            if (ffMpegOptions.isShowMuxers()) {
                optionsList.add("-muxers");
            }
            if (ffMpegOptions.isShowDemuxers()) {
                optionsList.add("-demuxers");
            }
            if (ffMpegOptions.isShowAvailableDevices()) {
                optionsList.add("-devices");
            }
            if (ffMpegOptions.isShowCodecs()) {
                optionsList.add("-codecs");
            }
            if (ffMpegOptions.isShowAvailableBitStreamFilters()) {
                optionsList.add("-bsfs");
            }
            if (ffMpegOptions.isShowProtocols()) {
                optionsList.add("-protocols");
            }
            if (ffMpegOptions.isShowFilters()) {
                optionsList.add("-filters");
            }
            if (ffMpegOptions.isShowPixelFormats()) {
                optionsList.add("-pix_fmts");
            }
            if (ffMpegOptions.isShowChannelLayouts()) {
                optionsList.add("-layouts");
            }
            if (ffMpegOptions.isShowAudioFormats()) {
                optionsList.add("-sample_fmts");
            }
            if (ffMpegOptions.isShowDispositions()) {
                optionsList.add("-dispositions");
            }
            if (ffMpegOptions.isShowColors()) {
                optionsList.add("-colors");
            }
            if (ffMpegOptions.getInputDeviceSources() != null) {
                optionsList.add("-sources");
                optionsList.add(ffMpegOptions.getInputDeviceSources());
            }
            if (ffMpegOptions.getOutputDeviceSinks() != null) {
                optionsList.add("-sinks");
                optionsList.add(ffMpegOptions.getOutputDeviceSinks());
            }
            if (ffMpegOptions.isShowHardwareAccelerators()) {
                optionsList.add("-hwaccels");
            }

            //Per File Options
            if (ffMpegOptions.getForceFormat() != null) {
                optionsList.add("-f");
                optionsList.add(ffMpegOptions.getForceFormat());
            }
            if (ffMpegOptions.getCodecName() != null) {
                optionsList.add("-c");
                optionsList.add(ffMpegOptions.getCodecName());
            }
            if (ffMpegOptions.getPre() != null) {
                optionsList.add("-map_metadata");
                optionsList.add(ffMpegOptions.getMapMetadata());
            }
            if (ffMpegOptions.getT() != null) {
                optionsList.add("-t");
                optionsList.add(ffMpegOptions.getT());
            }
            if (ffMpegOptions.getTo() != null) {
                optionsList.add("-to");
                optionsList.add(ffMpegOptions.getTo());
            }
            if (ffMpegOptions.getFs() != null) {
                optionsList.add("-fs");
                optionsList.add(ffMpegOptions.getFs());
            }
            if (ffMpegOptions.getSs() != null) {
                optionsList.add("-ss");
                optionsList.add(ffMpegOptions.getSs());
            }
            if (ffMpegOptions.getSseof() != null) {
                optionsList.add("-seeof");
                optionsList.add(ffMpegOptions.getSseof());
            }
            if (ffMpegOptions.getSeekTimestamp() != null) {
                optionsList.add("-seek_timestamp");
                optionsList.add(ffMpegOptions.getSeekTimestamp());
            }
            if (ffMpegOptions.getTimestamp() != null) {
                optionsList.add("-timestamp");
                optionsList.add(ffMpegOptions.getTimestamp());
            }
            if (ffMpegOptions.getMetadata() != null) {
                optionsList.add("-metadata");
                optionsList.add(ffMpegOptions.getMetadata());
            }
            if (ffMpegOptions.getProgram() != null) {
                optionsList.add("-program");
                optionsList.add(ffMpegOptions.getProgram());
            }
            if (ffMpegOptions.getTarget() != null) {
                optionsList.add("-target");
                optionsList.add(ffMpegOptions.getTarget());
            }
            if (ffMpegOptions.isApad()) {
                optionsList.add("-apad");
            }
            if (ffMpegOptions.getFrames() != null) {
                optionsList.add("-frames");
                optionsList.add(ffMpegOptions.getFrames());
            }
            if (ffMpegOptions.getFilter() != null) {
                optionsList.add("-filter");
                optionsList.add(ffMpegOptions.getFilter());
            }
            if (ffMpegOptions.getFilterScript() != null) {
                optionsList.add("-filter_script");
                optionsList.add(ffMpegOptions.getFilterScript());
            }
            if (ffMpegOptions.isReinitFilter()) {
                optionsList.add("-reint_filter");
            }
            if (ffMpegOptions.isDiscard()) {
                optionsList.add("-discard");
            }
            if (ffMpegOptions.isDisposition()) {
                optionsList.add("-disposition");
            }
            
            //Subtitle Options
            if (ffMpegOptions.getSn() != null) {
                optionsList.add("-sn");
                optionsList.add(ffMpegOptions.getSn());
            }
            if (ffMpegOptions.getSCodec() != null) {
                optionsList.add("-scodec");
                optionsList.add(ffMpegOptions.getSCodec());
            }
            if (ffMpegOptions.getSTag() != null) {
                optionsList.add("-stag");
                optionsList.add(ffMpegOptions.getSTag());
            }
            if (ffMpegOptions.getFixSubDuration() != null) {
                optionsList.add("-fix_sub_duration");
                optionsList.add(ffMpegOptions.getFixSubDuration());
            }
            if (ffMpegOptions.getCanvasSize() != null) {
                optionsList.add("-canvas_size");
                optionsList.add(ffMpegOptions.getCanvasSize());
            }
            if (ffMpegOptions.getSPre() != null) {
                optionsList.add("-spre");
                optionsList.add(ffMpegOptions.getSPre());
            }

            //Video Options
            if (ffMpegOptions.getVFrames() != null) {
                optionsList.add("-vframes");
                optionsList.add(ffMpegOptions.getVFrames());
            }
            if (ffMpegOptions.getR() != null) {
                optionsList.add("-r");
                optionsList.add(ffMpegOptions.getR());
            }
            if (ffMpegOptions.getFpsMax() != null) {
                optionsList.add("-fpsmax");
                optionsList.add(ffMpegOptions.getFpsMax());
            }
            if (ffMpegOptions.getAspect() != null) {
                optionsList.add("-aspect");
                optionsList.add(ffMpegOptions.getAspect());
            }
            if (ffMpegOptions.isVn()) {
                optionsList.add("-vn");
            }
            if (ffMpegOptions.getVCodec() != null) {
                optionsList.add("-vcodec");
                optionsList.add(ffMpegOptions.getVCodec());
            }
            if (ffMpegOptions.getTimeCode() != null) {
                optionsList.add("-timecode");
                optionsList.add(ffMpegOptions.getTimeCode());
            }
            if (ffMpegOptions.getPass() != null) {
                optionsList.add("-pass");
                optionsList.add(ffMpegOptions.getPass());
            }
            if (ffMpegOptions.getVf() != null) {
                optionsList.add("-vf");
                optionsList.add(ffMpegOptions.getVf());
            }
            if (ffMpegOptions.getAb() != null) {
                optionsList.add("-ab");
                optionsList.add(ffMpegOptions.getAb());
            }
            if (ffMpegOptions.getB() != null) {
                optionsList.add("-b");
                optionsList.add(ffMpegOptions.getB());
            }
            if (ffMpegOptions.isDn()) {
                optionsList.add("-dn");
            }
        }
        return optionsList;
    }
}
