package ca.tresearchgroup.ffmpeg.controller;

import ca.tresearchgroup.ffmpeg.model.AudioOptions;

import java.util.ArrayList;
import java.util.List;

public class AudioController {
    public static List<String> getOptions(AudioOptions audioOptions) {
        List<String> optionsList = new ArrayList<>();
        if(audioOptions != null) {
            if (audioOptions.getAFrames() != null) {
                optionsList.add("-aframes");
                optionsList.add(audioOptions.getAFrames());
            }
            if (audioOptions.getAq() != null) {
                optionsList.add("-aq");
                optionsList.add(audioOptions.getAq());
            }
            if (audioOptions.getAr() != null) {
                optionsList.add("-ar");
                optionsList.add(audioOptions.getAr());
            }
            if (audioOptions.getAc() != null) {
                optionsList.add("-ac");
                optionsList.add(audioOptions.getAc());
            }
            if (audioOptions.isAn()) {
                optionsList.add("-an");
            }
            if (audioOptions.getAf() != null) {
                optionsList.add("-af");
                optionsList.add(audioOptions.getAf());
            }
        }
        return optionsList;
    }
}
