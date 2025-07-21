package C1;

import Z0.N;
import android.view.Surface;
import c1.C1107A;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface C {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f464a = new C0015a();

        /* renamed from: C1.C$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0015a implements a {
            @Override // C1.C.a
            public void a(C c6, N n6) {
            }

            @Override // C1.C.a
            public void b(C c6) {
            }

            @Override // C1.C.a
            public void c(C c6) {
            }
        }

        void a(C c6, N n6);

        void b(C c6);

        void c(C c6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.q f465a;

        public b(Throwable th, Z0.q qVar) {
            super(th);
            this.f465a = qVar;
        }
    }

    boolean c();

    boolean d();

    void h();

    void i(long j6, long j7);

    boolean isInitialized();

    Surface j();

    void k();

    void l(Surface surface, C1107A c1107a);

    void m(int i6, Z0.q qVar);

    void n(a aVar, Executor executor);

    void o(Z0.q qVar);

    void p();

    void q(float f6);

    void r();

    void release();

    long s(long j6, boolean z6);

    void t(boolean z6);

    void u();

    void v(List list);

    void w(long j6, long j7);

    boolean x();

    void y(m mVar);

    void z(boolean z6);
}
