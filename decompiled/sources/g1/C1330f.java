package g1;

import c1.AbstractC1117K;

/* renamed from: g1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1330f {

    /* renamed from: a, reason: collision with root package name */
    public int f14553a;

    /* renamed from: b, reason: collision with root package name */
    public int f14554b;

    /* renamed from: c, reason: collision with root package name */
    public int f14555c;

    /* renamed from: d, reason: collision with root package name */
    public int f14556d;

    /* renamed from: e, reason: collision with root package name */
    public int f14557e;

    /* renamed from: f, reason: collision with root package name */
    public int f14558f;

    /* renamed from: g, reason: collision with root package name */
    public int f14559g;

    /* renamed from: h, reason: collision with root package name */
    public int f14560h;

    /* renamed from: i, reason: collision with root package name */
    public int f14561i;

    /* renamed from: j, reason: collision with root package name */
    public int f14562j;

    /* renamed from: k, reason: collision with root package name */
    public long f14563k;

    /* renamed from: l, reason: collision with root package name */
    public int f14564l;

    public void a(long j6) {
        b(j6, 1);
    }

    public final void b(long j6, int i6) {
        this.f14563k += j6;
        this.f14564l += i6;
    }

    public synchronized void c() {
    }

    public String toString() {
        return AbstractC1117K.H("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f14553a), Integer.valueOf(this.f14554b), Integer.valueOf(this.f14555c), Integer.valueOf(this.f14556d), Integer.valueOf(this.f14557e), Integer.valueOf(this.f14558f), Integer.valueOf(this.f14559g), Integer.valueOf(this.f14560h), Integer.valueOf(this.f14561i), Integer.valueOf(this.f14562j), Long.valueOf(this.f14563k), Integer.valueOf(this.f14564l));
    }
}
