package x;

import I.AbstractC0460w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2255c extends AbstractC0460w0 {

    /* renamed from: x.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f20391a = new ArrayList();

        public a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                this.f20391a.add(null);
            }
        }

        public void a() {
            Iterator it = this.f20391a.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public List b() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f20391a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }

        public List c() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f20391a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }

        public List d() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f20391a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }

        public List e() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f20391a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public C2255c(AbstractC2254b... abstractC2254bArr) {
        a(Arrays.asList(abstractC2254bArr));
    }

    public static C2255c e() {
        return new C2255c(new AbstractC2254b[0]);
    }

    @Override // I.AbstractC0460w0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0460w0 clone() {
        C2255c e6 = e();
        e6.a(c());
        return e6;
    }

    public a d() {
        return new a(c());
    }
}
