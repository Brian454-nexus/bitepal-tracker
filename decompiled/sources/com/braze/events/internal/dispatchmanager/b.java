package com.braze.events.internal.dispatchmanager;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12265a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f12266b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f12267c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f12268d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f12269e;

    static {
        b bVar = new b("ADD_PENDING_BRAZE_EVENT", 0);
        f12265a = bVar;
        b bVar2 = new b("ADD_BRAZE_EVENTS", 1);
        f12266b = bVar2;
        b bVar3 = new b("FLUSH_PENDING_BRAZE_EVENTS", 2);
        f12267c = bVar3;
        b bVar4 = new b("ADD_REQUEST", 3);
        f12268d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f12269e = bVarArr;
        EnumEntriesKt.enumEntries(bVarArr);
    }

    public b(String str, int i6) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f12269e.clone();
    }
}
