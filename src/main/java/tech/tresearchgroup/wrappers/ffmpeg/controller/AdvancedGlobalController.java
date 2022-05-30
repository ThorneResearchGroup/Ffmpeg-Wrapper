package tech.tresearchgroup.wrappers.ffmpeg.controller;

import tech.tresearchgroup.wrappers.ffmpeg.model.AdvancedGlobalOptions;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGlobalController {
    public static List<String> getOptions(AdvancedGlobalOptions advancedGlobalOptions) {
        List<String> optionsList = new ArrayList<>();
        if(advancedGlobalOptions != null) {
            if (advancedGlobalOptions.getCpuFlags() != null) {
                optionsList.add("-cpuflags");
                optionsList.add(advancedGlobalOptions.getCpuFlags());
            }
            if (advancedGlobalOptions.getCpuCount() != null) {
                optionsList.add("-cpucount");
                optionsList.add(advancedGlobalOptions.getCpuCount());
            }
            if (advancedGlobalOptions.isHideBanner()) {
                optionsList.add("-hide_banner");
            }
            if (advancedGlobalOptions.isCopyUnknown()) {
                optionsList.add("-copy_unknown");
            }
            if (advancedGlobalOptions.isRecastMedia()) {
                optionsList.add("-recast_media");
            }
            if (advancedGlobalOptions.isBenchmark()) {
                optionsList.add("-benchmark");
            }
            if (advancedGlobalOptions.isBenchmarkAll()) {
                optionsList.add("-benchmark_all");
            }
            if (advancedGlobalOptions.getProgressUrl() != null) {
                optionsList.add("-progress");
                optionsList.add(advancedGlobalOptions.getProgressUrl());
            }
            if (advancedGlobalOptions.isStdin()) {
                optionsList.add("-stdin");
            }
            if (advancedGlobalOptions.getTimeLimit() != null) {
                optionsList.add("-timelimit");
                optionsList.add(advancedGlobalOptions.getTimeLimit());
            }
            if (advancedGlobalOptions.isDump()) {
                optionsList.add("-dump");
            }
            if (advancedGlobalOptions.isHex()) {
                optionsList.add("-hex");
            }
            if (advancedGlobalOptions.isVsync()) {
                optionsList.add("-vsync");
            }
            if (advancedGlobalOptions.getFrameDropThreshold() != null) {
                optionsList.add("-frame_drop_threshold");
                optionsList.add(advancedGlobalOptions.getFrameDropThreshold());
            }
            if (advancedGlobalOptions.isAsync()) {
                optionsList.add("-async");
            }
            if (advancedGlobalOptions.getAudioDriftThreshold() != null) {
                optionsList.add("-adrift_threshold");
                optionsList.add(advancedGlobalOptions.getAudioDriftThreshold());
            }
            if (advancedGlobalOptions.isCopyTimestamps()) {
                optionsList.add("-copyts");
            }
            if (advancedGlobalOptions.isStartAtZero()) {
                optionsList.add("-start_at_zero");
            }
            if (advancedGlobalOptions.getCopyTb() != null) {
                optionsList.add("-copytb");
                optionsList.add(advancedGlobalOptions.getCopyTb());
            }
            if (advancedGlobalOptions.getDtsDeltaThreshold() != null) {
                optionsList.add("-dts_delta_threshold");
                optionsList.add(advancedGlobalOptions.getDtsDeltaThreshold());
            }
            if (advancedGlobalOptions.getDtsErrorThreshold() != null) {
                optionsList.add("-dts_error_threshold");
                optionsList.add(advancedGlobalOptions.getDtsErrorThreshold());
            }
            if (advancedGlobalOptions.getXError() != null) {
                optionsList.add("-xerror");
                optionsList.add(advancedGlobalOptions.getXError());
            }
            if (advancedGlobalOptions.getAbortOn() != null) {
                optionsList.add("-abort_on");
                optionsList.add(advancedGlobalOptions.getAbortOn());
            }
            if (advancedGlobalOptions.getFilterComplex() != null) {
                optionsList.add("-filter_complex");
                optionsList.add(advancedGlobalOptions.getFilterComplex());
            }
            if (advancedGlobalOptions.getLavfi() != null) {
                optionsList.add("-lavfi");
                optionsList.add(advancedGlobalOptions.getLavfi());
            }
            if (advancedGlobalOptions.getFilterComplexScript() != null) {
                optionsList.add("-filter_complex_script");
                optionsList.add(advancedGlobalOptions.getFilterComplexScript());
            }
            if (advancedGlobalOptions.getAutoConversionFilters() != null) {
                optionsList.add("-auto_conversion_filters");
                optionsList.add(advancedGlobalOptions.getAutoConversionFilters());
            }
            if (advancedGlobalOptions.getStatsPeriod() != null) {
                optionsList.add("-stats_period");
                optionsList.add(advancedGlobalOptions.getStatsPeriod());
            }
            if (advancedGlobalOptions.isDebugTs()) {
                optionsList.add("-debug_ts");
            }
            if (advancedGlobalOptions.isPsnr()) {
                optionsList.add("-psnr");
            }
            if (advancedGlobalOptions.isVStats()) {
                optionsList.add("-vstats");
            }
            if (advancedGlobalOptions.getVStatsFile() != null) {
                optionsList.add("-vstats_file");
                optionsList.add(advancedGlobalOptions.getVStatsFile());
            }
            if (advancedGlobalOptions.isVStatsVersion()) {
                optionsList.add("-vstats_version");
            }
            if (advancedGlobalOptions.isQpHist()) {
                optionsList.add("-qphist");
            }
            if (advancedGlobalOptions.getSdpFile() != null) {
                optionsList.add("-sdp_file");
                optionsList.add(advancedGlobalOptions.getSdpFile());
            }
            if (advancedGlobalOptions.getQsvDevice() != null) {
                optionsList.add("-qsv_device");
                optionsList.add(advancedGlobalOptions.getQsvDevice());
            }
            if (advancedGlobalOptions.getInitHwDevice() != null) {
                optionsList.add("-init_hw_device");
                optionsList.add(advancedGlobalOptions.getInitHwDevice());
            }
            if (advancedGlobalOptions.getFilterHwDevice() != null) {
                optionsList.add("-filter_hw_device");
                optionsList.add(advancedGlobalOptions.getFilterHwDevice());
            }
            if (advancedGlobalOptions.getS() != null) {
                optionsList.add("-s");
                optionsList.add(advancedGlobalOptions.getS());
            }
        }
        return optionsList;
    }
}
