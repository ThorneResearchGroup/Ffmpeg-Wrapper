package tech.tresearchgroup.wrappers.ffmpeg.controller;

import tech.tresearchgroup.wrappers.ffmpeg.model.AdvancedAudioOptions;

import java.util.ArrayList;
import java.util.List;

public class AdvancedAudioController {
    public static List<String> getOptions(AdvancedAudioOptions advancedAudioOptions) {
        List<String> optionsList = new ArrayList<>();
        if(advancedAudioOptions != null) {
            if (advancedAudioOptions.getATag() != null) {
                optionsList.add("-atag");
                optionsList.add(advancedAudioOptions.getATag());
            }
            if (advancedAudioOptions.getSampleFmt() != null) {
                optionsList.add("-sample_fmt");
                optionsList.add(advancedAudioOptions.getSampleFmt());
            }
            if (advancedAudioOptions.getChannelLayout() != null) {
                optionsList.add("-channel_layout");
                optionsList.add(advancedAudioOptions.getChannelLayout());
            }
            if (advancedAudioOptions.getGuessLayoutMax() != null) {
                optionsList.add("-guess_layout_max");
                optionsList.add(advancedAudioOptions.getGuessLayoutMax());
            }
            if (advancedAudioOptions.getAbsf() != null) {
                optionsList.add("-absf");
                optionsList.add(advancedAudioOptions.getAbsf());
            }
            if (advancedAudioOptions.getAPre() != null) {
                optionsList.add("-apre");
                optionsList.add(advancedAudioOptions.getAPre());
            }
        }
        return optionsList;
    }
}
