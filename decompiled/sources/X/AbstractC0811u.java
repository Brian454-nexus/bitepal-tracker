package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0811u {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0811u f5974a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0811u f5975b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0811u f5976c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0811u f5977d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0811u f5978e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0811u f5979f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0811u f5980g;

    /* renamed from: h, reason: collision with root package name */
    public static final Set f5981h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f5982i;

    /* renamed from: X.u$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b extends AbstractC0811u {
        public b() {
            super();
        }

        public static b e(int i6, String str) {
            return new C0801j(i6, str);
        }

        public abstract String c();

        public abstract int d();
    }

    static {
        b e6 = b.e(4, "SD");
        f5974a = e6;
        b e7 = b.e(5, "HD");
        f5975b = e7;
        b e8 = b.e(6, "FHD");
        f5976c = e8;
        b e9 = b.e(8, "UHD");
        f5977d = e9;
        b e10 = b.e(0, "LOWEST");
        f5978e = e10;
        b e11 = b.e(1, "HIGHEST");
        f5979f = e11;
        f5980g = b.e(-1, "NONE");
        f5981h = new HashSet(Arrays.asList(e10, e11, e6, e7, e8, e9));
        f5982i = Arrays.asList(e9, e8, e7, e6);
    }

    public static boolean a(AbstractC0811u abstractC0811u) {
        return f5981h.contains(abstractC0811u);
    }

    public static List b() {
        return new ArrayList(f5982i);
    }

    public AbstractC0811u() {
    }
}
