package y;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import y.InterfaceC2301f1;
import z.AbstractC2370b;
import z.AbstractC2372d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s1 extends InterfaceC2301f1.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f21072a;

    public s1(List list) {
        ArrayList arrayList = new ArrayList();
        this.f21072a = arrayList;
        arrayList.addAll(list);
    }

    public static InterfaceC2301f1.a v(InterfaceC2301f1.a... aVarArr) {
        return new s1(Arrays.asList(aVarArr));
    }

    @Override // y.InterfaceC2301f1.a
    public void n(InterfaceC2301f1 interfaceC2301f1) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).n(interfaceC2301f1);
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void o(InterfaceC2301f1 interfaceC2301f1) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).o(interfaceC2301f1);
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void p(InterfaceC2301f1 interfaceC2301f1) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).p(interfaceC2301f1);
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void q(InterfaceC2301f1 interfaceC2301f1) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).q(interfaceC2301f1);
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void r(InterfaceC2301f1 interfaceC2301f1) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).r(interfaceC2301f1);
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void s(InterfaceC2301f1 interfaceC2301f1) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).s(interfaceC2301f1);
        }
    }

    @Override // y.InterfaceC2301f1.a
    /* renamed from: t */
    public void z(InterfaceC2301f1 interfaceC2301f1) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).z(interfaceC2301f1);
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void u(InterfaceC2301f1 interfaceC2301f1, Surface surface) {
        Iterator it = this.f21072a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2301f1.a) it.next()).u(interfaceC2301f1, surface);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends InterfaceC2301f1.a {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f21073a;

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f21073a = stateCallback;
        }

        @Override // y.InterfaceC2301f1.a
        public void n(InterfaceC2301f1 interfaceC2301f1) {
            this.f21073a.onActive(interfaceC2301f1.f().c());
        }

        @Override // y.InterfaceC2301f1.a
        public void o(InterfaceC2301f1 interfaceC2301f1) {
            AbstractC2372d.b(this.f21073a, interfaceC2301f1.f().c());
        }

        @Override // y.InterfaceC2301f1.a
        public void p(InterfaceC2301f1 interfaceC2301f1) {
            this.f21073a.onClosed(interfaceC2301f1.f().c());
        }

        @Override // y.InterfaceC2301f1.a
        public void q(InterfaceC2301f1 interfaceC2301f1) {
            this.f21073a.onConfigureFailed(interfaceC2301f1.f().c());
        }

        @Override // y.InterfaceC2301f1.a
        public void r(InterfaceC2301f1 interfaceC2301f1) {
            this.f21073a.onConfigured(interfaceC2301f1.f().c());
        }

        @Override // y.InterfaceC2301f1.a
        public void s(InterfaceC2301f1 interfaceC2301f1) {
            this.f21073a.onReady(interfaceC2301f1.f().c());
        }

        @Override // y.InterfaceC2301f1.a
        /* renamed from: t */
        public void z(InterfaceC2301f1 interfaceC2301f1) {
        }

        @Override // y.InterfaceC2301f1.a
        public void u(InterfaceC2301f1 interfaceC2301f1, Surface surface) {
            AbstractC2370b.a(this.f21073a, interfaceC2301f1.f().c(), surface);
        }

        public a(List list) {
            this(AbstractC2319n0.a(list));
        }
    }
}
