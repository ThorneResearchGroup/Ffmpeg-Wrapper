package tech.tresearchgroup.wrappers.ffmpeg.controller;

import tech.tresearchgroup.wrappers.ffmpeg.model.AdvancedPerFileOptions;

import java.util.ArrayList;
import java.util.List;

public class AdvancedPerFileController {
    public static List<String> getOptions(AdvancedPerFileOptions advancedPerFileOptions) {
        List<String> optionsList = new ArrayList<>();
        if(advancedPerFileOptions != null) {
            if (advancedPerFileOptions.getMap() != null) {
                optionsList.add("-map");
                optionsList.add(advancedPerFileOptions.getMap());
            }
            if (advancedPerFileOptions.getMapChannel() != null) {
                optionsList.add("-map_channel");
                optionsList.add(advancedPerFileOptions.getMapChannel());
            }
            if (advancedPerFileOptions.getMapChapters() != null) {
                optionsList.add("-map_chapters");
                optionsList.add(advancedPerFileOptions.getMapChapters());
            }
            if (advancedPerFileOptions.isAccurateSeek()) {
                optionsList.add("-accurate_seek");
            }
            if (advancedPerFileOptions.getItsOffset() != null) {
                optionsList.add("-itsoffset");
                optionsList.add(advancedPerFileOptions.getItsOffset());
            }
            if (advancedPerFileOptions.getItsScale() != null) {
                optionsList.add("-itsscale");
                optionsList.add(advancedPerFileOptions.getItsScale());
            }
            if (advancedPerFileOptions.getDFrames() != null) {
                optionsList.add("-dframes");
                optionsList.add(advancedPerFileOptions.getDFrames());
            }
            if (advancedPerFileOptions.isRe()) {
                optionsList.add("-re");
            }
            if (advancedPerFileOptions.getReadRate() != null) {
                optionsList.add("-readrate");
                optionsList.add(advancedPerFileOptions.getReadRate());
            }
            if (advancedPerFileOptions.isShortest()) {
                optionsList.add("-shortest");
            }
            if (advancedPerFileOptions.isBitExact()) {
                optionsList.add("-bitexact");
            }
            if (advancedPerFileOptions.isCopyInkF()) {
                optionsList.add("-copyinkf");
            }
            if (advancedPerFileOptions.isCopyPriorSS()) {
                optionsList.add("-copypriorss");
            }
            if (advancedPerFileOptions.getTag() != null) {
                optionsList.add("-tag");
                optionsList.add(advancedPerFileOptions.getTag());
            }
            if (advancedPerFileOptions.getQ() != null) {
                optionsList.add("-q");
                optionsList.add(advancedPerFileOptions.getQ());
            }
            if (advancedPerFileOptions.getQScale() != null) {
                optionsList.add("-qscale");
                optionsList.add(advancedPerFileOptions.getQScale());
            }
            if (advancedPerFileOptions.getProfile() != null) {
                optionsList.add("-profile");
                optionsList.add(advancedPerFileOptions.getProfile());
            }
            if (advancedPerFileOptions.getAttach() != null) {
                optionsList.add("-attach");
                optionsList.add(advancedPerFileOptions.getAttach());
            }
            if (advancedPerFileOptions.getDumpAttachment() != null) {
                optionsList.add("-dump_attachment");
                optionsList.add(advancedPerFileOptions.getDumpAttachment());
            }
            if (advancedPerFileOptions.getStreamLoop() != null) {
                optionsList.add("stream_loop");
                optionsList.add(advancedPerFileOptions.getStreamLoop());
            }
            if (advancedPerFileOptions.getThreadQueueSize() != null) {
                optionsList.add("-thread_queue_size");
                optionsList.add(advancedPerFileOptions.getThreadQueueSize());
            }
            if (advancedPerFileOptions.getFindStreamInfo() != null) {
                optionsList.add("-find_stream_info");
                optionsList.add(advancedPerFileOptions.getFindStreamInfo());
            }
            if (advancedPerFileOptions.getBitsPerRawSample() != null) {
                optionsList.add("-bits_per_raw_sample");
                optionsList.add(advancedPerFileOptions.getBitsPerRawSample());
            }
            if (advancedPerFileOptions.isAutoRotate()) {
                optionsList.add("-autorotate");
            }
            if (advancedPerFileOptions.isAutoScale()) {
                optionsList.add("-autoscale");
            }
            if (advancedPerFileOptions.getMuxDelay() != null) {
                optionsList.add("-muxdelay");
                optionsList.add(advancedPerFileOptions.getMuxDelay());
            }
            if (advancedPerFileOptions.getMuxPreload() != null) {
                optionsList.add("-muxpreload");
                optionsList.add(advancedPerFileOptions.getMuxPreload());
            }
            if (advancedPerFileOptions.getTimeBase() != null) {
                optionsList.add("-time_base");
                optionsList.add(advancedPerFileOptions.getTimeBase());
            }
            if (advancedPerFileOptions.getEncTimeBase() != null) {
                optionsList.add("-encTimeBase");
                optionsList.add(advancedPerFileOptions.getEncTimeBase());
            }
            if (advancedPerFileOptions.getBsf() != null) {
                optionsList.add("-bsf");
                optionsList.add(advancedPerFileOptions.getBsf());
            }
            if (advancedPerFileOptions.getFpre() != null) {
                optionsList.add("-fpre");
                optionsList.add(advancedPerFileOptions.getFpre());
            }
            if (advancedPerFileOptions.getMaxMuxingQueueSize() != null) {
                optionsList.add("maxMuxingQueueSize");
                optionsList.add(advancedPerFileOptions.getMaxMuxingQueueSize());
            }
            if (advancedPerFileOptions.getMuxingQueueDataThreshold() != null) {
                optionsList.add("-muxing_queue_data_threshold");
                optionsList.add(advancedPerFileOptions.getMuxingQueueDataThreshold());
            }
            if (advancedPerFileOptions.getDCodec() != null) {
                optionsList.add("-dcodec");
                optionsList.add(advancedPerFileOptions.getDCodec());
            }
        }
        return optionsList;
    }
}
