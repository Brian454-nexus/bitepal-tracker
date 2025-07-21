package e1;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: e1.o, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1257o extends AbstractC1244b {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f13881e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f13882f;

    /* renamed from: g, reason: collision with root package name */
    public long f13883g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13884h;

    /* renamed from: e1.o$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: e1.o$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends C1249g {
        public b(Throwable th, int i6) {
            super(th, i6);
        }

        public b(String str, Throwable th, int i6) {
            super(str, th, i6);
        }
    }

    public C1257o() {
        super(false);
    }

    public static RandomAccessFile x(Uri uri) {
        try {
            return new RandomAccessFile((String) AbstractC1119a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e6) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e6, (AbstractC1117K.f10560a < 21 || !a.b(e6.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e6, 1004);
        } catch (SecurityException e7) {
            throw new b(e7, 2006);
        } catch (RuntimeException e8) {
            throw new b(e8, 2000);
        }
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        this.f13882f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f13881e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e6) {
                throw new b(e6, 2000);
            }
        } finally {
            this.f13881e = null;
            if (this.f13884h) {
                this.f13884h = false;
                u();
            }
        }
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return this.f13882f;
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        Uri uri = c1252j.f13820a;
        this.f13882f = uri;
        v(c1252j);
        RandomAccessFile x6 = x(uri);
        this.f13881e = x6;
        try {
            x6.seek(c1252j.f13826g);
            long j6 = c1252j.f13827h;
            if (j6 == -1) {
                j6 = this.f13881e.length() - c1252j.f13826g;
            }
            this.f13883g = j6;
            if (j6 < 0) {
                throw new b(null, null, 2008);
            }
            this.f13884h = true;
            w(c1252j);
            return this.f13883g;
        } catch (IOException e6) {
            throw new b(e6, 2000);
        }
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f13883g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) AbstractC1117K.i(this.f13881e)).read(bArr, i6, (int) Math.min(this.f13883g, i7));
            if (read > 0) {
                this.f13883g -= read;
                t(read);
            }
            return read;
        } catch (IOException e6) {
            throw new b(e6, 2000);
        }
    }
}
