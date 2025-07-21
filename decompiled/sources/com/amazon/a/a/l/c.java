package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p1.AbstractC1904e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements d, b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11004a = new com.amazon.a.a.o.c("ActivityResultManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    private static final Random f11005b = new Random();

    /* renamed from: c, reason: collision with root package name */
    private static final int f11006c = 65535;

    /* renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f11007d;

    /* renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f11008e;

    /* renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f11009f;

    /* renamed from: g, reason: collision with root package name */
    private AtomicReference<a> f11010g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private BlockingQueue<com.amazon.a.a.l.a> f11011h = new LinkedBlockingQueue();

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f11009f.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.l.c.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                a aVar2 = (a) c.this.f11010g.get();
                if (aVar2 != null) {
                    aVar2.b(aVar.b());
                }
            }
        });
    }

    private int b() {
        return f11005b.nextInt(f11006c) + 1;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Intent f11015a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11016b;

        /* renamed from: c, reason: collision with root package name */
        private Activity f11017c;

        public a(Intent intent, int i6) {
            this.f11015a = intent;
            this.f11016b = i6;
        }

        public void a(Activity activity) {
            c.f11004a.a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.f11015a, this.f11016b);
            this.f11017c = activity;
        }

        public void b(Activity activity) {
            c.f11004a.b("Context changed while awaiting result!");
            if (this.f11017c != null) {
                c.f11004a.b("Finishing activity from old context: " + this.f11017c);
                this.f11017c.finishActivity(this.f11016b);
            }
            a(activity);
        }

        public int a() {
            return this.f11016b;
        }
    }

    @Override // com.amazon.a.a.l.b
    public com.amazon.a.a.l.a a(Intent intent) {
        final a aVar = new a(intent, b());
        if (!AbstractC1904e.a(this.f11010g, null, aVar)) {
            f11004a.b("StartActivityForResult called while ActivityResultManager is already awaiting a result");
            return null;
        }
        com.amazon.a.a.o.c cVar = f11004a;
        cVar.a("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + aVar.a());
        this.f11007d.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.l.c.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                Activity b6 = c.this.f11008e.b();
                if (b6 == null) {
                    c.f11004a.a("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
                } else {
                    aVar.a(b6);
                }
            }
        });
        try {
            try {
                cVar.a("Blocking for request: " + aVar.a());
                com.amazon.a.a.l.a take = this.f11011h.take();
                cVar.a("Received Response: " + aVar.a());
                this.f11010g.set(null);
                return take;
            } catch (InterruptedException unused) {
                com.amazon.a.a.o.c cVar2 = f11004a;
                cVar2.a("Interrupted while awaiting for request, returning null");
                cVar2.a("Received Response: " + aVar.a());
                this.f11010g.set(null);
                return null;
            }
        } catch (Throwable th) {
            f11004a.a("Received Response: " + aVar.a());
            this.f11010g.set(null);
            throw th;
        }
    }

    @Override // com.amazon.a.a.l.b
    public boolean a(com.amazon.a.a.l.a aVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11004a.a("Recieved ActivityResult: " + aVar);
        }
        a aVar2 = this.f11010g.get();
        if (aVar2 == null) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11004a.a("We don't have a current open request, returning");
            }
            return false;
        }
        if (aVar2.a() != aVar.b()) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11004a.a("We don't have a request with code: " + aVar.b() + ", returning");
            }
            return false;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f11004a.a("Signaling thread waiting for request: " + aVar.b());
        }
        this.f11011h.add(aVar);
        return true;
    }
}
