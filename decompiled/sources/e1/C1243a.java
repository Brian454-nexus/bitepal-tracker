package e1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1243a extends AbstractC1244b {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f13794e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f13795f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f13796g;

    /* renamed from: h, reason: collision with root package name */
    public long f13797h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13798i;

    /* renamed from: e1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0193a extends C1249g {
        public C0193a(Throwable th, int i6) {
            super(th, i6);
        }
    }

    public C1243a(Context context) {
        super(false);
        this.f13794e = context.getAssets();
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        this.f13795f = null;
        try {
            try {
                InputStream inputStream = this.f13796g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e6) {
                throw new C0193a(e6, 2000);
            }
        } finally {
            this.f13796g = null;
            if (this.f13798i) {
                this.f13798i = false;
                u();
            }
        }
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return this.f13795f;
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        try {
            Uri uri = c1252j.f13820a;
            this.f13795f = uri;
            String str = (String) AbstractC1119a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            v(c1252j);
            InputStream open = this.f13794e.open(str, 1);
            this.f13796g = open;
            if (open.skip(c1252j.f13826g) < c1252j.f13826g) {
                throw new C0193a(null, 2008);
            }
            long j6 = c1252j.f13827h;
            if (j6 != -1) {
                this.f13797h = j6;
            } else {
                long available = this.f13796g.available();
                this.f13797h = available;
                if (available == 2147483647L) {
                    this.f13797h = -1L;
                }
            }
            this.f13798i = true;
            w(c1252j);
            return this.f13797h;
        } catch (C0193a e6) {
            throw e6;
        } catch (IOException e7) {
            throw new C0193a(e7, e7 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.f13797h;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i7 = (int) Math.min(j6, i7);
            } catch (IOException e6) {
                throw new C0193a(e6, 2000);
            }
        }
        int read = ((InputStream) AbstractC1117K.i(this.f13796g)).read(bArr, i6, i7);
        if (read == -1) {
            return -1;
        }
        long j7 = this.f13797h;
        if (j7 != -1) {
            this.f13797h = j7 - read;
        }
        t(read);
        return read;
    }
}
