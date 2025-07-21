package a5;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1019b implements R4.k {

    /* renamed from: a, reason: collision with root package name */
    public final U4.d f7737a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.k f7738b;

    public C1019b(U4.d dVar, R4.k kVar) {
        this.f7737a = dVar;
        this.f7738b = kVar;
    }

    @Override // R4.k
    public R4.c a(R4.h hVar) {
        return this.f7738b.a(hVar);
    }

    @Override // R4.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(T4.v vVar, File file, R4.h hVar) {
        return this.f7738b.b(new g(((BitmapDrawable) vVar.get()).getBitmap(), this.f7737a), file, hVar);
    }
}
