package S2;

import N2.d;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements R2.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4693a;

    /* renamed from: b, reason: collision with root package name */
    public final N2.d f4694b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f4695c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f4696d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f4697e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f4698f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, g.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        public final void a(WindowLayoutInfo p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((g) this.receiver).accept(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WindowLayoutInfo) obj);
            return Unit.INSTANCE;
        }
    }

    public d(WindowLayoutComponent component, N2.d consumerAdapter) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f4693a = component;
        this.f4694b = consumerAdapter;
        this.f4695c = new ReentrantLock();
        this.f4696d = new LinkedHashMap();
        this.f4697e = new LinkedHashMap();
        this.f4698f = new LinkedHashMap();
    }

    @Override // R2.a
    public void a(Context context, Executor executor, InterfaceC2343a callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f4695c;
        reentrantLock.lock();
        try {
            g gVar = (g) this.f4696d.get(context);
            if (gVar != null) {
                gVar.b(callback);
                this.f4697e.put(callback, context);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                g gVar2 = new g(context);
                this.f4696d.put(context, gVar2);
                this.f4697e.put(callback, context);
                gVar2.b(callback);
                if (!(context instanceof Activity)) {
                    gVar2.accept(new WindowLayoutInfo(CollectionsKt.emptyList()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f4698f.put(gVar2, this.f4694b.c(this.f4693a, Reflection.getOrCreateKotlinClass(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(gVar2)));
                }
            }
            Unit unit2 = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // R2.a
    public void b(InterfaceC2343a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f4695c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f4697e.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            g gVar = (g) this.f4696d.get(context);
            if (gVar == null) {
                reentrantLock.unlock();
                return;
            }
            gVar.d(callback);
            this.f4697e.remove(callback);
            if (gVar.c()) {
                this.f4696d.remove(context);
                d.b bVar = (d.b) this.f4698f.remove(gVar);
                if (bVar != null) {
                    bVar.dispose();
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
