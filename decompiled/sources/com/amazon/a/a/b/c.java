package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    private static final String f10839A = "deviceDisplay";

    /* renamed from: B, reason: collision with root package name */
    private static final String f10840B = "deviceBrand";

    /* renamed from: C, reason: collision with root package name */
    private static final String f10841C = "deviceBoard";

    /* renamed from: D, reason: collision with root package name */
    private static final String f10842D = "androidVersion";

    /* renamed from: E, reason: collision with root package name */
    private static final String f10843E = "deviceModel";

    /* renamed from: F, reason: collision with root package name */
    private static final String f10844F = "packageFilePath";

    /* renamed from: G, reason: collision with root package name */
    private static final String f10845G = "packageName";

    /* renamed from: H, reason: collision with root package name */
    private static final String f10846H = "packageVersionName";

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10847a = new com.amazon.a.a.o.c("CrashReport");

    /* renamed from: b, reason: collision with root package name */
    private static final long f10848b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final String f10849c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* renamed from: d, reason: collision with root package name */
    private static final String f10850d = "SHA1";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10851e = "crashTime";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10852f = "UTF-8";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10853g = "crashId";

    /* renamed from: h, reason: collision with root package name */
    private static final String f10854h = "threadDump";

    /* renamed from: i, reason: collision with root package name */
    private static final String f10855i = "stackTrace";

    /* renamed from: j, reason: collision with root package name */
    private static final String f10856j = "threadAllocSize";

    /* renamed from: k, reason: collision with root package name */
    private static final String f10857k = "threadAllocCount";

    /* renamed from: l, reason: collision with root package name */
    private static final String f10858l = "nativeHeapFreeSize";

    /* renamed from: m, reason: collision with root package name */
    private static final String f10859m = "nativeHeapSize";

    /* renamed from: n, reason: collision with root package name */
    private static final String f10860n = "memLowThreshold";

    /* renamed from: o, reason: collision with root package name */
    private static final String f10861o = "memLowFlag";

    /* renamed from: p, reason: collision with root package name */
    private static final String f10862p = "availableInternalMemorySize";

    /* renamed from: q, reason: collision with root package name */
    private static final String f10863q = "totalInternalMemorySize";

    /* renamed from: r, reason: collision with root package name */
    private static final String f10864r = "deviceUser";

    /* renamed from: s, reason: collision with root package name */
    private static final String f10865s = "deviceType";

    /* renamed from: t, reason: collision with root package name */
    private static final String f10866t = "deviceTime";

    /* renamed from: u, reason: collision with root package name */
    private static final String f10867u = "deviceTags";

    /* renamed from: v, reason: collision with root package name */
    private static final String f10868v = "deviceProduct";

    /* renamed from: w, reason: collision with root package name */
    private static final String f10869w = "deviceManufacturer";

    /* renamed from: x, reason: collision with root package name */
    private static final String f10870x = "deviceId";

    /* renamed from: y, reason: collision with root package name */
    private static final String f10871y = "deviceHost";

    /* renamed from: z, reason: collision with root package name */
    private static final String f10872z = "deviceFingerPrint";

    /* renamed from: I, reason: collision with root package name */
    private final HashMap<String, String> f10873I = new LinkedHashMap();

    public c(Application application, Throwable th) {
        try {
            a(application, th);
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10847a.b("Error collection crash report details", th2);
            }
        }
    }

    private void a(Application application, Throwable th) {
        b();
        a(application);
        c(application);
        a(th);
        e();
        f();
    }

    private void b() {
        this.f10873I.put(f10851e, new Date().toString());
    }

    private void c(Application application) {
        this.f10873I.put(f10843E, Build.MODEL);
        this.f10873I.put(f10842D, Build.VERSION.RELEASE);
        this.f10873I.put(f10841C, Build.BOARD);
        this.f10873I.put(f10840B, Build.BRAND);
        this.f10873I.put(f10839A, Build.DISPLAY);
        this.f10873I.put(f10872z, Build.FINGERPRINT);
        this.f10873I.put(f10871y, Build.HOST);
        this.f10873I.put(f10870x, Build.ID);
        this.f10873I.put(f10869w, Build.MANUFACTURER);
        this.f10873I.put(f10868v, Build.PRODUCT);
        this.f10873I.put(f10867u, Build.TAGS);
        this.f10873I.put(f10866t, Long.toString(Build.TIME));
        this.f10873I.put(f10865s, Build.TYPE);
        this.f10873I.put(f10864r, Build.USER);
        this.f10873I.put(f10863q, Long.toString(d()));
        this.f10873I.put(f10862p, Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.f10873I.put(f10861o, Boolean.toString(memoryInfo.lowMemory));
            this.f10873I.put(f10860n, Long.toString(memoryInfo.threshold));
        }
        this.f10873I.put(f10859m, Long.toString(Debug.getNativeHeapSize()));
        this.f10873I.put(f10858l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.f10873I.put(f10857k, Long.toString(Debug.getThreadAllocCount()));
        this.f10873I.put(f10856j, Long.toString(Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    private void e() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            sb.append("Thread : " + key.getId());
            if (!e.a(key.getName())) {
                sb.append("/" + key.getName());
            }
            sb.append("\n");
            sb.append("isAlive : " + key.isAlive() + "\n");
            sb.append("isInterrupted : " + key.isInterrupted() + "\n");
            sb.append("isDaemon : " + key.isDaemon() + "\n");
            for (StackTraceElement stackTraceElement : value) {
                sb.append("\tat " + stackTraceElement + "\n");
            }
            sb.append("\n\n");
        }
        this.f10873I.put(f10854h, sb.toString());
    }

    private void f() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10873I.get(f10845G));
            sb.append(this.f10873I.get(f10846H));
            sb.append(this.f10873I.get(f10842D));
            String str = this.f10873I.get(f10855i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f10849c).matcher(str);
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
            }
            this.f10873I.put(f10853g, new BigInteger(MessageDigest.getInstance(f10850d).digest(sb.toString().getBytes(f10852f))).abs().toString(16));
        } catch (Exception e6) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10847a.b("Error capturing crash id", e6);
            }
        }
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e6) {
            if (!com.amazon.a.a.o.c.f11254b) {
                return null;
            }
            f10847a.b("Unable to fetch package info", e6);
            return null;
        }
    }

    private void a(Application application) {
        PackageInfo b6 = b(application);
        if (b6 == null) {
            return;
        }
        this.f10873I.put(f10846H, b6.versionName);
        this.f10873I.put(f10845G, b6.packageName);
        this.f10873I.put(f10844F, application.getFilesDir().getAbsolutePath());
    }

    private void a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb.append(stringWriter.toString());
        sb.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb.append(stringWriter.toString());
            cause = cause.getCause();
            sb.append("\n\n");
        }
        printWriter.close();
        this.f10873I.put(f10855i, sb.toString());
    }

    public Map<String, String> a() {
        return this.f10873I;
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }
}
