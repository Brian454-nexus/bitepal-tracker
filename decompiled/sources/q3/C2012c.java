package q3;

import java.lang.ref.WeakReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2012c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18676d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18677e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18678f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18679g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakReference f18680h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: q3.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18681a = new a("Clickable", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f18682b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f18683c;

        static {
            a[] a6 = a();
            f18682b = a6;
            f18683c = EnumEntriesKt.enumEntries(a6);
        }

        public a(String str, int i6) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f18681a};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18682b.clone();
        }
    }

    public C2012c(Object obj, String str, String str2, String str3, String str4, String source, String str5) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f18673a = obj;
        this.f18674b = str;
        this.f18675c = str2;
        this.f18676d = str3;
        this.f18677e = str4;
        this.f18678f = source;
        this.f18679g = str5;
        this.f18680h = new WeakReference(obj);
    }

    public final String a() {
        return this.f18674b;
    }

    public final String b() {
        return this.f18679g;
    }

    public final String c() {
        return this.f18675c;
    }

    public final String d() {
        return this.f18678f;
    }

    public final String e() {
        return this.f18676d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012c)) {
            return false;
        }
        C2012c c2012c = (C2012c) obj;
        return Intrinsics.areEqual(this.f18673a, c2012c.f18673a) && Intrinsics.areEqual(this.f18674b, c2012c.f18674b) && Intrinsics.areEqual(this.f18675c, c2012c.f18675c) && Intrinsics.areEqual(this.f18676d, c2012c.f18676d) && Intrinsics.areEqual(this.f18677e, c2012c.f18677e) && Intrinsics.areEqual(this.f18678f, c2012c.f18678f) && Intrinsics.areEqual(this.f18679g, c2012c.f18679g);
    }

    public final String f() {
        return this.f18677e;
    }

    public int hashCode() {
        Object obj = this.f18673a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f18674b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18675c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18676d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18677e;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f18678f.hashCode()) * 31;
        String str5 = this.f18679g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ViewTarget(_view=" + this.f18673a + ", className=" + this.f18674b + ", resourceName=" + this.f18675c + ", tag=" + this.f18676d + ", text=" + this.f18677e + ", source=" + this.f18678f + ", hierarchy=" + this.f18679g + ')';
    }
}
