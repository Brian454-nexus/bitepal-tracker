package r5;

import android.os.Build;
import r5.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements c.b {
    @Override // r5.c.b
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // r5.c.b
    public void b(String str) {
        System.loadLibrary(str);
    }

    @Override // r5.c.b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // r5.c.b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // r5.c.b
    public void e(String str) {
        System.load(str);
    }
}
