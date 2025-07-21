package g3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14882a;

    static {
        String i6 = W2.k.i("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(i6, "tagWithPrefix(\"ProcessUtils\")");
        f14882a = i6;
    }

    public static final String a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return C1369a.f14865a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, W2.v.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Intrinsics.checkNotNull(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            W2.k.e().b(f14882a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, androidx.work.a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String a6 = a(context);
        String c6 = configuration.c();
        return (c6 == null || c6.length() == 0) ? Intrinsics.areEqual(a6, context.getApplicationInfo().processName) : Intrinsics.areEqual(a6, configuration.c());
    }
}
