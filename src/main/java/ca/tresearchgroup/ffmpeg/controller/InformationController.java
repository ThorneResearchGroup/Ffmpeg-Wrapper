package ca.tresearchgroup.ffmpeg.controller;

import ca.tresearchgroup.ffmpeg.model.InformationOptions;

import java.util.ArrayList;
import java.util.List;

public class InformationController {
    public static List<String> getOptions(InformationOptions informationOptions) {
        List<String> optionsList = new ArrayList<>();
        if(informationOptions != null) {
            if (informationOptions.isShowLicense()) {
                optionsList.add("-L");
            }
            if (informationOptions.isShowHelp()) {
                optionsList.add("-h");
            }
            if (informationOptions.isShowVersion()) {
                optionsList.add("-version");
            }
            if (informationOptions.isShowBuildConf()) {
                optionsList.add("-buildconf");
            }
            if (informationOptions.isShowFormats()) {
                optionsList.add("-formats");
            }
            if (informationOptions.isShowMuxers()) {
                optionsList.add("-muxers");
            }
            if (informationOptions.isShowDemuxers()) {
                optionsList.add("-demuxers");
            }
            if (informationOptions.isShowAvailableDevices()) {
                optionsList.add("-devices");
            }
            if (informationOptions.isShowCodecs()) {
                optionsList.add("-codecs");
            }
            if (informationOptions.isShowAvailableBitStreamFilters()) {
                optionsList.add("-bsfs");
            }
            if (informationOptions.isShowProtocols()) {
                optionsList.add("-protocols");
            }
            if (informationOptions.isShowFilters()) {
                optionsList.add("-filters");
            }
            if (informationOptions.isShowPixelFormats()) {
                optionsList.add("-pix_fmts");
            }
            if (informationOptions.isShowChannelLayouts()) {
                optionsList.add("-layouts");
            }
            if (informationOptions.isShowAudioFormats()) {
                optionsList.add("-sample_fmts");
            }
            if (informationOptions.isShowDispositions()) {
                optionsList.add("-dispositions");
            }
            if (informationOptions.isShowColors()) {
                optionsList.add("-colors");
            }
            if (informationOptions.getInputDeviceSources() != null) {
                optionsList.add("-sources");
                optionsList.add(informationOptions.getInputDeviceSources());
            }
            if (informationOptions.getOutputDeviceSinks() != null) {
                optionsList.add("-sinks");
                optionsList.add(informationOptions.getOutputDeviceSinks());
            }
            if (informationOptions.isShowHardwareAccelerators()) {
                optionsList.add("-hwaccels");
            }
        }
        return optionsList;
    }
}
