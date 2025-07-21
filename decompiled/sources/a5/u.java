package a5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f7784e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f7785f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f7786g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile u f7787h;

    /* renamed from: b, reason: collision with root package name */
    public int f7789b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7790c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7791d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f7788a = 20000;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f7784e = i6 < 29;
        f7785f = i6 >= 28;
        f7786g = new File("/proc/self/fd");
    }

    public static u b() {
        if (f7787h == null) {
            synchronized (u.class) {
                try {
                    if (f7787h == null) {
                        f7787h = new u();
                    }
                } finally {
                }
            }
        }
        return f7787h;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return f7784e && !this.f7791d.get();
    }

    public final int c() {
        if (e()) {
            return 500;
        }
        return this.f7788a;
    }

    public final synchronized boolean d() {
        try {
            boolean z6 = true;
            int i6 = this.f7789b + 1;
            this.f7789b = i6;
            if (i6 >= 50) {
                this.f7789b = 0;
                int length = f7786g.list().length;
                long c6 = c();
                if (length >= c6) {
                    z6 = false;
                }
                this.f7790c = z6;
                if (!z6 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c6);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7790c;
    }

    public boolean f(int i6, int i7, boolean z6, boolean z7) {
        if (!z6) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f7785f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z7) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i6 < 0 || i7 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    public boolean g(int i6, int i7, BitmapFactory.Options options, boolean z6, boolean z7) {
        boolean f6 = f(i6, i7, z6, z7);
        if (f6) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return f6;
    }

    public void h() {
        n5.l.b();
        this.f7791d.set(true);
    }
}
