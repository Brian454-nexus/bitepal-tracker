package e0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC1728c;

/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1224g implements InterfaceC1226i {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f13748a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f13749b;

    /* renamed from: c, reason: collision with root package name */
    public final D6.g f13750c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1728c.a f13751d;

    public C1224g(InterfaceC1226i interfaceC1226i) {
        this.f13749b = D(interfaceC1226i);
        this.f13748a = c(interfaceC1226i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f13750c = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: e0.f
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return C1224g.a(atomicReference, aVar);
            }
        });
        this.f13751d = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public final MediaCodec.BufferInfo D(InterfaceC1226i interfaceC1226i) {
        MediaCodec.BufferInfo z6 = interfaceC1226i.z();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, z6.size, z6.presentationTimeUs, z6.flags);
        return bufferInfo;
    }

    @Override // e0.InterfaceC1226i
    public boolean G() {
        return (this.f13749b.flags & 1) != 0;
    }

    @Override // e0.InterfaceC1226i
    public long V() {
        return this.f13749b.presentationTimeUs;
    }

    public final ByteBuffer c(InterfaceC1226i interfaceC1226i) {
        ByteBuffer e6 = interfaceC1226i.e();
        MediaCodec.BufferInfo z6 = interfaceC1226i.z();
        e6.position(z6.offset);
        e6.limit(z6.offset + z6.size);
        ByteBuffer allocate = ByteBuffer.allocate(z6.size);
        allocate.order(e6.order());
        allocate.put(e6);
        allocate.flip();
        return allocate;
    }

    @Override // e0.InterfaceC1226i, java.lang.AutoCloseable
    public void close() {
        this.f13751d.c(null);
    }

    @Override // e0.InterfaceC1226i
    public ByteBuffer e() {
        return this.f13748a;
    }

    @Override // e0.InterfaceC1226i
    public long size() {
        return this.f13749b.size;
    }

    @Override // e0.InterfaceC1226i
    public MediaCodec.BufferInfo z() {
        return this.f13749b;
    }
}
