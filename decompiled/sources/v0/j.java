package v0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f19287b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final k f19288a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Locale[] f19289a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    public j(k kVar) {
        this.f19288a = kVar;
    }

    public static j a(Locale... localeArr) {
        return j(b.a(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(com.amazon.a.a.o.b.f.f11248a, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i6 = 0; i6 < length; i6++) {
            localeArr[i6] = a.a(split[i6]);
        }
        return a(localeArr);
    }

    public static j d() {
        return j(b.b());
    }

    public static j e() {
        return f19287b;
    }

    public static j j(LocaleList localeList) {
        return new j(new l(localeList));
    }

    public Locale c(int i6) {
        return this.f19288a.get(i6);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f19288a.equals(((j) obj).f19288a);
    }

    public boolean f() {
        return this.f19288a.isEmpty();
    }

    public int g() {
        return this.f19288a.size();
    }

    public String h() {
        return this.f19288a.a();
    }

    public int hashCode() {
        return this.f19288a.hashCode();
    }

    public Object i() {
        return this.f19288a.b();
    }

    public String toString() {
        return this.f19288a.toString();
    }
}
