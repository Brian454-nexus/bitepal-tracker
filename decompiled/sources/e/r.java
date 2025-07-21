package e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.C1062n;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.S;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r extends Dialog implements InterfaceC1061m, y, y2.f {

    /* renamed from: a, reason: collision with root package name */
    public C1062n f13548a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.e f13549b;

    /* renamed from: c, reason: collision with root package name */
    public final w f13550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i6) {
        super(context, i6);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13549b = y2.e.f21218d.a(this);
        this.f13550c = new w(new Runnable() { // from class: e.q
            @Override // java.lang.Runnable
            public final void run() {
                r.d(r.this);
            }
        });
    }

    public static final void d(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final C1062n b() {
        C1062n c1062n = this.f13548a;
        if (c1062n != null) {
            return c1062n;
        }
        C1062n c1062n2 = new C1062n(this);
        this.f13548a = c1062n2;
        return c1062n2;
    }

    public void c() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        S.a(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        AbstractC1206B.a(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        y2.g.a(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1061m
    public AbstractC1057i getLifecycle() {
        return b();
    }

    @Override // e.y
    public final w getOnBackPressedDispatcher() {
        return this.f13550c;
    }

    @Override // y2.f
    public y2.d getSavedStateRegistry() {
        return this.f13549b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f13550c.k();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w wVar = this.f13550c;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            wVar.n(onBackInvokedDispatcher);
        }
        this.f13549b.d(bundle);
        b().h(AbstractC1057i.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f13549b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().h(AbstractC1057i.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().h(AbstractC1057i.a.ON_DESTROY);
        this.f13548a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        c();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
