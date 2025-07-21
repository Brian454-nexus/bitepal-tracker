package i0;

import android.graphics.drawable.Drawable;

/* renamed from: i0.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1482f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f15697a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f6, float f7, boolean z6) {
        return z6 ? (float) (f6 + ((1.0d - f15697a) * f7)) : f6;
    }

    public static float b(float f6, float f7, boolean z6) {
        return z6 ? (float) ((f6 * 1.5f) + ((1.0d - f15697a) * f7)) : f6 * 1.5f;
    }
}
