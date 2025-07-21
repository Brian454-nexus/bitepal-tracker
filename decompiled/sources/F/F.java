package F;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final List f1250a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1251b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1252c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1253d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f1254a;

        /* renamed from: b, reason: collision with root package name */
        public final List f1255b;

        /* renamed from: c, reason: collision with root package name */
        public final List f1256c;

        /* renamed from: d, reason: collision with root package name */
        public long f1257d;

        public a(l0 l0Var) {
            this(l0Var, 7);
        }

        public a a(l0 l0Var) {
            return b(l0Var, 7);
        }

        public a b(l0 l0Var, int i6) {
            boolean z6 = false;
            y0.g.b(l0Var != null, "Point cannot be null.");
            if (i6 >= 1 && i6 <= 7) {
                z6 = true;
            }
            y0.g.b(z6, "Invalid metering mode " + i6);
            if ((i6 & 1) != 0) {
                this.f1254a.add(l0Var);
            }
            if ((i6 & 2) != 0) {
                this.f1255b.add(l0Var);
            }
            if ((i6 & 4) != 0) {
                this.f1256c.add(l0Var);
            }
            return this;
        }

        public F c() {
            return new F(this);
        }

        public a d() {
            this.f1257d = 0L;
            return this;
        }

        public a e(int i6) {
            if ((i6 & 1) != 0) {
                this.f1254a.clear();
            }
            if ((i6 & 2) != 0) {
                this.f1255b.clear();
            }
            if ((i6 & 4) != 0) {
                this.f1256c.clear();
            }
            return this;
        }

        public a(l0 l0Var, int i6) {
            this.f1254a = new ArrayList();
            this.f1255b = new ArrayList();
            this.f1256c = new ArrayList();
            this.f1257d = 5000L;
            b(l0Var, i6);
        }

        public a(F f6) {
            ArrayList arrayList = new ArrayList();
            this.f1254a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f1255b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f1256c = arrayList3;
            this.f1257d = 5000L;
            arrayList.addAll(f6.c());
            arrayList2.addAll(f6.b());
            arrayList3.addAll(f6.d());
            this.f1257d = f6.a();
        }
    }

    public F(a aVar) {
        this.f1250a = Collections.unmodifiableList(aVar.f1254a);
        this.f1251b = Collections.unmodifiableList(aVar.f1255b);
        this.f1252c = Collections.unmodifiableList(aVar.f1256c);
        this.f1253d = aVar.f1257d;
    }

    public long a() {
        return this.f1253d;
    }

    public List b() {
        return this.f1251b;
    }

    public List c() {
        return this.f1250a;
    }

    public List d() {
        return this.f1252c;
    }

    public boolean e() {
        return this.f1253d > 0;
    }
}
