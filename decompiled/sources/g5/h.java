package g5;

import a5.u;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14928a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f14929b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f14930a;

        /* renamed from: g5.h$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class RunnableC0200a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f14932a;

            public RunnableC0200a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f14932a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                u.b().h();
                h.this.f14929b = true;
                h.b(a.this.f14930a, this.f14932a);
                h.this.f14928a.clear();
            }
        }

        public a(View view) {
            this.f14930a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            n5.l.v(new RunnableC0200a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // g5.i
    public void a(Activity activity) {
        if (!this.f14929b && this.f14928a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
