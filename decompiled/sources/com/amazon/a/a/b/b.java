package com.amazon.a.a.b;

import android.app.Application;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements a, d, Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10826a = new com.amazon.a.a.o.c("CrashManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    private static final String f10827b = "s-";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10828c = ".amzst";

    /* renamed from: d, reason: collision with root package name */
    private static final int f10829d = 99999;

    /* renamed from: e, reason: collision with root package name */
    private static final int f10830e = 5;

    /* renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f10831f;

    /* renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f10832g;

    /* renamed from: h, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f10833h;

    /* renamed from: i, reason: collision with root package name */
    private Map<c, String> f10834i = new HashMap();

    private void b() {
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof a) {
            return;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f10826a.a("Registering Crash Handler");
        }
        this.f10833h = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private boolean c() {
        return this.f10834i.size() >= 5;
    }

    private String[] d() {
        return new File(this.f10832g.getFilesDir().getAbsolutePath() + "/").list(new FilenameFilter() { // from class: com.amazon.a.a.b.b.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(b.f10828c) && !b.this.f10834i.containsValue(str);
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        com.amazon.a.a.o.a.a.a();
        b();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10826a.a("Crash detected", th);
        }
        try {
            a(th);
            this.f10831f.a(new com.amazon.a.a.b.a.a());
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10826a.a("Error occured while handling exception", th2);
            }
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f10826a.a("Calling previous handler");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10833h;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private void a(Throwable th) {
        try {
            a(a(new c(this.f10832g, th)));
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10826a.b("Could not handle uncaught exception", th2);
            }
        }
    }

    private String c(String str) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (bufferedReader2.ready()) {
                try {
                    sb.append(bufferedReader2.readLine());
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.amazon.a.a.o.a.a(bufferedReader);
                    throw th;
                }
            }
            com.amazon.a.a.o.a.a(bufferedReader2);
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String e(String str) {
        return this.f10832g.getFilesDir().getAbsolutePath() + "/" + str;
    }

    private void d(String str) {
        try {
            new File(str).delete();
        } catch (Exception e6) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10826a.b("Cannot delete file: " + str, e6);
            }
        }
    }

    private c b(String str) {
        try {
            return (c) com.amazon.a.a.o.c.a.a(c(str));
        } catch (Exception unused) {
            if (!com.amazon.a.a.o.c.f11254b) {
                return null;
            }
            f10826a.b("Failed to load crash report: " + str);
            return null;
        }
    }

    private String a(c cVar) {
        return com.amazon.a.a.o.c.a.a(cVar);
    }

    private synchronized void a(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.f10832g.openFileOutput(f10827b + new Random().nextInt(f10829d) + f10828c, 0);
                fileOutputStream.write(str.getBytes());
            } catch (Exception e6) {
                if (com.amazon.a.a.o.c.f11254b) {
                    f10826a.b("Coud not save crash report to file", e6);
                }
            }
        } finally {
            com.amazon.a.a.o.a.a(fileOutputStream);
        }
    }

    @Override // com.amazon.a.a.b.a
    public List<c> a() {
        if (c()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String[] d6 = d();
        for (int i6 = 0; i6 < d6.length && !c(); i6++) {
            String e6 = e(d6[i6]);
            c b6 = b(e6);
            if (b6 != null) {
                this.f10834i.put(b6, e6);
                arrayList.add(b6);
            } else {
                d(e6);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.a.a.b.a
    public void a(List<c> list) {
        for (c cVar : list) {
            d(this.f10834i.get(cVar));
            this.f10834i.remove(cVar);
        }
    }
}
