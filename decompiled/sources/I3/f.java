package I3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2807a = new f("EVENT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final f f2808b = new f("IDENTIFY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f2809c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2810d;

    static {
        f[] a6 = a();
        f2809c = a6;
        f2810d = EnumEntriesKt.enumEntries(a6);
    }

    public f(String str, int i6) {
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{f2807a, f2808b};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f2809c.clone();
    }
}
