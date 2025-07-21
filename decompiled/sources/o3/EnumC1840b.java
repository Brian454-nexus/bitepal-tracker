package o3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class EnumC1840b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1840b f17890a = new EnumC1840b("SESSIONS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1840b f17891b = new EnumC1840b("APP_LIFECYCLES", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1840b f17892c = new EnumC1840b("DEEP_LINKS", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1840b f17893d = new EnumC1840b("SCREEN_VIEWS", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1840b f17894e = new EnumC1840b("ELEMENT_INTERACTIONS", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1840b[] f17895f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f17896g;

    static {
        EnumC1840b[] a6 = a();
        f17895f = a6;
        f17896g = EnumEntriesKt.enumEntries(a6);
    }

    public EnumC1840b(String str, int i6) {
    }

    public static final /* synthetic */ EnumC1840b[] a() {
        return new EnumC1840b[]{f17890a, f17891b, f17892c, f17893d, f17894e};
    }

    public static EnumC1840b valueOf(String str) {
        return (EnumC1840b) Enum.valueOf(EnumC1840b.class, str);
    }

    public static EnumC1840b[] values() {
        return (EnumC1840b[]) f17895f.clone();
    }
}
