package Z0;

import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7290a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7291b;

    public z(String str, Throwable th, boolean z6, int i6) {
        super(str, th);
        this.f7290a = z6;
        this.f7291b = i6;
    }

    public static z a(String str, Throwable th) {
        return new z(str, th, true, 1);
    }

    public static z b(String str, Throwable th) {
        return new z(str, th, true, 0);
    }

    public static z c(String str, Throwable th) {
        return new z(str, th, true, 4);
    }

    public static z d(String str, Throwable th) {
        return new z(str, th, false, 4);
    }

    public static z e(String str) {
        return new z(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f7290a + ", dataType=" + this.f7291b + "}";
    }
}
