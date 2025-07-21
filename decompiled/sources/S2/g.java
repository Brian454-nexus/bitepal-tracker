package S2;

import Q2.j;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements InterfaceC2343a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4704a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4705b;

    /* renamed from: c, reason: collision with root package name */
    public j f4706c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4707d;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4704a = context;
        this.f4705b = new ReentrantLock();
        this.f4707d = new LinkedHashSet();
    }

    @Override // y0.InterfaceC2343a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(WindowLayoutInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.f4705b;
        reentrantLock.lock();
        try {
            this.f4706c = f.f4703a.c(this.f4704a, value);
            Iterator it = this.f4707d.iterator();
            while (it.hasNext()) {
                ((InterfaceC2343a) it.next()).accept(this.f4706c);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.f4705b;
        reentrantLock.lock();
        try {
            j jVar = this.f4706c;
            if (jVar != null) {
                listener.accept(jVar);
            }
            this.f4707d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f4707d.isEmpty();
    }

    public final void d(InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.f4705b;
        reentrantLock.lock();
        try {
            this.f4707d.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }
}
