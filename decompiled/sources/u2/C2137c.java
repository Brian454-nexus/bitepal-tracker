package u2;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import t2.AbstractC2077c;
import z0.AbstractC2393D;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2137c implements InterfaceC2136b {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2136b f19156a = new C2137c();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f6 = 0.0f;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            if (childAt != view) {
                float m6 = AbstractC2393D.m(childAt);
                if (m6 > f6) {
                    f6 = m6;
                }
            }
        }
        return f6;
    }

    @Override // u2.InterfaceC2136b
    public void a(View view) {
        int i6 = AbstractC2077c.f19052a;
        Object tag = view.getTag(i6);
        if (tag instanceof Float) {
            AbstractC2393D.S(view, ((Float) tag).floatValue());
        }
        view.setTag(i6, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // u2.InterfaceC2136b
    public void b(View view) {
    }

    @Override // u2.InterfaceC2136b
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f6, float f7, int i6, boolean z6) {
    }

    @Override // u2.InterfaceC2136b
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f6, float f7, int i6, boolean z6) {
        if (z6) {
            int i7 = AbstractC2077c.f19052a;
            if (view.getTag(i7) == null) {
                Float valueOf = Float.valueOf(AbstractC2393D.m(view));
                AbstractC2393D.S(view, e(recyclerView, view) + 1.0f);
                view.setTag(i7, valueOf);
            }
        }
        view.setTranslationX(f6);
        view.setTranslationY(f7);
    }
}
