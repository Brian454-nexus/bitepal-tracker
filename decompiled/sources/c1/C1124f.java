package c1;

/* renamed from: c1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1124f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1121c f10584a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10585b;

    public C1124f() {
        this(InterfaceC1121c.f10577a);
    }

    public synchronized void a() {
        while (!this.f10585b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z6 = false;
        while (!this.f10585b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z6;
        z6 = this.f10585b;
        this.f10585b = false;
        return z6;
    }

    public synchronized boolean d() {
        return this.f10585b;
    }

    public synchronized boolean e() {
        if (this.f10585b) {
            return false;
        }
        this.f10585b = true;
        notifyAll();
        return true;
    }

    public C1124f(InterfaceC1121c interfaceC1121c) {
        this.f10584a = interfaceC1121c;
    }
}
