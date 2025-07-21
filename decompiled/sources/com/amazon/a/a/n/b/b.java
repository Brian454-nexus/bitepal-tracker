package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11142a = new com.amazon.a.a.o.c("SimpleTaskPipeline");

    /* renamed from: b, reason: collision with root package name */
    private final Handler f11143b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Runnable> f11144c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11145d;

    private b(HandlerThread handlerThread) {
        this.f11144c = Collections.synchronizedSet(new HashSet());
        this.f11145d = handlerThread.getName();
        handlerThread.start();
        this.f11143b = new Handler(handlerThread.getLooper());
    }

    private Runnable c(final com.amazon.a.a.n.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f11144c.remove(this);
                try {
                    if (com.amazon.a.a.o.c.f11253a) {
                        b.f11142a.a(b.this.f11145d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                } catch (Throwable th) {
                    try {
                        if (com.amazon.a.a.o.c.f11254b) {
                            b.f11142a.b("Task Failed with unhandled exception: " + th, th);
                        }
                        if (com.amazon.a.a.o.c.f11253a) {
                            b.f11142a.a(b.this.f11145d + ": Task finished executing: " + aVar);
                        }
                    } finally {
                        if (com.amazon.a.a.o.c.f11253a) {
                            b.f11142a.a(b.this.f11145d + ": Task finished executing: " + aVar);
                        }
                    }
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.f11144c.add(runnable);
        return runnable;
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static b b(String str) {
        return new b(str);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11142a.a("Scheduling task: " + aVar);
        }
        this.f11143b.post(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11142a.a(this.f11145d + ": Scheduling task immediately: " + aVar);
        }
        this.f11143b.postAtFrontOfQueue(c(aVar));
    }

    private b(String str) {
        this.f11144c = Collections.synchronizedSet(new HashSet());
        this.f11145d = str;
        this.f11143b = new Handler();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long a6 = a(date);
        if (com.amazon.a.a.o.c.f11253a) {
            f11142a.a(this.f11145d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + a6);
        }
        this.f11143b.postAtTime(c(aVar), a6);
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j6) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11142a.a(this.f11145d + ": Scheduling task: " + aVar + ", with delay: " + j6);
        }
        this.f11143b.postDelayed(c(aVar), j6);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        for (Runnable runnable : this.f11144c) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11142a.a(this.f11145d + ": Removing callback: " + runnable);
            }
            this.f11143b.removeCallbacks(runnable);
        }
        this.f11144c.clear();
        if (this.f11143b.getLooper() == Looper.getMainLooper() || !this.f11143b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = f11142a;
        cVar.a("Interrupting looper thread!");
        this.f11143b.getLooper().getThread().interrupt();
        cVar.a("Quitting looper: " + this.f11143b.getLooper().getThread() + ", " + this.f11143b.getLooper().getThread().isAlive());
        this.f11143b.getLooper().quit();
    }
}
