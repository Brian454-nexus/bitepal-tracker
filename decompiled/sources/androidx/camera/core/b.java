package androidx.camera.core;

import F.Z;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final d f8370b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8369a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Set f8371c = new HashSet();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(d dVar);
    }

    public b(d dVar) {
        this.f8370b = dVar;
    }

    @Override // androidx.camera.core.d
    public void N(Rect rect) {
        this.f8370b.N(rect);
    }

    @Override // androidx.camera.core.d
    public Z O() {
        return this.f8370b.O();
    }

    @Override // androidx.camera.core.d
    public Image X() {
        return this.f8370b.X();
    }

    public void a(a aVar) {
        synchronized (this.f8369a) {
            this.f8371c.add(aVar);
        }
    }

    public void c() {
        HashSet hashSet;
        synchronized (this.f8369a) {
            hashSet = new HashSet(this.f8371c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f8370b.close();
        c();
    }

    @Override // androidx.camera.core.d
    public int g() {
        return this.f8370b.g();
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        return this.f8370b.getHeight();
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        return this.f8370b.getWidth();
    }

    @Override // androidx.camera.core.d
    public d.a[] j() {
        return this.f8370b.j();
    }
}
