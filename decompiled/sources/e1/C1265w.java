package e1;

import android.net.Uri;
import c1.AbstractC1119a;
import java.util.Collections;
import java.util.Map;

/* renamed from: e1.w, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1265w implements InterfaceC1248f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1248f f13902a;

    /* renamed from: b, reason: collision with root package name */
    public long f13903b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f13904c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    public Map f13905d = Collections.EMPTY_MAP;

    public C1265w(InterfaceC1248f interfaceC1248f) {
        this.f13902a = (InterfaceC1248f) AbstractC1119a.e(interfaceC1248f);
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        this.f13902a.close();
    }

    public long f() {
        return this.f13903b;
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return this.f13902a.getUri();
    }

    @Override // e1.InterfaceC1248f
    public void l(InterfaceC1266x interfaceC1266x) {
        AbstractC1119a.e(interfaceC1266x);
        this.f13902a.l(interfaceC1266x);
    }

    @Override // e1.InterfaceC1248f
    public Map n() {
        return this.f13902a.n();
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        this.f13904c = c1252j.f13820a;
        this.f13905d = Collections.EMPTY_MAP;
        long r6 = this.f13902a.r(c1252j);
        this.f13904c = (Uri) AbstractC1119a.e(getUri());
        this.f13905d = n();
        return r6;
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        int read = this.f13902a.read(bArr, i6, i7);
        if (read != -1) {
            this.f13903b += read;
        }
        return read;
    }

    public Uri t() {
        return this.f13904c;
    }

    public Map u() {
        return this.f13905d;
    }

    public void v() {
        this.f13903b = 0L;
    }
}
