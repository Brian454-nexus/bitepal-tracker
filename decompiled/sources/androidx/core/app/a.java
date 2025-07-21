package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import n0.AbstractC1809a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a extends AbstractC1809a {

    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0124a {
        public static void a(Activity activity, String[] strArr, int i6) {
            activity.requestPermissions(strArr, i6);
        }

        public static boolean b(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static boolean a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void validateRequestPermissionsRequestCode(int i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i6) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (TextUtils.isEmpty(strArr[i7])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i7], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i7));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    strArr2[i8] = strArr[i9];
                    i8++;
                }
            }
        }
        if (activity instanceof d) {
            ((d) activity).validateRequestPermissionsRequestCode(i6);
        }
        C0124a.a(activity, strArr, i6);
    }

    public static boolean b(Activity activity, String str) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i6 >= 32 ? c.a(activity, str) : i6 == 31 ? b.a(activity, str) : C0124a.b(activity, str);
        }
        return false;
    }

    public static void c(Activity activity, Intent intent, int i6, Bundle bundle) {
        activity.startActivityForResult(intent, i6, bundle);
    }

    public static void d(Activity activity, IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
    }
}
