package z0;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: z0.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2390A {

    /* renamed from: a, reason: collision with root package name */
    public static Map f21376a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: z0.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i6) {
            return velocityTracker.getAxisVelocity(i6);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f21376a.containsKey(velocityTracker)) {
                f21376a.put(velocityTracker, new C2391B());
            }
            ((C2391B) f21376a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i6) {
        c(velocityTracker, i6, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i6, float f6) {
        velocityTracker.computeCurrentVelocity(i6, f6);
        C2391B e6 = e(velocityTracker);
        if (e6 != null) {
            e6.c(i6, f6);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i6);
        }
        if (i6 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i6 == 1) {
            return velocityTracker.getYVelocity();
        }
        C2391B e6 = e(velocityTracker);
        if (e6 != null) {
            return e6.d(i6);
        }
        return 0.0f;
    }

    public static C2391B e(VelocityTracker velocityTracker) {
        return (C2391B) f21376a.get(velocityTracker);
    }
}
