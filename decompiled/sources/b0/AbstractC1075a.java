package b0;

import android.media.AudioFormat;
import android.media.AudioRecord;
import androidx.annotation.NonNull;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1075a {
    @NonNull
    public static AudioRecord a(@NonNull AudioRecord.Builder builder) {
        return builder.build();
    }

    @NonNull
    public static AudioRecord.Builder b() {
        return new AudioRecord.Builder();
    }

    public static void c(@NonNull AudioRecord.Builder builder, @NonNull AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    public static void d(@NonNull AudioRecord.Builder builder, int i6) {
        builder.setAudioSource(i6);
    }

    public static void e(@NonNull AudioRecord.Builder builder, int i6) {
        builder.setBufferSizeInBytes(i6);
    }
}
