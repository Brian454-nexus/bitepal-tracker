package e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13552a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f13553b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13554c;

    /* renamed from: d, reason: collision with root package name */
    public int f13555d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13556e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13557f;

    /* renamed from: g, reason: collision with root package name */
    public final List f13558g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f13559h;

    public t(Executor executor, Function0 reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f13552a = executor;
        this.f13553b = reportFullyDrawn;
        this.f13554c = new Object();
        this.f13558g = new ArrayList();
        this.f13559h = new Runnable() { // from class: e.s
            @Override // java.lang.Runnable
            public final void run() {
                t.d(t.this);
            }
        };
    }

    public static final void d(t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f13554c) {
            try {
                this$0.f13556e = false;
                if (this$0.f13555d == 0 && !this$0.f13557f) {
                    this$0.f13553b.invoke();
                    this$0.b();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f13554c) {
            try {
                this.f13557f = true;
                Iterator it = this.f13558g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f13558g.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z6;
        synchronized (this.f13554c) {
            z6 = this.f13557f;
        }
        return z6;
    }
}
