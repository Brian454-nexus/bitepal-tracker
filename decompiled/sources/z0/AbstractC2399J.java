package z0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: z0.J, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2399J {

    /* renamed from: z0.J$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static boolean a(ViewParent viewParent, View view, float f6, float f7, boolean z6) {
            return viewParent.onNestedFling(view, f6, f7, z6);
        }

        public static boolean b(ViewParent viewParent, View view, float f6, float f7) {
            return viewParent.onNestedPreFling(view, f6, f7);
        }

        public static void c(ViewParent viewParent, View view, int i6, int i7, int[] iArr) {
            viewParent.onNestedPreScroll(view, i6, i7, iArr);
        }

        public static void d(ViewParent viewParent, View view, int i6, int i7, int i8, int i9) {
            viewParent.onNestedScroll(view, i6, i7, i8, i9);
        }

        public static void e(ViewParent viewParent, View view, View view2, int i6) {
            viewParent.onNestedScrollAccepted(view, view2, i6);
        }

        public static boolean f(ViewParent viewParent, View view, View view2, int i6) {
            return viewParent.onStartNestedScroll(view, view2, i6);
        }

        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f6, float f7, boolean z6) {
        try {
            return a.a(viewParent, view, f6, f7, z6);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e6);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f6, float f7) {
        try {
            return a.b(viewParent, view, f6, f7);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e6);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i6, int i7, int[] iArr, int i8) {
        if (viewParent instanceof InterfaceC2434t) {
            ((InterfaceC2434t) viewParent).f(view, i6, i7, iArr, i8);
            return;
        }
        if (i8 == 0) {
            try {
                a.c(viewParent, view, i6, i7, iArr);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e6);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        if (viewParent instanceof InterfaceC2435u) {
            ((InterfaceC2435u) viewParent).a(view, i6, i7, i8, i9, i10, iArr);
            return;
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (viewParent instanceof InterfaceC2434t) {
            ((InterfaceC2434t) viewParent).b(view, i6, i7, i8, i9, i10);
            return;
        }
        if (i10 == 0) {
            try {
                a.d(viewParent, view, i6, i7, i8, i9);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e6);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i6, int i7) {
        if (viewParent instanceof InterfaceC2434t) {
            ((InterfaceC2434t) viewParent).d(view, view2, i6, i7);
            return;
        }
        if (i7 == 0) {
            try {
                a.e(viewParent, view, view2, i6);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e6);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i6, int i7) {
        if (viewParent instanceof InterfaceC2434t) {
            return ((InterfaceC2434t) viewParent).c(view, view2, i6, i7);
        }
        if (i7 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i6);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e6);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i6) {
        if (viewParent instanceof InterfaceC2434t) {
            ((InterfaceC2434t) viewParent).e(view, i6);
            return;
        }
        if (i6 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e6);
            }
        }
    }
}
