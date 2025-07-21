package y;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20677a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20678b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Set f20679c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final Set f20680d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final Set f20681e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final CameraDevice.StateCallback f20682f = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public final void b() {
            List g6;
            synchronized (B0.this.f20678b) {
                g6 = B0.this.g();
                B0.this.f20681e.clear();
                B0.this.f20679c.clear();
                B0.this.f20680d.clear();
            }
            Iterator it = g6.iterator();
            while (it.hasNext()) {
                ((InterfaceC2301f1) it.next()).d();
            }
        }

        public final void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (B0.this.f20678b) {
                linkedHashSet.addAll(B0.this.f20681e);
                linkedHashSet.addAll(B0.this.f20679c);
            }
            B0.this.f20677a.execute(new Runnable() { // from class: y.A0
                @Override // java.lang.Runnable
                public final void run() {
                    B0.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i6) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public B0(Executor executor) {
        this.f20677a = executor;
    }

    public static void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2301f1 interfaceC2301f1 = (InterfaceC2301f1) it.next();
            interfaceC2301f1.c().p(interfaceC2301f1);
        }
    }

    public final void a(InterfaceC2301f1 interfaceC2301f1) {
        InterfaceC2301f1 interfaceC2301f12;
        Iterator it = g().iterator();
        while (it.hasNext() && (interfaceC2301f12 = (InterfaceC2301f1) it.next()) != interfaceC2301f1) {
            interfaceC2301f12.d();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f20682f;
    }

    public List d() {
        ArrayList arrayList;
        synchronized (this.f20678b) {
            arrayList = new ArrayList(this.f20679c);
        }
        return arrayList;
    }

    public List e() {
        ArrayList arrayList;
        synchronized (this.f20678b) {
            arrayList = new ArrayList(this.f20680d);
        }
        return arrayList;
    }

    public List f() {
        ArrayList arrayList;
        synchronized (this.f20678b) {
            arrayList = new ArrayList(this.f20681e);
        }
        return arrayList;
    }

    public List g() {
        ArrayList arrayList;
        synchronized (this.f20678b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    public void h(InterfaceC2301f1 interfaceC2301f1) {
        synchronized (this.f20678b) {
            this.f20679c.remove(interfaceC2301f1);
            this.f20680d.remove(interfaceC2301f1);
        }
    }

    public void i(InterfaceC2301f1 interfaceC2301f1) {
        synchronized (this.f20678b) {
            this.f20680d.add(interfaceC2301f1);
        }
    }

    public void j(InterfaceC2301f1 interfaceC2301f1) {
        a(interfaceC2301f1);
        synchronized (this.f20678b) {
            this.f20681e.remove(interfaceC2301f1);
        }
    }

    public void k(InterfaceC2301f1 interfaceC2301f1) {
        synchronized (this.f20678b) {
            this.f20679c.add(interfaceC2301f1);
            this.f20681e.remove(interfaceC2301f1);
        }
        a(interfaceC2301f1);
    }

    public void l(InterfaceC2301f1 interfaceC2301f1) {
        synchronized (this.f20678b) {
            this.f20681e.add(interfaceC2301f1);
        }
    }
}
