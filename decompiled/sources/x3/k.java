package x3;

import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {
    public static final Number b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.valueOf(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.valueOf(longVersionCode);
    }
}
