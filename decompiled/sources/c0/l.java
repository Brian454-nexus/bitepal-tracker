package c0;

import I.F0;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10539a = Arrays.asList("lg-k430", "redmi note 4", "m2003j15sc", "rmx3231", "v2117", "sm-a032f", "moto g(20)", "sm-a035m");

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final MediaFormat f10540a;

        public a(MediaFormat mediaFormat) {
            this.f10540a = mediaFormat;
        }

        public final String a() {
            return this.f10540a.getString("mime");
        }

        public boolean b() {
            return "video/avc".equalsIgnoreCase(a());
        }

        public boolean c() {
            return "video/mp4v-es".equalsIgnoreCase(a());
        }

        public boolean d(int i6, int i7) {
            return this.f10540a.getInteger("width") == i6 && this.f10540a.getInteger("height") == i7;
        }

        public boolean e() {
            String a6 = a();
            return a6 != null && a6.contains("video/");
        }
    }

    public static Set d() {
        return e() ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET;
    }

    public static boolean e() {
        return f10539a.contains(Build.MODEL.toLowerCase(Locale.US));
    }

    private static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean j() {
        return "Redmi".equalsIgnoreCase(Build.BRAND) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean l() {
        return "LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean m() {
        return "infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean n() {
        return h() || g() || m() || l() || f() || j() || i() || e();
    }

    public boolean k(MediaFormat mediaFormat) {
        a aVar = new a(mediaFormat);
        return (h() || g() || m() || l() || i()) ? aVar.c() : (f() || j()) ? aVar.e() && aVar.d(3840, 2160) : e() && aVar.b() && aVar.d(1920, 1080);
    }
}
