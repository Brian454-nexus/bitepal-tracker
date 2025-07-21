package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d extends n {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f9901s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f9902h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f9903i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f9904j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f9905k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f9906l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f9907m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f9908n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f9909o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f9910p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f9911q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f9912r = new ArrayList();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9913a;

        public a(ArrayList arrayList) {
            this.f9913a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9913a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                d.this.U(jVar.f9947a, jVar.f9948b, jVar.f9949c, jVar.f9950d, jVar.f9951e);
            }
            this.f9913a.clear();
            d.this.f9907m.remove(this.f9913a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9915a;

        public b(ArrayList arrayList) {
            this.f9915a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9915a.iterator();
            while (it.hasNext()) {
                d.this.T((i) it.next());
            }
            this.f9915a.clear();
            d.this.f9908n.remove(this.f9915a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9917a;

        public c(ArrayList arrayList) {
            this.f9917a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9917a.iterator();
            while (it.hasNext()) {
                d.this.S((RecyclerView.D) it.next());
            }
            this.f9917a.clear();
            d.this.f9906l.remove(this.f9917a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0147d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f9919a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f9920b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f9921c;

        public C0147d(RecyclerView.D d6, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9919a = d6;
            this.f9920b = viewPropertyAnimator;
            this.f9921c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9920b.setListener(null);
            this.f9921c.setAlpha(1.0f);
            d.this.H(this.f9919a);
            d.this.f9911q.remove(this.f9919a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.I(this.f9919a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f9923a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f9924b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f9925c;

        public e(RecyclerView.D d6, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9923a = d6;
            this.f9924b = view;
            this.f9925c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9924b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9925c.setListener(null);
            d.this.B(this.f9923a);
            d.this.f9909o.remove(this.f9923a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.C(this.f9923a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f9927a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9928b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f9929c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f9930d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f9931e;

        public f(RecyclerView.D d6, int i6, View view, int i7, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9927a = d6;
            this.f9928b = i6;
            this.f9929c = view;
            this.f9930d = i7;
            this.f9931e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f9928b != 0) {
                this.f9929c.setTranslationX(0.0f);
            }
            if (this.f9930d != 0) {
                this.f9929c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9931e.setListener(null);
            d.this.F(this.f9927a);
            d.this.f9910p.remove(this.f9927a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.G(this.f9927a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f9933a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f9934b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f9935c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9933a = iVar;
            this.f9934b = viewPropertyAnimator;
            this.f9935c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9934b.setListener(null);
            this.f9935c.setAlpha(1.0f);
            this.f9935c.setTranslationX(0.0f);
            this.f9935c.setTranslationY(0.0f);
            d.this.D(this.f9933a.f9941a, true);
            d.this.f9912r.remove(this.f9933a.f9941a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.E(this.f9933a.f9941a, true);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f9937a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f9938b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f9939c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9937a = iVar;
            this.f9938b = viewPropertyAnimator;
            this.f9939c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9938b.setListener(null);
            this.f9939c.setAlpha(1.0f);
            this.f9939c.setTranslationX(0.0f);
            this.f9939c.setTranslationY(0.0f);
            d.this.D(this.f9937a.f9942b, false);
            d.this.f9912r.remove(this.f9937a.f9942b);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.E(this.f9937a.f9942b, false);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.D f9947a;

        /* renamed from: b, reason: collision with root package name */
        public int f9948b;

        /* renamed from: c, reason: collision with root package name */
        public int f9949c;

        /* renamed from: d, reason: collision with root package name */
        public int f9950d;

        /* renamed from: e, reason: collision with root package name */
        public int f9951e;

        public j(RecyclerView.D d6, int i6, int i7, int i8, int i9) {
            this.f9947a = d6;
            this.f9948b = i6;
            this.f9949c = i7;
            this.f9950d = i8;
            this.f9951e = i9;
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean A(RecyclerView.D d6) {
        b0(d6);
        this.f9902h.add(d6);
        return true;
    }

    public void S(RecyclerView.D d6) {
        View view = d6.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f9909o.add(d6);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d6, view, animate)).start();
    }

    public void T(i iVar) {
        RecyclerView.D d6 = iVar.f9941a;
        View view = d6 == null ? null : d6.itemView;
        RecyclerView.D d7 = iVar.f9942b;
        View view2 = d7 != null ? d7.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f9912r.add(iVar.f9941a);
            duration.translationX(iVar.f9945e - iVar.f9943c);
            duration.translationY(iVar.f9946f - iVar.f9944d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f9912r.add(iVar.f9942b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public void U(RecyclerView.D d6, int i6, int i7, int i8, int i9) {
        View view = d6.itemView;
        int i10 = i8 - i6;
        int i11 = i9 - i7;
        if (i10 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i11 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f9910p.add(d6);
        animate.setDuration(n()).setListener(new f(d6, i10, view, i11, animate)).start();
    }

    public final void V(RecyclerView.D d6) {
        View view = d6.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f9911q.add(d6);
        animate.setDuration(o()).alpha(0.0f).setListener(new C0147d(d6, animate, view)).start();
    }

    public void W(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.D) list.get(size)).itemView.animate().cancel();
        }
    }

    public void X() {
        if (p()) {
            return;
        }
        i();
    }

    public final void Y(List list, RecyclerView.D d6) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (a0(iVar, d6) && iVar.f9941a == null && iVar.f9942b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void Z(i iVar) {
        RecyclerView.D d6 = iVar.f9941a;
        if (d6 != null) {
            a0(iVar, d6);
        }
        RecyclerView.D d7 = iVar.f9942b;
        if (d7 != null) {
            a0(iVar, d7);
        }
    }

    public final boolean a0(i iVar, RecyclerView.D d6) {
        boolean z6 = false;
        if (iVar.f9942b == d6) {
            iVar.f9942b = null;
        } else {
            if (iVar.f9941a != d6) {
                return false;
            }
            iVar.f9941a = null;
            z6 = true;
        }
        d6.itemView.setAlpha(1.0f);
        d6.itemView.setTranslationX(0.0f);
        d6.itemView.setTranslationY(0.0f);
        D(d6, z6);
        return true;
    }

    public final void b0(RecyclerView.D d6) {
        if (f9901s == null) {
            f9901s = new ValueAnimator().getInterpolator();
        }
        d6.itemView.animate().setInterpolator(f9901s);
        j(d6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.D d6, List list) {
        return !list.isEmpty() || super.g(d6, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.D d6) {
        View view = d6.itemView;
        view.animate().cancel();
        int size = this.f9904j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f9904j.get(size)).f9947a == d6) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(d6);
                this.f9904j.remove(size);
            }
        }
        Y(this.f9905k, d6);
        if (this.f9902h.remove(d6)) {
            view.setAlpha(1.0f);
            H(d6);
        }
        if (this.f9903i.remove(d6)) {
            view.setAlpha(1.0f);
            B(d6);
        }
        for (int size2 = this.f9908n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f9908n.get(size2);
            Y(arrayList, d6);
            if (arrayList.isEmpty()) {
                this.f9908n.remove(size2);
            }
        }
        for (int size3 = this.f9907m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f9907m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f9947a == d6) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(d6);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f9907m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f9906l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f9906l.get(size5);
            if (arrayList3.remove(d6)) {
                view.setAlpha(1.0f);
                B(d6);
                if (arrayList3.isEmpty()) {
                    this.f9906l.remove(size5);
                }
            }
        }
        this.f9911q.remove(d6);
        this.f9909o.remove(d6);
        this.f9912r.remove(d6);
        this.f9910p.remove(d6);
        X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f9904j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f9904j.get(size);
            View view = jVar.f9947a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.f9947a);
            this.f9904j.remove(size);
        }
        for (int size2 = this.f9902h.size() - 1; size2 >= 0; size2--) {
            H((RecyclerView.D) this.f9902h.get(size2));
            this.f9902h.remove(size2);
        }
        int size3 = this.f9903i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.D d6 = (RecyclerView.D) this.f9903i.get(size3);
            d6.itemView.setAlpha(1.0f);
            B(d6);
            this.f9903i.remove(size3);
        }
        for (int size4 = this.f9905k.size() - 1; size4 >= 0; size4--) {
            Z((i) this.f9905k.get(size4));
        }
        this.f9905k.clear();
        if (p()) {
            for (int size5 = this.f9907m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f9907m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f9947a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.f9947a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f9907m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f9906l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f9906l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.D d7 = (RecyclerView.D) arrayList2.get(size8);
                    d7.itemView.setAlpha(1.0f);
                    B(d7);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f9906l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f9908n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f9908n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Z((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f9908n.remove(arrayList3);
                    }
                }
            }
            W(this.f9911q);
            W(this.f9910p);
            W(this.f9909o);
            W(this.f9912r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f9903i.isEmpty() && this.f9905k.isEmpty() && this.f9904j.isEmpty() && this.f9902h.isEmpty() && this.f9910p.isEmpty() && this.f9911q.isEmpty() && this.f9909o.isEmpty() && this.f9912r.isEmpty() && this.f9907m.isEmpty() && this.f9906l.isEmpty() && this.f9908n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v() {
        boolean isEmpty = this.f9902h.isEmpty();
        boolean isEmpty2 = this.f9904j.isEmpty();
        boolean isEmpty3 = this.f9905k.isEmpty();
        boolean isEmpty4 = this.f9903i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = this.f9902h.iterator();
        while (it.hasNext()) {
            V((RecyclerView.D) it.next());
        }
        this.f9902h.clear();
        if (!isEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f9904j);
            this.f9907m.add(arrayList);
            this.f9904j.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                AbstractC2393D.J(((j) arrayList.get(0)).f9947a.itemView, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f9905k);
            this.f9908n.add(arrayList2);
            this.f9905k.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                AbstractC2393D.J(((i) arrayList2.get(0)).f9941a.itemView, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f9903i);
        this.f9906l.add(arrayList3);
        this.f9903i.clear();
        c cVar = new c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            AbstractC2393D.J(((RecyclerView.D) arrayList3.get(0)).itemView, cVar, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean x(RecyclerView.D d6) {
        b0(d6);
        d6.itemView.setAlpha(0.0f);
        this.f9903i.add(d6);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean y(RecyclerView.D d6, RecyclerView.D d7, int i6, int i7, int i8, int i9) {
        if (d6 == d7) {
            return z(d6, i6, i7, i8, i9);
        }
        float translationX = d6.itemView.getTranslationX();
        float translationY = d6.itemView.getTranslationY();
        float alpha = d6.itemView.getAlpha();
        b0(d6);
        int i10 = (int) ((i8 - i6) - translationX);
        int i11 = (int) ((i9 - i7) - translationY);
        d6.itemView.setTranslationX(translationX);
        d6.itemView.setTranslationY(translationY);
        d6.itemView.setAlpha(alpha);
        if (d7 != null) {
            b0(d7);
            d7.itemView.setTranslationX(-i10);
            d7.itemView.setTranslationY(-i11);
            d7.itemView.setAlpha(0.0f);
        }
        this.f9905k.add(new i(d6, d7, i6, i7, i8, i9));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean z(RecyclerView.D d6, int i6, int i7, int i8, int i9) {
        View view = d6.itemView;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i7 + ((int) d6.itemView.getTranslationY());
        b0(d6);
        int i10 = i8 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            F(d6);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        this.f9904j.add(new j(d6, translationX, translationY, i8, i9));
        return true;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.D f9941a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.D f9942b;

        /* renamed from: c, reason: collision with root package name */
        public int f9943c;

        /* renamed from: d, reason: collision with root package name */
        public int f9944d;

        /* renamed from: e, reason: collision with root package name */
        public int f9945e;

        /* renamed from: f, reason: collision with root package name */
        public int f9946f;

        public i(RecyclerView.D d6, RecyclerView.D d7) {
            this.f9941a = d6;
            this.f9942b = d7;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f9941a + ", newHolder=" + this.f9942b + ", fromX=" + this.f9943c + ", fromY=" + this.f9944d + ", toX=" + this.f9945e + ", toY=" + this.f9946f + '}';
        }

        public i(RecyclerView.D d6, RecyclerView.D d7, int i6, int i7, int i8, int i9) {
            this(d6, d7);
            this.f9943c = i6;
            this.f9944d = i7;
            this.f9945e = i8;
            this.f9946f = i9;
        }
    }
}
