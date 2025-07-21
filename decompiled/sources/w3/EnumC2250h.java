package w3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w3.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class EnumC2250h {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2250h f20176b = new EnumC2250h("V3", 0, 3);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2250h[] f20177c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f20178d;

    /* renamed from: a, reason: collision with root package name */
    public final int f20179a;

    static {
        EnumC2250h[] a6 = a();
        f20177c = a6;
        f20178d = EnumEntriesKt.enumEntries(a6);
    }

    public EnumC2250h(String str, int i6, int i7) {
        this.f20179a = i7;
    }

    public static final /* synthetic */ EnumC2250h[] a() {
        return new EnumC2250h[]{f20176b};
    }

    public static EnumC2250h valueOf(String str) {
        return (EnumC2250h) Enum.valueOf(EnumC2250h.class, str);
    }

    public static EnumC2250h[] values() {
        return (EnumC2250h[]) f20177c.clone();
    }

    public final int b() {
        return this.f20179a;
    }
}
