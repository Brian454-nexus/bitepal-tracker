package z0;

import android.view.MotionEvent;

/* renamed from: z0.r, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2432r {
    public static boolean a(MotionEvent motionEvent, int i6) {
        return (motionEvent.getSource() & i6) == i6;
    }
}
