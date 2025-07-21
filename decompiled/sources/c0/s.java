package c0;

import I.D;
import X.AbstractC0811u;
import android.os.Build;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class s implements u {
    private static boolean d() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return d();
    }

    @Override // c0.u
    public boolean a(D d6, AbstractC0811u abstractC0811u) {
        return d() && d6.g() == 0 && abstractC0811u == AbstractC0811u.f5974a;
    }

    @Override // c0.u
    public boolean c() {
        return false;
    }
}
