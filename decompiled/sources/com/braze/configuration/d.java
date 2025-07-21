package com.braze.configuration;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f12116b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f12117c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f12118d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f12119e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f12120f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f12121g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f12122h;

    /* renamed from: a, reason: collision with root package name */
    public final String f12123a;

    static {
        d dVar = new d("INTEGER", 0, "integer");
        f12116b = dVar;
        d dVar2 = new d("COLOR", 1, "color");
        f12117c = dVar2;
        d dVar3 = new d("BOOLEAN", 2, "bool");
        f12118d = dVar3;
        d dVar4 = new d("STRING", 3, "string");
        f12119e = dVar4;
        d dVar5 = new d("DRAWABLE_IDENTIFIER", 4, "drawable");
        f12120f = dVar5;
        d dVar6 = new d("STRING_ARRAY", 5, "array");
        f12121g = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f12122h = dVarArr;
        EnumEntriesKt.enumEntries(dVarArr);
    }

    public d(String str, int i6, String str2) {
        this.f12123a = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12122h.clone();
    }
}
