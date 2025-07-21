package com.braze.requests.framework.queue;

import com.braze.models.outgoing.k;
import com.braze.requests.f;
import com.braze.requests.framework.h;
import com.braze.requests.m;
import com.braze.requests.n;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends com.braze.requests.framework.b {

    /* renamed from: k, reason: collision with root package name */
    public static final String f12819k = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.braze.dispatch.h dispatchDataProvider) {
        super(m.f12833f, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    public final void a(final long j6, final com.braze.requests.framework.h hVar, List list) {
        com.braze.models.b bVar;
        com.braze.models.b bVar2;
        n nVar = hVar != null ? hVar.f12805a : null;
        com.braze.requests.f fVar = nVar instanceof com.braze.requests.f ? (com.braze.requests.f) nVar : null;
        if (fVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.braze.requests.framework.h hVar2 = (com.braze.requests.framework.h) it.next();
            n nVar2 = hVar2.f12805a;
            final com.braze.requests.f fVar2 = nVar2 instanceof com.braze.requests.f ? (com.braze.requests.f) nVar2 : null;
            if (fVar2 == null || ((fVar.f12767l != null && fVar2.f12767l != null) || (((bVar = fVar.f12768m) != null && !bVar.f12573b) || ((bVar2 = fVar2.f12768m) != null && !bVar2.f12573b)))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: m4.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.requests.framework.queue.c.a(f.this, hVar);
                    }
                }, 7, (Object) null);
            } else {
                k kVar = fVar2.f12765j;
                k kVar2 = fVar.f12765j;
                Boolean bool = (kVar2.f12638b == null && kVar.f12638b == null) ? null : Boolean.TRUE;
                Boolean bool2 = (kVar2.b() || kVar.b()) ? Boolean.TRUE : null;
                com.braze.models.outgoing.i outboundConfigParams = fVar.f12765j.f12640d;
                if (outboundConfigParams != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
                } else {
                    outboundConfigParams = null;
                }
                com.braze.models.outgoing.i outboundConfigParams2 = kVar.f12640d;
                if (outboundConfigParams2 != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams2, "outboundConfigParams");
                    outboundConfigParams = outboundConfigParams2;
                }
                String str = fVar.f12765j.f12637a;
                if (str == null) {
                    str = null;
                }
                String str2 = kVar.f12637a;
                if (str2 != null) {
                    str = str2;
                }
                fVar.f12765j = new k(str, bool, bool2, outboundConfigParams);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12819k, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: m4.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.requests.framework.queue.c.a(h.this, j6, hVar);
                    }
                }, 14, (Object) null);
                hVar2.a(j6, com.braze.requests.framework.i.f12816d);
            }
        }
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j6) {
        ArrayList arrayList = this.f12778e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((com.braze.requests.framework.h) next).f12808d.a()) {
                arrayList2.add(next);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new b());
        int size = sortedWith.size();
        if (size < 2) {
            return;
        }
        a(j6, (com.braze.requests.framework.h) CollectionsKt.first(sortedWith), sortedWith.subList(1, size));
    }

    public static final String a(com.braze.requests.framework.h hVar, long j6, com.braze.requests.framework.h hVar2) {
        return "Batched request " + hVar.a(j6) + " and combined into " + hVar2.a(j6);
    }

    public static final String a(com.braze.requests.f fVar, com.braze.requests.framework.h hVar) {
        return "Could not merge other request: " + fVar + " into parent: " + hVar;
    }
}
