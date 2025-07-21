package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f12434a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12435b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f12436c;

    public i0(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f12434a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.f12435b = arrayList;
        SharedPreferences a6 = c.a(context, null, apiKey, new StringBuilder("com.braze.storage.braze_push_delivery_storage"), 0);
        this.f12436c = a6;
        reentrantLock.lock();
        try {
            arrayList.clear();
            Map<String, ?> all = a6.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                ArrayList arrayList2 = this.f12435b;
                Intrinsics.checkNotNull(key);
                arrayList2.add(new com.braze.models.push.a(key, this.f12436c.getLong(key, 0L)));
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(List list) {
        return "Re-adding PDEs to storage: " + list;
    }

    public static final String b(String str) {
        return com.braze.j.a("Adding push campaign to storage with uid ", str);
    }

    public final void a(final String pushCampaignId) {
        Intrinsics.checkNotNullParameter(pushCampaignId, "pushCampaignId");
        ReentrantLock reentrantLock = this.f12434a;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.D1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.i0.b(pushCampaignId);
                    }
                }, 7, (Object) null);
                long nowInSeconds = DateTimeUtils.nowInSeconds();
                this.f12436c.edit().putLong(pushCampaignId, nowInSeconds).apply();
                this.f12435b.add(new com.braze.models.push.a(pushCampaignId, nowInSeconds));
                reentrantLock.unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void b(final ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.E1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.i0.a(events);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = this.f12434a;
        reentrantLock.lock();
        try {
            this.f12435b.addAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        ReentrantLock reentrantLock = this.f12434a;
        reentrantLock.lock();
        try {
            SharedPreferences.Editor edit = this.f12436c.edit();
            Iterator it = events.iterator();
            while (it.hasNext()) {
                final com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.F1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.i0.a(com.braze.models.push.a.this);
                        }
                    }, 7, (Object) null);
                    String string = aVar.f12608b.getString("cid");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    edit.remove(string);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            edit.apply();
            this.f12435b.removeAll(events);
            reentrantLock.unlock();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String a(com.braze.models.push.a aVar) {
        StringBuilder sb = new StringBuilder("Clearing PDE from storage with uid ");
        String string = aVar.f12608b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        sb.append(string);
        return sb.toString();
    }
}
