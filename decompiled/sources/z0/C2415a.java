package z0;

import A0.s;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import m0.AbstractC1791e;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2415a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f21433c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f21434a;

    /* renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f21435b;

    /* renamed from: z0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0278a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final C2415a f21436a;

        public C0278a(C2415a c2415a) {
            this.f21436a = c2415a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f21436a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            A0.t b6 = this.f21436a.b(view);
            if (b6 != null) {
                return (AccessibilityNodeProvider) b6.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f21436a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            A0.s Z5 = A0.s.Z(accessibilityNodeInfo);
            Z5.V(AbstractC2393D.C(view));
            Z5.T(AbstractC2393D.y(view));
            Z5.U(AbstractC2393D.h(view));
            Z5.X(AbstractC2393D.t(view));
            this.f21436a.g(view, Z5);
            Z5.c(accessibilityNodeInfo.getText(), view);
            List c6 = C2415a.c(view);
            for (int i6 = 0; i6 < c6.size(); i6++) {
                Z5.b((s.a) c6.get(i6));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f21436a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f21436a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i6, Bundle bundle) {
            return this.f21436a.j(view, i6, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i6) {
            this.f21436a.l(view, i6);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f21436a.m(view, accessibilityEvent);
        }
    }

    public C2415a() {
        this(f21433c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(AbstractC1791e.f17156H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f21434a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A0.t b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f21434a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A0.t(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f21435b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] l6 = A0.s.l(view.createAccessibilityNodeInfo().getText());
            for (int i6 = 0; l6 != null && i6 < l6.length; i6++) {
                if (clickableSpan.equals(l6[i6])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f21434a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, A0.s sVar) {
        this.f21434a.onInitializeAccessibilityNodeInfo(view, sVar.Y());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f21434a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f21434a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i6, Bundle bundle) {
        List c6 = c(view);
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= c6.size()) {
                break;
            }
            s.a aVar = (s.a) c6.get(i7);
            if (aVar.a() == i6) {
                z6 = aVar.c(view, bundle);
                break;
            }
            i7++;
        }
        if (!z6) {
            z6 = this.f21434a.performAccessibilityAction(view, i6, bundle);
        }
        return (z6 || i6 != AbstractC1791e.f17166a || bundle == null) ? z6 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i6, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC1791e.f17157I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i6)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i6) {
        this.f21434a.sendAccessibilityEvent(view, i6);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f21434a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2415a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f21434a = accessibilityDelegate;
        this.f21435b = new C0278a(this);
    }
}
