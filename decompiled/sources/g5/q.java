package g5;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14948a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final Set f14949b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14950c;

    public boolean a(j5.d dVar) {
        boolean z6 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f14948a.remove(dVar);
        if (!this.f14949b.remove(dVar) && !remove) {
            z6 = false;
        }
        if (z6) {
            dVar.clear();
        }
        return z6;
    }

    public void b() {
        Iterator it = n5.l.k(this.f14948a).iterator();
        while (it.hasNext()) {
            a((j5.d) it.next());
        }
        this.f14949b.clear();
    }

    public void c() {
        this.f14950c = true;
        for (j5.d dVar : n5.l.k(this.f14948a)) {
            if (dVar.isRunning() || dVar.l()) {
                dVar.clear();
                this.f14949b.add(dVar);
            }
        }
    }

    public void d() {
        this.f14950c = true;
        for (j5.d dVar : n5.l.k(this.f14948a)) {
            if (dVar.isRunning()) {
                dVar.c();
                this.f14949b.add(dVar);
            }
        }
    }

    public void e() {
        for (j5.d dVar : n5.l.k(this.f14948a)) {
            if (!dVar.l() && !dVar.g()) {
                dVar.clear();
                if (this.f14950c) {
                    this.f14949b.add(dVar);
                } else {
                    dVar.j();
                }
            }
        }
    }

    public void f() {
        this.f14950c = false;
        for (j5.d dVar : n5.l.k(this.f14948a)) {
            if (!dVar.l() && !dVar.isRunning()) {
                dVar.j();
            }
        }
        this.f14949b.clear();
    }

    public void g(j5.d dVar) {
        this.f14948a.add(dVar);
        if (!this.f14950c) {
            dVar.j();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f14949b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f14948a.size() + ", isPaused=" + this.f14950c + "}";
    }
}
