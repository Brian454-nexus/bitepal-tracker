package b3;

import W2.k;
import c3.AbstractC1148c;
import c3.C1146a;
import c3.C1147b;
import c3.C1149d;
import c3.C1150e;
import c3.g;
import c3.h;
import d3.n;
import f3.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1089e implements InterfaceC1088d, AbstractC1148c.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1087c f10517a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1148c[] f10518b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10519c;

    public C1089e(InterfaceC1087c interfaceC1087c, AbstractC1148c[] constraintControllers) {
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.f10517a = interfaceC1087c;
        this.f10518b = constraintControllers;
        this.f10519c = new Object();
    }

    @Override // b3.InterfaceC1088d
    public void a() {
        synchronized (this.f10519c) {
            try {
                for (AbstractC1148c abstractC1148c : this.f10518b) {
                    abstractC1148c.f();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b3.InterfaceC1088d
    public void b(Iterable workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f10519c) {
            try {
                for (AbstractC1148c abstractC1148c : this.f10518b) {
                    abstractC1148c.g(null);
                }
                for (AbstractC1148c abstractC1148c2 : this.f10518b) {
                    abstractC1148c2.e(workSpecs);
                }
                for (AbstractC1148c abstractC1148c3 : this.f10518b) {
                    abstractC1148c3.g(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c3.AbstractC1148c.a
    public void c(List workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f10519c) {
            try {
                ArrayList<u> arrayList = new ArrayList();
                for (Object obj : workSpecs) {
                    if (e(((u) obj).f14117a)) {
                        arrayList.add(obj);
                    }
                }
                for (u uVar : arrayList) {
                    k e6 = k.e();
                    str = AbstractC1090f.f10520a;
                    e6.a(str, "Constraints met for " + uVar);
                }
                InterfaceC1087c interfaceC1087c = this.f10517a;
                if (interfaceC1087c != null) {
                    interfaceC1087c.f(arrayList);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c3.AbstractC1148c.a
    public void d(List workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f10519c) {
            InterfaceC1087c interfaceC1087c = this.f10517a;
            if (interfaceC1087c != null) {
                interfaceC1087c.c(workSpecs);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean e(String workSpecId) {
        AbstractC1148c abstractC1148c;
        boolean z6;
        String str;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f10519c) {
            try {
                AbstractC1148c[] abstractC1148cArr = this.f10518b;
                int length = abstractC1148cArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        abstractC1148c = null;
                        break;
                    }
                    abstractC1148c = abstractC1148cArr[i6];
                    if (abstractC1148c.d(workSpecId)) {
                        break;
                    }
                    i6++;
                }
                if (abstractC1148c != null) {
                    k e6 = k.e();
                    str = AbstractC1090f.f10520a;
                    e6.a(str, "Work " + workSpecId + " constrained by " + abstractC1148c.getClass().getSimpleName());
                }
                z6 = abstractC1148c == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1089e(n trackers, InterfaceC1087c interfaceC1087c) {
        this(interfaceC1087c, new AbstractC1148c[]{new C1146a(trackers.a()), new C1147b(trackers.b()), new h(trackers.d()), new C1149d(trackers.c()), new g(trackers.c()), new c3.f(trackers.c()), new C1150e(trackers.c())});
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
