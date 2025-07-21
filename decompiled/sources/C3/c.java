package C3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f709b = new c("SET", 0, "$set");

    /* renamed from: c, reason: collision with root package name */
    public static final c f710c = new c("SET_ONCE", 1, "$setOnce");

    /* renamed from: d, reason: collision with root package name */
    public static final c f711d = new c("ADD", 2, "$add");

    /* renamed from: e, reason: collision with root package name */
    public static final c f712e = new c("APPEND", 3, "$append");

    /* renamed from: f, reason: collision with root package name */
    public static final c f713f = new c("CLEAR_ALL", 4, "$clearAll");

    /* renamed from: g, reason: collision with root package name */
    public static final c f714g = new c("PREPEND", 5, "$prepend");

    /* renamed from: h, reason: collision with root package name */
    public static final c f715h = new c("UNSET", 6, "$unset");

    /* renamed from: i, reason: collision with root package name */
    public static final c f716i = new c("PRE_INSERT", 7, "$preInsert");

    /* renamed from: j, reason: collision with root package name */
    public static final c f717j = new c("POST_INSERT", 8, "$postInsert");

    /* renamed from: k, reason: collision with root package name */
    public static final c f718k = new c("REMOVE", 9, "$remove");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ c[] f719l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f720m;

    /* renamed from: a, reason: collision with root package name */
    public final String f721a;

    static {
        c[] a6 = a();
        f719l = a6;
        f720m = EnumEntriesKt.enumEntries(a6);
    }

    public c(String str, int i6, String str2) {
        this.f721a = str2;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f709b, f710c, f711d, f712e, f713f, f714g, f715h, f716i, f717j, f718k};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f719l.clone();
    }

    public final String b() {
        return this.f721a;
    }
}
