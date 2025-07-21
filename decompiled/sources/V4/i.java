package V4;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f5322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5323b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5324c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5325d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        public static final int f5326i = 1;

        /* renamed from: a, reason: collision with root package name */
        public final Context f5327a;

        /* renamed from: b, reason: collision with root package name */
        public ActivityManager f5328b;

        /* renamed from: c, reason: collision with root package name */
        public c f5329c;

        /* renamed from: e, reason: collision with root package name */
        public float f5331e;

        /* renamed from: d, reason: collision with root package name */
        public float f5330d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f5332f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        public float f5333g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        public int f5334h = 4194304;

        public a(Context context) {
            this.f5331e = f5326i;
            this.f5327a = context;
            this.f5328b = (ActivityManager) context.getSystemService("activity");
            this.f5329c = new b(context.getResources().getDisplayMetrics());
            if (i.e(this.f5328b)) {
                this.f5331e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f5335a;

        public b(DisplayMetrics displayMetrics) {
            this.f5335a = displayMetrics;
        }

        @Override // V4.i.c
        public int a() {
            return this.f5335a.heightPixels;
        }

        @Override // V4.i.c
        public int b() {
            return this.f5335a.widthPixels;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        int a();

        int b();
    }

    public i(a aVar) {
        this.f5324c = aVar.f5327a;
        int i6 = e(aVar.f5328b) ? aVar.f5334h / 2 : aVar.f5334h;
        this.f5325d = i6;
        int c6 = c(aVar.f5328b, aVar.f5332f, aVar.f5333g);
        float b6 = aVar.f5329c.b() * aVar.f5329c.a() * 4;
        int round = Math.round(aVar.f5331e * b6);
        int round2 = Math.round(b6 * aVar.f5330d);
        int i7 = c6 - i6;
        int i8 = round2 + round;
        if (i8 <= i7) {
            this.f5323b = round2;
            this.f5322a = round;
        } else {
            float f6 = i7;
            float f7 = aVar.f5331e;
            float f8 = aVar.f5330d;
            float f9 = f6 / (f7 + f8);
            this.f5323b = Math.round(f8 * f9);
            this.f5322a = Math.round(f9 * aVar.f5331e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f5323b));
            sb.append(", pool size: ");
            sb.append(f(this.f5322a));
            sb.append(", byte array size: ");
            sb.append(f(i6));
            sb.append(", memory class limited? ");
            sb.append(i8 > c6);
            sb.append(", max size: ");
            sb.append(f(c6));
            sb.append(", memoryClass: ");
            sb.append(aVar.f5328b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f5328b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    public static int c(ActivityManager activityManager, float f6, float f7) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f6 = f7;
        }
        return Math.round(memoryClass * f6);
    }

    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.f5325d;
    }

    public int b() {
        return this.f5322a;
    }

    public int d() {
        return this.f5323b;
    }

    public final String f(int i6) {
        return Formatter.formatFileSize(this.f5324c, i6);
    }
}
