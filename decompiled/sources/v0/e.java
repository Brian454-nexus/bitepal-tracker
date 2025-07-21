package v0;

import android.os.CancellationSignal;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19281a;

    /* renamed from: b, reason: collision with root package name */
    public a f19282b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19283c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19284d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f19281a) {
                    return;
                }
                this.f19281a = true;
                this.f19284d = true;
                a aVar = this.f19282b;
                Object obj = this.f19283c;
                if (aVar != null) {
                    try {
                        aVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f19284d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f19284d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f19282b == aVar) {
                    return;
                }
                this.f19282b = aVar;
                if (this.f19281a && aVar != null) {
                    aVar.a();
                }
            } finally {
            }
        }
    }

    public final void c() {
        while (this.f19284d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
