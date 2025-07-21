package z0;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: z0.y, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2439y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f21471a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f21472b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f21473c;

    public ViewTreeObserverOnPreDrawListenerC2439y(View view, Runnable runnable) {
        this.f21471a = view;
        this.f21472b = view.getViewTreeObserver();
        this.f21473c = runnable;
    }

    public static ViewTreeObserverOnPreDrawListenerC2439y a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC2439y viewTreeObserverOnPreDrawListenerC2439y = new ViewTreeObserverOnPreDrawListenerC2439y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2439y);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2439y);
        return viewTreeObserverOnPreDrawListenerC2439y;
    }

    public void b() {
        if (this.f21472b.isAlive()) {
            this.f21472b.removeOnPreDrawListener(this);
        } else {
            this.f21471a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f21471a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f21473c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f21472b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
