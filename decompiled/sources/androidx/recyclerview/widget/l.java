package androidx.recyclerview.widget;

import A0.s;
import A0.t;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import z0.AbstractC2393D;
import z0.C2415a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l extends C2415a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f10096d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10097e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends C2415a {

        /* renamed from: d, reason: collision with root package name */
        public final l f10098d;

        /* renamed from: e, reason: collision with root package name */
        public Map f10099e = new WeakHashMap();

        public a(l lVar) {
            this.f10098d = lVar;
        }

        @Override // z0.C2415a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            return c2415a != null ? c2415a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // z0.C2415a
        public t b(View view) {
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            return c2415a != null ? c2415a.b(view) : super.b(view);
        }

        @Override // z0.C2415a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            if (c2415a != null) {
                c2415a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // z0.C2415a
        public void g(View view, s sVar) {
            if (this.f10098d.o() || this.f10098d.f10096d.getLayoutManager() == null) {
                super.g(view, sVar);
                return;
            }
            this.f10098d.f10096d.getLayoutManager().N0(view, sVar);
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            if (c2415a != null) {
                c2415a.g(view, sVar);
            } else {
                super.g(view, sVar);
            }
        }

        @Override // z0.C2415a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            if (c2415a != null) {
                c2415a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // z0.C2415a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2415a c2415a = (C2415a) this.f10099e.get(viewGroup);
            return c2415a != null ? c2415a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // z0.C2415a
        public boolean j(View view, int i6, Bundle bundle) {
            if (this.f10098d.o() || this.f10098d.f10096d.getLayoutManager() == null) {
                return super.j(view, i6, bundle);
            }
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            if (c2415a != null) {
                if (c2415a.j(view, i6, bundle)) {
                    return true;
                }
            } else if (super.j(view, i6, bundle)) {
                return true;
            }
            return this.f10098d.f10096d.getLayoutManager().g1(view, i6, bundle);
        }

        @Override // z0.C2415a
        public void l(View view, int i6) {
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            if (c2415a != null) {
                c2415a.l(view, i6);
            } else {
                super.l(view, i6);
            }
        }

        @Override // z0.C2415a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C2415a c2415a = (C2415a) this.f10099e.get(view);
            if (c2415a != null) {
                c2415a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public C2415a n(View view) {
            return (C2415a) this.f10099e.remove(view);
        }

        public void o(View view) {
            C2415a e6 = AbstractC2393D.e(view);
            if (e6 == null || e6 == this) {
                return;
            }
            this.f10099e.put(view, e6);
        }
    }

    public l(RecyclerView recyclerView) {
        this.f10096d = recyclerView;
        C2415a n6 = n();
        if (n6 == null || !(n6 instanceof a)) {
            this.f10097e = new a(this);
        } else {
            this.f10097e = (a) n6;
        }
    }

    @Override // z0.C2415a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().J0(accessibilityEvent);
        }
    }

    @Override // z0.C2415a
    public void g(View view, s sVar) {
        super.g(view, sVar);
        if (o() || this.f10096d.getLayoutManager() == null) {
            return;
        }
        this.f10096d.getLayoutManager().L0(sVar);
    }

    @Override // z0.C2415a
    public boolean j(View view, int i6, Bundle bundle) {
        if (super.j(view, i6, bundle)) {
            return true;
        }
        if (o() || this.f10096d.getLayoutManager() == null) {
            return false;
        }
        return this.f10096d.getLayoutManager().e1(i6, bundle);
    }

    public C2415a n() {
        return this.f10097e;
    }

    public boolean o() {
        return this.f10096d.m0();
    }
}
