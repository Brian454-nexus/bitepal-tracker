package H2;

import H2.AbstractC0411l;
import P0.AbstractComponentCallbacksC0708p;
import P0.U;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import v0.e;

/* renamed from: H2.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0404e extends U {

    /* renamed from: H2.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0411l.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f2106a;

        public a(Rect rect) {
            this.f2106a = rect;
        }
    }

    /* renamed from: H2.e$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements AbstractC0411l.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2108a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2109b;

        public b(View view, ArrayList arrayList) {
            this.f2108a = view;
            this.f2109b = arrayList;
        }

        @Override // H2.AbstractC0411l.f
        public void a(AbstractC0411l abstractC0411l) {
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            abstractC0411l.Q(this);
            this.f2108a.setVisibility(8);
            int size = this.f2109b.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((View) this.f2109b.get(i6)).setVisibility(0);
            }
        }

        @Override // H2.AbstractC0411l.f
        public void c(AbstractC0411l abstractC0411l) {
        }

        @Override // H2.AbstractC0411l.f
        public void d(AbstractC0411l abstractC0411l) {
            abstractC0411l.Q(this);
            abstractC0411l.a(this);
        }

        @Override // H2.AbstractC0411l.f
        public void e(AbstractC0411l abstractC0411l) {
        }
    }

    /* renamed from: H2.e$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends AbstractC0412m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f2111a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2112b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f2113c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2114d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f2115e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2116f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2111a = obj;
            this.f2112b = arrayList;
            this.f2113c = obj2;
            this.f2114d = arrayList2;
            this.f2115e = obj3;
            this.f2116f = arrayList3;
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            abstractC0411l.Q(this);
        }

        @Override // H2.AbstractC0412m, H2.AbstractC0411l.f
        public void d(AbstractC0411l abstractC0411l) {
            Object obj = this.f2111a;
            if (obj != null) {
                C0404e.this.D(obj, this.f2112b, null);
            }
            Object obj2 = this.f2113c;
            if (obj2 != null) {
                C0404e.this.D(obj2, this.f2114d, null);
            }
            Object obj3 = this.f2115e;
            if (obj3 != null) {
                C0404e.this.D(obj3, this.f2116f, null);
            }
        }
    }

    /* renamed from: H2.e$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0411l f2118a;

        public d(AbstractC0411l abstractC0411l) {
            this.f2118a = abstractC0411l;
        }

        @Override // v0.e.a
        public void a() {
            this.f2118a.g();
        }
    }

    /* renamed from: H2.e$e, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0039e implements AbstractC0411l.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f2120a;

        public C0039e(Runnable runnable) {
            this.f2120a = runnable;
        }

        @Override // H2.AbstractC0411l.f
        public void a(AbstractC0411l abstractC0411l) {
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            this.f2120a.run();
        }

        @Override // H2.AbstractC0411l.f
        public void c(AbstractC0411l abstractC0411l) {
        }

        @Override // H2.AbstractC0411l.f
        public void d(AbstractC0411l abstractC0411l) {
        }

        @Override // H2.AbstractC0411l.f
        public void e(AbstractC0411l abstractC0411l) {
        }
    }

    /* renamed from: H2.e$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f extends AbstractC0411l.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f2122a;

        public f(Rect rect) {
            this.f2122a = rect;
        }
    }

    public static boolean C(AbstractC0411l abstractC0411l) {
        return (U.l(abstractC0411l.A()) && U.l(abstractC0411l.B()) && U.l(abstractC0411l.C())) ? false : true;
    }

    @Override // P0.U
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0415p c0415p = (C0415p) obj;
        if (c0415p != null) {
            c0415p.D().clear();
            c0415p.D().addAll(arrayList2);
            D(c0415p, arrayList, arrayList2);
        }
    }

    @Override // P0.U
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        C0415p c0415p = new C0415p();
        c0415p.f0((AbstractC0411l) obj);
        return c0415p;
    }

    public void D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0411l abstractC0411l = (AbstractC0411l) obj;
        int i6 = 0;
        if (abstractC0411l instanceof C0415p) {
            C0415p c0415p = (C0415p) abstractC0411l;
            int i02 = c0415p.i0();
            while (i6 < i02) {
                D(c0415p.h0(i6), arrayList, arrayList2);
                i6++;
            }
            return;
        }
        if (C(abstractC0411l)) {
            return;
        }
        List D6 = abstractC0411l.D();
        if (D6.size() == arrayList.size() && D6.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i6 < size) {
                abstractC0411l.b((View) arrayList2.get(i6));
                i6++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0411l.R((View) arrayList.get(size2));
            }
        }
    }

    @Override // P0.U
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0411l) obj).b(view);
        }
    }

    @Override // P0.U
    public void b(Object obj, ArrayList arrayList) {
        AbstractC0411l abstractC0411l = (AbstractC0411l) obj;
        if (abstractC0411l == null) {
            return;
        }
        int i6 = 0;
        if (abstractC0411l instanceof C0415p) {
            C0415p c0415p = (C0415p) abstractC0411l;
            int i02 = c0415p.i0();
            while (i6 < i02) {
                b(c0415p.h0(i6), arrayList);
                i6++;
            }
            return;
        }
        if (C(abstractC0411l) || !U.l(abstractC0411l.D())) {
            return;
        }
        int size = arrayList.size();
        while (i6 < size) {
            abstractC0411l.b((View) arrayList.get(i6));
            i6++;
        }
    }

    @Override // P0.U
    public void e(ViewGroup viewGroup, Object obj) {
        AbstractC0413n.a(viewGroup, (AbstractC0411l) obj);
    }

    @Override // P0.U
    public boolean g(Object obj) {
        return obj instanceof AbstractC0411l;
    }

    @Override // P0.U
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC0411l) obj).clone();
        }
        return null;
    }

    @Override // P0.U
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC0411l abstractC0411l = (AbstractC0411l) obj;
        AbstractC0411l abstractC0411l2 = (AbstractC0411l) obj2;
        AbstractC0411l abstractC0411l3 = (AbstractC0411l) obj3;
        if (abstractC0411l != null && abstractC0411l2 != null) {
            abstractC0411l = new C0415p().f0(abstractC0411l).f0(abstractC0411l2).n0(1);
        } else if (abstractC0411l == null) {
            abstractC0411l = abstractC0411l2 != null ? abstractC0411l2 : null;
        }
        if (abstractC0411l3 == null) {
            return abstractC0411l;
        }
        C0415p c0415p = new C0415p();
        if (abstractC0411l != null) {
            c0415p.f0(abstractC0411l);
        }
        c0415p.f0(abstractC0411l3);
        return c0415p;
    }

    @Override // P0.U
    public Object p(Object obj, Object obj2, Object obj3) {
        C0415p c0415p = new C0415p();
        if (obj != null) {
            c0415p.f0((AbstractC0411l) obj);
        }
        if (obj2 != null) {
            c0415p.f0((AbstractC0411l) obj2);
        }
        if (obj3 != null) {
            c0415p.f0((AbstractC0411l) obj3);
        }
        return c0415p;
    }

    @Override // P0.U
    public void r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0411l) obj).a(new b(view, arrayList));
    }

    @Override // P0.U
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC0411l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // P0.U
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0411l) obj).W(new f(rect));
        }
    }

    @Override // P0.U
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC0411l) obj).W(new a(rect));
        }
    }

    @Override // P0.U
    public void w(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Object obj, v0.e eVar, Runnable runnable) {
        AbstractC0411l abstractC0411l = (AbstractC0411l) obj;
        eVar.b(new d(abstractC0411l));
        abstractC0411l.a(new C0039e(runnable));
    }

    @Override // P0.U
    public void z(Object obj, View view, ArrayList arrayList) {
        C0415p c0415p = (C0415p) obj;
        List D6 = c0415p.D();
        D6.clear();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            U.f(D6, (View) arrayList.get(i6));
        }
        D6.add(view);
        arrayList.add(view);
        b(c0415p, arrayList);
    }
}
