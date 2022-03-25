package ca.tresearchgroup.ffmpeg.controller;

import ca.tresearchgroup.ffmpeg.model.SubtitleOptions;

import java.util.ArrayList;
import java.util.List;

public class SubtitleController {
    public static List<String> getOptions(SubtitleOptions subtitleOptions) {
        List<String> optionsList = new ArrayList<>();
        if(subtitleOptions != null) {
            if (subtitleOptions.getSn() != null) {
                optionsList.add("-sn");
                optionsList.add(subtitleOptions.getSn());
            }
            if (subtitleOptions.getSCodec() != null) {
                optionsList.add("-scodec");
                optionsList.add(subtitleOptions.getSCodec());
            }
            if (subtitleOptions.getSTag() != null) {
                optionsList.add("-stag");
                optionsList.add(subtitleOptions.getSTag());
            }
            if (subtitleOptions.getFixSubDuration() != null) {
                optionsList.add("-fix_sub_duration");
                optionsList.add(subtitleOptions.getFixSubDuration());
            }
            if (subtitleOptions.getCanvasSize() != null) {
                optionsList.add("-canvas_size");
                optionsList.add(subtitleOptions.getCanvasSize());
            }
            if (subtitleOptions.getSPre() != null) {
                optionsList.add("-spre");
                optionsList.add(subtitleOptions.getSPre());
            }
        }
        return optionsList;
    }
}
