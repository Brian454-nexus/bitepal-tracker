package com.braze.triggers.enums;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f13058a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f13059b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f13060c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f13061d;

    static {
        b bVar = new b("ZIP", 0);
        f13058a = bVar;
        b bVar2 = new b("IMAGE", 1);
        f13059b = bVar2;
        b bVar3 = new b("FILE", 2);
        f13060c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f13061d = bVarArr;
        EnumEntriesKt.enumEntries(bVarArr);
    }

    public b(String str, int i6) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13061d.clone();
    }
}
