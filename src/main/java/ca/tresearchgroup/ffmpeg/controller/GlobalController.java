package ca.tresearchgroup.ffmpeg.controller;

import ca.tresearchgroup.ffmpeg.model.GlobalOptions;

import java.util.ArrayList;
import java.util.List;

public class GlobalController {
    public static List<String> getOptions(GlobalOptions globalOptions) {
        List<String> optionsList = new ArrayList<>();
        if(globalOptions != null) {
            if (globalOptions.getLogLevel() != null) {
                optionsList.add("-loglevel");
                optionsList.add(globalOptions.getLogLevel());
            }
            if (globalOptions.isGenerateReport()) {
                optionsList.add("-report");
            }
            if (globalOptions.getMaxAlloc() != null) {
                optionsList.add("-max_alloc");
                optionsList.add(globalOptions.getMaxAlloc());
            }
            if (globalOptions.isOverwriteOutput()) {
                optionsList.add("-y");
            }
            if (globalOptions.isIgnoreUnknown()) {
                optionsList.add("-ignore_unknown");
            }
            if (globalOptions.isFilterThreads()) {
                optionsList.add("-filter_threads");
            }
            if (globalOptions.isFilterComplexThreads()) {
                optionsList.add("-filter_complex_threads");
            }
            if (globalOptions.isPrintStats()) {
                optionsList.add("-stats");
            }
            if (globalOptions.getMaxErrorRate() != null) {
                optionsList.add("-max_error_rate");
                optionsList.add(globalOptions.getMaxErrorRate());
            }
            if (globalOptions.getVolume() != null) {
                optionsList.add("-vol");
                optionsList.add(globalOptions.getVolume());
            }
            if(globalOptions.getInput() != null) {
                optionsList.add("-i");
                optionsList.add(globalOptions.getInput());
            }
        }
        return optionsList;
    }
}
