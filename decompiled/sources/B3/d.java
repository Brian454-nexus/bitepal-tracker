package B3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f365a = new d("US", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final d f366b = new d("EU", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f367c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f368d;

    static {
        d[] a6 = a();
        f367c = a6;
        f368d = EnumEntriesKt.enumEntries(a6);
    }

    public d(String str, int i6) {
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{f365a, f366b};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f367c.clone();
    }
}
