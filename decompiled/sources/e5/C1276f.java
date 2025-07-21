package e5;

import R4.l;
import T4.v;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import n5.k;

/* renamed from: e5.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1276f implements l {

    /* renamed from: b, reason: collision with root package name */
    public final l f13954b;

    public C1276f(l lVar) {
        this.f13954b = (l) k.d(lVar);
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        this.f13954b.a(messageDigest);
    }

    @Override // R4.l
    public v b(Context context, v vVar, int i6, int i7) {
        C1273c c1273c = (C1273c) vVar.get();
        v gVar = new a5.g(c1273c.e(), com.bumptech.glide.b.c(context).f());
        v b6 = this.f13954b.b(context, gVar, i6, i7);
        if (!gVar.equals(b6)) {
            gVar.a();
        }
        c1273c.m(this.f13954b, (Bitmap) b6.get());
        return vVar;
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof C1276f) {
            return this.f13954b.equals(((C1276f) obj).f13954b);
        }
        return false;
    }

    @Override // R4.f
    public int hashCode() {
        return this.f13954b.hashCode();
    }
}
