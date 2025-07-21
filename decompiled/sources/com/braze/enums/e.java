package com.braze.enums;

import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements IPutIntoJson {

    /* renamed from: A, reason: collision with root package name */
    public static final e f12168A;

    /* renamed from: B, reason: collision with root package name */
    public static final e f12169B;

    /* renamed from: C, reason: collision with root package name */
    public static final e f12170C;

    /* renamed from: D, reason: collision with root package name */
    public static final e f12171D;

    /* renamed from: E, reason: collision with root package name */
    public static final e f12172E;

    /* renamed from: F, reason: collision with root package name */
    public static final e f12173F;

    /* renamed from: G, reason: collision with root package name */
    public static final e f12174G;

    /* renamed from: H, reason: collision with root package name */
    public static final e f12175H;

    /* renamed from: I, reason: collision with root package name */
    public static final e f12176I;

    /* renamed from: J, reason: collision with root package name */
    public static final e f12177J;

    /* renamed from: K, reason: collision with root package name */
    public static final e f12178K;

    /* renamed from: L, reason: collision with root package name */
    public static final e f12179L;

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ e[] f12180M;

    /* renamed from: b, reason: collision with root package name */
    public static final d f12181b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f12182c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f12183d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f12184e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f12185f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f12186g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f12187h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f12188i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f12189j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f12190k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f12191l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f12192m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f12193n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f12194o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f12195p;

    /* renamed from: q, reason: collision with root package name */
    public static final e f12196q;

    /* renamed from: r, reason: collision with root package name */
    public static final e f12197r;

    /* renamed from: s, reason: collision with root package name */
    public static final e f12198s;

    /* renamed from: t, reason: collision with root package name */
    public static final e f12199t;

    /* renamed from: u, reason: collision with root package name */
    public static final e f12200u;

    /* renamed from: v, reason: collision with root package name */
    public static final e f12201v;

    /* renamed from: w, reason: collision with root package name */
    public static final e f12202w;

    /* renamed from: x, reason: collision with root package name */
    public static final e f12203x;

    /* renamed from: y, reason: collision with root package name */
    public static final e f12204y;

    /* renamed from: z, reason: collision with root package name */
    public static final e f12205z;

    /* renamed from: a, reason: collision with root package name */
    public final String f12206a;

    static {
        e eVar = new e("LOCATION_RECORDED", 0, "lr");
        f12183d = eVar;
        e eVar2 = new e("CUSTOM_EVENT", 1, "ce");
        f12184e = eVar2;
        e eVar3 = new e("PURCHASE", 2, "p");
        f12185f = eVar3;
        e eVar4 = new e("PUSH_STORY_PAGE_CLICK", 3, "cic");
        f12186g = eVar4;
        e eVar5 = new e("PUSH_CLICKED", 4, "pc");
        f12187h = eVar5;
        e eVar6 = new e("PUSH_ACTION_BUTTON_CLICKED", 5, "ca");
        f12188i = eVar6;
        e eVar7 = new e("INTERNAL", 6, "i");
        f12189j = eVar7;
        e eVar8 = new e("INTERNAL_ERROR", 7, "ie");
        f12190k = eVar8;
        e eVar9 = new e("NEWS_FEED_CARD_IMPRESSION", 8, "ci");
        f12191l = eVar9;
        e eVar10 = new e("NEWS_FEED_CARD_CLICK", 9, "cc");
        f12192m = eVar10;
        e eVar11 = new e("GEOFENCE", 10, L.g.f3025c);
        f12193n = eVar11;
        e eVar12 = new e("CONTENT_CARDS_CLICK", 11, "ccc");
        f12194o = eVar12;
        e eVar13 = new e("CONTENT_CARDS_IMPRESSION", 12, "cci");
        f12195p = eVar13;
        e eVar14 = new e("CONTENT_CARDS_CONTROL_IMPRESSION", 13, "ccic");
        f12196q = eVar14;
        e eVar15 = new e("CONTENT_CARDS_DISMISS", 14, "ccd");
        f12197r = eVar15;
        e eVar16 = new e("INCREMENT", 15, "inc");
        f12198s = eVar16;
        e eVar17 = new e("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 16, "add");
        f12199t = eVar17;
        e eVar18 = new e("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 17, "rem");
        f12200u = eVar18;
        e eVar19 = new e("SET_CUSTOM_ATTRIBUTE_ARRAY", 18, "set");
        f12201v = eVar19;
        e eVar20 = new e("INAPP_MESSAGE_IMPRESSION", 19, "si");
        f12202w = eVar20;
        e eVar21 = new e("INAPP_MESSAGE_CONTROL_IMPRESSION", 20, "iec");
        f12203x = eVar21;
        e eVar22 = new e("INAPP_MESSAGE_CLICK", 21, "sc");
        f12204y = eVar22;
        e eVar23 = new e("INAPP_MESSAGE_BUTTON_CLICK", 22, "sbc");
        f12205z = eVar23;
        e eVar24 = new e("INAPP_MESSAGE_MESSAGE_EXTRAS", 23, "message_extras");
        e eVar25 = new e("USER_ALIAS", 24, "uae");
        f12168A = eVar25;
        e eVar26 = new e("SESSION_START", 25, "ss");
        f12169B = eVar26;
        e eVar27 = new e("SESSION_END", 26, "se");
        f12170C = eVar27;
        e eVar28 = new e("TEST_TYPE", 27, "tt");
        e eVar29 = new e("LOCATION_CUSTOM_ATTRIBUTE_ADD", 28, "lcaa");
        f12171D = eVar29;
        e eVar30 = new e("LOCATION_CUSTOM_ATTRIBUTE_REMOVE", 29, "lcar");
        f12172E = eVar30;
        e eVar31 = new e("NESTED_CUSTOM_ATTRIBUTE_MERGE", 30, "ncam");
        f12173F = eVar31;
        e eVar32 = new e("SUBSCRIPTION_GROUP_UPDATE", 31, "sgu");
        f12174G = eVar32;
        e eVar33 = new e("FEATURE_FLAG_IMPRESSION_EVENT", 32, "ffi");
        f12175H = eVar33;
        e eVar34 = new e("BANNER_IMPRESSION_EVENT", 33, "bi");
        f12176I = eVar34;
        e eVar35 = new e("BANNER_CLICK_EVENT", 34, "bc");
        f12177J = eVar35;
        e eVar36 = new e("PUSH_DELIVERY_EVENT", 35, "pde");
        f12178K = eVar36;
        e eVar37 = new e("UNKNOWN", 36, "");
        f12179L = eVar37;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar36, eVar37};
        f12180M = eVarArr;
        EnumEntriesKt.enumEntries(eVarArr);
        f12181b = new d();
        e[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (e eVar38 : values) {
            linkedHashMap.put(eVar38.f12206a, eVar38);
        }
        f12182c = linkedHashMap;
    }

    public e(String str, int i6, String str2) {
        this.f12206a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f12180M.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        return this.f12206a;
    }
}
