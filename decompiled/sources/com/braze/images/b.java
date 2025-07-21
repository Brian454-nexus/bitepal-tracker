package com.braze.images;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends LruCache {
    public b(int i6) {
        super(i6);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String key = (String) obj;
        Bitmap image = (Bitmap) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(image, "image");
        return image.getByteCount();
    }
}
