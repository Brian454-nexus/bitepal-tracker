package p1;

import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class J implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f18135a;

    public J(MediaCodec mediaCodec) {
        this.f18135a = mediaCodec;
    }

    @Override // p1.l
    public void a(Bundle bundle) {
        this.f18135a.setParameters(bundle);
    }

    @Override // p1.l
    public void b(int i6, int i7, f1.c cVar, long j6, int i8) {
        this.f18135a.queueSecureInputBuffer(i6, i7, cVar.a(), j6, i8);
    }

    @Override // p1.l
    public void c(int i6, int i7, int i8, long j6, int i9) {
        this.f18135a.queueInputBuffer(i6, i7, i8, j6, i9);
    }

    @Override // p1.l
    public void d() {
    }

    @Override // p1.l
    public void flush() {
    }

    @Override // p1.l
    public void shutdown() {
    }

    @Override // p1.l
    public void start() {
    }
}
