package e1;

import Z0.z;
import android.net.Uri;
import android.util.Base64;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.net.URLDecoder;

/* renamed from: e1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1247e extends AbstractC1244b {

    /* renamed from: e, reason: collision with root package name */
    public C1252j f13809e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f13810f;

    /* renamed from: g, reason: collision with root package name */
    public int f13811g;

    /* renamed from: h, reason: collision with root package name */
    public int f13812h;

    public C1247e() {
        super(false);
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        if (this.f13810f != null) {
            this.f13810f = null;
            u();
        }
        this.f13809e = null;
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        C1252j c1252j = this.f13809e;
        if (c1252j != null) {
            return c1252j.f13820a;
        }
        return null;
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        v(c1252j);
        this.f13809e = c1252j;
        Uri normalizeScheme = c1252j.f13820a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC1119a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] d12 = AbstractC1117K.d1(normalizeScheme.getSchemeSpecificPart(), com.amazon.a.a.o.b.f.f11248a);
        if (d12.length != 2) {
            throw z.b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = d12[1];
        if (d12[0].contains(";base64")) {
            try {
                this.f13810f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e6) {
                throw z.b("Error while parsing Base64 encoded string: " + str, e6);
            }
        } else {
            this.f13810f = AbstractC1117K.s0(URLDecoder.decode(str, y6.e.a.name()));
        }
        long j6 = c1252j.f13826g;
        byte[] bArr = this.f13810f;
        if (j6 > bArr.length) {
            this.f13810f = null;
            throw new C1249g(2008);
        }
        int i6 = (int) j6;
        this.f13811g = i6;
        int length = bArr.length - i6;
        this.f13812h = length;
        long j7 = c1252j.f13827h;
        if (j7 != -1) {
            this.f13812h = (int) Math.min(length, j7);
        }
        w(c1252j);
        long j8 = c1252j.f13827h;
        return j8 != -1 ? j8 : this.f13812h;
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i8 = this.f13812h;
        if (i8 == 0) {
            return -1;
        }
        int min = Math.min(i7, i8);
        System.arraycopy(AbstractC1117K.i(this.f13810f), this.f13811g, bArr, i6, min);
        this.f13811g += min;
        this.f13812h -= min;
        t(min);
        return min;
    }
}
