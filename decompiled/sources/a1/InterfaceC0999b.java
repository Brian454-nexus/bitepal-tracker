package a1;

import Z0.q;
import c1.AbstractC1117K;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y6.k;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC0999b {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f7642a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: a1.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f7643e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f7644a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7645b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7646c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7647d;

        public a(q qVar) {
            this(qVar.f6967C, qVar.f6966B, qVar.f6968D);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7644a == aVar.f7644a && this.f7645b == aVar.f7645b && this.f7646c == aVar.f7646c;
        }

        public int hashCode() {
            return k.b(new Object[]{Integer.valueOf(this.f7644a), Integer.valueOf(this.f7645b), Integer.valueOf(this.f7646c)});
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f7644a + ", channelCount=" + this.f7645b + ", encoding=" + this.f7646c + ']';
        }

        public a(int i6, int i7, int i8) {
            this.f7644a = i6;
            this.f7645b = i7;
            this.f7646c = i8;
            this.f7647d = AbstractC1117K.B0(i8) ? AbstractC1117K.i0(i8, i7) : -1;
        }
    }

    /* renamed from: a1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0119b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final a f7648a;

        public C0119b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public C0119b(String str, a aVar) {
            super(str + " " + aVar);
            this.f7648a = aVar;
        }
    }

    void a();

    ByteBuffer b();

    void c(ByteBuffer byteBuffer);

    boolean d();

    a e(a aVar);

    void f();

    void flush();

    boolean isActive();
}
