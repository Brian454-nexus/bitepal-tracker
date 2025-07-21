package X4;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final r f6279a;

    /* renamed from: b, reason: collision with root package name */
    public final a f6280b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f6281a = new HashMap();

        /* renamed from: X4.p$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0108a {

            /* renamed from: a, reason: collision with root package name */
            public final List f6282a;

            public C0108a(List list) {
                this.f6282a = list;
            }
        }

        public void a() {
            this.f6281a.clear();
        }

        public List b(Class cls) {
            C0108a c0108a = (C0108a) this.f6281a.get(cls);
            if (c0108a == null) {
                return null;
            }
            return c0108a.f6282a;
        }

        public void c(Class cls, List list) {
            if (((C0108a) this.f6281a.put(cls, new C0108a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(y0.d dVar) {
        this(new r(dVar));
    }

    public static Class b(Object obj) {
        return obj.getClass();
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f6279a.b(cls, cls2, oVar);
        this.f6280b.a();
    }

    public synchronized List c(Class cls) {
        return this.f6279a.g(cls);
    }

    public List d(Object obj) {
        List e6 = e(b(obj));
        if (e6.isEmpty()) {
            throw new i.c(obj);
        }
        int size = e6.size();
        List list = Collections.EMPTY_LIST;
        boolean z6 = true;
        for (int i6 = 0; i6 < size; i6++) {
            n nVar = (n) e6.get(i6);
            if (nVar.b(obj)) {
                if (z6) {
                    list = new ArrayList(size - i6);
                    z6 = false;
                }
                list.add(nVar);
            }
        }
        if (list.isEmpty()) {
            throw new i.c(obj, e6);
        }
        return list;
    }

    public final synchronized List e(Class cls) {
        List b6;
        b6 = this.f6280b.b(cls);
        if (b6 == null) {
            b6 = Collections.unmodifiableList(this.f6279a.e(cls));
            this.f6280b.c(cls, b6);
        }
        return b6;
    }

    public p(r rVar) {
        this.f6280b = new a();
        this.f6279a = rVar;
    }
}
