package e0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodecInfo f13745a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f13746b;

    public e0(MediaCodecInfo mediaCodecInfo, String str) {
        this.f13745a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f13746b = capabilitiesForType;
        } catch (RuntimeException e6) {
            throw new i0("Unable to get CodecCapabilities for mime: " + str, e6);
        }
    }

    public static MediaCodecInfo i(InterfaceC1231n interfaceC1231n) {
        MediaCodec a6 = new g0.b().a(interfaceC1231n.a());
        MediaCodecInfo codecInfo = a6.getCodecInfo();
        a6.release();
        return codecInfo;
    }
}
