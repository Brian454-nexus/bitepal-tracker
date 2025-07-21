package S2;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements R2.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4699a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4700b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4701c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f4702d;

    public e(WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4699a = component;
        this.f4700b = new ReentrantLock();
        this.f4701c = new LinkedHashMap();
        this.f4702d = new LinkedHashMap();
    }

    @Override // R2.a
    public void a(Context context, Executor executor, InterfaceC2343a callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f4700b;
        reentrantLock.lock();
        try {
            g gVar = (g) this.f4701c.get(context);
            if (gVar != null) {
                gVar.b(callback);
                this.f4702d.put(callback, context);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                g gVar2 = new g(context);
                this.f4701c.put(context, gVar2);
                this.f4702d.put(callback, context);
                gVar2.b(callback);
                this.f4699a.addWindowLayoutInfoListener(context, gVar2);
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
        ReentrantLock reentrantLock = this.f4700b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f4702d.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            g gVar = (g) this.f4701c.get(context);
            if (gVar == null) {
                reentrantLock.unlock();
                return;
            }
            gVar.d(callback);
            this.f4702d.remove(callback);
            if (gVar.c()) {
                this.f4701c.remove(context);
                this.f4699a.removeWindowLayoutInfoListener(gVar);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
