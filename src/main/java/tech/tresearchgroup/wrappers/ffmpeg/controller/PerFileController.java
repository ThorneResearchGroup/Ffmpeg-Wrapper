package tech.tresearchgroup.wrappers.ffmpeg.controller;

import tech.tresearchgroup.wrappers.ffmpeg.model.PerFileOptions;

import java.util.ArrayList;
import java.util.List;

public class PerFileController {
    public static List<String> getOptions(PerFileOptions perFileOptions) {
        List<String> optionsList = new ArrayList<>();
        if(perFileOptions != null) {
            if (perFileOptions.getForceFormat() != null) {
                optionsList.add("-f");
                optionsList.add(perFileOptions.getForceFormat());
            }
            if (perFileOptions.getCodecName() != null) {
                optionsList.add("-c");
                optionsList.add(perFileOptions.getCodecName());
            }
            if (perFileOptions.getPre() != null) {
                optionsList.add("-map_metadata");
                optionsList.add(perFileOptions.getMapMetadata());
            }
            if (perFileOptions.getT() != null) {
                optionsList.add("-t");
                optionsList.add(perFileOptions.getT());
            }
            if (perFileOptions.getTo() != null) {
                optionsList.add("-to");
                optionsList.add(perFileOptions.getTo());
            }
            if (perFileOptions.getFs() != null) {
                optionsList.add("-fs");
                optionsList.add(perFileOptions.getFs());
            }
            if (perFileOptions.getSs() != null) {
                optionsList.add("-ss");
                optionsList.add(perFileOptions.getSs());
            }
            if (perFileOptions.getSseof() != null) {
                optionsList.add("-seeof");
                optionsList.add(perFileOptions.getSseof());
            }
            if (perFileOptions.getSeekTimestamp() != null) {
                optionsList.add("-seek_timestamp");
                optionsList.add(perFileOptions.getSeekTimestamp());
            }
            if (perFileOptions.getTimestamp() != null) {
                optionsList.add("-timestamp");
                optionsList.add(perFileOptions.getTimestamp());
            }
            if (perFileOptions.getMetadata() != null) {
                optionsList.add("-metadata");
                optionsList.add(perFileOptions.getMetadata());
            }
            if (perFileOptions.getProgram() != null) {
                optionsList.add("-program");
                optionsList.add(perFileOptions.getProgram());
            }
            if (perFileOptions.getTarget() != null) {
                optionsList.add("-target");
                optionsList.add(perFileOptions.getTarget());
            }
            if (perFileOptions.isApad()) {
                optionsList.add("-apad");
            }
            if (perFileOptions.getFrames() != null) {
                optionsList.add("-frames");
                optionsList.add(perFileOptions.getFrames());
            }
            if (perFileOptions.getFilter() != null) {
                optionsList.add("-filter");
                optionsList.add(perFileOptions.getFilter());
            }
            if (perFileOptions.getFilterScript() != null) {
                optionsList.add("-filter_script");
                optionsList.add(perFileOptions.getFilterScript());
            }
            if (perFileOptions.isReinitFilter()) {
                optionsList.add("-reint_filter");
            }
            if (perFileOptions.isDiscard()) {
                optionsList.add("-discard");
            }
            if (perFileOptions.isDisposition()) {
                optionsList.add("-disposition");
            }
        }
        return optionsList;
    }
}
