package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public int f10084b;

    /* renamed from: c, reason: collision with root package name */
    public int f10085c;

    /* renamed from: d, reason: collision with root package name */
    public int f10086d;

    /* renamed from: e, reason: collision with root package name */
    public int f10087e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10090h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10091i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f10083a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f10088f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f10089g = 0;

    public boolean a(RecyclerView.A a6) {
        int i6 = this.f10085c;
        return i6 >= 0 && i6 < a6.b();
    }

    public View b(RecyclerView.w wVar) {
        View o6 = wVar.o(this.f10085c);
        this.f10085c += this.f10086d;
        return o6;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f10084b + ", mCurrentPosition=" + this.f10085c + ", mItemDirection=" + this.f10086d + ", mLayoutDirection=" + this.f10087e + ", mStartLine=" + this.f10088f + ", mEndLine=" + this.f10089g + '}';
    }
}
