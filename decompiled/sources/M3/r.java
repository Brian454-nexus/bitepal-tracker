package M3;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r {
    public static String a(Context context, String str) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31 && e(context, null, str)) {
            return str;
        }
        if (i6 >= 29) {
            if (e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (e(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    public static int b(Activity activity, String str) {
        if (activity == null) {
            return 0;
        }
        boolean l6 = l(activity, str);
        boolean f6 = f(activity, str);
        boolean z6 = !f6;
        if (l6) {
            z6 = f6;
        }
        if (!l6 && z6) {
            h(activity, str);
        }
        return (l6 && z6) ? 4 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012e, code lost:
    
        if (r7 != false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List c(android.content.Context r6, int r7) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.r.c(android.content.Context, int):java.util.List");
    }

    public static PackageInfo d(Context context) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.getPackageInfo(context.getPackageName(), ConstantsKt.DEFAULT_BLOCK_SIZE);
        }
        String packageName = context.getPackageName();
        of = PackageManager.PackageInfoFlags.of(4096L);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        return packageInfo;
    }

    public static boolean e(Context context, ArrayList arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e6) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e6);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo d6 = d(context);
        if (d6 == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(d6.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Activity activity, String str) {
        return !androidx.core.app.a.b(activity, str);
    }

    public static int g(String str) {
        int i6;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2062386608:
                i6 = 30;
                if (str.equals("android.permission.READ_SMS")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1928411001:
                i6 = 30;
                if (str.equals("android.permission.READ_CALENDAR")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1925850455:
                i6 = 30;
                if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1921431796:
                i6 = 30;
                if (str.equals("android.permission.READ_CALL_LOG")) {
                    c6 = 3;
                    break;
                }
                break;
            case -1888586689:
                i6 = 30;
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c6 = 4;
                    break;
                }
                break;
            case -1813079487:
                i6 = 30;
                if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c6 = 5;
                    break;
                }
                break;
            case -1783097621:
                i6 = 30;
                if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c6 = 6;
                    break;
                }
                break;
            case -1561629405:
                i6 = 30;
                if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c6 = 7;
                    break;
                }
                break;
            case -1479758289:
                i6 = 30;
                if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    c6 = '\b';
                    break;
                }
                break;
            case -1238066820:
                i6 = 30;
                if (str.equals("android.permission.BODY_SENSORS")) {
                    c6 = '\t';
                    break;
                }
                break;
            case -1164582768:
                i6 = 30;
                if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c6 = '\n';
                    break;
                }
                break;
            case -909527021:
                i6 = 30;
                if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c6 = 11;
                    break;
                }
                break;
            case -895679497:
                i6 = 30;
                if (str.equals("android.permission.RECEIVE_MMS")) {
                    c6 = '\f';
                    break;
                }
                break;
            case -895673731:
                i6 = 30;
                if (str.equals("android.permission.RECEIVE_SMS")) {
                    c6 = '\r';
                    break;
                }
                break;
            case -798669607:
                i6 = 30;
                if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c6 = 14;
                    break;
                }
                break;
            case -406040016:
                i6 = 30;
                if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c6 = 15;
                    break;
                }
                break;
            case -63024214:
                i6 = 30;
                if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c6 = 16;
                    break;
                }
                break;
            case -5573545:
                i6 = 30;
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    c6 = 17;
                    break;
                }
                break;
            case 52602690:
                i6 = 30;
                if (str.equals("android.permission.SEND_SMS")) {
                    c6 = 18;
                    break;
                }
                break;
            case 112197485:
                i6 = 30;
                if (str.equals("android.permission.CALL_PHONE")) {
                    c6 = 19;
                    break;
                }
                break;
            case 175802396:
                i6 = 30;
                if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c6 = 20;
                    break;
                }
                break;
            case 214526995:
                i6 = 30;
                if (str.equals("android.permission.WRITE_CONTACTS")) {
                    c6 = 21;
                    break;
                }
                break;
            case 361658321:
                i6 = 30;
                if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                    c6 = 22;
                    break;
                }
                break;
            case 463403621:
                i6 = 30;
                if (str.equals("android.permission.CAMERA")) {
                    c6 = 23;
                    break;
                }
                break;
            case 603653886:
                i6 = 30;
                if (str.equals("android.permission.WRITE_CALENDAR")) {
                    c6 = 24;
                    break;
                }
                break;
            case 610633091:
                i6 = 30;
                if (str.equals("android.permission.WRITE_CALL_LOG")) {
                    c6 = 25;
                    break;
                }
                break;
            case 691260818:
                i6 = 30;
                if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c6 = 26;
                    break;
                }
                break;
            case 710297143:
                i6 = 30;
                if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c6 = 27;
                    break;
                }
                break;
            case 784519842:
                i6 = 30;
                if (str.equals("android.permission.USE_SIP")) {
                    c6 = 28;
                    break;
                }
                break;
            case 970694249:
                i6 = 30;
                if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c6 = 29;
                    break;
                }
                break;
            case 1166454870:
                i6 = 30;
                if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c6 = 30;
                    break;
                }
                break;
            case 1271781903:
                i6 = 30;
                if (str.equals("android.permission.GET_ACCOUNTS")) {
                    c6 = 31;
                    break;
                }
                break;
            case 1365911975:
                i6 = 30;
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c6 = ' ';
                    break;
                }
                break;
            case 1777263169:
                i6 = 30;
                if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c6 = '!';
                    break;
                }
                break;
            case 1780337063:
                i6 = 30;
                if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c6 = '\"';
                    break;
                }
                break;
            case 1831139720:
                i6 = 30;
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c6 = '#';
                    break;
                }
                break;
            case 1977429404:
                i6 = 30;
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c6 = '$';
                    break;
                }
                break;
            case 2024715147:
                i6 = 30;
                if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c6 = '%';
                    break;
                }
                break;
            case 2062356686:
                i6 = 30;
                if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                    c6 = '&';
                    break;
                }
                break;
            case 2114579147:
                i6 = 30;
                if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c6 = '\'';
                    break;
                }
                break;
            case 2133799037:
                i6 = 30;
                if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c6 = '(';
                    break;
                }
                break;
            default:
                i6 = 30;
                break;
        }
        switch (c6) {
            case 0:
            case '\b':
            case '\f':
            case '\r':
            case 18:
                return 13;
            case 1:
            case 24:
                return 0;
            case 2:
                return 17;
            case 3:
            case '\n':
            case 17:
            case 19:
            case 25:
            case 28:
            case '(':
                return 8;
            case 4:
            case 16:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case '\t':
                return 12;
            case 11:
                return 31;
            case 14:
                return i6;
            case 15:
            case ' ':
                return 15;
            case 20:
                return 9;
            case 21:
            case 31:
            case '$':
                return 2;
            case 22:
                return 35;
            case 23:
                return 1;
            case 26:
                return 33;
            case 27:
                return 32;
            case 29:
                return 34;
            case 30:
                return 29;
            case '!':
                return 24;
            case '\"':
                return 19;
            case '#':
                return 7;
            case '%':
                return 4;
            case '&':
                return 28;
            case '\'':
                return 18;
            default:
                return 20;
        }
    }

    public static void h(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    public static Integer i(Integer num, Integer num2) {
        HashSet hashSet = new HashSet();
        hashSet.add(num);
        hashSet.add(num2);
        return j(hashSet);
    }

    public static Integer j(Collection collection) {
        if (collection.contains(4)) {
            return 4;
        }
        if (collection.contains(2)) {
            return 2;
        }
        if (collection.contains(0)) {
            return 0;
        }
        return collection.contains(3) ? 3 : 1;
    }

    public static int k(Activity activity, String str, int i6) {
        if (i6 == -1) {
            return b(activity, str);
        }
        return 1;
    }

    public static boolean l(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
