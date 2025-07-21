package y5;

import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21257a;

    /* renamed from: b, reason: collision with root package name */
    public final H5.a f21258b;

    /* renamed from: c, reason: collision with root package name */
    public final H5.a f21259c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21260d;

    public c(Context context, H5.a aVar, H5.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f21257a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f21258b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f21259c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f21260d = str;
    }

    @Override // y5.h
    public Context b() {
        return this.f21257a;
    }

    @Override // y5.h
    public String c() {
        return this.f21260d;
    }

    @Override // y5.h
    public H5.a d() {
        return this.f21259c;
    }

    @Override // y5.h
    public H5.a e() {
        return this.f21258b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f21257a.equals(hVar.b()) && this.f21258b.equals(hVar.e()) && this.f21259c.equals(hVar.d()) && this.f21260d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f21257a.hashCode() ^ 1000003) * 1000003) ^ this.f21258b.hashCode()) * 1000003) ^ this.f21259c.hashCode()) * 1000003) ^ this.f21260d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f21257a + ", wallClock=" + this.f21258b + ", monotonicClock=" + this.f21259c + ", backendName=" + this.f21260d + "}";
    }
}
