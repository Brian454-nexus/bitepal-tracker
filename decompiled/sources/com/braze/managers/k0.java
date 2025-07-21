package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.e0 f12443a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12444b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f12445c;

    public k0(Context context, String apiKey, String str, com.braze.events.d internalEventPublisher, com.braze.storage.e0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f12443a = serverConfigStorageProvider;
        SharedPreferences pushMaxPrefs = c.a(context, str, apiKey, new StringBuilder("com.braze.storage.braze_push_max_storage"), 0);
        this.f12444b = pushMaxPrefs;
        this.f12445c = c.a(context, str, apiKey, new StringBuilder("com.braze.storage.braze_push_max_metadata"), 0);
        internalEventPublisher.c(com.braze.events.internal.p.class, new IEventSubscriber() { // from class: Z3.O1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.k0.a(com.braze.managers.k0.this, (com.braze.events.internal.p) obj);
            }
        });
        long nowInSeconds = DateTimeUtils.nowInSeconds() - TimeUnit.DAYS.toSeconds(45L);
        Intrinsics.checkNotNullExpressionValue(pushMaxPrefs, "pushMaxPrefs");
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = pushMaxPrefs.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            Intrinsics.checkNotNull(key);
            arrayList.add(new j0(key, pushMaxPrefs.getLong(key, 0L)));
        }
        List<j0> list = CollectionsKt.toList(arrayList);
        SharedPreferences.Editor edit = pushMaxPrefs.edit();
        for (j0 j0Var : list) {
            if (this.f12444b.getLong(j0Var.f12437a, 0L) < nowInSeconds) {
                edit.remove(j0Var.f12437a);
            }
        }
        edit.apply();
    }

    public static final void a(k0 k0Var, com.braze.events.internal.p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k0Var.f12445c.edit().putLong("lastUpdateTime", it.f12294a).apply();
    }

    public static final String b(String str) {
        return com.braze.j.a("Adding push campaign to storage with uid ", str);
    }

    public final void a(final String pushCampaign) {
        Intrinsics.checkNotNullParameter(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.P1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.k0.b(pushCampaign);
            }
        }, 7, (Object) null);
        if (StringsKt.isBlank(pushCampaign)) {
            return;
        }
        this.f12444b.edit().putLong(pushCampaign, DateTimeUtils.nowInSeconds()).apply();
    }

    public final void a() {
        this.f12444b.edit().clear().apply();
        this.f12445c.edit().clear().apply();
    }
}
