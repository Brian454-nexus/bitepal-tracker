package T;

import T.C0765u;
import l0.AbstractC1728c;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0746a extends C0765u.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4803a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4804b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1728c.a f4805c;

    public C0746a(int i6, int i7, AbstractC1728c.a aVar) {
        this.f4803a = i6;
        this.f4804b = i7;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f4805c = aVar;
    }

    @Override // T.C0765u.b
    public AbstractC1728c.a a() {
        return this.f4805c;
    }

    @Override // T.C0765u.b
    public int b() {
        return this.f4803a;
    }

    @Override // T.C0765u.b
    public int c() {
        return this.f4804b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0765u.b) {
            C0765u.b bVar = (C0765u.b) obj;
            if (this.f4803a == bVar.b() && this.f4804b == bVar.c() && this.f4805c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4803a ^ 1000003) * 1000003) ^ this.f4804b) * 1000003) ^ this.f4805c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f4803a + ", rotationDegrees=" + this.f4804b + ", completer=" + this.f4805c + "}";
    }
}
