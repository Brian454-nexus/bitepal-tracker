package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f8557a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f8558b;

    /* renamed from: c, reason: collision with root package name */
    public String f8559c;

    /* renamed from: d, reason: collision with root package name */
    public String f8560d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8561e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8562f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static t a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.b(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        public static Person b(t tVar) {
            return new Person.Builder().setName(tVar.e()).setIcon(tVar.c() != null ? tVar.c().u() : null).setUri(tVar.f()).setKey(tVar.d()).setBot(tVar.g()).setImportant(tVar.h()).build();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f8563a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f8564b;

        /* renamed from: c, reason: collision with root package name */
        public String f8565c;

        /* renamed from: d, reason: collision with root package name */
        public String f8566d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f8567e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8568f;

        public t a() {
            return new t(this);
        }

        public b b(boolean z6) {
            this.f8567e = z6;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f8564b = iconCompat;
            return this;
        }

        public b d(boolean z6) {
            this.f8568f = z6;
            return this;
        }

        public b e(String str) {
            this.f8566d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f8563a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f8565c = str;
            return this;
        }
    }

    public t(b bVar) {
        this.f8557a = bVar.f8563a;
        this.f8558b = bVar.f8564b;
        this.f8559c = bVar.f8565c;
        this.f8560d = bVar.f8566d;
        this.f8561e = bVar.f8567e;
        this.f8562f = bVar.f8568f;
    }

    public static t a(Person person) {
        return a.a(person);
    }

    public static t b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().f(bundle.getCharSequence(com.amazon.a.a.h.a.f10906a)).c(bundle2 != null ? IconCompat.a(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f8558b;
    }

    public String d() {
        return this.f8560d;
    }

    public CharSequence e() {
        return this.f8557a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String d6 = d();
        String d7 = tVar.d();
        return (d6 == null && d7 == null) ? Objects.equals(Objects.toString(e()), Objects.toString(tVar.e())) && Objects.equals(f(), tVar.f()) && Boolean.valueOf(g()).equals(Boolean.valueOf(tVar.g())) && Boolean.valueOf(h()).equals(Boolean.valueOf(tVar.h())) : Objects.equals(d6, d7);
    }

    public String f() {
        return this.f8559c;
    }

    public boolean g() {
        return this.f8561e;
    }

    public boolean h() {
        return this.f8562f;
    }

    public int hashCode() {
        String d6 = d();
        return d6 != null ? d6.hashCode() : Objects.hash(e(), f(), Boolean.valueOf(g()), Boolean.valueOf(h()));
    }

    public String i() {
        String str = this.f8559c;
        if (str != null) {
            return str;
        }
        if (this.f8557a == null) {
            return "";
        }
        return "name:" + ((Object) this.f8557a);
    }

    public Person j() {
        return a.b(this);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(com.amazon.a.a.h.a.f10906a, this.f8557a);
        IconCompat iconCompat = this.f8558b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.t() : null);
        bundle.putString("uri", this.f8559c);
        bundle.putString("key", this.f8560d);
        bundle.putBoolean("isBot", this.f8561e);
        bundle.putBoolean("isImportant", this.f8562f);
        return bundle;
    }
}
