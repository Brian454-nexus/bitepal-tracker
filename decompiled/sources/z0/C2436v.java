package z0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: z0.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2436v {

    /* renamed from: a, reason: collision with root package name */
    public int f21469a;

    /* renamed from: b, reason: collision with root package name */
    public int f21470b;

    public C2436v(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f21469a | this.f21470b;
    }

    public void b(View view, View view2, int i6) {
        c(view, view2, i6, 0);
    }

    public void c(View view, View view2, int i6, int i7) {
        if (i7 == 1) {
            this.f21470b = i6;
        } else {
            this.f21469a = i6;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i6) {
        if (i6 == 1) {
            this.f21470b = 0;
        } else {
            this.f21469a = 0;
        }
    }
}
