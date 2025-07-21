package com.braze.requests;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f12829b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f12830c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f12831d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f12832e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f12833f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f12834g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f12835h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f12836i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f12837j;

    /* renamed from: k, reason: collision with root package name */
    public static final m f12838k;

    /* renamed from: l, reason: collision with root package name */
    public static final m f12839l;

    /* renamed from: m, reason: collision with root package name */
    public static final m f12840m;

    /* renamed from: n, reason: collision with root package name */
    public static final m f12841n;

    /* renamed from: o, reason: collision with root package name */
    public static final m f12842o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ m[] f12843p;

    /* renamed from: a, reason: collision with root package name */
    public final String f12844a;

    static {
        m mVar = new m("CONTENT_CARD_SYNC", 0, "content_cards/sync");
        f12831d = mVar;
        m mVar2 = new m("FEATURE_FLAG_SYNC", 1, "feature_flags/sync");
        f12832e = mVar2;
        m mVar3 = new m("V3_DATA", 2, "data");
        f12833f = mVar3;
        m mVar4 = new m("TEMPLATE_REQUEST", 3, "template");
        f12834g = mVar4;
        m mVar5 = new m("PUSH_DELIVERY_EVENTS", 4, "push/delivery_events");
        f12835h = mVar5;
        m mVar6 = new m("GEOFENCE_REFRESH", 5, "geofence/request");
        f12836i = mVar6;
        m mVar7 = new m("GEOFENCE_REPORT", 6, "geofence/report");
        f12837j = mVar7;
        m mVar8 = new m("PUSH_REDELIVER", 7, "push/redeliver");
        f12838k = mVar8;
        m mVar9 = new m("BANNERS_SYNC", 8, "banners/sync");
        f12839l = mVar9;
        m mVar10 = new m("SDK_DEBUGGER_INIT", 9, "debugger/init");
        f12840m = mVar10;
        m mVar11 = new m("SDK_DEBUGGER_LOG", 10, "debugger/log");
        f12841n = mVar11;
        m mVar12 = new m("DUST_CONFIG", 11, "dust/config");
        f12842o = mVar12;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12};
        f12843p = mVarArr;
        EnumEntriesKt.enumEntries(mVarArr);
        f12829b = new l();
        m[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (m mVar13 : values) {
            linkedHashMap.put(mVar13.f12844a, mVar13);
        }
        f12830c = linkedHashMap;
    }

    public m(String str, int i6, String str2) {
        this.f12844a = str2;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f12843p.clone();
    }
}
