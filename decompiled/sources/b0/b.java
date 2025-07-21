package b0;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {
    public static int a(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int b(@NonNull AudioRecord audioRecord, @NonNull AudioTimestamp audioTimestamp, int i6) {
        return audioRecord.getTimestamp(audioTimestamp, i6);
    }
}
