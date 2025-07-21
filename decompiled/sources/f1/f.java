package f1;

import Z0.q;
import Z0.v;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f extends AbstractC1285a {

    /* renamed from: b, reason: collision with root package name */
    public q f14003b;

    /* renamed from: c, reason: collision with root package name */
    public final c f14004c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f14005d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14006e;

    /* renamed from: f, reason: collision with root package name */
    public long f14007f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f14008g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14009h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14010i;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f14011a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14012b;

        public a(int i6, int i7) {
            super("Buffer too small (" + i6 + " < " + i7 + ")");
            this.f14011a = i6;
            this.f14012b = i7;
        }
    }

    static {
        v.a("media3.decoder");
    }

    public f(int i6) {
        this(i6, 0);
    }

    public static f r() {
        return new f(0);
    }

    @Override // f1.AbstractC1285a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f14005d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f14008g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f14006e = false;
    }

    public final ByteBuffer n(int i6) {
        int i7 = this.f14009h;
        if (i7 == 1) {
            return ByteBuffer.allocate(i6);
        }
        if (i7 == 2) {
            return ByteBuffer.allocateDirect(i6);
        }
        ByteBuffer byteBuffer = this.f14005d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i6);
    }

    public void o(int i6) {
        int i7 = i6 + this.f14010i;
        ByteBuffer byteBuffer = this.f14005d;
        if (byteBuffer == null) {
            this.f14005d = n(i7);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i8 = i7 + position;
        if (capacity >= i8) {
            this.f14005d = byteBuffer;
            return;
        }
        ByteBuffer n6 = n(i8);
        n6.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            n6.put(byteBuffer);
        }
        this.f14005d = n6;
    }

    public final void p() {
        ByteBuffer byteBuffer = this.f14005d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f14008g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean q() {
        return g(1073741824);
    }

    public void s(int i6) {
        ByteBuffer byteBuffer = this.f14008g;
        if (byteBuffer == null || byteBuffer.capacity() < i6) {
            this.f14008g = ByteBuffer.allocate(i6);
        } else {
            this.f14008g.clear();
        }
    }

    public f(int i6, int i7) {
        this.f14004c = new c();
        this.f14009h = i6;
        this.f14010i = i7;
    }
}
