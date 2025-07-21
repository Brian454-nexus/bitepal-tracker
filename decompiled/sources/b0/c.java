package b0;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {
    @NonNull
    public static Range<Integer> a(@NonNull MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.getQualityRange();
    }
}
