package y;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class D0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Size f20698e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f20699f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f20700g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f20701h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static volatile D0 f20702i;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f20703a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Size f20704b = null;

    /* renamed from: c, reason: collision with root package name */
    public final C.k f20705c = new C.k();

    /* renamed from: d, reason: collision with root package name */
    public final C.d f20706d = new C.d();

    public D0(Context context) {
        this.f20703a = (DisplayManager) context.getSystemService("display");
    }

    public static D0 c(Context context) {
        if (f20702i == null) {
            synchronized (f20701h) {
                try {
                    if (f20702i == null) {
                        f20702i = new D0(context);
                    }
                } finally {
                }
            }
        }
        return f20702i;
    }

    public final Size a() {
        Size b6 = b();
        int width = b6.getWidth() * b6.getHeight();
        Size size = f20698e;
        if (width > size.getWidth() * size.getHeight()) {
            b6 = size;
        }
        return this.f20705c.a(b6);
    }

    public final Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (S.d.b(size, f20699f) && (size = this.f20706d.a()) == null) {
            size = f20700g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public Display d(boolean z6) {
        Display[] displays = this.f20703a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display e6 = e(displays, z6);
        if (e6 == null && z6) {
            e6 = e(displays, false);
        }
        if (e6 != null) {
            return e6;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Display e(Display[] displayArr, boolean z6) {
        Display display = null;
        int i6 = -1;
        for (Display display2 : displayArr) {
            if (!z6 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i7 = point.x;
                int i8 = point.y;
                if (i7 * i8 > i6) {
                    display = display2;
                    i6 = i7 * i8;
                }
            }
        }
        return display;
    }

    public Size f() {
        if (this.f20704b != null) {
            return this.f20704b;
        }
        this.f20704b = a();
        return this.f20704b;
    }

    public void g() {
        this.f20704b = a();
    }
}
