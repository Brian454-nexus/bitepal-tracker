package H3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f2212b = new g("SUCCESS", 0, 200, new IntRange(200, 299));

    /* renamed from: c, reason: collision with root package name */
    public static final g f2213c = new g("BAD_REQUEST", 1, 400, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    public static final g f2214d = new g("TIMEOUT", 2, 408, null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public static final g f2215e = new g("PAYLOAD_TOO_LARGE", 3, 413, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public static final g f2216f = new g("TOO_MANY_REQUESTS", 4, 429, null, 2, null);

    /* renamed from: g, reason: collision with root package name */
    public static final g f2217g = new g("FAILED", 5, 500, new IntRange(500, 599));

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f2218h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2219i;

    /* renamed from: a, reason: collision with root package name */
    public final IntRange f2220a;

    static {
        g[] a6 = a();
        f2218h = a6;
        f2219i = EnumEntriesKt.enumEntries(a6);
    }

    public g(String str, int i6, int i7, IntRange intRange) {
        this.f2220a = intRange;
    }

    public static final /* synthetic */ g[] a() {
        return new g[]{f2212b, f2213c, f2214d, f2215e, f2216f, f2217g};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2218h.clone();
    }

    public final IntRange b() {
        return this.f2220a;
    }

    public final int c() {
        return this.f2220a.getFirst();
    }

    public /* synthetic */ g(String str, int i6, int i7, IntRange intRange, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i6, i7, (i8 & 2) != 0 ? new IntRange(i7, i7) : intRange);
    }
}
