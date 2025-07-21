package a5;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: a5.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1012A implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final c5.l f7712a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.d f7713b;

    public C1012A(c5.l lVar, U4.d dVar) {
        this.f7712a = lVar;
        this.f7713b = dVar;
    }

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T4.v a(Uri uri, int i6, int i7, R4.h hVar) {
        T4.v a6 = this.f7712a.a(uri, i6, i7, hVar);
        if (a6 == null) {
            return null;
        }
        return q.a(this.f7713b, (Drawable) a6.get(), i6, i7);
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, R4.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
