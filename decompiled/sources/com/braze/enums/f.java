package com.braze.enums;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f12207a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f12208b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f12209c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f12210d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f12211e;

    static {
        f fVar = new f("NONE", 0);
        f12207a = fVar;
        f fVar2 = new f("BAD", 1);
        f12208b = fVar2;
        f fVar3 = new f("GOOD", 2);
        f12209c = fVar3;
        f fVar4 = new f("GREAT", 3);
        f12210d = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f12211e = fVarArr;
        EnumEntriesKt.enumEntries(fVarArr);
    }

    public f(String str, int i6) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f12211e.clone();
    }
}
