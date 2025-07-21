package e0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f13754a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13755b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f13756c;

    /* renamed from: d, reason: collision with root package name */
    public final D6.g f13757d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1728c.a f13758e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f13759f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public long f13760g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13761h = false;

    public h0(MediaCodec mediaCodec, int i6) {
        this.f13754a = (MediaCodec) y0.g.f(mediaCodec);
        this.f13755b = y0.g.e(i6);
        this.f13756c = mediaCodec.getInputBuffer(i6);
        final AtomicReference atomicReference = new AtomicReference();
        this.f13757d = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: e0.g0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return h0.f(atomicReference, aVar);
            }
        });
        this.f13758e = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference.get());
    }

    public static /* synthetic */ Object f(AtomicReference atomicReference, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // e0.f0
    public D6.g a() {
        return N.f.i(this.f13757d);
    }

    @Override // e0.f0
    public void b(boolean z6) {
        g();
        this.f13761h = z6;
    }

    @Override // e0.f0
    public boolean c() {
        if (this.f13759f.getAndSet(true)) {
            return false;
        }
        try {
            this.f13754a.queueInputBuffer(this.f13755b, this.f13756c.position(), this.f13756c.limit(), this.f13760g, this.f13761h ? 4 : 0);
            this.f13758e.c(null);
            return true;
        } catch (IllegalStateException e6) {
            this.f13758e.f(e6);
            return false;
        }
    }

    @Override // e0.f0
    public boolean cancel() {
        if (this.f13759f.getAndSet(true)) {
            return false;
        }
        try {
            this.f13754a.queueInputBuffer(this.f13755b, 0, 0, 0L, 0);
            this.f13758e.c(null);
        } catch (IllegalStateException e6) {
            this.f13758e.f(e6);
        }
        return true;
    }

    @Override // e0.f0
    public void d(long j6) {
        g();
        y0.g.a(j6 >= 0);
        this.f13760g = j6;
    }

    @Override // e0.f0
    public ByteBuffer e() {
        g();
        return this.f13756c;
    }

    public final void g() {
        if (this.f13759f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }
}
