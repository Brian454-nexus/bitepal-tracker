package c0;

import I.D;
import X.AbstractC0811u;
import android.os.Build;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i implements u {
    public static boolean d() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean g() {
        return d() || f() || e();
    }

    @Override // c0.u
    public boolean a(D d6, AbstractC0811u abstractC0811u) {
        return d() ? abstractC0811u == AbstractC0811u.f5976c || abstractC0811u == AbstractC0811u.f5977d : (f() || e()) && abstractC0811u == AbstractC0811u.f5976c;
    }
}
