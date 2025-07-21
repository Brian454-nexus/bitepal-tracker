package Z;

import F.AbstractC0335i0;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {
    public static void a(StringBuilder sb, MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        h(sb, "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        h(sb, "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            h(sb, "[AudioCaps] getMinInputChannelCount = " + b0.e.b(audioCapabilities));
            h(sb, "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(b0.e.a(audioCapabilities)));
        }
        h(sb, "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        h(sb, "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            h(sb, "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            h(sb, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    public static String b(String str, MediaCodec mediaCodec, MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            y0.g.a(capabilitiesForType != null);
            c(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            h(sb, "[" + mediaCodec.getName() + "] does not support mime " + str);
        }
        return sb.toString();
    }

    public static void c(StringBuilder sb, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        try {
            h(sb, "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        } catch (ClassCastException unused) {
            h(sb, "[CodecCaps] isFormatSupported=false");
        }
        h(sb, "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(l(codecProfileLevel));
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            h(sb, "[CodecCaps] profileLevels = " + ((Object) sb2));
        }
        if (codecCapabilities.colorFormats != null) {
            h(sb, "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            f(sb, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            a(sb, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            d(sb, encoderCapabilities, mediaFormat);
        }
    }

    public static void d(StringBuilder sb, MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        h(sb, "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            h(sb, "[EncoderCaps] getQualityRange = " + b0.c.a(encoderCapabilities));
        }
        try {
            h(sb, "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(mediaFormat.getInteger("bitrate-mode")));
        } catch (IllegalArgumentException | NullPointerException unused) {
            h(sb, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    public static String e(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        h(sb, "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z6 = true;
                try {
                    y0.g.a(string != null);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z6 = false;
                    }
                    y0.g.a(z6);
                    h(sb, "[Start] [" + mediaCodecInfo.getName() + "]");
                    c(sb, capabilitiesForType, mediaFormat);
                    h(sb, "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    h(sb, "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        h(sb, "[End] Dump MediaCodecList");
        String sb2 = sb.toString();
        k(sb2);
        return sb2;
    }

    public static void f(StringBuilder sb, MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        int i6;
        int i7;
        boolean z6;
        h(sb, "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        h(sb, "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        h(sb, "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i8 = 0;
        boolean z7 = true;
        try {
            i6 = mediaFormat.getInteger("width");
            i7 = mediaFormat.getInteger("height");
            y0.g.a(i6 > 0 && i7 > 0);
            z6 = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            h(sb, "[VideoCaps] mediaFormat does not contain valid width and height");
            i6 = 0;
            i7 = 0;
            z6 = false;
        }
        if (z6) {
            try {
                h(sb, "[VideoCaps] getSupportedHeightsFor " + i6 + " = " + videoCapabilities.getSupportedHeightsFor(i6));
            } catch (IllegalArgumentException unused2) {
                h(sb, "[VideoCaps] could not getSupportedHeightsFor " + i6);
            }
            try {
                h(sb, "[VideoCaps] getSupportedWidthsFor " + i7 + " = " + videoCapabilities.getSupportedWidthsFor(i7));
            } catch (IllegalArgumentException unused3) {
                h(sb, "[VideoCaps] could not getSupportedWidthsFor " + i7);
            }
            h(sb, "[VideoCaps] isSizeSupported for " + i6 + "x" + i7 + " = " + videoCapabilities.isSizeSupported(i6, i7));
        }
        h(sb, "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z7 = false;
            }
            y0.g.a(z7);
            i8 = integer;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            h(sb, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z6) {
            h(sb, "[VideoCaps] getSupportedFrameRatesFor " + i6 + "x" + i7 + " = " + videoCapabilities.getSupportedFrameRatesFor(i6, i7));
        }
        if (!z6 || i8 <= 0) {
            return;
        }
        h(sb, "[VideoCaps] areSizeAndRateSupported for " + i6 + "x" + i7 + ", " + i8 + " = " + videoCapabilities.areSizeAndRateSupported(i6, i7, i8));
    }

    public static String g(long j6) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j6);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j6 - timeUnit2.toMillis(hours));
        long millis = j6 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j6 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static void h(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("\n");
    }

    public static String i(long j6) {
        return g(j6);
    }

    public static String j(long j6) {
        return i(TimeUnit.MICROSECONDS.toMillis(j6));
    }

    public static void k(String str) {
        if (AbstractC0335i0.g("DebugUtils")) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                AbstractC0335i0.e("DebugUtils", scanner.nextLine());
            }
        }
    }

    public static String l(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        return codecProfileLevel == null ? "null" : String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }
}
