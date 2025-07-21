package H2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import j0.C1638a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import z0.AbstractC2393D;

/* renamed from: H2.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0413n {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC0411l f2169a = new C0401b();

    /* renamed from: b, reason: collision with root package name */
    public static ThreadLocal f2170b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList f2171c = new ArrayList();

    /* renamed from: H2.n$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC0411l f2172a;

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup f2173b;

        /* renamed from: H2.n$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0040a extends AbstractC0412m {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1638a f2174a;

            public C0040a(C1638a c1638a) {
                this.f2174a = c1638a;
            }

            @Override // H2.AbstractC0411l.f
            public void b(AbstractC0411l abstractC0411l) {
                ((ArrayList) this.f2174a.get(a.this.f2173b)).remove(abstractC0411l);
                abstractC0411l.Q(this);
            }
        }

        public a(AbstractC0411l abstractC0411l, ViewGroup viewGroup) {
            this.f2172a = abstractC0411l;
            this.f2173b = viewGroup;
        }

        public final void a() {
            this.f2173b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2173b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!AbstractC0413n.f2171c.remove(this.f2173b)) {
                return true;
            }
            C1638a b6 = AbstractC0413n.b();
            ArrayList arrayList = (ArrayList) b6.get(this.f2173b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b6.put(this.f2173b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f2172a);
            this.f2172a.a(new C0040a(b6));
            this.f2172a.l(this.f2173b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0411l) it.next()).S(this.f2173b);
                }
            }
            this.f2172a.P(this.f2173b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            AbstractC0413n.f2171c.remove(this.f2173b);
            ArrayList arrayList = (ArrayList) AbstractC0413n.b().get(this.f2173b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0411l) it.next()).S(this.f2173b);
                }
            }
            this.f2172a.m(true);
        }
    }

    public static void a(ViewGroup viewGroup, AbstractC0411l abstractC0411l) {
        if (f2171c.contains(viewGroup) || !AbstractC2393D.A(viewGroup)) {
            return;
        }
        f2171c.add(viewGroup);
        if (abstractC0411l == null) {
            abstractC0411l = f2169a;
        }
        AbstractC0411l clone = abstractC0411l.clone();
        d(viewGroup, clone);
        AbstractC0410k.b(viewGroup, null);
        c(viewGroup, clone);
    }

    public static C1638a b() {
        C1638a c1638a;
        WeakReference weakReference = (WeakReference) f2170b.get();
        if (weakReference != null && (c1638a = (C1638a) weakReference.get()) != null) {
            return c1638a;
        }
        C1638a c1638a2 = new C1638a();
        f2170b.set(new WeakReference(c1638a2));
        return c1638a2;
    }

    public static void c(ViewGroup viewGroup, AbstractC0411l abstractC0411l) {
        if (abstractC0411l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0411l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, AbstractC0411l abstractC0411l) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0411l) it.next()).O(viewGroup);
            }
        }
        if (abstractC0411l != null) {
            abstractC0411l.l(viewGroup, true);
        }
        AbstractC0410k.a(viewGroup);
    }
}
