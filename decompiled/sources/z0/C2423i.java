package z0;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: z0.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2423i {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f21448a;

    public C2423i(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f21448a.onTouchEvent(motionEvent);
    }

    public C2423i(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f21448a = new GestureDetector(context, onGestureListener, handler);
    }
}
