package a5;

import android.content.res.Resources;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1018a implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final R4.j f7735a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f7736b;

    public C1018a(Resources resources, R4.j jVar) {
        this.f7736b = (Resources) n5.k.d(resources);
        this.f7735a = (R4.j) n5.k.d(jVar);
    }

    @Override // R4.j
    public T4.v a(Object obj, int i6, int i7, R4.h hVar) {
        return x.e(this.f7736b, this.f7735a.a(obj, i6, i7, hVar));
    }

    @Override // R4.j
    public boolean b(Object obj, R4.h hVar) {
        return this.f7735a.b(obj, hVar);
    }
}
