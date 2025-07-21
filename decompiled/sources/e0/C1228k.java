package e0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC1728c;

/* renamed from: e0.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1228k implements InterfaceC1226i {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f13763a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f13764b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13765c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f13766d;

    /* renamed from: e, reason: collision with root package name */
    public final D6.g f13767e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1728c.a f13768f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f13769g = new AtomicBoolean(false);

    public C1228k(MediaCodec mediaCodec, int i6, MediaCodec.BufferInfo bufferInfo) {
        this.f13763a = (MediaCodec) y0.g.f(mediaCodec);
        this.f13765c = i6;
        this.f13766d = mediaCodec.getOutputBuffer(i6);
        this.f13764b = (MediaCodec.BufferInfo) y0.g.f(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f13767e = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: e0.j
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return C1228k.a(atomicReference, aVar);
            }
        });
        this.f13768f = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public final void D() {
        if (this.f13769g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // e0.InterfaceC1226i
    public boolean G() {
        return (this.f13764b.flags & 1) != 0;
    }

    @Override // e0.InterfaceC1226i
    public long V() {
        return this.f13764b.presentationTimeUs;
    }

    public D6.g c() {
        return N.f.i(this.f13767e);
    }

    @Override // e0.InterfaceC1226i, java.lang.AutoCloseable
    public void close() {
        if (this.f13769g.getAndSet(true)) {
            return;
        }
        try {
            this.f13763a.releaseOutputBuffer(this.f13765c, false);
            this.f13768f.c(null);
        } catch (IllegalStateException e6) {
            this.f13768f.f(e6);
        }
    }

    @Override // e0.InterfaceC1226i
    public ByteBuffer e() {
        D();
        this.f13766d.position(this.f13764b.offset);
        ByteBuffer byteBuffer = this.f13766d;
        MediaCodec.BufferInfo bufferInfo = this.f13764b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f13766d;
    }

    @Override // e0.InterfaceC1226i
    public long size() {
        return this.f13764b.size;
    }

    @Override // e0.InterfaceC1226i
    public MediaCodec.BufferInfo z() {
        return this.f13764b;
    }
}
