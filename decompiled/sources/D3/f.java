package D3;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f797a = new a("Before", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f798b = new a("Enrichment", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f799c = new a("Destination", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f800d = new a("Utility", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f801e = new a("Observe", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f802f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f803g;

        static {
            a[] a6 = a();
            f802f = a6;
            f803g = EnumEntriesKt.enumEntries(a6);
        }

        public a(String str, int i6) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f797a, f798b, f799c, f800d, f801e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f802f.clone();
        }
    }

    default void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        d(amplitude);
    }

    default C3.a c(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event;
    }

    void d(B3.a aVar);

    a getType();
}
