package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import l0.C1729d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1729d f9589a = C1729d.s();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9590b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f9591c = null;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9592a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9593b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9594c;

        /* renamed from: d, reason: collision with root package name */
        public final long f9595d;

        public b(int i6, int i7, long j6, long j7) {
            this.f9592a = i6;
            this.f9593b = i7;
            this.f9594c = j6;
            this.f9595d = j7;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f9592a);
                dataOutputStream.writeInt(this.f9593b);
                dataOutputStream.writeLong(this.f9594c);
                dataOutputStream.writeLong(this.f9595d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f9593b == bVar.f9593b && this.f9594c == bVar.f9594c && this.f9592a == bVar.f9592a && this.f9595d == bVar.f9595d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f9593b), Long.valueOf(this.f9594c), Integer.valueOf(this.f9592a), Long.valueOf(this.f9595d));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f9596a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9597b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9598c;

        public c(int i6, boolean z6, boolean z7) {
            this.f9596a = i6;
            this.f9598c = z7;
            this.f9597b = z6;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i6, boolean z6, boolean z7) {
        c cVar = new c(i6, z6, z7);
        f9591c = cVar;
        f9589a.o(cVar);
        return f9591c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
    
        r13 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.d.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.d.c(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
