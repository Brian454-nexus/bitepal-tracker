package x1;

import java.util.NoSuchElementException;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2258b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final long f20405b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20406c;

    /* renamed from: d, reason: collision with root package name */
    public long f20407d;

    public AbstractC2258b(long j6, long j7) {
        this.f20405b = j6;
        this.f20406c = j7;
        f();
    }

    public final void c() {
        long j6 = this.f20407d;
        if (j6 < this.f20405b || j6 > this.f20406c) {
            throw new NoSuchElementException();
        }
    }

    public final long d() {
        return this.f20407d;
    }

    public boolean e() {
        return this.f20407d > this.f20406c;
    }

    public void f() {
        this.f20407d = this.f20405b - 1;
    }

    @Override // x1.n
    public boolean next() {
        this.f20407d++;
        return !e();
    }
}
