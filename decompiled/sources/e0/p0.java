package e0;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p0 extends e0 implements o0 {

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f13776c;

    public p0(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f13746b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f13776c = videoCapabilities;
    }

    public static p0 j(m0 m0Var) {
        return new p0(e0.i(m0Var), m0Var.c());
    }

    public static IllegalArgumentException k(Throwable th) {
        return th instanceof IllegalArgumentException ? (IllegalArgumentException) th : new IllegalArgumentException(th);
    }

    @Override // e0.o0
    public int a() {
        return this.f13776c.getWidthAlignment();
    }

    @Override // e0.o0
    public Range b() {
        return this.f13776c.getBitrateRange();
    }

    @Override // e0.o0
    public Range c(int i6) {
        try {
            return this.f13776c.getSupportedWidthsFor(i6);
        } catch (Throwable th) {
            throw k(th);
        }
    }

    @Override // e0.o0
    public Range d(int i6) {
        try {
            return this.f13776c.getSupportedHeightsFor(i6);
        } catch (Throwable th) {
            throw k(th);
        }
    }

    @Override // e0.o0
    public int e() {
        return this.f13776c.getHeightAlignment();
    }

    @Override // e0.o0
    public Range f() {
        return this.f13776c.getSupportedWidths();
    }

    @Override // e0.o0
    public boolean g(int i6, int i7) {
        return this.f13776c.isSizeSupported(i6, i7);
    }

    @Override // e0.o0
    public Range h() {
        return this.f13776c.getSupportedHeights();
    }
}
