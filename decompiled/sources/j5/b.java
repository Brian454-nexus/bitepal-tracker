package j5;

import j5.e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements e, d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16230a;

    /* renamed from: b, reason: collision with root package name */
    public final e f16231b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f16232c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f16233d;

    /* renamed from: e, reason: collision with root package name */
    public e.a f16234e;

    /* renamed from: f, reason: collision with root package name */
    public e.a f16235f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f16234e = aVar;
        this.f16235f = aVar;
        this.f16230a = obj;
        this.f16231b = eVar;
    }

    @Override // j5.e, j5.d
    public boolean a() {
        boolean z6;
        synchronized (this.f16230a) {
            try {
                z6 = this.f16232c.a() || this.f16233d.a();
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.e
    public void b(d dVar) {
        synchronized (this.f16230a) {
            try {
                if (dVar.equals(this.f16232c)) {
                    this.f16234e = e.a.SUCCESS;
                } else if (dVar.equals(this.f16233d)) {
                    this.f16235f = e.a.SUCCESS;
                }
                e eVar = this.f16231b;
                if (eVar != null) {
                    eVar.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.d
    public void c() {
        synchronized (this.f16230a) {
            try {
                e.a aVar = this.f16234e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f16234e = e.a.PAUSED;
                    this.f16232c.c();
                }
                if (this.f16235f == aVar2) {
                    this.f16235f = e.a.PAUSED;
                    this.f16233d.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.d
    public void clear() {
        synchronized (this.f16230a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f16234e = aVar;
                this.f16232c.clear();
                if (this.f16235f != aVar) {
                    this.f16235f = aVar;
                    this.f16233d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.e
    public e d() {
        e d6;
        synchronized (this.f16230a) {
            try {
                e eVar = this.f16231b;
                d6 = eVar != null ? eVar.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d6;
    }

    @Override // j5.d
    public boolean e(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.f16232c.e(bVar.f16232c) && this.f16233d.e(bVar.f16233d)) {
                return true;
            }
        }
        return false;
    }

    @Override // j5.e
    public boolean f(d dVar) {
        boolean z6;
        synchronized (this.f16230a) {
            try {
                z6 = o() && m(dVar);
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.d
    public boolean g() {
        boolean z6;
        synchronized (this.f16230a) {
            try {
                e.a aVar = this.f16234e;
                e.a aVar2 = e.a.CLEARED;
                z6 = aVar == aVar2 && this.f16235f == aVar2;
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.e
    public boolean h(d dVar) {
        boolean z6;
        synchronized (this.f16230a) {
            try {
                z6 = n() && dVar.equals(this.f16232c);
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.e
    public boolean i(d dVar) {
        boolean p6;
        synchronized (this.f16230a) {
            p6 = p();
        }
        return p6;
    }

    @Override // j5.d
    public boolean isRunning() {
        boolean z6;
        synchronized (this.f16230a) {
            try {
                e.a aVar = this.f16234e;
                e.a aVar2 = e.a.RUNNING;
                z6 = aVar == aVar2 || this.f16235f == aVar2;
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.d
    public void j() {
        synchronized (this.f16230a) {
            try {
                e.a aVar = this.f16234e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f16234e = aVar2;
                    this.f16232c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.e
    public void k(d dVar) {
        synchronized (this.f16230a) {
            try {
                if (dVar.equals(this.f16233d)) {
                    this.f16235f = e.a.FAILED;
                    e eVar = this.f16231b;
                    if (eVar != null) {
                        eVar.k(this);
                    }
                    return;
                }
                this.f16234e = e.a.FAILED;
                e.a aVar = this.f16235f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f16235f = aVar2;
                    this.f16233d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.d
    public boolean l() {
        boolean z6;
        synchronized (this.f16230a) {
            try {
                e.a aVar = this.f16234e;
                e.a aVar2 = e.a.SUCCESS;
                z6 = aVar == aVar2 || this.f16235f == aVar2;
            } finally {
            }
        }
        return z6;
    }

    public final boolean m(d dVar) {
        e.a aVar = this.f16234e;
        e.a aVar2 = e.a.FAILED;
        if (aVar != aVar2) {
            return dVar.equals(this.f16232c);
        }
        if (!dVar.equals(this.f16233d)) {
            return false;
        }
        e.a aVar3 = this.f16235f;
        return aVar3 == e.a.SUCCESS || aVar3 == aVar2;
    }

    public final boolean n() {
        e eVar = this.f16231b;
        return eVar == null || eVar.h(this);
    }

    public final boolean o() {
        e eVar = this.f16231b;
        return eVar == null || eVar.f(this);
    }

    public final boolean p() {
        e eVar = this.f16231b;
        return eVar == null || eVar.i(this);
    }

    public void q(d dVar, d dVar2) {
        this.f16232c = dVar;
        this.f16233d = dVar2;
    }
}
