package w1;

import android.net.Uri;
import c1.AbstractC1119a;
import c1.C1144z;
import e1.C1252j;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import java.util.Map;

/* renamed from: w1.x, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2238x implements InterfaceC1248f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1248f f20119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20120b;

    /* renamed from: c, reason: collision with root package name */
    public final a f20121c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f20122d;

    /* renamed from: e, reason: collision with root package name */
    public int f20123e;

    /* renamed from: w1.x$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void b(C1144z c1144z);
    }

    public C2238x(InterfaceC1248f interfaceC1248f, int i6, a aVar) {
        AbstractC1119a.a(i6 > 0);
        this.f20119a = interfaceC1248f;
        this.f20120b = i6;
        this.f20121c = aVar;
        this.f20122d = new byte[1];
        this.f20123e = i6;
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        throw new UnsupportedOperationException();
    }

    public final boolean f() {
        if (this.f20119a.read(this.f20122d, 0, 1) == -1) {
            return false;
        }
        int i6 = (this.f20122d[0] & 255) << 4;
        if (i6 == 0) {
            return true;
        }
        byte[] bArr = new byte[i6];
        int i7 = i6;
        int i8 = 0;
        while (i7 > 0) {
            int read = this.f20119a.read(bArr, i8, i7);
            if (read == -1) {
                return false;
            }
            i8 += read;
            i7 -= read;
        }
        while (i6 > 0 && bArr[i6 - 1] == 0) {
            i6--;
        }
        if (i6 > 0) {
            this.f20121c.b(new C1144z(bArr, i6));
        }
        return true;
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return this.f20119a.getUri();
    }

    @Override // e1.InterfaceC1248f
    public void l(InterfaceC1266x interfaceC1266x) {
        AbstractC1119a.e(interfaceC1266x);
        this.f20119a.l(interfaceC1266x);
    }

    @Override // e1.InterfaceC1248f
    public Map n() {
        return this.f20119a.n();
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        throw new UnsupportedOperationException();
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (this.f20123e == 0) {
            if (!f()) {
                return -1;
            }
            this.f20123e = this.f20120b;
        }
        int read = this.f20119a.read(bArr, i6, Math.min(this.f20123e, i7));
        if (read != -1) {
            this.f20123e -= read;
        }
        return read;
    }
}
