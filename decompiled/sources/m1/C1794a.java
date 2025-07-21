package m1;

import android.net.Uri;
import c1.AbstractC1119a;
import e1.C1250h;
import e1.C1252j;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1794a implements InterfaceC1248f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1248f f17228a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17229b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f17230c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f17231d;

    public C1794a(InterfaceC1248f interfaceC1248f, byte[] bArr, byte[] bArr2) {
        this.f17228a = interfaceC1248f;
        this.f17229b = bArr;
        this.f17230c = bArr2;
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        if (this.f17231d != null) {
            this.f17231d = null;
            this.f17228a.close();
        }
    }

    public Cipher f() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // e1.InterfaceC1248f
    public final Uri getUri() {
        return this.f17228a.getUri();
    }

    @Override // e1.InterfaceC1248f
    public final void l(InterfaceC1266x interfaceC1266x) {
        AbstractC1119a.e(interfaceC1266x);
        this.f17228a.l(interfaceC1266x);
    }

    @Override // e1.InterfaceC1248f
    public final Map n() {
        return this.f17228a.n();
    }

    @Override // e1.InterfaceC1248f
    public final long r(C1252j c1252j) {
        try {
            Cipher f6 = f();
            try {
                f6.init(2, new SecretKeySpec(this.f17229b, "AES"), new IvParameterSpec(this.f17230c));
                C1250h c1250h = new C1250h(this.f17228a, c1252j);
                this.f17231d = new CipherInputStream(c1250h, f6);
                c1250h.c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e6) {
                throw new RuntimeException(e6);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // Z0.InterfaceC0837i
    public final int read(byte[] bArr, int i6, int i7) {
        AbstractC1119a.e(this.f17231d);
        int read = this.f17231d.read(bArr, i6, i7);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
