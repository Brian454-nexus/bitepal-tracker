package H2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f2194a;

    public u(ViewGroup viewGroup) {
        this.f2194a = viewGroup.getOverlay();
    }

    @Override // H2.z
    public void a(Drawable drawable) {
        this.f2194a.add(drawable);
    }

    @Override // H2.z
    public void b(Drawable drawable) {
        this.f2194a.remove(drawable);
    }

    @Override // H2.v
    public void c(View view) {
        this.f2194a.add(view);
    }

    @Override // H2.v
    public void d(View view) {
        this.f2194a.remove(view);
    }
}
