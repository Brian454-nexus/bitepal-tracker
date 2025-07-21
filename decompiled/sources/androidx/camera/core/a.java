package androidx.camera.core;

import F.AbstractC0331g0;
import F.Z;
import I.S0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.d;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Image f8365a;

    /* renamed from: b, reason: collision with root package name */
    public final C0123a[] f8366b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f8367c;

    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0123a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final Image.Plane f8368a;

        public C0123a(Image.Plane plane) {
            this.f8368a = plane;
        }

        @Override // androidx.camera.core.d.a
        public int a() {
            return this.f8368a.getRowStride();
        }

        @Override // androidx.camera.core.d.a
        public int b() {
            return this.f8368a.getPixelStride();
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer d() {
            return this.f8368a.getBuffer();
        }
    }

    public a(Image image) {
        this.f8365a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f8366b = new C0123a[planes.length];
            for (int i6 = 0; i6 < planes.length; i6++) {
                this.f8366b[i6] = new C0123a(planes[i6]);
            }
        } else {
            this.f8366b = new C0123a[0];
        }
        this.f8367c = AbstractC0331g0.d(S0.b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.d
    public void N(Rect rect) {
        this.f8365a.setCropRect(rect);
    }

    @Override // androidx.camera.core.d
    public Z O() {
        return this.f8367c;
    }

    @Override // androidx.camera.core.d
    public Image X() {
        return this.f8365a;
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f8365a.close();
    }

    @Override // androidx.camera.core.d
    public int g() {
        return this.f8365a.getFormat();
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        return this.f8365a.getHeight();
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        return this.f8365a.getWidth();
    }

    @Override // androidx.camera.core.d
    public d.a[] j() {
        return this.f8366b;
    }
}
