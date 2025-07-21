package c0;

import I.D;
import X.AbstractC0811u;
import android.os.Build;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r implements u {
    public static boolean d() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean g() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return d() || e() || g() || f();
    }

    @Override // c0.u
    public boolean a(D d6, AbstractC0811u abstractC0811u) {
        return (d() || e()) ? abstractC0811u == AbstractC0811u.f5977d : g() ? abstractC0811u == AbstractC0811u.f5975b || abstractC0811u == AbstractC0811u.f5976c : f() && d6.g() == 0 && (abstractC0811u == AbstractC0811u.f5976c || abstractC0811u == AbstractC0811u.f5975b);
    }

    @Override // c0.u
    public boolean c() {
        return d() || e() || f();
    }
}
