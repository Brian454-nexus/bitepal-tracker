package y3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC2355a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: y3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class EnumC0276a {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0276a f21222a = new EnumC0276a("DEBUG", 0, 1);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0276a f21223b = new EnumC0276a("INFO", 1, 2);

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0276a f21224c = new EnumC0276a("WARN", 2, 3);

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0276a f21225d = new EnumC0276a("ERROR", 3, 4);

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0276a f21226e = new EnumC0276a("OFF", 4, 5);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumC0276a[] f21227f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f21228g;

        static {
            EnumC0276a[] a6 = a();
            f21227f = a6;
            f21228g = EnumEntriesKt.enumEntries(a6);
        }

        public EnumC0276a(String str, int i6, int i7) {
        }

        public static final /* synthetic */ EnumC0276a[] a() {
            return new EnumC0276a[]{f21222a, f21223b, f21224c, f21225d, f21226e};
        }

        public static EnumC0276a valueOf(String str) {
            return (EnumC0276a) Enum.valueOf(EnumC0276a.class, str);
        }

        public static EnumC0276a[] values() {
            return (EnumC0276a[]) f21227f.clone();
        }
    }

    void a(String str);

    void b(String str);

    void c(EnumC0276a enumC0276a);

    void d(String str);

    void e(String str);
}
