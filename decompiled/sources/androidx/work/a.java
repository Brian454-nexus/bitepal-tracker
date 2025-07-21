package androidx.work;

import W2.i;
import W2.s;
import W2.x;
import X2.C0820d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.IntCompanionObject;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f10230a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10231b;

    /* renamed from: c, reason: collision with root package name */
    public final x f10232c;

    /* renamed from: d, reason: collision with root package name */
    public final i f10233d;

    /* renamed from: e, reason: collision with root package name */
    public final s f10234e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2343a f10235f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2343a f10236g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10237h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10238i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10239j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10240k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10241l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10242m;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class ThreadFactoryC0152a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f10243a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10244b;

        public ThreadFactoryC0152a(boolean z6) {
            this.f10244b = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f10244b ? "WM.task-" : "androidx.work-") + this.f10243a.incrementAndGet());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Executor f10246a;

        /* renamed from: b, reason: collision with root package name */
        public x f10247b;

        /* renamed from: c, reason: collision with root package name */
        public i f10248c;

        /* renamed from: d, reason: collision with root package name */
        public Executor f10249d;

        /* renamed from: e, reason: collision with root package name */
        public s f10250e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC2343a f10251f;

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC2343a f10252g;

        /* renamed from: h, reason: collision with root package name */
        public String f10253h;

        /* renamed from: i, reason: collision with root package name */
        public int f10254i = 4;

        /* renamed from: j, reason: collision with root package name */
        public int f10255j = 0;

        /* renamed from: k, reason: collision with root package name */
        public int f10256k = IntCompanionObject.MAX_VALUE;

        /* renamed from: l, reason: collision with root package name */
        public int f10257l = 20;

        public a a() {
            return new a(this);
        }

        public b b(int i6) {
            this.f10254i = i6;
            return this;
        }
    }

    public a(b bVar) {
        Executor executor = bVar.f10246a;
        if (executor == null) {
            this.f10230a = a(false);
        } else {
            this.f10230a = executor;
        }
        Executor executor2 = bVar.f10249d;
        if (executor2 == null) {
            this.f10242m = true;
            this.f10231b = a(true);
        } else {
            this.f10242m = false;
            this.f10231b = executor2;
        }
        x xVar = bVar.f10247b;
        if (xVar == null) {
            this.f10232c = x.c();
        } else {
            this.f10232c = xVar;
        }
        i iVar = bVar.f10248c;
        if (iVar == null) {
            this.f10233d = i.c();
        } else {
            this.f10233d = iVar;
        }
        s sVar = bVar.f10250e;
        if (sVar == null) {
            this.f10234e = new C0820d();
        } else {
            this.f10234e = sVar;
        }
        this.f10238i = bVar.f10254i;
        this.f10239j = bVar.f10255j;
        this.f10240k = bVar.f10256k;
        this.f10241l = bVar.f10257l;
        this.f10235f = bVar.f10251f;
        this.f10236g = bVar.f10252g;
        this.f10237h = bVar.f10253h;
    }

    public final Executor a(boolean z6) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z6));
    }

    public final ThreadFactory b(boolean z6) {
        return new ThreadFactoryC0152a(z6);
    }

    public String c() {
        return this.f10237h;
    }

    public Executor d() {
        return this.f10230a;
    }

    public InterfaceC2343a e() {
        return this.f10235f;
    }

    public i f() {
        return this.f10233d;
    }

    public int g() {
        return this.f10240k;
    }

    public int h() {
        return this.f10241l;
    }

    public int i() {
        return this.f10239j;
    }

    public int j() {
        return this.f10238i;
    }

    public s k() {
        return this.f10234e;
    }

    public InterfaceC2343a l() {
        return this.f10236g;
    }

    public Executor m() {
        return this.f10231b;
    }

    public x n() {
        return this.f10232c;
    }
}
