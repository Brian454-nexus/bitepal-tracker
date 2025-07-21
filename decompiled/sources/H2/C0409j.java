package H2;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: H2.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0409j implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public Rect f2126a;

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f6, Rect rect, Rect rect2) {
        int i6 = rect.left + ((int) ((rect2.left - r0) * f6));
        int i7 = rect.top + ((int) ((rect2.top - r1) * f6));
        int i8 = rect.right + ((int) ((rect2.right - r2) * f6));
        int i9 = rect.bottom + ((int) ((rect2.bottom - r6) * f6));
        Rect rect3 = this.f2126a;
        if (rect3 == null) {
            return new Rect(i6, i7, i8, i9);
        }
        rect3.set(i6, i7, i8, i9);
        return this.f2126a;
    }
}
