package com.braze.images;

import android.content.Context;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {
    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            final File file = new File(context.getCacheDir(), "appboy.imageloader.lru.cache");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Y3.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.images.c.a(file);
                }
            }, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(file);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Y3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.images.c.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(File file) {
        return "Deleting lru image cache directory at: " + file.getAbsolutePath();
    }

    public static final String a() {
        return "Failed to delete stored data in image loader";
    }
}
