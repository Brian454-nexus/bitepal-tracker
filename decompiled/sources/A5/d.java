package A5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f227c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f228a;

    /* renamed from: b, reason: collision with root package name */
    public final List f229b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f230a = "";

        /* renamed from: b, reason: collision with root package name */
        public List f231b = new ArrayList();

        public d a() {
            return new d(this.f230a, Collections.unmodifiableList(this.f231b));
        }

        public a b(List list) {
            this.f231b = list;
            return this;
        }

        public a c(String str) {
            this.f230a = str;
            return this;
        }
    }

    public d(String str, List list) {
        this.f228a = str;
        this.f229b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f229b;
    }

    public String b() {
        return this.f228a;
    }
}
