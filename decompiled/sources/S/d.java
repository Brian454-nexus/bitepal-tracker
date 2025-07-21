package S;

import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f4637a = new Size(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Size f4638b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Size f4639c = new Size(640, 480);

    /* renamed from: d, reason: collision with root package name */
    public static final Size f4640d = new Size(720, 480);

    /* renamed from: e, reason: collision with root package name */
    public static final Size f4641e = new Size(1280, 720);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f4642f = new Size(1920, 1080);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f4643g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static boolean b(Size size, Size size2) {
        return a(size) < a(size2);
    }
}
