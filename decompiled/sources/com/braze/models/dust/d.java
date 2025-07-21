package com.braze.models.dust;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f12580a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f12581b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f12582c;

    static {
        d dVar = new d("UNKNOWN", 0, "");
        f12580a = dVar;
        d dVar2 = new d("CONTENT_CARD_REFRESH", 1, "ccr");
        f12581b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f12582c = dVarArr;
        EnumEntriesKt.enumEntries(dVarArr);
    }

    public d(String str, int i6, String str2) {
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12582c.clone();
    }
}
