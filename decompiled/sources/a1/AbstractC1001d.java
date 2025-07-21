package a1;

import a1.InterfaceC0999b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1001d implements InterfaceC0999b {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0999b.a f7649b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0999b.a f7650c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0999b.a f7651d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0999b.a f7652e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f7653f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f7654g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7655h;

    public AbstractC1001d() {
        ByteBuffer byteBuffer = InterfaceC0999b.f7642a;
        this.f7653f = byteBuffer;
        this.f7654g = byteBuffer;
        InterfaceC0999b.a aVar = InterfaceC0999b.a.f7643e;
        this.f7651d = aVar;
        this.f7652e = aVar;
        this.f7649b = aVar;
        this.f7650c = aVar;
    }

    @Override // a1.InterfaceC0999b
    public final void a() {
        flush();
        this.f7653f = InterfaceC0999b.f7642a;
        InterfaceC0999b.a aVar = InterfaceC0999b.a.f7643e;
        this.f7651d = aVar;
        this.f7652e = aVar;
        this.f7649b = aVar;
        this.f7650c = aVar;
        k();
    }

    @Override // a1.InterfaceC0999b
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f7654g;
        this.f7654g = InterfaceC0999b.f7642a;
        return byteBuffer;
    }

    @Override // a1.InterfaceC0999b
    public boolean d() {
        return this.f7655h && this.f7654g == InterfaceC0999b.f7642a;
    }

    @Override // a1.InterfaceC0999b
    public final InterfaceC0999b.a e(InterfaceC0999b.a aVar) {
        this.f7651d = aVar;
        this.f7652e = h(aVar);
        return isActive() ? this.f7652e : InterfaceC0999b.a.f7643e;
    }

    @Override // a1.InterfaceC0999b
    public final void f() {
        this.f7655h = true;
        j();
    }

    @Override // a1.InterfaceC0999b
    public final void flush() {
        this.f7654g = InterfaceC0999b.f7642a;
        this.f7655h = false;
        this.f7649b = this.f7651d;
        this.f7650c = this.f7652e;
        i();
    }

    public final boolean g() {
        return this.f7654g.hasRemaining();
    }

    public abstract InterfaceC0999b.a h(InterfaceC0999b.a aVar);

    public void i() {
    }

    @Override // a1.InterfaceC0999b
    public boolean isActive() {
        return this.f7652e != InterfaceC0999b.a.f7643e;
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i6) {
        if (this.f7653f.capacity() < i6) {
            this.f7653f = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
        } else {
            this.f7653f.clear();
        }
        ByteBuffer byteBuffer = this.f7653f;
        this.f7654g = byteBuffer;
        return byteBuffer;
    }
}
