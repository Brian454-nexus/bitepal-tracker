package q;

import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    public int f18459a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f18460b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f18461c = IntCompanionObject.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f18462d = IntCompanionObject.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f18463e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f18464f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18465g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18466h = false;

    public int a() {
        return this.f18465g ? this.f18459a : this.f18460b;
    }

    public int b() {
        return this.f18459a;
    }

    public int c() {
        return this.f18460b;
    }

    public int d() {
        return this.f18465g ? this.f18460b : this.f18459a;
    }

    public void e(int i6, int i7) {
        this.f18466h = false;
        if (i6 != Integer.MIN_VALUE) {
            this.f18463e = i6;
            this.f18459a = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f18464f = i7;
            this.f18460b = i7;
        }
    }

    public void f(boolean z6) {
        if (z6 == this.f18465g) {
            return;
        }
        this.f18465g = z6;
        if (!this.f18466h) {
            this.f18459a = this.f18463e;
            this.f18460b = this.f18464f;
            return;
        }
        if (z6) {
            int i6 = this.f18462d;
            if (i6 == Integer.MIN_VALUE) {
                i6 = this.f18463e;
            }
            this.f18459a = i6;
            int i7 = this.f18461c;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.f18464f;
            }
            this.f18460b = i7;
            return;
        }
        int i8 = this.f18461c;
        if (i8 == Integer.MIN_VALUE) {
            i8 = this.f18463e;
        }
        this.f18459a = i8;
        int i9 = this.f18462d;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.f18464f;
        }
        this.f18460b = i9;
    }

    public void g(int i6, int i7) {
        this.f18461c = i6;
        this.f18462d = i7;
        this.f18466h = true;
        if (this.f18465g) {
            if (i7 != Integer.MIN_VALUE) {
                this.f18459a = i7;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f18460b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f18459a = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f18460b = i7;
        }
    }
}
