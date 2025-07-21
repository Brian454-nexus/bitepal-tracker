package i1;

import Z0.C0830b;
import Z0.C0833e;
import android.media.AudioDeviceInfo;
import c1.InterfaceC1121c;
import h1.v1;
import java.nio.ByteBuffer;

/* renamed from: i1.y, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1507y {

    /* renamed from: i1.y$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15978a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15979b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15980c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15981d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f15982e;

        /* renamed from: f, reason: collision with root package name */
        public final int f15983f;

        public a(int i6, int i7, int i8, boolean z6, boolean z7, int i9) {
            this.f15978a = i6;
            this.f15979b = i7;
            this.f15980c = i8;
            this.f15981d = z6;
            this.f15982e = z7;
            this.f15983f = i9;
        }
    }

    /* renamed from: i1.y$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f15985a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15986b;

        /* renamed from: c, reason: collision with root package name */
        public final Z0.q f15987c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(int r4, int r5, int r6, int r7, Z0.q r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f15985a = r4
                r3.f15986b = r9
                r3.f15987c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i1.InterfaceC1507y.c.<init>(int, int, int, int, Z0.q, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: i1.y$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void a(long j6);

        void b(a aVar);

        void c(boolean z6);

        void d(Exception exc);

        void e(a aVar);

        void f();

        void g();

        void h(int i6, long j6, long j7);

        void i();

        void j();

        void k();
    }

    /* renamed from: i1.y$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f15988a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15989b;

        public e(long j6, long j7) {
            super("Unexpected audio track timestamp discontinuity: expected " + j7 + ", got " + j6);
            this.f15988a = j6;
            this.f15989b = j7;
        }
    }

    /* renamed from: i1.y$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f15990a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15991b;

        /* renamed from: c, reason: collision with root package name */
        public final Z0.q f15992c;

        public f(int i6, Z0.q qVar, boolean z6) {
            super("AudioTrack write failed: " + i6);
            this.f15991b = z6;
            this.f15990a = i6;
            this.f15992c = qVar;
        }
    }

    void A(d dVar);

    void B(C0833e c0833e);

    void C(boolean z6);

    void a();

    boolean b(Z0.q qVar);

    void c();

    boolean d();

    void e(Z0.B b6);

    void f(AudioDeviceInfo audioDeviceInfo);

    void flush();

    Z0.B g();

    void h();

    void i(float f6);

    void j();

    boolean k();

    C1494k l(Z0.q qVar);

    void m(int i6);

    void n(int i6, int i7);

    void o(int i6);

    long p(boolean z6);

    void q();

    default void r(long j6) {
    }

    void release();

    void s(InterfaceC1121c interfaceC1121c);

    void t();

    void u(Z0.q qVar, int i6, int[] iArr);

    void v();

    void w(C0830b c0830b);

    int x(Z0.q qVar);

    boolean y(ByteBuffer byteBuffer, long j6, int i6);

    void z(v1 v1Var);

    /* renamed from: i1.y$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.q f15984a;

        public b(Throwable th, Z0.q qVar) {
            super(th);
            this.f15984a = qVar;
        }

        public b(String str, Z0.q qVar) {
            super(str);
            this.f15984a = qVar;
        }
    }
}
