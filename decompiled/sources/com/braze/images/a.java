package com.braze.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.braze.lrucache.j;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.lrucache.f f12318a;

    public a(File file) {
        Pattern pattern = com.braze.lrucache.f.f12351o;
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        com.braze.lrucache.f fVar = new com.braze.lrucache.f(file);
        if (fVar.f12355b.exists()) {
            try {
                fVar.c();
                fVar.b();
            } catch (IOException e6) {
                BrazeLogger.w(com.braze.lrucache.f.f12352p, "DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                synchronized (fVar) {
                    try {
                        if (fVar.f12362i != null) {
                            Iterator it = new ArrayList(fVar.f12363j.values()).iterator();
                            while (it.hasNext()) {
                                com.braze.lrucache.d dVar = ((com.braze.lrucache.g) it.next()).f12371d;
                                if (dVar != null) {
                                    com.braze.lrucache.f.a(dVar.f12349d, dVar, false);
                                }
                            }
                            while (fVar.f12361h > fVar.f12359f) {
                                fVar.d((String) ((Map.Entry) fVar.f12363j.entrySet().iterator().next()).getKey());
                            }
                            fVar.f12362i.close();
                            fVar.f12362i = null;
                        }
                        j.a(fVar.f12354a);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(fVar, "open(...)");
            this.f12318a = fVar;
        }
        file.mkdirs();
        fVar = new com.braze.lrucache.f(file);
        fVar.d();
        Intrinsics.checkNotNullExpressionValue(fVar, "open(...)");
        this.f12318a = fVar;
    }

    public static final String c(String str, String str2) {
        return "Failed to load image from disk cache: " + str + '/' + str2;
    }

    public static final String d(String str, String str2) {
        return "Error while producing output stream or compressing bitmap for key " + str + " diskKey " + str2;
    }

    public final boolean a(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String valueOf = String.valueOf(key.hashCode());
        try {
            com.braze.lrucache.e b6 = this.f12318a.b(valueOf);
            boolean z6 = b6 != null;
            CloseableKt.closeFinally(b6, null);
            return z6;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: Y3.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.images.a.a(key, valueOf);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final Bitmap b(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String valueOf = String.valueOf(key.hashCode());
        try {
            com.braze.lrucache.e b6 = this.f12318a.b(valueOf);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(b6.f12350a[0]);
                CloseableKt.closeFinally(b6, null);
                return decodeStream;
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: Y3.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.images.a.b(key, valueOf);
                }
            }, 4, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.images.a.c(key, valueOf);
                }
            }, 7, (Object) null);
            return null;
        }
    }

    public static final String a(String str, String str2) {
        return "Error while retrieving disk for key " + str + " diskKey " + str2;
    }

    public final void a(final String key, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final String valueOf = String.valueOf(key.hashCode());
        try {
            com.braze.lrucache.d a6 = this.f12318a.a(valueOf);
            OutputStream a7 = a6.a();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, a7);
                a7.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(a7, null);
                if (a6.f12348c) {
                    com.braze.lrucache.f.a(a6.f12349d, a6, false);
                    a6.f12349d.d(a6.f12346a.f12368a);
                } else {
                    com.braze.lrucache.f.a(a6.f12349d, a6, true);
                }
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: Y3.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.images.a.d(key, valueOf);
                }
            }, 4, (Object) null);
        }
    }

    public static final String b(String str, String str2) {
        return "Failed to get bitmap from disk cache for key " + str + " diskKey " + str2;
    }
}
