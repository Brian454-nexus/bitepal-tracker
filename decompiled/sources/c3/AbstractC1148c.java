package c3;

import b3.InterfaceC1085a;
import d3.AbstractC1189h;
import f3.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1148c implements InterfaceC1085a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1189h f10748a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10749b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10750c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10751d;

    /* renamed from: e, reason: collision with root package name */
    public a f10752e;

    /* renamed from: c3.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void c(List list);

        void d(List list);
    }

    public AbstractC1148c(AbstractC1189h tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f10748a = tracker;
        this.f10749b = new ArrayList();
        this.f10750c = new ArrayList();
    }

    @Override // b3.InterfaceC1085a
    public void a(Object obj) {
        this.f10751d = obj;
        h(this.f10752e, obj);
    }

    public abstract boolean b(u uVar);

    public abstract boolean c(Object obj);

    public final boolean d(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Object obj = this.f10751d;
        return obj != null && c(obj) && this.f10750c.contains(workSpecId);
    }

    public final void e(Iterable workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.f10749b.clear();
        this.f10750c.clear();
        List list = this.f10749b;
        for (Object obj : workSpecs) {
            if (b((u) obj)) {
                list.add(obj);
            }
        }
        List list2 = this.f10749b;
        List list3 = this.f10750c;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((u) it.next()).f14117a);
        }
        if (this.f10749b.isEmpty()) {
            this.f10748a.f(this);
        } else {
            this.f10748a.c(this);
        }
        h(this.f10752e, this.f10751d);
    }

    public final void f() {
        if (this.f10749b.isEmpty()) {
            return;
        }
        this.f10749b.clear();
        this.f10748a.f(this);
    }

    public final void g(a aVar) {
        if (this.f10752e != aVar) {
            this.f10752e = aVar;
            h(aVar, this.f10751d);
        }
    }

    public final void h(a aVar, Object obj) {
        if (this.f10749b.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.d(this.f10749b);
        } else {
            aVar.c(this.f10749b);
        }
    }
}
