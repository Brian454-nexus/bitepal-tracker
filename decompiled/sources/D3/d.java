package D3;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f795a;

    public d(CopyOnWriteArrayList plugins) {
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        this.f795a = plugins;
    }

    public final void a(f plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f795a.add(plugin);
    }

    public final void b(Function1 closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        for (f fVar : this.f795a) {
            Intrinsics.checkNotNull(fVar);
            closure.invoke(fVar);
        }
    }

    public final C3.a c(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        for (f fVar : this.f795a) {
            if (event != null) {
                if (fVar instanceof a) {
                    try {
                        ((a) fVar).g(event);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                } else if (fVar instanceof c) {
                    event = fVar.c(event);
                    if (event != null) {
                        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.amplitude.core.events.BaseEvent");
                        event = ((c) fVar).b(event);
                    }
                } else {
                    event = fVar.c(event);
                }
            }
        }
        return event;
    }

    public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList);
    }
}
