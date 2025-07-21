package r5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.io.ConstantsKt;
import r5.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements c.a {

    /* renamed from: r5.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0242a {

        /* renamed from: a, reason: collision with root package name */
        public ZipFile f18713a;

        /* renamed from: b, reason: collision with root package name */
        public ZipEntry f18714b;

        public C0242a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f18713a = zipFile;
            this.f18714b = zipEntry;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    @Override // r5.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r9, java.lang.String[] r10, java.lang.String r11, java.io.File r12, r5.d r13) {
        /*
            r8 = this;
            r0 = 0
            r5.a$a r1 = r8.d(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L98
            r9 = 0
            r10 = r9
        L9:
            int r2 = r10 + 1
            r3 = 5
            if (r10 >= r3) goto L8d
            java.lang.String r10 = "Found %s! Extracting..."
            java.lang.Object[] r3 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L25
            r13.i(r10, r3)     // Catch: java.lang.Throwable -> L25
            boolean r10 = r12.exists()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L8a
            if (r10 != 0) goto L29
            boolean r10 = r12.createNewFile()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L8a
            if (r10 != 0) goto L29
            goto L8a
        L25:
            r9 = move-exception
            r0 = r1
            goto Lad
        L29:
            java.util.zip.ZipFile r10 = r1.f18713a     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.util.zip.ZipEntry r3 = r1.f18714b     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.io.InputStream r10 = r10.getInputStream(r3)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6e java.io.FileNotFoundException -> L70
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6e java.io.FileNotFoundException -> L70
            long r4 = r8.c(r10, r3)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L82 java.io.FileNotFoundException -> L86
            java.io.FileDescriptor r6 = r3.getFD()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L82 java.io.FileNotFoundException -> L86
            r6.sync()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L82 java.io.FileNotFoundException -> L86
            long r6 = r12.length()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L82 java.io.FileNotFoundException -> L86
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L50
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
        L4c:
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            goto L8a
        L50:
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            r10 = 1
            r12.setReadable(r10, r9)     // Catch: java.lang.Throwable -> L25
            r12.setExecutable(r10, r9)     // Catch: java.lang.Throwable -> L25
            r12.setWritable(r10)     // Catch: java.lang.Throwable -> L25
            java.util.zip.ZipFile r9 = r1.f18713a     // Catch: java.io.IOException -> L97
            if (r9 == 0) goto L97
        L64:
            r9.close()     // Catch: java.io.IOException -> L97
            goto L97
        L68:
            r9 = move-exception
        L69:
            r0 = r10
            goto L7b
        L6b:
            r9 = move-exception
            r3 = r0
            goto L69
        L6e:
            r3 = r0
            goto L82
        L70:
            r3 = r0
            goto L86
        L72:
            r9 = move-exception
            r3 = r0
            goto L7b
        L75:
            r10 = r0
            r3 = r10
            goto L82
        L78:
            r10 = r0
            r3 = r10
            goto L86
        L7b:
            r8.b(r0)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L82:
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
            goto L4c
        L86:
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
            goto L4c
        L8a:
            r10 = r2
            goto L9
        L8d:
            java.lang.String r9 = "FATAL! Couldn't extract the library from the APK!"
            r13.h(r9)     // Catch: java.lang.Throwable -> L25
            java.util.zip.ZipFile r9 = r1.f18713a     // Catch: java.io.IOException -> L97
            if (r9 == 0) goto L97
            goto L64
        L97:
            return
        L98:
            java.lang.String[] r9 = r8.e(r9, r11)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L9d
            goto La6
        L9d:
            r9 = move-exception
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L25
        La6:
            r5.b r12 = new r5.b     // Catch: java.lang.Throwable -> L25
            r12.<init>(r11, r10, r9)     // Catch: java.lang.Throwable -> L25
            throw r12     // Catch: java.lang.Throwable -> L25
        Lac:
            r9 = move-exception
        Lad:
            if (r0 == 0) goto Lb6
            java.util.zip.ZipFile r10 = r0.f18713a     // Catch: java.io.IOException -> Lb6
            if (r10 == 0) goto Lb6
            r10.close()     // Catch: java.io.IOException -> Lb6
        Lb6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.a.a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, r5.d):void");
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        long j6 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j6;
            }
            outputStream.write(bArr, 0, read);
            j6 += read;
        }
    }

    public final C0242a d(Context context, String[] strArr, String str, d dVar) {
        String[] f6 = f(context);
        int length = f6.length;
        int i6 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i6 >= length) {
                return null;
            }
            String str2 = f6[i6];
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (i7 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i7 = i8;
                }
            }
            if (zipFile != null) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (i9 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c6 = File.separatorChar;
                            sb.append(c6);
                            sb.append(str3);
                            sb.append(c6);
                            sb.append(str);
                            String sb2 = sb.toString();
                            dVar.i("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new C0242a(zipFile, entry);
                            }
                        }
                        i9 = i10;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i6++;
        }
    }

    public final String[] e(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c6 = File.separatorChar;
        sb.append(c6);
        sb.append("([^\\");
        sb.append(c6);
        sb.append("]*)");
        sb.append(c6);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
