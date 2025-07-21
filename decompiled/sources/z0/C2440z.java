package z0;

import android.os.Build;
import android.view.View;

/* renamed from: z0.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2440z {

    /* renamed from: a, reason: collision with root package name */
    public final c f21474a;

    /* renamed from: z0.z$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f21475a;

        public a(View view) {
            this.f21475a = view;
        }
    }

    /* renamed from: z0.z$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f21476b;

        public b(View view) {
            super(view);
            this.f21476b = view;
        }
    }

    /* renamed from: z0.z$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
    }

    public C2440z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f21474a = new b(view);
        } else {
            this.f21474a = new a(view);
        }
    }
}
