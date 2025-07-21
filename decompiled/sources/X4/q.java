package X4;

import X4.n;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f6283a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.d f6284b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements com.bumptech.glide.load.data.d, d.a {

        /* renamed from: a, reason: collision with root package name */
        public final List f6285a;

        /* renamed from: b, reason: collision with root package name */
        public final y0.d f6286b;

        /* renamed from: c, reason: collision with root package name */
        public int f6287c;

        /* renamed from: d, reason: collision with root package name */
        public com.bumptech.glide.g f6288d;

        /* renamed from: e, reason: collision with root package name */
        public d.a f6289e;

        /* renamed from: f, reason: collision with root package name */
        public List f6290f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6291g;

        public a(List list, y0.d dVar) {
            this.f6286b = dVar;
            n5.k.c(list);
            this.f6285a = list;
            this.f6287c = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f6285a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f6290f;
            if (list != null) {
                this.f6286b.a(list);
            }
            this.f6290f = null;
            Iterator it = this.f6285a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) n5.k.d(this.f6290f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f6291g = true;
            Iterator it = this.f6285a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public R4.a d() {
            return ((com.bumptech.glide.load.data.d) this.f6285a.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            this.f6288d = gVar;
            this.f6289e = aVar;
            this.f6290f = (List) this.f6286b.b();
            ((com.bumptech.glide.load.data.d) this.f6285a.get(this.f6287c)).e(gVar, this);
            if (this.f6291g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f6289e.f(obj);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f6291g) {
                return;
            }
            if (this.f6287c < this.f6285a.size() - 1) {
                this.f6287c++;
                e(this.f6288d, this.f6289e);
            } else {
                n5.k.d(this.f6290f);
                this.f6289e.c(new T4.q("Fetch failed", new ArrayList(this.f6290f)));
            }
        }
    }

    public q(List list, y0.d dVar) {
        this.f6283a = list;
        this.f6284b = dVar;
    }

    @Override // X4.n
    public n.a a(Object obj, int i6, int i7, R4.h hVar) {
        n.a a6;
        int size = this.f6283a.size();
        ArrayList arrayList = new ArrayList(size);
        R4.f fVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            n nVar = (n) this.f6283a.get(i8);
            if (nVar.b(obj) && (a6 = nVar.a(obj, i6, i7, hVar)) != null) {
                fVar = a6.f6276a;
                arrayList.add(a6.f6278c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a(fVar, new a(arrayList, this.f6284b));
    }

    @Override // X4.n
    public boolean b(Object obj) {
        Iterator it = this.f6283a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f6283a.toArray()) + '}';
    }
}
