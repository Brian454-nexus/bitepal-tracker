package I;

import F.InterfaceC0341m;
import I.L0;
import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface A extends InterfaceC0341m {

    /* renamed from: a, reason: collision with root package name */
    public static final A f2232a = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements A {
        @Override // I.A
        public void a(L0.b bVar) {
        }

        @Override // I.A
        public D6.g c(List list, int i6, int i7) {
            return N.f.h(Collections.EMPTY_LIST);
        }

        @Override // F.InterfaceC0341m
        public D6.g d() {
            return N.f.h(null);
        }

        @Override // F.InterfaceC0341m
        public D6.g e(float f6) {
            return N.f.h(null);
        }

        @Override // I.A
        public Rect f() {
            return new Rect();
        }

        @Override // I.A
        public void g(int i6) {
        }

        @Override // F.InterfaceC0341m
        public D6.g h(boolean z6) {
            return N.f.h(null);
        }

        @Override // I.A
        public P i() {
            return null;
        }

        @Override // F.InterfaceC0341m
        public D6.g j(int i6) {
            return N.f.h(0);
        }

        @Override // I.A
        public void k() {
        }

        @Override // F.InterfaceC0341m
        public D6.g l(F.F f6) {
            return N.f.h(F.G.b());
        }

        @Override // I.A
        public void m(P p6) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public C0444o f2233a;

        public b(C0444o c0444o) {
            this.f2233a = c0444o;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a();

        void b(List list);
    }

    void a(L0.b bVar);

    default A b() {
        return this;
    }

    D6.g c(List list, int i6, int i7);

    Rect f();

    void g(int i6);

    P i();

    void k();

    void m(P p6);
}
