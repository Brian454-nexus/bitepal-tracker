package o;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1831a {

    /* renamed from: a, reason: collision with root package name */
    public Context f17799a;

    public C1831a(Context context) {
        this.f17799a = context;
    }

    public static C1831a a(Context context) {
        return new C1831a(context);
    }

    public int b() {
        return this.f17799a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.f17799a.getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i6 > 600) {
            return 5;
        }
        if (i6 > 960 && i7 > 720) {
            return 5;
        }
        if (i6 > 720 && i7 > 960) {
            return 5;
        }
        if (i6 >= 500) {
            return 4;
        }
        if (i6 > 640 && i7 > 480) {
            return 4;
        }
        if (i6 <= 480 || i7 <= 640) {
            return i6 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean d() {
        return true;
    }
}
