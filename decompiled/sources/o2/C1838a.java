package o2;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1838a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1838a f17876a = new C1838a();

    /* renamed from: o2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0227a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0227a f17877a = new C0227a();

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0227a.f17877a.a();
        }
        return 0;
    }
}
