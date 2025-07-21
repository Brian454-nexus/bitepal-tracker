package j5;

import j5.e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k implements e, d {

    /* renamed from: a, reason: collision with root package name */
    public final e f16292a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16293b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f16294c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f16295d;

    /* renamed from: e, reason: collision with root package name */
    public e.a f16296e;

    /* renamed from: f, reason: collision with root package name */
    public e.a f16297f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16298g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f16296e = aVar;
        this.f16297f = aVar;
        this.f16293b = obj;
        this.f16292a = eVar;
    }

    private boolean m() {
        e eVar = this.f16292a;
        return eVar == null || eVar.h(this);
    }

    private boolean n() {
        e eVar = this.f16292a;
        return eVar == null || eVar.f(this);
    }

    private boolean o() {
        e eVar = this.f16292a;
        return eVar == null || eVar.i(this);
    }

    @Override // j5.e, j5.d
    public boolean a() {
        boolean z6;
        synchronized (this.f16293b) {
            try {
                z6 = this.f16295d.a() || this.f16294c.a();
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.e
    public void b(d dVar) {
        synchronized (this.f16293b) {
            try {
                if (dVar.equals(this.f16295d)) {
                    this.f16297f = e.a.SUCCESS;
                    return;
                }
                this.f16296e = e.a.SUCCESS;
                e eVar = this.f16292a;
                if (eVar != null) {
                    eVar.b(this);
                }
                if (!this.f16297f.b()) {
                    this.f16295d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.d
    public void c() {
        synchronized (this.f16293b) {
            try {
                if (!this.f16297f.b()) {
                    this.f16297f = e.a.PAUSED;
                    this.f16295d.c();
                }
                if (!this.f16296e.b()) {
                    this.f16296e = e.a.PAUSED;
                    this.f16294c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.d
    public void clear() {
        synchronized (this.f16293b) {
            this.f16298g = false;
            e.a aVar = e.a.CLEARED;
            this.f16296e = aVar;
            this.f16297f = aVar;
            this.f16295d.clear();
            this.f16294c.clear();
        }
    }

    @Override // j5.e
    public e d() {
        e d6;
        synchronized (this.f16293b) {
            try {
                e eVar = this.f16292a;
                d6 = eVar != null ? eVar.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d6;
    }

    @Override // j5.d
    public boolean e(d dVar) {
        if (dVar instanceof k) {
            k kVar = (k) dVar;
            if (this.f16294c != null ? this.f16294c.e(kVar.f16294c) : kVar.f16294c == null) {
                if (this.f16295d == null) {
                    if (kVar.f16295d == null) {
                        return true;
                    }
                } else if (this.f16295d.e(kVar.f16295d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j5.e
    public boolean f(d dVar) {
        boolean z6;
        synchronized (this.f16293b) {
            try {
                z6 = n() && dVar.equals(this.f16294c) && !a();
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.d
    public boolean g() {
        boolean z6;
        synchronized (this.f16293b) {
            z6 = this.f16296e == e.a.CLEARED;
        }
        return z6;
    }

    @Override // j5.e
    public boolean h(d dVar) {
        boolean z6;
        synchronized (this.f16293b) {
            try {
                z6 = m() && dVar.equals(this.f16294c) && this.f16296e != e.a.PAUSED;
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.e
    public boolean i(d dVar) {
        boolean z6;
        synchronized (this.f16293b) {
            try {
                z6 = o() && (dVar.equals(this.f16294c) || this.f16296e != e.a.SUCCESS);
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.d
    public boolean isRunning() {
        boolean z6;
        synchronized (this.f16293b) {
            z6 = this.f16296e == e.a.RUNNING;
        }
        return z6;
    }

    @Override // j5.d
    public void j() {
        synchronized (this.f16293b) {
            try {
                this.f16298g = true;
                try {
                    if (this.f16296e != e.a.SUCCESS) {
                        e.a aVar = this.f16297f;
                        e.a aVar2 = e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f16297f = aVar2;
                            this.f16295d.j();
                        }
                    }
                    if (this.f16298g) {
                        e.a aVar3 = this.f16296e;
                        e.a aVar4 = e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f16296e = aVar4;
                            this.f16294c.j();
                        }
                    }
                    this.f16298g = false;
                } catch (Throwable th) {
                    this.f16298g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j5.e
    public void k(d dVar) {
        synchronized (this.f16293b) {
            try {
                if (!dVar.equals(this.f16294c)) {
                    this.f16297f = e.a.FAILED;
                    return;
                }
                this.f16296e = e.a.FAILED;
                e eVar = this.f16292a;
                if (eVar != null) {
                    eVar.k(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.d
    public boolean l() {
        boolean z6;
        synchronized (this.f16293b) {
            z6 = this.f16296e == e.a.SUCCESS;
        }
        return z6;
    }

    public void p(d dVar, d dVar2) {
        this.f16294c = dVar;
        this.f16295d = dVar2;
    }
}
