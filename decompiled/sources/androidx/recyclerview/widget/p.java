package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final j0.k f10108a = new j0.k();

    /* renamed from: b, reason: collision with root package name */
    public final j0.h f10109b = new j0.h();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static y0.d f10110d = new y0.e(20);

        /* renamed from: a, reason: collision with root package name */
        public int f10111a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.m.c f10112b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.m.c f10113c;

        public static void a() {
            do {
            } while (f10110d.b() != null);
        }

        public static a b() {
            a aVar = (a) f10110d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.f10111a = 0;
            aVar.f10112b = null;
            aVar.f10113c = null;
            f10110d.a(aVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(RecyclerView.D d6);

        void b(RecyclerView.D d6, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.D d6, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.D d6, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    public void a(RecyclerView.D d6, RecyclerView.m.c cVar) {
        a aVar = (a) this.f10108a.get(d6);
        if (aVar == null) {
            aVar = a.b();
            this.f10108a.put(d6, aVar);
        }
        aVar.f10111a |= 2;
        aVar.f10112b = cVar;
    }

    public void b(RecyclerView.D d6) {
        a aVar = (a) this.f10108a.get(d6);
        if (aVar == null) {
            aVar = a.b();
            this.f10108a.put(d6, aVar);
        }
        aVar.f10111a |= 1;
    }

    public void c(long j6, RecyclerView.D d6) {
        this.f10109b.h(j6, d6);
    }

    public void d(RecyclerView.D d6, RecyclerView.m.c cVar) {
        a aVar = (a) this.f10108a.get(d6);
        if (aVar == null) {
            aVar = a.b();
            this.f10108a.put(d6, aVar);
        }
        aVar.f10113c = cVar;
        aVar.f10111a |= 8;
    }

    public void e(RecyclerView.D d6, RecyclerView.m.c cVar) {
        a aVar = (a) this.f10108a.get(d6);
        if (aVar == null) {
            aVar = a.b();
            this.f10108a.put(d6, aVar);
        }
        aVar.f10112b = cVar;
        aVar.f10111a |= 4;
    }

    public void f() {
        this.f10108a.clear();
        this.f10109b.a();
    }

    public RecyclerView.D g(long j6) {
        return (RecyclerView.D) this.f10109b.e(j6);
    }

    public boolean h(RecyclerView.D d6) {
        a aVar = (a) this.f10108a.get(d6);
        return (aVar == null || (aVar.f10111a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.D d6) {
        a aVar = (a) this.f10108a.get(d6);
        return (aVar == null || (aVar.f10111a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.D d6) {
        p(d6);
    }

    public final RecyclerView.m.c l(RecyclerView.D d6, int i6) {
        a aVar;
        RecyclerView.m.c cVar;
        int d7 = this.f10108a.d(d6);
        if (d7 >= 0 && (aVar = (a) this.f10108a.j(d7)) != null) {
            int i7 = aVar.f10111a;
            if ((i7 & i6) != 0) {
                int i8 = (~i6) & i7;
                aVar.f10111a = i8;
                if (i6 == 4) {
                    cVar = aVar.f10112b;
                } else {
                    if (i6 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f10113c;
                }
                if ((i8 & 12) == 0) {
                    this.f10108a.h(d7);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.m.c m(RecyclerView.D d6) {
        return l(d6, 8);
    }

    public RecyclerView.m.c n(RecyclerView.D d6) {
        return l(d6, 4);
    }

    public void o(b bVar) {
        for (int size = this.f10108a.size() - 1; size >= 0; size--) {
            RecyclerView.D d6 = (RecyclerView.D) this.f10108a.f(size);
            a aVar = (a) this.f10108a.h(size);
            int i6 = aVar.f10111a;
            if ((i6 & 3) == 3) {
                bVar.a(d6);
            } else if ((i6 & 1) != 0) {
                RecyclerView.m.c cVar = aVar.f10112b;
                if (cVar == null) {
                    bVar.a(d6);
                } else {
                    bVar.c(d6, cVar, aVar.f10113c);
                }
            } else if ((i6 & 14) == 14) {
                bVar.b(d6, aVar.f10112b, aVar.f10113c);
            } else if ((i6 & 12) == 12) {
                bVar.d(d6, aVar.f10112b, aVar.f10113c);
            } else if ((i6 & 4) != 0) {
                bVar.c(d6, aVar.f10112b, null);
            } else if ((i6 & 8) != 0) {
                bVar.b(d6, aVar.f10112b, aVar.f10113c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.D d6) {
        a aVar = (a) this.f10108a.get(d6);
        if (aVar == null) {
            return;
        }
        aVar.f10111a &= -2;
    }

    public void q(RecyclerView.D d6) {
        int j6 = this.f10109b.j() - 1;
        while (true) {
            if (j6 < 0) {
                break;
            }
            if (d6 == this.f10109b.k(j6)) {
                this.f10109b.i(j6);
                break;
            }
            j6--;
        }
        a aVar = (a) this.f10108a.remove(d6);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
