package com.braze.lrucache;

import com.braze.support.BrazeLogger;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f12351o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p, reason: collision with root package name */
    public static final String f12352p = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* renamed from: q, reason: collision with root package name */
    public static final b f12353q = new b();

    /* renamed from: a, reason: collision with root package name */
    public final File f12354a;

    /* renamed from: b, reason: collision with root package name */
    public final File f12355b;

    /* renamed from: c, reason: collision with root package name */
    public final File f12356c;

    /* renamed from: d, reason: collision with root package name */
    public final File f12357d;

    /* renamed from: i, reason: collision with root package name */
    public BufferedWriter f12362i;

    /* renamed from: k, reason: collision with root package name */
    public int f12364k;

    /* renamed from: h, reason: collision with root package name */
    public long f12361h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f12363j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f12365l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f12366m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n, reason: collision with root package name */
    public final a f12367n = new a(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f12358e = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f12360g = 1;

    /* renamed from: f, reason: collision with root package name */
    public final long f12359f = 52428800;

    public f(File file) {
        this.f12354a = file;
        this.f12355b = new File(file, "journal");
        this.f12356c = new File(file, "journal.tmp");
        this.f12357d = new File(file, "journal.bkp");
    }

    public static void a(f fVar, d dVar, boolean z6) {
        synchronized (fVar) {
            g gVar = dVar.f12346a;
            if (gVar.f12371d == dVar) {
                if (z6 && !gVar.f12370c) {
                    for (int i6 = 0; i6 < fVar.f12360g; i6++) {
                        if (dVar.f12347b[i6]) {
                            if (!gVar.a(i6).exists()) {
                                a(dVar.f12349d, dVar, false);
                                return;
                            }
                        } else {
                            a(dVar.f12349d, dVar, false);
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i6);
                        }
                    }
                }
                for (int i7 = 0; i7 < fVar.f12360g; i7++) {
                    File a6 = gVar.a(i7);
                    if (z6) {
                        if (a6.exists()) {
                            File file = new File(gVar.f12373f, gVar.f12368a + "." + i7);
                            a6.renameTo(file);
                            long j6 = gVar.f12369b[i7];
                            long length = file.length();
                            gVar.f12369b[i7] = length;
                            fVar.f12361h = (fVar.f12361h - j6) + length;
                        }
                    } else if (a6.exists() && !a6.delete()) {
                        throw new IOException();
                    }
                }
                fVar.f12364k++;
                gVar.f12371d = null;
                if (gVar.f12370c | z6) {
                    gVar.f12370c = true;
                    BufferedWriter bufferedWriter = fVar.f12362i;
                    StringBuilder sb = new StringBuilder("CLEAN ");
                    sb.append(gVar.f12368a);
                    StringBuilder sb2 = new StringBuilder();
                    for (long j7 : gVar.f12369b) {
                        sb2.append(' ');
                        sb2.append(j7);
                    }
                    sb.append(sb2.toString());
                    sb.append('\n');
                    bufferedWriter.write(sb.toString());
                    if (z6) {
                        fVar.f12365l++;
                    }
                } else {
                    fVar.f12363j.remove(gVar.f12368a);
                    fVar.f12362i.write("REMOVE " + gVar.f12368a + '\n');
                }
                fVar.f12362i.flush();
                if (fVar.f12361h > fVar.f12359f || fVar.a()) {
                    fVar.f12366m.submit(fVar.f12367n);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void b() {
        File file = this.f12356c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f12363j.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            int i6 = 0;
            if (gVar.f12371d == null) {
                while (i6 < this.f12360g) {
                    this.f12361h += gVar.f12369b[i6];
                    i6++;
                }
            } else {
                gVar.f12371d = null;
                while (i6 < this.f12360g) {
                    File file2 = new File(gVar.f12373f, gVar.f12368a + "." + i6);
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    File a6 = gVar.a(i6);
                    if (a6.exists() && !a6.delete()) {
                        throw new IOException();
                    }
                    i6++;
                }
                it.remove();
            }
        }
    }

    public final void c() {
        i iVar = new i(new FileInputStream(this.f12355b), j.f12380a);
        try {
            String a6 = iVar.a();
            String a7 = iVar.a();
            String a8 = iVar.a();
            String a9 = iVar.a();
            String a10 = iVar.a();
            if (!"libcore.io.DiskLruCache".equals(a6) || !"1".equals(a7) || !Integer.toString(this.f12358e).equals(a8) || !Integer.toString(this.f12360g).equals(a9) || !"".equals(a10)) {
                throw new IOException("unexpected journal header: [" + a6 + ", " + a7 + ", " + a9 + ", " + a10 + "]");
            }
            int i6 = 0;
            while (true) {
                try {
                    c(iVar.a());
                    i6++;
                } catch (EOFException unused) {
                    this.f12364k = i6 - this.f12363j.size();
                    if (iVar.f12379e == -1) {
                        d();
                    } else {
                        this.f12362i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f12355b, true), j.f12380a));
                    }
                    try {
                        iVar.close();
                        return;
                    } catch (RuntimeException e6) {
                        throw e6;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.f12362i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f12356c), j.f12380a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f12358e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f12360g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (g gVar : this.f12363j.values()) {
                    if (gVar.f12371d != null) {
                        bufferedWriter2.write("DIRTY " + gVar.f12368a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(gVar.f12368a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j6 : gVar.f12369b) {
                            sb2.append(' ');
                            sb2.append(j6);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f12355b.exists()) {
                    File file = this.f12355b;
                    File file2 = this.f12357d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (this.f12356c.renameTo(this.f12355b)) {
                    this.f12357d.delete();
                    this.f12362i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f12355b, true), j.f12380a));
                } else {
                    throw new IOException();
                }
            } finally {
                try {
                    bufferedWriter2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized e b(String str) {
        InputStream inputStream;
        if (this.f12362i != null) {
            if (f12351o.matcher(str).matches()) {
                g gVar = (g) this.f12363j.get(str);
                if (gVar == null) {
                    return null;
                }
                if (!gVar.f12370c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f12360g];
                for (int i6 = 0; i6 < this.f12360g; i6++) {
                    try {
                        inputStreamArr[i6] = new FileInputStream(new File(gVar.f12373f, gVar.f12368a + "." + i6));
                    } catch (FileNotFoundException unused) {
                        for (int i7 = 0; i7 < this.f12360g && (inputStream = inputStreamArr[i7]) != null; i7++) {
                            Charset charset = j.f12380a;
                            try {
                                inputStream.close();
                            } catch (RuntimeException e6) {
                                throw e6;
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    }
                }
                this.f12364k++;
                this.f12362i.append((CharSequence) ("READ " + str + '\n'));
                if (a()) {
                    this.f12366m.submit(this.f12367n);
                }
                return new e(inputStreamArr);
            }
            throw new IllegalArgumentException(com.braze.a.a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i6 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i6);
            if (indexOf2 == -1) {
                substring = str.substring(i6);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f12363j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i6, indexOf2);
            }
            g gVar = (g) this.f12363j.get(substring);
            if (gVar == null) {
                gVar = new g(substring, this.f12360g, this.f12354a);
                this.f12363j.put(substring, gVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                gVar.f12370c = true;
                gVar.f12371d = null;
                if (split.length == gVar.f12372e) {
                    for (int i7 = 0; i7 < split.length; i7++) {
                        try {
                            gVar.f12369b[i7] = Long.parseLong(split[i7]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                gVar.f12371d = new d(this, gVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void d(String str) {
        try {
            if (this.f12362i != null) {
                if (f12351o.matcher(str).matches()) {
                    g gVar = (g) this.f12363j.get(str);
                    if (gVar != null && gVar.f12371d == null) {
                        for (int i6 = 0; i6 < this.f12360g; i6++) {
                            File file = new File(gVar.f12373f, gVar.f12368a + "." + i6);
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j6 = this.f12361h;
                            long[] jArr = gVar.f12369b;
                            this.f12361h = j6 - jArr[i6];
                            jArr[i6] = 0;
                        }
                        this.f12364k++;
                        this.f12362i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.f12363j.remove(str);
                        if (a()) {
                            this.f12366m.submit(this.f12367n);
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(com.braze.a.a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.f12362i != null) {
                    if (f12351o.matcher(str).matches()) {
                        g gVar = (g) this.f12363j.get(str);
                        if (gVar == null) {
                            gVar = new g(str, this.f12360g, this.f12354a);
                            this.f12363j.put(str, gVar);
                        } else if (gVar.f12371d != null) {
                            return null;
                        }
                        d dVar = new d(this, gVar);
                        gVar.f12371d = dVar;
                        this.f12362i.write("DIRTY " + str + '\n');
                        this.f12362i.flush();
                        return dVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        int i6 = this.f12364k;
        return i6 >= 2000 && i6 >= this.f12363j.size();
    }
}
