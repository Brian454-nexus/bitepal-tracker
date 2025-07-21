package f5;

import R4.h;
import T4.v;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1303a implements InterfaceC1307e {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f14220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14221b;

    public C1303a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // f5.InterfaceC1307e
    public v a(v vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f14220a, this.f14221b, byteArrayOutputStream);
        vVar.a();
        return new b5.b(byteArrayOutputStream.toByteArray());
    }

    public C1303a(Bitmap.CompressFormat compressFormat, int i6) {
        this.f14220a = compressFormat;
        this.f14221b = i6;
    }
}
