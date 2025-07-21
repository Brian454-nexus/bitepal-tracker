package com.braze.enums;

import com.braze.models.IPutIntoJson;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public static final h f12215a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f12216b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f12217c;

    static {
        h hVar = new h("SUBSCRIBED", 0);
        f12215a = hVar;
        h hVar2 = new h("UNSUBSCRIBED", 1);
        f12216b = hVar2;
        h[] hVarArr = {hVar, hVar2};
        f12217c = hVarArr;
        EnumEntriesKt.enumEntries(hVarArr);
    }

    public h(String str, int i6) {
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f12217c.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "subscribed";
        }
        if (ordinal == 1) {
            return "unsubscribed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
