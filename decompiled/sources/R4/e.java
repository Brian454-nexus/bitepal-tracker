package R4;

import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f4617a;

    public e(int i6) {
        this("Http request failed", i6);
    }

    public e(String str, int i6) {
        this(str, i6, null);
    }

    public e(String str, int i6, Throwable th) {
        super(str + ", status code: " + i6, th);
        this.f4617a = i6;
    }
}
