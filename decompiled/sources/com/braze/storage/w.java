package com.braze.storage;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f12964c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f12965d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f12966e;

    /* renamed from: a, reason: collision with root package name */
    public final String f12967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12968b;

    static {
        w wVar = new w("READ_CARDS", 0, "read_cards_set", "read_cards_flat");
        f12964c = wVar;
        w wVar2 = new w("VIEWED_CARDS", 1, "viewed_cards_set", "viewed_cards_flat");
        f12965d = wVar2;
        w[] wVarArr = {wVar, wVar2};
        f12966e = wVarArr;
        EnumEntriesKt.enumEntries(wVarArr);
    }

    public w(String str, int i6, String str2, String str3) {
        this.f12967a = str2;
        this.f12968b = str3;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f12966e.clone();
    }
}
