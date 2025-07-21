package y1;

import b2.j;
import b2.k;
import b2.s;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2345b extends j {

    /* renamed from: p, reason: collision with root package name */
    public final s f21179p;

    public C2345b(String str, s sVar) {
        super(str);
        this.f21179p = sVar;
    }

    @Override // b2.j
    public k B(byte[] bArr, int i6, boolean z6) {
        if (z6) {
            this.f21179p.a();
        }
        return this.f21179p.b(bArr, 0, i6);
    }
}
