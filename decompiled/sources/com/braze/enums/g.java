package com.braze.enums;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f12212a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f12213b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f12214c;

    static {
        g gVar = new g("OPEN_SESSION", 0);
        f12212a = gVar;
        g gVar2 = new g("NO_SESSION", 1);
        f12213b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f12214c = gVarArr;
        EnumEntriesKt.enumEntries(gVarArr);
    }

    public g(String str, int i6) {
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f12214c.clone();
    }
}
