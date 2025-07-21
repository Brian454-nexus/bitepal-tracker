package a5;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7747b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(R4.f.f4618a);

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f7747b);
    }

    @Override // a5.h
    public Bitmap c(U4.d dVar, Bitmap bitmap, int i6, int i7) {
        return AbstractC1014C.b(dVar, bitmap, i6, i7);
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // R4.f
    public int hashCode() {
        return -599754482;
    }
}
