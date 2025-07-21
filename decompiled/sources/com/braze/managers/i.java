package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.events.IEventSubscriber;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12426a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12427b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f12428c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12429d;

    /* renamed from: e, reason: collision with root package name */
    public long f12430e;

    /* renamed from: f, reason: collision with root package name */
    public long f12431f;

    /* renamed from: g, reason: collision with root package name */
    public int f12432g;

    /* renamed from: h, reason: collision with root package name */
    public int f12433h;

    public i(Context context, String apiKey, com.braze.storage.e0 serverConfigStorageProvider, com.braze.events.e internalIEventMessenger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        ((com.braze.events.d) internalIEventMessenger).c(com.braze.events.internal.y.class, new IEventSubscriber() { // from class: Z3.q1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.i.a(com.braze.managers.i.this, (com.braze.events.internal.y) obj);
            }
        });
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.global." + apiKey, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12426a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.individual." + apiKey, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        this.f12427b = sharedPreferences2;
        this.f12428c = a(sharedPreferences2);
        this.f12429d = new AtomicBoolean(false);
        this.f12430e = sharedPreferences.getLong("last_request_global", 0L);
        this.f12431f = sharedPreferences.getLong("last_report_global", 0L);
        this.f12432g = serverConfigStorageProvider.t();
        this.f12433h = serverConfigStorageProvider.s();
    }

    public static final String b(String str) {
        return com.braze.j.a("Exception trying to parse re-eligibility id: ", str);
    }

    public static final String c(String str) {
        return com.braze.a.a("Deleting outdated id ", str, " from re-eligibility list.");
    }

    public static final String d(String str) {
        return com.braze.a.a("Retaining id ", str, " in re-eligibility list.");
    }

    public final void a(com.braze.models.response.m serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        final int i6 = serverConfig.f12691e;
        if (i6 >= 0) {
            this.f12432g = i6;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.i.a(i6);
                }
            }, 6, (Object) null);
        }
        final int i7 = serverConfig.f12692f;
        if (i7 >= 0) {
            this.f12433h = i7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.w1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.i.b(i7);
                }
            }, 6, (Object) null);
        }
    }

    public static final String b(long j6, i iVar) {
        return "Geofence request suppressed since only " + j6 + " seconds have passed since the last time geofences were requested (minimum interval: " + iVar.f12432g + ").";
    }

    public static final String c(long j6) {
        return "Updating the last successful location request time to: " + j6;
    }

    public static final String b() {
        return "Geofences have already been requested for the current session. Geofence request not eligible.";
    }

    public static final void a(i iVar, com.braze.events.internal.y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        iVar.f12429d.set(false);
    }

    public final void b(final long j6) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.i.c(j6);
            }
        }, 7, (Object) null);
        this.f12430e = j6;
        this.f12426a.edit().putLong("last_request_global", this.f12430e).apply();
    }

    public final void a(List brazeGeofenceList) {
        Intrinsics.checkNotNullParameter(brazeGeofenceList, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = brazeGeofenceList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.f12428c.keySet());
        SharedPreferences.Editor edit = this.f12427b.edit();
        Iterator it2 = hashSet.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            final String str = (String) it2.next();
            Intrinsics.checkNotNull(str);
            if (!linkedHashSet.contains(a(str))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.x1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.i.c(str);
                    }
                }, 7, (Object) null);
                this.f12428c.remove(str);
                edit.remove(str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.y1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.i.d(str);
                    }
                }, 7, (Object) null);
            }
        }
        edit.apply();
    }

    public static final String b(int i6) {
        return "Min time since last geofence report reset via server configuration: " + i6 + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public final boolean a(boolean z6, long j6) {
        final long j7 = j6 - this.f12430e;
        if (!z6 && this.f12432g > j7) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.i.b(j7, this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (z6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.A1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.i.a(j7);
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.B1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.i.a(j7, this);
                }
            }, 7, (Object) null);
        }
        if (this.f12429d.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.C1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.i.a();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.i.b();
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String a(long j6) {
        return "Ignoring rate limit for this geofence request. Elapsed time since last request:" + j6;
    }

    public static final String a(long j6, i iVar) {
        return j6 + " seconds have passed since the last time geofences were requested (minimum interval: " + iVar.f12432g + ").";
    }

    public static final String a() {
        return "Geofences have not been requested for the current session yet. Request is eligible.";
    }

    public final String a(final String reEligibilityId) {
        Intrinsics.checkNotNullParameter(reEligibilityId, "reEligibilityId");
        try {
            return (String) new Regex("_").split(reEligibilityId, 2).get(1);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.s1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.i.b(reEligibilityId);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a(int i6) {
        return "Min time since last geofence request reset via server configuration: " + i6 + com.amazon.a.a.o.c.a.b.f11260a;
    }

    public final ConcurrentHashMap a(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            Set<String> keySet = all.keySet();
            if (!keySet.isEmpty()) {
                for (final String str : keySet) {
                    long j6 = sharedPreferences.getLong(str, 0L);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.u1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.i.a(com.braze.managers.i.this, str);
                        }
                    }, 7, (Object) null);
                    concurrentHashMap.put(str, Long.valueOf(j6));
                }
            }
        }
        return concurrentHashMap;
    }

    public static final String a(i iVar, String str) {
        StringBuilder sb = new StringBuilder("Retrieving geofence id ");
        Intrinsics.checkNotNull(str);
        sb.append(iVar.a(str));
        sb.append(" eligibility information from local storage.");
        return sb.toString();
    }
}
