package H;

import F.Z;
import I.S0;
import L.i;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.d;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class K implements androidx.camera.core.d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1939c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1940d;

    /* renamed from: e, reason: collision with root package name */
    public d.a[] f1941e;

    /* renamed from: f, reason: collision with root package name */
    public final Z f1942f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1943a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1944b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f1945c;

        public a(int i6, int i7, ByteBuffer byteBuffer) {
            this.f1943a = i6;
            this.f1944b = i7;
            this.f1945c = byteBuffer;
        }

        @Override // androidx.camera.core.d.a
        public int a() {
            return this.f1943a;
        }

        @Override // androidx.camera.core.d.a
        public int b() {
            return this.f1944b;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer d() {
            return this.f1945c;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f1946a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1947b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f1948c;

        public b(long j6, int i6, Matrix matrix) {
            this.f1946a = j6;
            this.f1947b = i6;
            this.f1948c = matrix;
        }

        @Override // F.Z
        public S0 a() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // F.Z
        public void b(i.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // F.Z
        public long c() {
            return this.f1946a;
        }
    }

    public K(T.A a6) {
        this((Bitmap) a6.c(), a6.b(), a6.f(), a6.g(), a6.a().c());
    }

    public static d.a D(ByteBuffer byteBuffer, int i6, int i7) {
        return new a(i6, i7, byteBuffer);
    }

    public static Z c(long j6, int i6, Matrix matrix) {
        return new b(j6, i6, matrix);
    }

    @Override // androidx.camera.core.d
    public void N(Rect rect) {
        synchronized (this.f1937a) {
            try {
                a();
                if (rect != null) {
                    this.f1940d.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.d
    public Z O() {
        Z z6;
        synchronized (this.f1937a) {
            a();
            z6 = this.f1942f;
        }
        return z6;
    }

    @Override // androidx.camera.core.d
    public Image X() {
        synchronized (this.f1937a) {
            a();
        }
        return null;
    }

    public final void a() {
        synchronized (this.f1937a) {
            y0.g.i(this.f1941e != null, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f1937a) {
            a();
            this.f1941e = null;
        }
    }

    @Override // androidx.camera.core.d
    public int g() {
        synchronized (this.f1937a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        int i6;
        synchronized (this.f1937a) {
            a();
            i6 = this.f1939c;
        }
        return i6;
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        int i6;
        synchronized (this.f1937a) {
            a();
            i6 = this.f1938b;
        }
        return i6;
    }

    @Override // androidx.camera.core.d
    public d.a[] j() {
        d.a[] aVarArr;
        synchronized (this.f1937a) {
            a();
            d.a[] aVarArr2 = this.f1941e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    public K(Bitmap bitmap, Rect rect, int i6, Matrix matrix, long j6) {
        this(S.b.b(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i6, matrix, j6);
    }

    public K(ByteBuffer byteBuffer, int i6, int i7, int i8, Rect rect, int i9, Matrix matrix, long j6) {
        this.f1937a = new Object();
        this.f1938b = i7;
        this.f1939c = i8;
        this.f1940d = rect;
        this.f1942f = c(j6, i9, matrix);
        byteBuffer.rewind();
        this.f1941e = new d.a[]{D(byteBuffer, i7 * i6, i6)};
    }
}
