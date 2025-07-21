package P4;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f4369a;

    /* renamed from: b, reason: collision with root package name */
    public final File f4370b;

    /* renamed from: c, reason: collision with root package name */
    public final File f4371c;

    /* renamed from: d, reason: collision with root package name */
    public final File f4372d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4373e;

    /* renamed from: f, reason: collision with root package name */
    public long f4374f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4375g;

    /* renamed from: i, reason: collision with root package name */
    public Writer f4377i;

    /* renamed from: k, reason: collision with root package name */
    public int f4379k;

    /* renamed from: h, reason: collision with root package name */
    public long f4376h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f4378j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f4380l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f4381m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n, reason: collision with root package name */
    public final Callable f4382n = new CallableC0070a();

    /* renamed from: P4.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class CallableC0070a implements Callable {
        public CallableC0070a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f4377i == null) {
                        return null;
                    }
                    a.this.C0();
                    if (a.this.u0()) {
                        a.this.z0();
                        a.this.f4379k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(CallableC0070a callableC0070a) {
            this();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f4384a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f4385b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4386c;

        public /* synthetic */ c(a aVar, d dVar, CallableC0070a callableC0070a) {
            this(dVar);
        }

        public void a() {
            a.this.k0(this, false);
        }

        public void b() {
            if (this.f4386c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.k0(this, true);
            this.f4386c = true;
        }

        public File f(int i6) {
            File k6;
            synchronized (a.this) {
                try {
                    if (this.f4384a.f4393f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f4384a.f4392e) {
                        this.f4385b[i6] = true;
                    }
                    k6 = this.f4384a.k(i6);
                    a.this.f4369a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k6;
        }

        public c(d dVar) {
            this.f4384a = dVar;
            this.f4385b = dVar.f4392e ? null : new boolean[a.this.f4375g];
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f4388a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f4389b;

        /* renamed from: c, reason: collision with root package name */
        public File[] f4390c;

        /* renamed from: d, reason: collision with root package name */
        public File[] f4391d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4392e;

        /* renamed from: f, reason: collision with root package name */
        public c f4393f;

        /* renamed from: g, reason: collision with root package name */
        public long f4394g;

        public /* synthetic */ d(a aVar, String str, CallableC0070a callableC0070a) {
            this(str);
        }

        public File j(int i6) {
            return this.f4390c[i6];
        }

        public File k(int i6) {
            return this.f4391d[i6];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j6 : this.f4389b) {
                sb.append(' ');
                sb.append(j6);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) {
            if (strArr.length != a.this.f4375g) {
                throw m(strArr);
            }
            for (int i6 = 0; i6 < strArr.length; i6++) {
                try {
                    this.f4389b[i6] = Long.parseLong(strArr[i6]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public d(String str) {
            this.f4388a = str;
            this.f4389b = new long[a.this.f4375g];
            this.f4390c = new File[a.this.f4375g];
            this.f4391d = new File[a.this.f4375g];
            StringBuilder sb = new StringBuilder(str);
            sb.append(com.amazon.a.a.o.c.a.b.f11260a);
            int length = sb.length();
            for (int i6 = 0; i6 < a.this.f4375g; i6++) {
                sb.append(i6);
                this.f4390c[i6] = new File(a.this.f4369a, sb.toString());
                sb.append(".tmp");
                this.f4391d[i6] = new File(a.this.f4369a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f4396a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4397b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f4398c;

        /* renamed from: d, reason: collision with root package name */
        public final File[] f4399d;

        public /* synthetic */ e(a aVar, String str, long j6, File[] fileArr, long[] jArr, CallableC0070a callableC0070a) {
            this(str, j6, fileArr, jArr);
        }

        public File a(int i6) {
            return this.f4399d[i6];
        }

        public e(String str, long j6, File[] fileArr, long[] jArr) {
            this.f4396a = str;
            this.f4397b = j6;
            this.f4399d = fileArr;
            this.f4398c = jArr;
        }
    }

    public a(File file, int i6, int i7, long j6) {
        this.f4369a = file;
        this.f4373e = i6;
        this.f4370b = new File(file, "journal");
        this.f4371c = new File(file, "journal.tmp");
        this.f4372d = new File(file, "journal.bkp");
        this.f4375g = i7;
        this.f4374f = j6;
    }

    public static void B0(File file, File file2, boolean z6) {
        if (z6) {
            p0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void f0(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void p0(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void s0(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a v0(File file, int i6, int i7, long j6) {
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i7 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                B0(file2, file3, false);
            }
        }
        a aVar = new a(file, i6, i7, j6);
        if (aVar.f4370b.exists()) {
            try {
                aVar.x0();
                aVar.w0();
                return aVar;
            } catch (IOException e6) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                aVar.o0();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i6, i7, j6);
        aVar2.z0();
        return aVar2;
    }

    public synchronized boolean A0(String str) {
        try {
            a0();
            d dVar = (d) this.f4378j.get(str);
            if (dVar != null && dVar.f4393f == null) {
                for (int i6 = 0; i6 < this.f4375g; i6++) {
                    File j6 = dVar.j(i6);
                    if (j6.exists() && !j6.delete()) {
                        throw new IOException("failed to delete " + j6);
                    }
                    this.f4376h -= dVar.f4389b[i6];
                    dVar.f4389b[i6] = 0;
                }
                this.f4379k++;
                this.f4377i.append((CharSequence) "REMOVE");
                this.f4377i.append(' ');
                this.f4377i.append((CharSequence) str);
                this.f4377i.append('\n');
                this.f4378j.remove(str);
                if (u0()) {
                    this.f4381m.submit(this.f4382n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void C0() {
        while (this.f4376h > this.f4374f) {
            A0((String) ((Map.Entry) this.f4378j.entrySet().iterator().next()).getKey());
        }
    }

    public final void a0() {
        if (this.f4377i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f4377i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f4378j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f4393f != null) {
                    dVar.f4393f.a();
                }
            }
            C0();
            f0(this.f4377i);
            this.f4377i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k0(c cVar, boolean z6) {
        d dVar = cVar.f4384a;
        if (dVar.f4393f != cVar) {
            throw new IllegalStateException();
        }
        if (z6 && !dVar.f4392e) {
            for (int i6 = 0; i6 < this.f4375g; i6++) {
                if (!cVar.f4385b[i6]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i6);
                }
                if (!dVar.k(i6).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i7 = 0; i7 < this.f4375g; i7++) {
            File k6 = dVar.k(i7);
            if (!z6) {
                p0(k6);
            } else if (k6.exists()) {
                File j6 = dVar.j(i7);
                k6.renameTo(j6);
                long j7 = dVar.f4389b[i7];
                long length = j6.length();
                dVar.f4389b[i7] = length;
                this.f4376h = (this.f4376h - j7) + length;
            }
        }
        this.f4379k++;
        dVar.f4393f = null;
        if (dVar.f4392e || z6) {
            dVar.f4392e = true;
            this.f4377i.append((CharSequence) "CLEAN");
            this.f4377i.append(' ');
            this.f4377i.append((CharSequence) dVar.f4388a);
            this.f4377i.append((CharSequence) dVar.l());
            this.f4377i.append('\n');
            if (z6) {
                long j8 = this.f4380l;
                this.f4380l = 1 + j8;
                dVar.f4394g = j8;
            }
        } else {
            this.f4378j.remove(dVar.f4388a);
            this.f4377i.append((CharSequence) "REMOVE");
            this.f4377i.append(' ');
            this.f4377i.append((CharSequence) dVar.f4388a);
            this.f4377i.append('\n');
        }
        s0(this.f4377i);
        if (this.f4376h > this.f4374f || u0()) {
            this.f4381m.submit(this.f4382n);
        }
    }

    public void o0() {
        close();
        P4.c.b(this.f4369a);
    }

    public c q0(String str) {
        return r0(str, -1L);
    }

    public final synchronized c r0(String str, long j6) {
        a0();
        d dVar = (d) this.f4378j.get(str);
        CallableC0070a callableC0070a = null;
        if (j6 != -1 && (dVar == null || dVar.f4394g != j6)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0070a);
            this.f4378j.put(str, dVar);
        } else if (dVar.f4393f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0070a);
        dVar.f4393f = cVar;
        this.f4377i.append((CharSequence) "DIRTY");
        this.f4377i.append(' ');
        this.f4377i.append((CharSequence) str);
        this.f4377i.append('\n');
        s0(this.f4377i);
        return cVar;
    }

    public synchronized e t0(String str) {
        Throwable th;
        try {
            try {
                a0();
                d dVar = (d) this.f4378j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f4392e) {
                    return null;
                }
                for (File file : dVar.f4390c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f4379k++;
                this.f4377i.append((CharSequence) "READ");
                this.f4377i.append(' ');
                this.f4377i.append((CharSequence) str);
                this.f4377i.append('\n');
                if (u0()) {
                    this.f4381m.submit(this.f4382n);
                }
                return new e(this, str, dVar.f4394g, dVar.f4390c, dVar.f4389b, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final boolean u0() {
        int i6 = this.f4379k;
        return i6 >= 2000 && i6 >= this.f4378j.size();
    }

    public final void w0() {
        p0(this.f4371c);
        Iterator it = this.f4378j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i6 = 0;
            if (dVar.f4393f == null) {
                while (i6 < this.f4375g) {
                    this.f4376h += dVar.f4389b[i6];
                    i6++;
                }
            } else {
                dVar.f4393f = null;
                while (i6 < this.f4375g) {
                    p0(dVar.j(i6));
                    p0(dVar.k(i6));
                    i6++;
                }
                it.remove();
            }
        }
    }

    public final void x0() {
        P4.b bVar = new P4.b(new FileInputStream(this.f4370b), P4.c.f4407a);
        try {
            String I6 = bVar.I();
            String I7 = bVar.I();
            String I8 = bVar.I();
            String I9 = bVar.I();
            String I10 = bVar.I();
            if (!"libcore.io.DiskLruCache".equals(I6) || !"1".equals(I7) || !Integer.toString(this.f4373e).equals(I8) || !Integer.toString(this.f4375g).equals(I9) || !"".equals(I10)) {
                throw new IOException("unexpected journal header: [" + I6 + ", " + I7 + ", " + I9 + ", " + I10 + "]");
            }
            int i6 = 0;
            while (true) {
                try {
                    y0(bVar.I());
                    i6++;
                } catch (EOFException unused) {
                    this.f4379k = i6 - this.f4378j.size();
                    if (bVar.D()) {
                        z0();
                    } else {
                        this.f4377i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4370b, true), P4.c.f4407a));
                    }
                    P4.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            P4.c.a(bVar);
            throw th;
        }
    }

    public final void y0(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i6 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i6);
        if (indexOf2 == -1) {
            substring = str.substring(i6);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f4378j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i6, indexOf2);
        }
        d dVar = (d) this.f4378j.get(substring);
        CallableC0070a callableC0070a = null;
        if (dVar == null) {
            dVar = new d(this, substring, callableC0070a);
            this.f4378j.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f4392e = true;
            dVar.f4393f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f4393f = new c(this, dVar, callableC0070a);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void z0() {
        try {
            Writer writer = this.f4377i;
            if (writer != null) {
                f0(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4371c), P4.c.f4407a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f4373e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f4375g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f4378j.values()) {
                    if (dVar.f4393f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f4388a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f4388a + dVar.l() + '\n');
                    }
                }
                f0(bufferedWriter);
                if (this.f4370b.exists()) {
                    B0(this.f4370b, this.f4372d, true);
                }
                B0(this.f4371c, this.f4370b, false);
                this.f4372d.delete();
                this.f4377i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4370b, true), P4.c.f4407a));
            } catch (Throwable th) {
                f0(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
