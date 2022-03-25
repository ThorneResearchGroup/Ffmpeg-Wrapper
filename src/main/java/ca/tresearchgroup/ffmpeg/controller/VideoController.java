package ca.tresearchgroup.ffmpeg.controller;

import ca.tresearchgroup.ffmpeg.model.VideoOptions;

import java.util.ArrayList;
import java.util.List;

public class VideoController {
    public static List<String> getOptions(VideoOptions videoOptions) {
        List<String> optionsList = new ArrayList<>();
        if(videoOptions != null) {
            if (videoOptions.getVFrames() != null) {
                optionsList.add("-vframes");
                optionsList.add(videoOptions.getVFrames());
            }
            if (videoOptions.getR() != null) {
                optionsList.add("-r");
                optionsList.add(videoOptions.getR());
            }
            if (videoOptions.getFpsMax() != null) {
                optionsList.add("-fpsmax");
                optionsList.add(videoOptions.getFpsMax());
            }
            if (videoOptions.getAspect() != null) {
                optionsList.add("-aspect");
                optionsList.add(videoOptions.getAspect());
            }
            if (videoOptions.isVn()) {
                optionsList.add("-vn");
            }
            if (videoOptions.getVCodec() != null) {
                optionsList.add("-vcodec");
                optionsList.add(videoOptions.getVCodec());
            }
            if (videoOptions.getTimeCode() != null) {
                optionsList.add("-timecode");
                optionsList.add(videoOptions.getTimeCode());
            }
            if (videoOptions.getPass() != null) {
                optionsList.add("-pass");
                optionsList.add(videoOptions.getPass());
            }
            if (videoOptions.getVf() != null) {
                optionsList.add("-vf");
                optionsList.add(videoOptions.getVf());
            }
            if (videoOptions.getAb() != null) {
                optionsList.add("-ab");
                optionsList.add(videoOptions.getAb());
            }
            if (videoOptions.getB() != null) {
                optionsList.add("-b");
                optionsList.add(videoOptions.getB());
            }
            if (videoOptions.isDn()) {
                optionsList.add("-dn");
            }
        }
        return optionsList;
    }
}
