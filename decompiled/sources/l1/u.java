package l1;

import android.os.Looper;
import h1.v1;
import l1.InterfaceC1743m;
import l1.t;
import l1.u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f17030a = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements u {
        @Override // l1.u
        public void a(Looper looper, v1 v1Var) {
        }

        @Override // l1.u
        public InterfaceC1743m b(t.a aVar, Z0.q qVar) {
            if (qVar.f6994r == null) {
                return null;
            }
            return new z(new InterfaceC1743m.a(new N(1), 6001));
        }

        @Override // l1.u
        public int c(Z0.q qVar) {
            return qVar.f6994r != null ? 1 : 0;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17031a = new b() { // from class: l1.v
            @Override // l1.u.b
            public final void release() {
                u.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void release();
    }

    void a(Looper looper, v1 v1Var);

    InterfaceC1743m b(t.a aVar, Z0.q qVar);

    int c(Z0.q qVar);

    default b d(t.a aVar, Z0.q qVar) {
        return b.f17031a;
    }

    default void h() {
    }

    default void release() {
    }
}
