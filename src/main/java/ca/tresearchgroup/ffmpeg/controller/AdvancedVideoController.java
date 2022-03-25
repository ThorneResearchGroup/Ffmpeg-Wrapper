package ca.tresearchgroup.ffmpeg.controller;

import ca.tresearchgroup.ffmpeg.model.AdvancedVideoOptions;

import java.util.ArrayList;
import java.util.List;

public class AdvancedVideoController {
    public static List<String> getOptions(AdvancedVideoOptions advancedVideoOptions) {
        List<String> optionsList = new ArrayList<>();
        if(advancedVideoOptions != null) {
            if (advancedVideoOptions.getPixFmt() != null) {
                optionsList.add("-pix_fmt");
                optionsList.add(advancedVideoOptions.getPixFmt());
            }
            if (advancedVideoOptions.getRcOverride() != null) {
                optionsList.add("-rc_override");
                optionsList.add(advancedVideoOptions.getRcOverride());
            }
            if (advancedVideoOptions.getPassLogFile() != null) {
                optionsList.add("-passlogfile");
                optionsList.add(advancedVideoOptions.getPassLogFile());
            }
            if (advancedVideoOptions.getIntraMatrix() != null) {
                optionsList.add("-intra_matrix");
                optionsList.add(advancedVideoOptions.getIntraMatrix());
            }
            if (advancedVideoOptions.getChromaIntraMatrix() != null) {
                optionsList.add("-chroma_intra_matrix");
                optionsList.add(advancedVideoOptions.getChromaIntraMatrix());
            }
            if (advancedVideoOptions.getTop() != null) {
                optionsList.add("-top");
                optionsList.add(advancedVideoOptions.getTop());
            }
            if (advancedVideoOptions.getVTag() != null) {
                optionsList.add("-vtag");
                optionsList.add(advancedVideoOptions.getVTag());
            }
            if (advancedVideoOptions.isForceFps()) {
                optionsList.add("-force_fps");
            }
            if (advancedVideoOptions.getStreamId() != null) {
                optionsList.add("-streamid");
                optionsList.add(advancedVideoOptions.getStreamId());
            }
            if (advancedVideoOptions.getForceKeyFrames() != null) {
                optionsList.add("-force_key_frames");
                optionsList.add(advancedVideoOptions.getForceKeyFrames());
            }
            if (advancedVideoOptions.getHwAccel() != null) {
                optionsList.add("-hwaccel");
                optionsList.add(advancedVideoOptions.getHwAccel());
            }
            if (advancedVideoOptions.getHwAccelDevice() != null) {
                optionsList.add("-hwaccel_device");
                optionsList.add(advancedVideoOptions.getHwAccelDevice());
            }
            if (advancedVideoOptions.getHwAccelOutputFormat() != null) {
                optionsList.add("-hwaccel_output_format");
                optionsList.add(advancedVideoOptions.getHwAccelOutputFormat());
            }
            if (advancedVideoOptions.getVbsf() != null) {
                optionsList.add("-vbsf");
                optionsList.add(advancedVideoOptions.getVbsf());
            }
            if (advancedVideoOptions.getVPre() != null) {
                optionsList.add("-vpre");
                optionsList.add(advancedVideoOptions.getVPre());
            }
        }
        return optionsList;
    }
}
