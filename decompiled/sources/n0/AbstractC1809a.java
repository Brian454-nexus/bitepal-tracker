package n0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.h;
import java.io.File;
import java.util.concurrent.Executor;
import p0.AbstractC1892f;
import v0.j;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1809a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* renamed from: n0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0219a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i6) {
            return context.getDrawable(i6);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: n0.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static int a(Context context, int i6) {
            return context.getColor(i6);
        }

        public static Object b(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        public static String c(Context context, Class cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: n0.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: n0.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i6) {
            return ((i6 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i6 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC1809a.obtainAndCheckReceiverPermission(context), handler);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: n0.a$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: n0.a$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }

        public static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(AbstractC1809a.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* renamed from: n0.a$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i6) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i6);
        }
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        y0.b.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    @NonNull
    public static Context createAttributionContext(@NonNull Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(@NonNull Context context) {
        return c.a(context);
    }

    public static String getAttributionTag(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context) {
        return C0219a.a(context);
    }

    public static int getColor(@NonNull Context context, int i6) {
        return b.a(context, i6);
    }

    public static ColorStateList getColorStateList(@NonNull Context context, int i6) {
        return AbstractC1892f.c(context.getResources(), i6, context.getTheme());
    }

    @NonNull
    public static Context getContextForLanguage(@NonNull Context context) {
        j a6 = h.a(context);
        if (Build.VERSION.SDK_INT > 32 || a6.f()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        v0.f.b(configuration, a6);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(@NonNull Context context) {
        return c.b(context);
    }

    @NonNull
    public static Display getDisplayOrDefault(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(@NonNull Context context, int i6) {
        return C0219a.b(context, i6);
    }

    @NonNull
    @Deprecated
    public static File[] getExternalCacheDirs(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    @Deprecated
    public static File[] getExternalFilesDirs(@NonNull Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : v0.h.a(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(@NonNull Context context) {
        return C0219a.c(context);
    }

    @NonNull
    @Deprecated
    public static File[] getObbDirs(@NonNull Context context) {
        return context.getObbDirs();
    }

    @NonNull
    public static String getString(@NonNull Context context, int i6) {
        return getContextForLanguage(context).getString(i6);
    }

    public static <T> T getSystemService(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) b.b(context, cls);
    }

    public static String getSystemServiceName(@NonNull Context context, @NonNull Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context) {
        return c.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (n0.e.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(@NonNull Context context, BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i6) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i6);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(@NonNull Context context, @NonNull Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@NonNull Context context, @NonNull Intent intent) {
        d.b(context, intent);
    }

    public static Intent registerReceiver(@NonNull Context context, BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, String str, Handler handler, int i6) {
        int i7 = i6 & 1;
        if (i7 != 0 && (i6 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i7 != 0) {
            i6 |= 2;
        }
        int i8 = i6;
        int i9 = i8 & 2;
        if (i9 == 0 && (i8 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i9 != 0 && (i8 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i8);
        }
        return d.a(context, broadcastReceiver, intentFilter, str, handler, i8);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
