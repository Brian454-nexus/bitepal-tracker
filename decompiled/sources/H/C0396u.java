package H;

import F.X;
import F.Y;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* renamed from: H.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0396u implements T.z {

    /* renamed from: H.u$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a c(T.A a6, X.g gVar) {
            return new C0381e(a6, gVar);
        }

        public abstract X.g a();

        public abstract T.A b();
    }

    public static Uri b(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new Y(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static Uri c(File file, X.g gVar) {
        Uri insert;
        ContentResolver a6 = gVar.a();
        Objects.requireNonNull(a6);
        ContentValues contentValues = gVar.b() != null ? new ContentValues(gVar.b()) : new ContentValues();
        l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                insert = a6.insert(gVar.f(), contentValues);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (SecurityException e7) {
            e = e7;
        }
        try {
            if (insert == null) {
                throw new Y(1, "Failed to insert a MediaStore URI.", null);
            }
            e(file, insert, a6);
            n(insert, a6, 0);
            return insert;
        } catch (IOException e8) {
            e = e8;
            uri = insert;
            throw new Y(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e9) {
            e = e9;
            uri = insert;
            throw new Y(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th2) {
            th = th2;
            uri = insert;
            if (uri != null) {
                n(uri, a6, 0);
            }
            throw th;
        }
    }

    public static void d(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void e(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                d(file, openOutputStream);
                openOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static File f(X.g gVar) {
        try {
            File c6 = gVar.c();
            if (c6 == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(c6.getParent(), "CameraX" + UUID.randomUUID().toString() + g(c6));
        } catch (IOException e6) {
            throw new Y(1, "Failed to create temp file.", e6);
        }
    }

    public static String g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : "";
    }

    public static boolean h(X.g gVar) {
        return gVar.c() != null;
    }

    public static boolean i(X.g gVar) {
        return (gVar.f() == null || gVar.a() == null || gVar.b() == null) ? false : true;
    }

    public static boolean j(X.g gVar) {
        return gVar.e() != null;
    }

    public static Uri k(File file, X.g gVar) {
        Uri uri = null;
        try {
            try {
                if (i(gVar)) {
                    uri = c(file, gVar);
                } else if (j(gVar)) {
                    OutputStream e6 = gVar.e();
                    Objects.requireNonNull(e6);
                    d(file, e6);
                } else if (h(gVar)) {
                    File c6 = gVar.c();
                    Objects.requireNonNull(c6);
                    uri = b(file, c6);
                }
                file.delete();
                return uri;
            } catch (IOException unused) {
                throw new Y(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public static void l(ContentValues contentValues, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i6));
        }
    }

    public static void m(File file, L.g gVar, X.g gVar2, int i6) {
        try {
            L.g h6 = L.g.h(file);
            gVar.g(h6);
            if (h6.s() == 0 && i6 != 0) {
                h6.z(i6);
            }
            X.d d6 = gVar2.d();
            if (d6.b()) {
                h6.l();
            }
            if (d6.c()) {
                h6.m();
            }
            if (d6.a() != null) {
                h6.b(d6.a());
            }
            h6.A();
        } catch (IOException e6) {
            throw new Y(1, "Failed to update Exif data", e6);
        }
    }

    public static void n(Uri uri, ContentResolver contentResolver, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            l(contentValues, i6);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    public static void o(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new R.c().a(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e6) {
            throw new Y(1, "Failed to write to temp file", e6);
        }
    }

    @Override // T.z
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public X.h apply(a aVar) {
        T.A b6 = aVar.b();
        X.g a6 = aVar.a();
        File f6 = f(a6);
        o(f6, (byte[]) b6.c());
        L.g d6 = b6.d();
        Objects.requireNonNull(d6);
        m(f6, d6, a6, b6.f());
        return new X.h(k(f6, a6));
    }
}
