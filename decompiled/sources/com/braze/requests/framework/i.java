package com.braze.requests.framework;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f12813a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f12814b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f12815c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f12816d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f12817e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i[] f12818f;

    static {
        i iVar = new i("PENDING_START", 0);
        f12813a = iVar;
        i iVar2 = new i("PENDING_RETRY", 1);
        f12814b = iVar2;
        i iVar3 = new i("IN_FLIGHT", 2);
        f12815c = iVar3;
        i iVar4 = new i("BATCHED", 3);
        f12816d = iVar4;
        i iVar5 = new i("COMPLETE", 4);
        f12817e = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        f12818f = iVarArr;
        EnumEntriesKt.enumEntries(iVarArr);
    }

    public i(String str, int i6) {
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f12818f.clone();
    }

    public final boolean a() {
        return this == f12813a || this == f12814b;
    }
}
