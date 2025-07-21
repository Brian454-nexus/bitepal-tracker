package J3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f2904a = new m("Initialized", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final m f2905b = new m("Updated", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f2906c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f2907d;

    static {
        m[] a6 = a();
        f2906c = a6;
        f2907d = EnumEntriesKt.enumEntries(a6);
    }

    public m(String str, int i6) {
    }

    public static final /* synthetic */ m[] a() {
        return new m[]{f2904a, f2905b};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f2906c.clone();
    }
}
