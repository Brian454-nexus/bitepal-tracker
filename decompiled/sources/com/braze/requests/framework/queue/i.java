package com.braze.requests.framework.queue;

import com.braze.requests.framework.h;
import com.braze.requests.framework.queue.i;
import com.braze.requests.m;
import com.braze.requests.n;
import com.braze.requests.x;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends com.braze.requests.framework.b {

    /* renamed from: k, reason: collision with root package name */
    public final com.braze.requests.util.b f12822k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.braze.dispatch.h dispatchDataProvider) {
        super(m.f12834g, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.f12822k = new com.braze.requests.util.b((int) TimeUnit.MINUTES.toMillis(1L), dispatchDataProvider.f12162a.f12548m.k(), dispatchDataProvider.f12162a.f12548m.l());
    }

    public static final String b(com.braze.requests.framework.h hVar, long j6) {
        return "Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. " + hVar.a(j6);
    }

    @Override // com.braze.requests.framework.b
    public final com.braze.requests.util.b a() {
        return this.f12822k;
    }

    @Override // com.braze.requests.framework.b
    public final void a(final long j6) {
        ArrayList arrayList = this.f12778e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((com.braze.requests.framework.h) next).f12808d.a()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            com.braze.requests.framework.h hVar = (com.braze.requests.framework.h) next2;
            n nVar = hVar.f12805a;
            x xVar = nVar instanceof x ? (x) nVar : null;
            if ((xVar != null ? ((com.braze.triggers.events.i) xVar.f12885k).f13070b + xVar.f12888n : -1L) < hVar.f12806b) {
                arrayList3.add(next2);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            final com.braze.requests.framework.h hVar2 = (com.braze.requests.framework.h) it3.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: m4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.b(h.this, j6);
                }
            }, 7, (Object) null);
            hVar2.a(j6, com.braze.requests.framework.i.f12817e);
        }
    }
}
