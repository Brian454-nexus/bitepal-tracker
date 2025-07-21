package d3;

import android.content.Context;
import b3.InterfaceC1085a;
import i3.InterfaceC1511b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d3.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1189h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1511b f13490a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13491b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13492c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13493d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13494e;

    public AbstractC1189h(Context context, InterfaceC1511b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f13490a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f13491b = applicationContext;
        this.f13492c = new Object();
        this.f13493d = new LinkedHashSet();
    }

    public static final void b(List listenersList, AbstractC1189h this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = listenersList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1085a) it.next()).a(this$0.f13494e);
        }
    }

    public final void c(InterfaceC1085a listener) {
        String str;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f13492c) {
            try {
                if (this.f13493d.add(listener)) {
                    if (this.f13493d.size() == 1) {
                        this.f13494e = e();
                        W2.k e6 = W2.k.e();
                        str = AbstractC1190i.f13495a;
                        e6.a(str, getClass().getSimpleName() + ": initial state = " + this.f13494e);
                        h();
                    }
                    listener.a(this.f13494e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context d() {
        return this.f13491b;
    }

    public abstract Object e();

    public final void f(InterfaceC1085a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f13492c) {
            try {
                if (this.f13493d.remove(listener) && this.f13493d.isEmpty()) {
                    i();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f13492c) {
            Object obj2 = this.f13494e;
            if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                this.f13494e = obj;
                final List list = CollectionsKt.toList(this.f13493d);
                this.f13490a.a().execute(new Runnable() { // from class: d3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1189h.b(list, this);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
