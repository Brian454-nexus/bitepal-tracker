package com.amazon.a.a.h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10915a = new com.amazon.a.a.o.c("MetricsManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    private b f10916b = new b();

    @Override // com.amazon.a.a.h.c
    public synchronized void a(a aVar) {
        try {
            if (com.amazon.a.a.o.c.f11253a) {
                f10915a.a("Recording Metric: " + aVar);
            }
            this.f10916b.a(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.a.a.h.c
    public synchronized b a() {
        if (this.f10916b.a()) {
            return this.f10916b;
        }
        b bVar = this.f10916b;
        this.f10916b = new b();
        return bVar;
    }
}
