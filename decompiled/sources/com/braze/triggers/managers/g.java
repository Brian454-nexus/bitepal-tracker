package com.braze.triggers.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.triggers.actions.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13104a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13105b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13106c;

    public g(Context context, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences a6 = com.braze.managers.c.a(context, str, apiKey, new StringBuilder("com.appboy.storage.triggers.re_eligibility"), 0);
        Intrinsics.checkNotNullExpressionValue(a6, "getSharedPreferences(...)");
        this.f13104a = a6;
        this.f13105b = a();
        this.f13106c = new LinkedHashMap();
    }

    public static final String a(String str) {
        return com.braze.a.a("Deleting outdated triggered action id ", str, " from stored re-eligibility list. In-memory re-eligibility list is unchanged.");
    }

    public static final String b(String str) {
        return com.braze.a.a("Retaining triggered action ", str, " in re-eligibility list.");
    }

    public static final String c(String str) {
        return com.braze.a.a("Retrieving triggered action id ", str, " eligibility information from local storage.");
    }

    public final void d(final com.braze.triggers.actions.a triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) triggeredAction;
        if (gVar.f13021b.f13050f.f13044a == -1) {
            this.f13105b.remove(gVar.f13020a);
            this.f13104a.edit().remove(gVar.f13020a).apply();
            return;
        }
        Long l6 = (Long) this.f13106c.get(gVar.f13020a);
        final long longValue = l6 != null ? l6.longValue() : 0L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.g.b(com.braze.triggers.actions.a.this, longValue);
            }
        }, 7, (Object) null);
        this.f13105b.put(gVar.f13020a, Long.valueOf(longValue));
        this.f13104a.edit().putLong(gVar.f13020a, longValue).apply();
    }

    public static final String b(com.braze.triggers.actions.a aVar) {
        return com.braze.c.a(new StringBuilder("Triggered action id "), ((com.braze.triggers.actions.g) aVar).f13020a, " always eligible via never having been triggered. Returning true for eligibility status");
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return com.braze.c.a(new StringBuilder("Triggered action id "), ((com.braze.triggers.actions.g) aVar).f13020a, " no longer eligible due to having been triggered in the past and is only eligible once.");
    }

    public final boolean a(final com.braze.triggers.actions.g triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        final com.braze.triggers.config.b bVar = triggeredAction.f13021b.f13050f;
        if (bVar.f13044a == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.g.a(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            return true;
        }
        if (!this.f13105b.containsKey(triggeredAction.f13020a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.g.b(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            return true;
        }
        if (bVar.f13044a == -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.g.c(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            return false;
        }
        Long l6 = (Long) this.f13105b.get(triggeredAction.f13020a);
        final long longValue = l6 != null ? l6.longValue() : 0L;
        long nowInSeconds = DateTimeUtils.nowInSeconds() + triggeredAction.f13021b.f13048d;
        int i6 = bVar.f13044a;
        if (nowInSeconds >= ((i6 > 0 ? Integer.valueOf(i6) : null) != null ? r0.intValue() : 0) + longValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.g.a(longValue, bVar);
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.g.b(longValue, bVar);
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String b(long j6, com.braze.triggers.config.a aVar) {
        StringBuilder sb = new StringBuilder("Trigger action is not re-eligible for display since only ");
        sb.append(DateTimeUtils.nowInSeconds() - j6);
        sb.append(" seconds have passed since the last time it was triggered (minimum interval: ");
        int i6 = ((com.braze.triggers.config.b) aVar).f13044a;
        sb.append(i6 > 0 ? Integer.valueOf(i6) : null);
        sb.append(").");
        return sb.toString();
    }

    public static final String b(com.braze.triggers.actions.a aVar, long j6) {
        return "Resetting re-eligibility for action Id " + ((com.braze.triggers.actions.g) aVar).f13020a + " to " + j6;
    }

    public static final String b() {
        return "Encountered unexpected exception while parsing stored re-eligibility information.";
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return com.braze.c.a(new StringBuilder("Triggered action id "), ((com.braze.triggers.actions.g) aVar).f13020a, " always eligible via configuration. Returning true for eligibility status");
    }

    public static final String a(long j6, com.braze.triggers.config.a aVar) {
        StringBuilder sb = new StringBuilder("Trigger action is re-eligible for display since ");
        sb.append(DateTimeUtils.nowInSeconds() - j6);
        sb.append(" seconds have passed since the last time it was triggered (minimum interval: ");
        int i6 = ((com.braze.triggers.config.b) aVar).f13044a;
        sb.append(i6 > 0 ? Integer.valueOf(i6) : null);
        sb.append(").");
        return sb.toString();
    }

    public final void a(final h triggeredAction, final long j6) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.g.a(com.braze.triggers.actions.a.this, j6);
            }
        }, 7, (Object) null);
        LinkedHashMap linkedHashMap = this.f13106c;
        String str = triggeredAction.f13020a;
        Long l6 = (Long) this.f13105b.get(str);
        linkedHashMap.put(str, Long.valueOf(l6 != null ? l6.longValue() : 0L));
        this.f13105b.put(triggeredAction.f13020a, Long.valueOf(j6));
        this.f13104a.edit().putLong(triggeredAction.f13020a, j6).apply();
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j6) {
        return "Updating re-eligibility for action Id " + ((com.braze.triggers.actions.g) aVar).f13020a + " to time " + j6 + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public final ConcurrentHashMap a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (final String str : this.f13104a.getAll().keySet()) {
                long j6 = this.f13104a.getLong(str, 0L);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.g.c(str);
                    }
                }, 7, (Object) null);
                concurrentHashMap.put(str, Long.valueOf(j6));
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: t4.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.managers.g.b();
                }
            }, 4, (Object) null);
        }
        return concurrentHashMap;
    }

    public final void a(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(triggeredActions, 10));
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next())).f13020a);
        }
        SharedPreferences.Editor edit = this.f13104a.edit();
        for (final String str : CollectionsKt.toSet(this.f13105b.keySet())) {
            if (!arrayList.contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.g.a(str);
                    }
                }, 7, (Object) null);
                edit.remove(str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.managers.g.b(str);
                    }
                }, 7, (Object) null);
            }
        }
        edit.apply();
    }
}
