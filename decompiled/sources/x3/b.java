package x3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20516a = new b("Created", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f20517b = new b("Started", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f20518c = new b("Resumed", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f20519d = new b("Paused", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final b f20520e = new b("Stopped", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final b f20521f = new b("Destroyed", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f20522g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f20523h;

    static {
        b[] a6 = a();
        f20522g = a6;
        f20523h = EnumEntriesKt.enumEntries(a6);
    }

    public b(String str, int i6) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f20516a, f20517b, f20518c, f20519d, f20520e, f20521f};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20522g.clone();
    }
}
