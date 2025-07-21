package P0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z0.AbstractC2393D;
import z0.ViewTreeObserverOnPreDrawListenerC2439y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class U {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4085a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4086b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4087c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4088d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4089e;

        public a(int i6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4085a = i6;
            this.f4086b = arrayList;
            this.f4087c = arrayList2;
            this.f4088d = arrayList3;
            this.f4089e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i6 = 0; i6 < this.f4085a; i6++) {
                AbstractC2393D.Y((View) this.f4086b.get(i6), (String) this.f4087c.get(i6));
                AbstractC2393D.Y((View) this.f4088d.get(i6), (String) this.f4089e.get(i6));
            }
        }
    }

    public static void f(List list, View view) {
        int size = list.size();
        if (i(list, view, size)) {
            return;
        }
        if (AbstractC2393D.u(view) != null) {
            list.add(view);
        }
        for (int i6 = size; i6 < list.size(); i6++) {
            View view2 = (View) list.get(i6);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (!i(list, childAt, size) && AbstractC2393D.u(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean i(List list, View view, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (list.get(i7) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, Runnable runnable) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        if (!I.I0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    public ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            arrayList2.add(AbstractC2393D.u(view));
            AbstractC2393D.Y(view, null);
        }
        return arrayList2;
    }

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public void t(Object obj, float f6) {
    }

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public abstract void w(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Object obj, v0.e eVar, Runnable runnable);

    public void x(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Object obj, v0.e eVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) arrayList.get(i6);
            String u6 = AbstractC2393D.u(view2);
            arrayList4.add(u6);
            if (u6 != null) {
                AbstractC2393D.Y(view2, null);
                String str = (String) map.get(u6);
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i7))) {
                        AbstractC2393D.Y((View) arrayList2.get(i7), u6);
                        break;
                    }
                    i7++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC2439y.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);
}
