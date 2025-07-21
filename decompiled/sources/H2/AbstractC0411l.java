package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import j0.C1638a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import z0.AbstractC2393D;

/* renamed from: H2.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0411l implements Cloneable {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f2127F = {2, 1, 3, 4};

    /* renamed from: G, reason: collision with root package name */
    public static final AbstractC0406g f2128G = new a();

    /* renamed from: H, reason: collision with root package name */
    public static ThreadLocal f2129H = new ThreadLocal();

    /* renamed from: C, reason: collision with root package name */
    public e f2132C;

    /* renamed from: D, reason: collision with root package name */
    public C1638a f2133D;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2154t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2155u;

    /* renamed from: a, reason: collision with root package name */
    public String f2135a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2136b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2137c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2138d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2139e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f2140f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2141g = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f2142h = null;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f2143i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2144j = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2145k = null;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2146l = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2147m = null;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2148n = null;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2149o = null;

    /* renamed from: p, reason: collision with root package name */
    public t f2150p = new t();

    /* renamed from: q, reason: collision with root package name */
    public t f2151q = new t();

    /* renamed from: r, reason: collision with root package name */
    public C0415p f2152r = null;

    /* renamed from: s, reason: collision with root package name */
    public int[] f2153s = f2127F;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2156v = false;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2157w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public int f2158x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2159y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2160z = false;

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2130A = null;

    /* renamed from: B, reason: collision with root package name */
    public ArrayList f2131B = new ArrayList();

    /* renamed from: E, reason: collision with root package name */
    public AbstractC0406g f2134E = f2128G;

    /* renamed from: H2.l$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0406g {
        @Override // H2.AbstractC0406g
        public Path a(float f6, float f7, float f8, float f9) {
            Path path = new Path();
            path.moveTo(f6, f7);
            path.lineTo(f8, f9);
            return path;
        }
    }

    /* renamed from: H2.l$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1638a f2161a;

        public b(C1638a c1638a) {
            this.f2161a = c1638a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2161a.remove(animator);
            AbstractC0411l.this.f2157w.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0411l.this.f2157w.add(animator);
        }
    }

    /* renamed from: H2.l$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0411l.this.q();
            animator.removeListener(this);
        }
    }

    /* renamed from: H2.l$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public View f2164a;

        /* renamed from: b, reason: collision with root package name */
        public String f2165b;

        /* renamed from: c, reason: collision with root package name */
        public s f2166c;

        /* renamed from: d, reason: collision with root package name */
        public P f2167d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC0411l f2168e;

        public d(View view, String str, AbstractC0411l abstractC0411l, P p6, s sVar) {
            this.f2164a = view;
            this.f2165b = str;
            this.f2166c = sVar;
            this.f2167d = p6;
            this.f2168e = abstractC0411l;
        }
    }

    /* renamed from: H2.l$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class e {
    }

    /* renamed from: H2.l$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        void a(AbstractC0411l abstractC0411l);

        void b(AbstractC0411l abstractC0411l);

        void c(AbstractC0411l abstractC0411l);

        void d(AbstractC0411l abstractC0411l);

        void e(AbstractC0411l abstractC0411l);
    }

    public static boolean I(s sVar, s sVar2, String str) {
        Object obj = sVar.f2187a.get(str);
        Object obj2 = sVar2.f2187a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void e(t tVar, View view, s sVar) {
        tVar.f2190a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f2191b.indexOfKey(id) >= 0) {
                tVar.f2191b.put(id, null);
            } else {
                tVar.f2191b.put(id, view);
            }
        }
        String u6 = AbstractC2393D.u(view);
        if (u6 != null) {
            if (tVar.f2193d.containsKey(u6)) {
                tVar.f2193d.put(u6, null);
            } else {
                tVar.f2193d.put(u6, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f2192c.f(itemIdAtPosition) < 0) {
                    AbstractC2393D.T(view, true);
                    tVar.f2192c.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tVar.f2192c.e(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC2393D.T(view2, false);
                    tVar.f2192c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C1638a y() {
        C1638a c1638a = (C1638a) f2129H.get();
        if (c1638a != null) {
            return c1638a;
        }
        C1638a c1638a2 = new C1638a();
        f2129H.set(c1638a2);
        return c1638a2;
    }

    public List A() {
        return this.f2139e;
    }

    public List B() {
        return this.f2141g;
    }

    public List C() {
        return this.f2142h;
    }

    public List D() {
        return this.f2140f;
    }

    public String[] E() {
        return null;
    }

    public s F(View view, boolean z6) {
        C0415p c0415p = this.f2152r;
        if (c0415p != null) {
            return c0415p.F(view, z6);
        }
        return (s) (z6 ? this.f2150p : this.f2151q).f2190a.get(view);
    }

    public boolean G(s sVar, s sVar2) {
        if (sVar != null && sVar2 != null) {
            String[] E6 = E();
            if (E6 != null) {
                for (String str : E6) {
                    if (I(sVar, sVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sVar.f2187a.keySet().iterator();
                while (it.hasNext()) {
                    if (I(sVar, sVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean H(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f2143i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f2144j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f2145k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((Class) this.f2145k.get(i6)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f2146l != null && AbstractC2393D.u(view) != null && this.f2146l.contains(AbstractC2393D.u(view))) {
            return false;
        }
        if ((this.f2139e.size() == 0 && this.f2140f.size() == 0 && (((arrayList = this.f2142h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2141g) == null || arrayList2.isEmpty()))) || this.f2139e.contains(Integer.valueOf(id)) || this.f2140f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f2141g;
        if (arrayList6 != null && arrayList6.contains(AbstractC2393D.u(view))) {
            return true;
        }
        if (this.f2142h != null) {
            for (int i7 = 0; i7 < this.f2142h.size(); i7++) {
                if (((Class) this.f2142h.get(i7)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void J(C1638a c1638a, C1638a c1638a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) sparseArray.valueAt(i6);
            if (view2 != null && H(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i6))) != null && H(view)) {
                s sVar = (s) c1638a.get(view2);
                s sVar2 = (s) c1638a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f2154t.add(sVar);
                    this.f2155u.add(sVar2);
                    c1638a.remove(view2);
                    c1638a2.remove(view);
                }
            }
        }
    }

    public final void K(C1638a c1638a, C1638a c1638a2) {
        s sVar;
        for (int size = c1638a.size() - 1; size >= 0; size--) {
            View view = (View) c1638a.f(size);
            if (view != null && H(view) && (sVar = (s) c1638a2.remove(view)) != null && H(sVar.f2188b)) {
                this.f2154t.add((s) c1638a.h(size));
                this.f2155u.add(sVar);
            }
        }
    }

    public final void L(C1638a c1638a, C1638a c1638a2, j0.h hVar, j0.h hVar2) {
        View view;
        int j6 = hVar.j();
        for (int i6 = 0; i6 < j6; i6++) {
            View view2 = (View) hVar.k(i6);
            if (view2 != null && H(view2) && (view = (View) hVar2.e(hVar.g(i6))) != null && H(view)) {
                s sVar = (s) c1638a.get(view2);
                s sVar2 = (s) c1638a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f2154t.add(sVar);
                    this.f2155u.add(sVar2);
                    c1638a.remove(view2);
                    c1638a2.remove(view);
                }
            }
        }
    }

    public final void M(C1638a c1638a, C1638a c1638a2, C1638a c1638a3, C1638a c1638a4) {
        View view;
        int size = c1638a3.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) c1638a3.j(i6);
            if (view2 != null && H(view2) && (view = (View) c1638a4.get(c1638a3.f(i6))) != null && H(view)) {
                s sVar = (s) c1638a.get(view2);
                s sVar2 = (s) c1638a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f2154t.add(sVar);
                    this.f2155u.add(sVar2);
                    c1638a.remove(view2);
                    c1638a2.remove(view);
                }
            }
        }
    }

    public final void N(t tVar, t tVar2) {
        C1638a c1638a = new C1638a(tVar.f2190a);
        C1638a c1638a2 = new C1638a(tVar2.f2190a);
        int i6 = 0;
        while (true) {
            int[] iArr = this.f2153s;
            if (i6 >= iArr.length) {
                d(c1638a, c1638a2);
                return;
            }
            int i7 = iArr[i6];
            if (i7 == 1) {
                K(c1638a, c1638a2);
            } else if (i7 == 2) {
                M(c1638a, c1638a2, tVar.f2193d, tVar2.f2193d);
            } else if (i7 == 3) {
                J(c1638a, c1638a2, tVar.f2191b, tVar2.f2191b);
            } else if (i7 == 4) {
                L(c1638a, c1638a2, tVar.f2192c, tVar2.f2192c);
            }
            i6++;
        }
    }

    public void O(View view) {
        if (this.f2160z) {
            return;
        }
        for (int size = this.f2157w.size() - 1; size >= 0; size--) {
            AbstractC0400a.b((Animator) this.f2157w.get(size));
        }
        ArrayList arrayList = this.f2130A;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2130A.clone();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((f) arrayList2.get(i6)).a(this);
            }
        }
        this.f2159y = true;
    }

    public void P(ViewGroup viewGroup) {
        d dVar;
        this.f2154t = new ArrayList();
        this.f2155u = new ArrayList();
        N(this.f2150p, this.f2151q);
        C1638a y6 = y();
        int size = y6.size();
        P d6 = A.d(viewGroup);
        for (int i6 = size - 1; i6 >= 0; i6--) {
            Animator animator = (Animator) y6.f(i6);
            if (animator != null && (dVar = (d) y6.get(animator)) != null && dVar.f2164a != null && d6.equals(dVar.f2167d)) {
                s sVar = dVar.f2166c;
                View view = dVar.f2164a;
                s F6 = F(view, true);
                s u6 = u(view, true);
                if (F6 == null && u6 == null) {
                    u6 = (s) this.f2151q.f2190a.get(view);
                }
                if ((F6 != null || u6 != null) && dVar.f2168e.G(sVar, u6)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        y6.remove(animator);
                    }
                }
            }
        }
        p(viewGroup, this.f2150p, this.f2151q, this.f2154t, this.f2155u);
        U();
    }

    public AbstractC0411l Q(f fVar) {
        ArrayList arrayList = this.f2130A;
        if (arrayList != null) {
            arrayList.remove(fVar);
            if (this.f2130A.size() == 0) {
                this.f2130A = null;
            }
        }
        return this;
    }

    public AbstractC0411l R(View view) {
        this.f2140f.remove(view);
        return this;
    }

    public void S(View view) {
        if (this.f2159y) {
            if (!this.f2160z) {
                for (int size = this.f2157w.size() - 1; size >= 0; size--) {
                    AbstractC0400a.c((Animator) this.f2157w.get(size));
                }
                ArrayList arrayList = this.f2130A;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2130A.clone();
                    int size2 = arrayList2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        ((f) arrayList2.get(i6)).c(this);
                    }
                }
            }
            this.f2159y = false;
        }
    }

    public final void T(Animator animator, C1638a c1638a) {
        if (animator != null) {
            animator.addListener(new b(c1638a));
            f(animator);
        }
    }

    public void U() {
        b0();
        C1638a y6 = y();
        Iterator it = this.f2131B.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (y6.containsKey(animator)) {
                b0();
                T(animator, y6);
            }
        }
        this.f2131B.clear();
        q();
    }

    public AbstractC0411l V(long j6) {
        this.f2137c = j6;
        return this;
    }

    public void W(e eVar) {
        this.f2132C = eVar;
    }

    public AbstractC0411l X(TimeInterpolator timeInterpolator) {
        this.f2138d = timeInterpolator;
        return this;
    }

    public void Y(AbstractC0406g abstractC0406g) {
        if (abstractC0406g == null) {
            this.f2134E = f2128G;
        } else {
            this.f2134E = abstractC0406g;
        }
    }

    public void Z(AbstractC0414o abstractC0414o) {
    }

    public AbstractC0411l a(f fVar) {
        if (this.f2130A == null) {
            this.f2130A = new ArrayList();
        }
        this.f2130A.add(fVar);
        return this;
    }

    public AbstractC0411l a0(long j6) {
        this.f2136b = j6;
        return this;
    }

    public AbstractC0411l b(View view) {
        this.f2140f.add(view);
        return this;
    }

    public void b0() {
        if (this.f2158x == 0) {
            ArrayList arrayList = this.f2130A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2130A.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((f) arrayList2.get(i6)).d(this);
                }
            }
            this.f2160z = false;
        }
        this.f2158x++;
    }

    public String c0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2137c != -1) {
            str2 = str2 + "dur(" + this.f2137c + ") ";
        }
        if (this.f2136b != -1) {
            str2 = str2 + "dly(" + this.f2136b + ") ";
        }
        if (this.f2138d != null) {
            str2 = str2 + "interp(" + this.f2138d + ") ";
        }
        if (this.f2139e.size() <= 0 && this.f2140f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f2139e.size() > 0) {
            for (int i6 = 0; i6 < this.f2139e.size(); i6++) {
                if (i6 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f2139e.get(i6);
            }
        }
        if (this.f2140f.size() > 0) {
            for (int i7 = 0; i7 < this.f2140f.size(); i7++) {
                if (i7 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f2140f.get(i7);
            }
        }
        return str3 + ")";
    }

    public final void d(C1638a c1638a, C1638a c1638a2) {
        for (int i6 = 0; i6 < c1638a.size(); i6++) {
            s sVar = (s) c1638a.j(i6);
            if (H(sVar.f2188b)) {
                this.f2154t.add(sVar);
                this.f2155u.add(null);
            }
        }
        for (int i7 = 0; i7 < c1638a2.size(); i7++) {
            s sVar2 = (s) c1638a2.j(i7);
            if (H(sVar2.f2188b)) {
                this.f2155u.add(sVar2);
                this.f2154t.add(null);
            }
        }
    }

    public void f(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (z() >= 0) {
            animator.setStartDelay(z() + animator.getStartDelay());
        }
        if (t() != null) {
            animator.setInterpolator(t());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void g() {
        for (int size = this.f2157w.size() - 1; size >= 0; size--) {
            ((Animator) this.f2157w.get(size)).cancel();
        }
        ArrayList arrayList = this.f2130A;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f2130A.clone();
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ((f) arrayList2.get(i6)).e(this);
        }
    }

    public abstract void h(s sVar);

    public final void i(View view, boolean z6) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f2143i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f2144j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f2145k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (((Class) this.f2145k.get(i6)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z6) {
                        k(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f2189c.add(this);
                    j(sVar);
                    if (z6) {
                        e(this.f2150p, view, sVar);
                    } else {
                        e(this.f2151q, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f2147m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f2148n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f2149o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    if (((Class) this.f2149o.get(i7)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                                i(viewGroup.getChildAt(i8), z6);
                            }
                        }
                    }
                }
            }
        }
    }

    public void j(s sVar) {
    }

    public abstract void k(s sVar);

    public void l(ViewGroup viewGroup, boolean z6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1638a c1638a;
        m(z6);
        if ((this.f2139e.size() > 0 || this.f2140f.size() > 0) && (((arrayList = this.f2141g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2142h) == null || arrayList2.isEmpty()))) {
            for (int i6 = 0; i6 < this.f2139e.size(); i6++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f2139e.get(i6)).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z6) {
                        k(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f2189c.add(this);
                    j(sVar);
                    if (z6) {
                        e(this.f2150p, findViewById, sVar);
                    } else {
                        e(this.f2151q, findViewById, sVar);
                    }
                }
            }
            for (int i7 = 0; i7 < this.f2140f.size(); i7++) {
                View view = (View) this.f2140f.get(i7);
                s sVar2 = new s(view);
                if (z6) {
                    k(sVar2);
                } else {
                    h(sVar2);
                }
                sVar2.f2189c.add(this);
                j(sVar2);
                if (z6) {
                    e(this.f2150p, view, sVar2);
                } else {
                    e(this.f2151q, view, sVar2);
                }
            }
        } else {
            i(viewGroup, z6);
        }
        if (z6 || (c1638a = this.f2133D) == null) {
            return;
        }
        int size = c1638a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList3.add(this.f2150p.f2193d.remove((String) this.f2133D.f(i8)));
        }
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) arrayList3.get(i9);
            if (view2 != null) {
                this.f2150p.f2193d.put((String) this.f2133D.j(i9), view2);
            }
        }
    }

    public void m(boolean z6) {
        if (z6) {
            this.f2150p.f2190a.clear();
            this.f2150p.f2191b.clear();
            this.f2150p.f2192c.a();
        } else {
            this.f2151q.f2190a.clear();
            this.f2151q.f2191b.clear();
            this.f2151q.f2192c.a();
        }
    }

    @Override // 
    /* renamed from: n */
    public AbstractC0411l clone() {
        try {
            AbstractC0411l abstractC0411l = (AbstractC0411l) super.clone();
            abstractC0411l.f2131B = new ArrayList();
            abstractC0411l.f2150p = new t();
            abstractC0411l.f2151q = new t();
            abstractC0411l.f2154t = null;
            abstractC0411l.f2155u = null;
            return abstractC0411l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        s sVar;
        View view2;
        Animator animator2;
        C1638a y6 = y();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            s sVar2 = (s) arrayList.get(i6);
            s sVar3 = (s) arrayList2.get(i6);
            if (sVar2 != null && !sVar2.f2189c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f2189c.contains(this)) {
                sVar3 = null;
            }
            if ((sVar2 != null || sVar3 != null) && (sVar2 == null || sVar3 == null || G(sVar2, sVar3))) {
                Animator o6 = o(viewGroup, sVar2, sVar3);
                if (o6 != null) {
                    if (sVar3 != null) {
                        View view3 = sVar3.f2188b;
                        String[] E6 = E();
                        if (E6 != null && E6.length > 0) {
                            sVar = new s(view3);
                            s sVar4 = (s) tVar2.f2190a.get(view3);
                            if (sVar4 != null) {
                                int i7 = 0;
                                while (i7 < E6.length) {
                                    Map map = sVar.f2187a;
                                    String[] strArr = E6;
                                    String str = strArr[i7];
                                    map.put(str, sVar4.f2187a.get(str));
                                    i7++;
                                    E6 = strArr;
                                }
                            }
                            int size2 = y6.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size2) {
                                    view2 = view3;
                                    animator2 = o6;
                                    break;
                                }
                                d dVar = (d) y6.get((Animator) y6.f(i8));
                                if (dVar.f2166c != null && dVar.f2164a == view3) {
                                    view2 = view3;
                                    if (dVar.f2165b.equals(v()) && dVar.f2166c.equals(sVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i8++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = o6;
                            sVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = sVar2.f2188b;
                        animator = o6;
                        sVar = null;
                    }
                    if (animator != null) {
                        y6.put(animator, new d(view, v(), this, A.d(viewGroup), sVar));
                        this.f2131B.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                Animator animator3 = (Animator) this.f2131B.get(sparseIntArray.keyAt(i9));
                animator3.setStartDelay((sparseIntArray.valueAt(i9) - LongCompanionObject.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    public void q() {
        int i6 = this.f2158x - 1;
        this.f2158x = i6;
        if (i6 == 0) {
            ArrayList arrayList = this.f2130A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2130A.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((f) arrayList2.get(i7)).b(this);
                }
            }
            for (int i8 = 0; i8 < this.f2150p.f2192c.j(); i8++) {
                View view = (View) this.f2150p.f2192c.k(i8);
                if (view != null) {
                    AbstractC2393D.T(view, false);
                }
            }
            for (int i9 = 0; i9 < this.f2151q.f2192c.j(); i9++) {
                View view2 = (View) this.f2151q.f2192c.k(i9);
                if (view2 != null) {
                    AbstractC2393D.T(view2, false);
                }
            }
            this.f2160z = true;
        }
    }

    public long r() {
        return this.f2137c;
    }

    public e s() {
        return this.f2132C;
    }

    public TimeInterpolator t() {
        return this.f2138d;
    }

    public String toString() {
        return c0("");
    }

    public s u(View view, boolean z6) {
        C0415p c0415p = this.f2152r;
        if (c0415p != null) {
            return c0415p.u(view, z6);
        }
        ArrayList arrayList = z6 ? this.f2154t : this.f2155u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i6);
            if (sVar == null) {
                return null;
            }
            if (sVar.f2188b == view) {
                break;
            }
            i6++;
        }
        if (i6 >= 0) {
            return (s) (z6 ? this.f2155u : this.f2154t).get(i6);
        }
        return null;
    }

    public String v() {
        return this.f2135a;
    }

    public AbstractC0406g w() {
        return this.f2134E;
    }

    public AbstractC0414o x() {
        return null;
    }

    public long z() {
        return this.f2136b;
    }
}
