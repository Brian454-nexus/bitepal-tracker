package M3;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.AbstractC1809a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p implements G9.l, G9.n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3423a;

    /* renamed from: b, reason: collision with root package name */
    public b f3424b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f3425c;

    /* renamed from: d, reason: collision with root package name */
    public int f3426d;

    /* renamed from: e, reason: collision with root package name */
    public Map f3427e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(int i6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(Map map);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a(boolean z6);
    }

    public p(Context context) {
        this.f3423a = context;
    }

    public final int a() {
        List c6 = r.c(this.f3423a, 21);
        if (c6 != null && !c6.isEmpty()) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT < 33) {
            return NotificationManagerCompat.from(this.f3423a).areNotificationsEnabled() ? 1 : 0;
        }
        if (this.f3423a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return r.b(this.f3425c, "android.permission.POST_NOTIFICATIONS");
    }

    public void c(int i6, a aVar) {
        aVar.a(d(i6));
    }

    public final int d(int i6) {
        boolean isExternalStorageManager;
        boolean canScheduleExactAlarms;
        if (i6 == 17) {
            return b();
        }
        if (i6 == 21) {
            return a();
        }
        if ((i6 == 30 || i6 == 28 || i6 == 29) && Build.VERSION.SDK_INT < 31) {
            return a();
        }
        if ((i6 == 37 || i6 == 0) && !e()) {
            return 0;
        }
        List<String> c6 = r.c(this.f3423a, i6);
        if (c6 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i6);
            return 1;
        }
        if (c6.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + c6 + i6);
            return (i6 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        if (this.f3423a.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            for (String str : c6) {
                if (i6 == 16) {
                    String packageName = this.f3423a.getPackageName();
                    PowerManager powerManager = (PowerManager) this.f3423a.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        hashSet.add(0);
                    } else {
                        hashSet.add(1);
                    }
                } else if (i6 == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        hashSet.add(2);
                    }
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                } else if (i6 == 23) {
                    hashSet.add(Integer.valueOf(Settings.canDrawOverlays(this.f3423a) ? 1 : 0));
                } else if (i6 == 24) {
                    hashSet.add(Integer.valueOf(this.f3423a.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                } else if (i6 == 27) {
                    hashSet.add(Integer.valueOf(((NotificationManager) this.f3423a.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                } else if (i6 == 34) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        canScheduleExactAlarms = ((AlarmManager) this.f3423a.getSystemService("alarm")).canScheduleExactAlarms();
                        hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i6 == 9 || i6 == 32) {
                    int checkSelfPermission = AbstractC1809a.checkSelfPermission(this.f3423a, str);
                    if ((Build.VERSION.SDK_INT >= 34 ? AbstractC1809a.checkSelfPermission(this.f3423a, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : checkSelfPermission) == 0 && checkSelfPermission == -1) {
                        hashSet.add(3);
                    } else if (checkSelfPermission == 0) {
                        hashSet.add(1);
                    } else {
                        hashSet.add(Integer.valueOf(r.b(this.f3425c, str)));
                    }
                } else if (AbstractC1809a.checkSelfPermission(this.f3423a, str) != 0) {
                    hashSet.add(Integer.valueOf(r.b(this.f3425c, str)));
                }
            }
            if (!hashSet.isEmpty()) {
                return r.j(hashSet).intValue();
            }
        }
        return 1;
    }

    public final boolean e() {
        List c6 = r.c(this.f3423a, 37);
        boolean z6 = c6 != null && c6.contains("android.permission.WRITE_CALENDAR");
        boolean z7 = c6 != null && c6.contains("android.permission.READ_CALENDAR");
        if (z6 && z7) {
            return true;
        }
        if (!z6) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z7) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void f(String str, int i6) {
        if (this.f3425c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f3425c.getPackageName()));
        }
        this.f3425c.startActivityForResult(intent, i6);
        this.f3426d++;
    }

    public void g(List list, b bVar, M3.b bVar2) {
        if (this.f3426d > 0) {
            bVar2.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
            return;
        }
        if (this.f3425c == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar2.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        this.f3424b = bVar;
        this.f3427e = new HashMap();
        this.f3426d = 0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (d(num.intValue()) != 1) {
                List c6 = r.c(this.f3425c, num.intValue());
                if (c6 != null && !c6.isEmpty()) {
                    int i6 = Build.VERSION.SDK_INT;
                    if (num.intValue() == 16) {
                        f("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                    } else if (i6 >= 30 && num.intValue() == 22) {
                        f("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                    } else if (num.intValue() == 23) {
                        f("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                    } else if (num.intValue() == 24) {
                        f("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                    } else if (num.intValue() == 27) {
                        f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                    } else if (i6 >= 31 && num.intValue() == 34) {
                        f("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", 214);
                    } else if (num.intValue() != 37 && num.intValue() != 0) {
                        arrayList.addAll(c6);
                        this.f3426d += c6.size();
                    } else if (e()) {
                        arrayList.add("android.permission.WRITE_CALENDAR");
                        arrayList.add("android.permission.READ_CALENDAR");
                        this.f3426d += 2;
                    } else {
                        this.f3427e.put(num, 0);
                    }
                } else if (!this.f3427e.containsKey(num)) {
                    this.f3427e.put(num, 0);
                    if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                        this.f3427e.put(num, 0);
                    } else {
                        this.f3427e.put(num, 2);
                    }
                }
            } else if (!this.f3427e.containsKey(num)) {
                this.f3427e.put(num, 1);
            }
        }
        if (arrayList.size() > 0) {
            androidx.core.app.a.a(this.f3425c, (String[]) arrayList.toArray(new String[0]), 24);
        }
        b bVar3 = this.f3424b;
        if (bVar3 == null || this.f3426d != 0) {
            return;
        }
        bVar3.a(this.f3427e);
    }

    public void h(Activity activity) {
        this.f3425c = activity;
    }

    public void i(int i6, c cVar, M3.b bVar) {
        Activity activity = this.f3425c;
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List c6 = r.c(activity, i6);
        if (c6 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i6);
            cVar.a(false);
            return;
        }
        if (!c6.isEmpty()) {
            cVar.a(androidx.core.app.a.b(this.f3425c, (String) c6.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i6 + " no need to show request rationale");
        cVar.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onActivityResult(int i6, int i7, Intent intent) {
        boolean z6;
        int i8;
        boolean canScheduleExactAlarms;
        boolean isExternalStorageManager;
        int i9;
        Activity activity = this.f3425c;
        boolean z7 = false;
        z7 = false;
        if (activity == null) {
            return false;
        }
        if (this.f3427e == null) {
            this.f3426d = 0;
            return false;
        }
        if (i6 == 209) {
            String packageName = this.f3423a.getPackageName();
            PowerManager powerManager = (PowerManager) this.f3423a.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z7 = true;
            }
            i8 = 16;
            i9 = z7;
        } else if (i6 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            isExternalStorageManager = Environment.isExternalStorageManager();
            i8 = 22;
            i9 = isExternalStorageManager;
        } else if (i6 == 211) {
            i8 = 23;
            i9 = Settings.canDrawOverlays(activity);
        } else if (i6 == 212) {
            i8 = 24;
            i9 = activity.getPackageManager().canRequestPackageInstalls();
        } else if (i6 == 213) {
            i8 = 27;
            i9 = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i6 != 214) {
                return false;
            }
            AlarmManager alarmManager = (AlarmManager) activity.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 31) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                z6 = canScheduleExactAlarms;
            } else {
                z6 = true;
            }
            i8 = 34;
            i9 = z6;
        }
        this.f3427e.put(Integer.valueOf(i8), Integer.valueOf(i9));
        int i10 = this.f3426d - 1;
        this.f3426d = i10;
        b bVar = this.f3424b;
        if (bVar != null && i10 == 0) {
            bVar.a(this.f3427e);
        }
        return true;
    }

    public boolean onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        int g6;
        if (i6 != 24) {
            this.f3426d = 0;
            return false;
        }
        if (this.f3427e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List asList = Arrays.asList(strArr);
        int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
        if (indexOf >= 0) {
            int k6 = r.k(this.f3425c, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
            this.f3427e.put(36, Integer.valueOf(k6));
            int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
            if (indexOf2 >= 0) {
                Integer i7 = r.i(Integer.valueOf(k6), Integer.valueOf(r.k(this.f3425c, "android.permission.READ_CALENDAR", iArr[indexOf2])));
                i7.intValue();
                this.f3427e.put(37, i7);
                this.f3427e.put(0, i7);
            }
        }
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String str = strArr[i8];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR") && (g6 = r.g(str)) != 20) {
                int i9 = iArr[i8];
                if (g6 == 8) {
                    this.f3427e.put(8, r.i((Integer) this.f3427e.get(8), Integer.valueOf(r.k(this.f3425c, str, i9))));
                } else if (g6 == 7) {
                    if (!this.f3427e.containsKey(7)) {
                        this.f3427e.put(7, Integer.valueOf(r.k(this.f3425c, str, i9)));
                    }
                    if (!this.f3427e.containsKey(14)) {
                        this.f3427e.put(14, Integer.valueOf(r.k(this.f3425c, str, i9)));
                    }
                } else if (g6 == 4) {
                    int k7 = r.k(this.f3425c, str, i9);
                    if (!this.f3427e.containsKey(4)) {
                        this.f3427e.put(4, Integer.valueOf(k7));
                    }
                } else if (g6 == 3) {
                    int k8 = r.k(this.f3425c, str, i9);
                    if (Build.VERSION.SDK_INT < 29 && !this.f3427e.containsKey(4)) {
                        this.f3427e.put(4, Integer.valueOf(k8));
                    }
                    if (!this.f3427e.containsKey(5)) {
                        this.f3427e.put(5, Integer.valueOf(k8));
                    }
                    this.f3427e.put(Integer.valueOf(g6), Integer.valueOf(k8));
                } else if (g6 == 9 || g6 == 32) {
                    this.f3427e.put(Integer.valueOf(g6), Integer.valueOf(d(g6)));
                } else if (!this.f3427e.containsKey(Integer.valueOf(g6))) {
                    this.f3427e.put(Integer.valueOf(g6), Integer.valueOf(r.k(this.f3425c, str, i9)));
                }
            }
        }
        int length = this.f3426d - iArr.length;
        this.f3426d = length;
        b bVar = this.f3424b;
        if (bVar == null || length != 0) {
            return true;
        }
        bVar.a(this.f3427e);
        return true;
    }
}
