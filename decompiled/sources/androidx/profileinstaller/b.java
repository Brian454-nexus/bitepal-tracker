package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import s2.AbstractC2058c;
import s2.C2057b;
import s2.k;
import s2.l;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f9576a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9577b;

    /* renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0144c f9578c;

    /* renamed from: e, reason: collision with root package name */
    public final File f9580e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9581f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9582g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9583h;

    /* renamed from: j, reason: collision with root package name */
    public C2057b[] f9585j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f9586k;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9584i = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9579d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0144c interfaceC0144c, String str, String str2, String str3, File file) {
        this.f9576a = assetManager;
        this.f9577b = executor;
        this.f9578c = interfaceC0144c;
        this.f9581f = str;
        this.f9582g = str2;
        this.f9583h = str3;
        this.f9580e = file;
    }

    public static byte[] d() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 > 34) {
            return null;
        }
        switch (i6) {
            case 26:
                return l.f18903d;
            case 27:
                return l.f18902c;
            case 28:
            case 29:
            case 30:
                return l.f18901b;
            case 31:
            case 32:
            case 33:
            case 34:
                return l.f18900a;
            default:
                return null;
        }
    }

    public static boolean j() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 > 34) {
            return false;
        }
        switch (i6) {
            case 31:
            case 32:
            case 33:
            case 34:
                return true;
            default:
                return false;
        }
    }

    public final b b(C2057b[] c2057bArr, byte[] bArr) {
        InputStream g6;
        try {
            g6 = g(this.f9576a, this.f9583h);
        } catch (FileNotFoundException e6) {
            this.f9578c.b(9, e6);
        } catch (IOException e7) {
            this.f9578c.b(7, e7);
        } catch (IllegalStateException e8) {
            this.f9585j = null;
            this.f9578c.b(8, e8);
        }
        if (g6 == null) {
            if (g6 != null) {
                g6.close();
            }
            return null;
        }
        try {
            this.f9585j = k.q(g6, k.o(g6, k.f18899b), bArr, c2057bArr);
            g6.close();
            return this;
        } catch (Throwable th) {
            try {
                g6.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.f9584i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f9579d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f9580e.exists()) {
            try {
                this.f9580e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f9580e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f9584i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f9582g);
        } catch (FileNotFoundException e6) {
            this.f9578c.b(6, e6);
            return null;
        } catch (IOException e7) {
            this.f9578c.b(7, e7);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f9578c.a(5, null);
            }
            return null;
        }
    }

    public b h() {
        b b6;
        c();
        if (this.f9579d != null) {
            InputStream f6 = f(this.f9576a);
            if (f6 != null) {
                this.f9585j = i(f6);
            }
            C2057b[] c2057bArr = this.f9585j;
            if (c2057bArr != null && j() && (b6 = b(c2057bArr, this.f9579d)) != null) {
                return b6;
            }
        }
        return this;
    }

    public final C2057b[] i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C2057b[] w6 = k.w(inputStream, k.o(inputStream, k.f18898a), this.f9581f);
                        try {
                            inputStream.close();
                            return w6;
                        } catch (IOException e6) {
                            this.f9578c.b(7, e6);
                            return w6;
                        }
                    } catch (IOException e7) {
                        this.f9578c.b(7, e7);
                        return null;
                    }
                } catch (IllegalStateException e8) {
                    this.f9578c.b(8, e8);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e9) {
                this.f9578c.b(7, e9);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                this.f9578c.b(7, e10);
            }
            throw th;
        }
    }

    public final void k(final int i6, final Object obj) {
        this.f9577b.execute(new Runnable() { // from class: s2.a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.b.this.f9578c.b(i6, obj);
            }
        });
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        C2057b[] c2057bArr = this.f9585j;
        byte[] bArr = this.f9579d;
        if (c2057bArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    k.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e6) {
                this.f9578c.b(7, e6);
            } catch (IllegalStateException e7) {
                this.f9578c.b(8, e7);
            }
            if (!k.B(byteArrayOutputStream, bArr, c2057bArr)) {
                this.f9578c.b(5, null);
                this.f9585j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f9586k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f9585j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        byte[] bArr = this.f9586k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f9580e);
                    try {
                        AbstractC2058c.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f9586k = null;
                this.f9585j = null;
            }
        } catch (FileNotFoundException e6) {
            k(6, e6);
            return false;
        } catch (IOException e7) {
            k(7, e7);
            return false;
        }
    }
}
