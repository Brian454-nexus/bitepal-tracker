package e0;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1219b extends e0 implements d0 {

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.AudioCapabilities f13708c;

    public C1219b(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f13746b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f13708c = audioCapabilities;
    }
}
