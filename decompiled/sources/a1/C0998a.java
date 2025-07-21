package a1;

import a1.InterfaceC0999b;
import c1.AbstractC1119a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import z6.w;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0998a {

    /* renamed from: a, reason: collision with root package name */
    public final w f7636a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7637b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f7638c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0999b.a f7639d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0999b.a f7640e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7641f;

    public C0998a(w wVar) {
        this.f7636a = wVar;
        InterfaceC0999b.a aVar = InterfaceC0999b.a.f7643e;
        this.f7639d = aVar;
        this.f7640e = aVar;
        this.f7641f = false;
    }

    public InterfaceC0999b.a a(InterfaceC0999b.a aVar) {
        if (aVar.equals(InterfaceC0999b.a.f7643e)) {
            throw new InterfaceC0999b.C0119b(aVar);
        }
        for (int i6 = 0; i6 < this.f7636a.size(); i6++) {
            InterfaceC0999b interfaceC0999b = (InterfaceC0999b) this.f7636a.get(i6);
            InterfaceC0999b.a e6 = interfaceC0999b.e(aVar);
            if (interfaceC0999b.isActive()) {
                AbstractC1119a.g(!e6.equals(InterfaceC0999b.a.f7643e));
                aVar = e6;
            }
        }
        this.f7640e = aVar;
        return aVar;
    }

    public void b() {
        this.f7637b.clear();
        this.f7639d = this.f7640e;
        this.f7641f = false;
        for (int i6 = 0; i6 < this.f7636a.size(); i6++) {
            InterfaceC0999b interfaceC0999b = (InterfaceC0999b) this.f7636a.get(i6);
            interfaceC0999b.flush();
            if (interfaceC0999b.isActive()) {
                this.f7637b.add(interfaceC0999b);
            }
        }
        this.f7638c = new ByteBuffer[this.f7637b.size()];
        for (int i7 = 0; i7 <= c(); i7++) {
            this.f7638c[i7] = ((InterfaceC0999b) this.f7637b.get(i7)).b();
        }
    }

    public final int c() {
        return this.f7638c.length - 1;
    }

    public ByteBuffer d() {
        if (!f()) {
            return InterfaceC0999b.f7642a;
        }
        ByteBuffer byteBuffer = this.f7638c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(InterfaceC0999b.f7642a);
        return this.f7638c[c()];
    }

    public boolean e() {
        return this.f7641f && ((InterfaceC0999b) this.f7637b.get(c())).d() && !this.f7638c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0998a)) {
            return false;
        }
        C0998a c0998a = (C0998a) obj;
        if (this.f7636a.size() != c0998a.f7636a.size()) {
            return false;
        }
        for (int i6 = 0; i6 < this.f7636a.size(); i6++) {
            if (this.f7636a.get(i6) != c0998a.f7636a.get(i6)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f7637b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z6;
        for (boolean z7 = true; z7; z7 = z6) {
            z6 = false;
            int i6 = 0;
            while (i6 <= c()) {
                if (!this.f7638c[i6].hasRemaining()) {
                    InterfaceC0999b interfaceC0999b = (InterfaceC0999b) this.f7637b.get(i6);
                    if (!interfaceC0999b.d()) {
                        ByteBuffer byteBuffer2 = i6 > 0 ? this.f7638c[i6 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0999b.f7642a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC0999b.c(byteBuffer2);
                        this.f7638c[i6] = interfaceC0999b.b();
                        z6 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f7638c[i6].hasRemaining();
                    } else if (!this.f7638c[i6].hasRemaining() && i6 < c()) {
                        ((InterfaceC0999b) this.f7637b.get(i6 + 1)).f();
                    }
                }
                i6++;
            }
        }
    }

    public void h() {
        if (!f() || this.f7641f) {
            return;
        }
        this.f7641f = true;
        ((InterfaceC0999b) this.f7637b.get(0)).f();
    }

    public int hashCode() {
        return this.f7636a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f7641f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i6 = 0; i6 < this.f7636a.size(); i6++) {
            InterfaceC0999b interfaceC0999b = (InterfaceC0999b) this.f7636a.get(i6);
            interfaceC0999b.flush();
            interfaceC0999b.a();
        }
        this.f7638c = new ByteBuffer[0];
        InterfaceC0999b.a aVar = InterfaceC0999b.a.f7643e;
        this.f7639d = aVar;
        this.f7640e = aVar;
        this.f7641f = false;
    }
}
