package V0;

import V0.a;
import W0.b;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C1067t;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.u;
import j0.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends V0.a {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5289c = false;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1061m f5290a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5291b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends C1067t implements b.a {

        /* renamed from: l, reason: collision with root package name */
        public final int f5292l;

        /* renamed from: m, reason: collision with root package name */
        public final Bundle f5293m;

        /* renamed from: n, reason: collision with root package name */
        public final W0.b f5294n;

        /* renamed from: o, reason: collision with root package name */
        public InterfaceC1061m f5295o;

        /* renamed from: p, reason: collision with root package name */
        public C0091b f5296p;

        /* renamed from: q, reason: collision with root package name */
        public W0.b f5297q;

        public a(int i6, Bundle bundle, W0.b bVar, W0.b bVar2) {
            this.f5292l = i6;
            this.f5293m = bundle;
            this.f5294n = bVar;
            this.f5297q = bVar2;
            bVar.r(i6, this);
        }

        @Override // W0.b.a
        public void a(W0.b bVar, Object obj) {
            if (b.f5289c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                p(obj);
                return;
            }
            if (b.f5289c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(obj);
        }

        @Override // androidx.lifecycle.AbstractC1065q
        public void k() {
            if (b.f5289c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f5294n.u();
        }

        @Override // androidx.lifecycle.AbstractC1065q
        public void l() {
            if (b.f5289c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f5294n.v();
        }

        @Override // androidx.lifecycle.AbstractC1065q
        public void n(u uVar) {
            super.n(uVar);
            this.f5295o = null;
            this.f5296p = null;
        }

        @Override // androidx.lifecycle.C1067t, androidx.lifecycle.AbstractC1065q
        public void p(Object obj) {
            super.p(obj);
            W0.b bVar = this.f5297q;
            if (bVar != null) {
                bVar.s();
                this.f5297q = null;
            }
        }

        public W0.b q(boolean z6) {
            if (b.f5289c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f5294n.b();
            this.f5294n.a();
            C0091b c0091b = this.f5296p;
            if (c0091b != null) {
                n(c0091b);
                if (z6) {
                    c0091b.d();
                }
            }
            this.f5294n.w(this);
            if ((c0091b == null || c0091b.c()) && !z6) {
                return this.f5294n;
            }
            this.f5294n.s();
            return this.f5297q;
        }

        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f5292l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f5293m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f5294n);
            this.f5294n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f5296p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f5296p);
                this.f5296p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(s().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public W0.b s() {
            return this.f5294n;
        }

        public void t() {
            InterfaceC1061m interfaceC1061m = this.f5295o;
            C0091b c0091b = this.f5296p;
            if (interfaceC1061m == null || c0091b == null) {
                return;
            }
            super.n(c0091b);
            i(interfaceC1061m, c0091b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f5292l);
            sb.append(" : ");
            Class<?> cls = this.f5294n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }

        public W0.b u(InterfaceC1061m interfaceC1061m, a.InterfaceC0090a interfaceC0090a) {
            C0091b c0091b = new C0091b(this.f5294n, interfaceC0090a);
            i(interfaceC1061m, c0091b);
            u uVar = this.f5296p;
            if (uVar != null) {
                n(uVar);
            }
            this.f5295o = interfaceC1061m;
            this.f5296p = c0091b;
            return this.f5294n;
        }
    }

    /* renamed from: V0.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0091b implements u {

        /* renamed from: a, reason: collision with root package name */
        public final W0.b f5298a;

        /* renamed from: b, reason: collision with root package name */
        public final a.InterfaceC0090a f5299b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5300c = false;

        public C0091b(W0.b bVar, a.InterfaceC0090a interfaceC0090a) {
            this.f5298a = bVar;
            this.f5299b = interfaceC0090a;
        }

        @Override // androidx.lifecycle.u
        public void a(Object obj) {
            if (b.f5289c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f5298a + ": " + this.f5298a.d(obj));
            }
            this.f5300c = true;
            this.f5299b.b(this.f5298a, obj);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f5300c);
        }

        public boolean c() {
            return this.f5300c;
        }

        public void d() {
            if (this.f5300c) {
                if (b.f5289c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f5298a);
                }
                this.f5299b.c(this.f5298a);
            }
        }

        public String toString() {
            return this.f5299b.toString();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends M {

        /* renamed from: f, reason: collision with root package name */
        public static final N.b f5301f = new a();

        /* renamed from: d, reason: collision with root package name */
        public l f5302d = new l();

        /* renamed from: e, reason: collision with root package name */
        public boolean f5303e = false;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements N.b {
            @Override // androidx.lifecycle.N.b
            public M a(Class cls) {
                return new c();
            }
        }

        public static c h(P p6) {
            return (c) new N(p6, f5301f).a(c.class);
        }

        @Override // androidx.lifecycle.M
        public void d() {
            super.d();
            int h6 = this.f5302d.h();
            for (int i6 = 0; i6 < h6; i6++) {
                ((a) this.f5302d.i(i6)).q(true);
            }
            this.f5302d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5302d.h() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i6 = 0; i6 < this.f5302d.h(); i6++) {
                    a aVar = (a) this.f5302d.i(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f5302d.f(i6));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void g() {
            this.f5303e = false;
        }

        public a i(int i6) {
            return (a) this.f5302d.e(i6);
        }

        public boolean j() {
            return this.f5303e;
        }

        public void k() {
            int h6 = this.f5302d.h();
            for (int i6 = 0; i6 < h6; i6++) {
                ((a) this.f5302d.i(i6)).t();
            }
        }

        public void l(int i6, a aVar) {
            this.f5302d.g(i6, aVar);
        }

        public void m() {
            this.f5303e = true;
        }
    }

    public b(InterfaceC1061m interfaceC1061m, P p6) {
        this.f5290a = interfaceC1061m;
        this.f5291b = c.h(p6);
    }

    @Override // V0.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f5291b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // V0.a
    public W0.b c(int i6, Bundle bundle, a.InterfaceC0090a interfaceC0090a) {
        if (this.f5291b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a i7 = this.f5291b.i(i6);
        if (f5289c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (i7 == null) {
            return e(i6, bundle, interfaceC0090a, null);
        }
        if (f5289c) {
            Log.v("LoaderManager", "  Re-using existing loader " + i7);
        }
        return i7.u(this.f5290a, interfaceC0090a);
    }

    @Override // V0.a
    public void d() {
        this.f5291b.k();
    }

    public final W0.b e(int i6, Bundle bundle, a.InterfaceC0090a interfaceC0090a, W0.b bVar) {
        try {
            this.f5291b.m();
            W0.b a6 = interfaceC0090a.a(i6, bundle);
            if (a6 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (a6.getClass().isMemberClass() && !Modifier.isStatic(a6.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a6);
            }
            a aVar = new a(i6, bundle, a6, bVar);
            if (f5289c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f5291b.l(i6, aVar);
            this.f5291b.g();
            return aVar.u(this.f5290a, interfaceC0090a);
        } catch (Throwable th) {
            this.f5291b.g();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f5290a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
