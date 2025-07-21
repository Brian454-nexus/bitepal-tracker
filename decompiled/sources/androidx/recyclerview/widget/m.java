package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m {
    public static int a(RecyclerView.A a6, k kVar, View view, View view2, RecyclerView.p pVar, boolean z6) {
        if (pVar.J() == 0 || a6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(pVar.g0(view) - pVar.g0(view2)) + 1;
        }
        return Math.min(kVar.n(), kVar.d(view2) - kVar.g(view));
    }

    public static int b(RecyclerView.A a6, k kVar, View view, View view2, RecyclerView.p pVar, boolean z6, boolean z7) {
        if (pVar.J() == 0 || a6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z7 ? Math.max(0, (a6.b() - Math.max(pVar.g0(view), pVar.g0(view2))) - 1) : Math.max(0, Math.min(pVar.g0(view), pVar.g0(view2)));
        if (z6) {
            return Math.round((max * (Math.abs(kVar.d(view2) - kVar.g(view)) / (Math.abs(pVar.g0(view) - pVar.g0(view2)) + 1))) + (kVar.m() - kVar.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.A a6, k kVar, View view, View view2, RecyclerView.p pVar, boolean z6) {
        if (pVar.J() == 0 || a6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return a6.b();
        }
        return (int) (((kVar.d(view2) - kVar.g(view)) / (Math.abs(pVar.g0(view) - pVar.g0(view2)) + 1)) * a6.b());
    }
}
