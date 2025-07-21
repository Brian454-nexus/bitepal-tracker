package a5;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7748b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(R4.f.f4618a);

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f7748b);
    }

    @Override // a5.h
    public Bitmap c(U4.d dVar, Bitmap bitmap, int i6, int i7) {
        return AbstractC1014C.c(dVar, bitmap, i6, i7);
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // R4.f
    public int hashCode() {
        return -670243078;
    }
}
