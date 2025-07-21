package A5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x5.m;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f201e = new C0006a().b();

    /* renamed from: a, reason: collision with root package name */
    public final f f202a;

    /* renamed from: b, reason: collision with root package name */
    public final List f203b;

    /* renamed from: c, reason: collision with root package name */
    public final b f204c;

    /* renamed from: d, reason: collision with root package name */
    public final String f205d;

    /* renamed from: A5.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0006a {

        /* renamed from: a, reason: collision with root package name */
        public f f206a = null;

        /* renamed from: b, reason: collision with root package name */
        public List f207b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public b f208c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f209d = "";

        public C0006a a(d dVar) {
            this.f207b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f206a, Collections.unmodifiableList(this.f207b), this.f208c, this.f209d);
        }

        public C0006a c(String str) {
            this.f209d = str;
            return this;
        }

        public C0006a d(b bVar) {
            this.f208c = bVar;
            return this;
        }

        public C0006a e(f fVar) {
            this.f206a = fVar;
            return this;
        }
    }

    public a(f fVar, List list, b bVar, String str) {
        this.f202a = fVar;
        this.f203b = list;
        this.f204c = bVar;
        this.f205d = str;
    }

    public static C0006a e() {
        return new C0006a();
    }

    public String a() {
        return this.f205d;
    }

    public b b() {
        return this.f204c;
    }

    public List c() {
        return this.f203b;
    }

    public f d() {
        return this.f202a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
