package androidx.media3.exoplayer.rtsp;

import androidx.media3.exoplayer.rtsp.a;
import s1.AbstractC2048h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements a.InterfaceC0138a {

    /* renamed from: a, reason: collision with root package name */
    public final long f9423a;

    public k(long j6) {
        this.f9423a = j6;
    }

    @Override // androidx.media3.exoplayer.rtsp.a.InterfaceC0138a
    public a a(int i6) {
        j jVar = new j(this.f9423a);
        jVar.r(AbstractC2048h.a(i6 * 2));
        return jVar;
    }
}
