package D3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f808a = new i("EVENT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final i f809b = new i("FLUSH", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f810c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f811d;

    static {
        i[] a6 = a();
        f810c = a6;
        f811d = EnumEntriesKt.enumEntries(a6);
    }

    public i(String str, int i6) {
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{f808a, f809b};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f810c.clone();
    }
}
