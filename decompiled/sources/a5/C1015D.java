package a5;

import android.graphics.Bitmap;

/* renamed from: a5.D, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1015D implements R4.j {

    /* renamed from: a5.D$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements T4.v {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f7723a;

        public a(Bitmap bitmap) {
            this.f7723a = bitmap;
        }

        @Override // T4.v
        public void a() {
        }

        @Override // T4.v
        public Class b() {
            return Bitmap.class;
        }

        @Override // T4.v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f7723a;
        }

        @Override // T4.v
        public int f() {
            return n5.l.i(this.f7723a);
        }
    }

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T4.v a(Bitmap bitmap, int i6, int i7, R4.h hVar) {
        return new a(bitmap);
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Bitmap bitmap, R4.h hVar) {
        return true;
    }
}
