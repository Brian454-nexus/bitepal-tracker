package o1;

import Z0.q;
import Z0.y;
import Z0.z;
import android.graphics.Bitmap;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.AbstractC1245c;
import f1.h;
import g1.K0;
import java.io.IOException;
import java.nio.ByteBuffer;
import o1.c;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1836a extends h implements o1.c {

    /* renamed from: o, reason: collision with root package name */
    public final b f17845o;

    /* renamed from: o1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0226a extends f {
        public C0226a() {
        }

        @Override // f1.g
        public void n() {
            C1836a.this.t(this);
        }
    }

    /* renamed from: o1.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        Bitmap a(byte[] bArr, int i6);
    }

    /* renamed from: o1.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements c.a {

        /* renamed from: b, reason: collision with root package name */
        public final b f17847b = new b() { // from class: o1.b
            @Override // o1.C1836a.b
            public final Bitmap a(byte[] bArr, int i6) {
                Bitmap B6;
                B6 = C1836a.B(bArr, i6);
                return B6;
            }
        };

        @Override // o1.c.a
        public int b(q qVar) {
            String str = qVar.f6990n;
            return (str == null || !y.p(str)) ? K0.E(0) : AbstractC1117K.z0(qVar.f6990n) ? K0.E(4) : K0.E(1);
        }

        @Override // o1.c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1836a a() {
            return new C1836a(this.f17847b, null);
        }
    }

    public /* synthetic */ C1836a(b bVar, C0226a c0226a) {
        this(bVar);
    }

    public static Bitmap B(byte[] bArr, int i6) {
        try {
            return AbstractC1245c.a(bArr, i6, null);
        } catch (z e6) {
            throw new d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i6 + ")", e6);
        } catch (IOException e7) {
            throw new d(e7);
        }
    }

    @Override // f1.h
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public d k(Throwable th) {
        return new d("Unexpected decode error", th);
    }

    @Override // f1.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public d l(f1.f fVar, f fVar2, boolean z6) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(fVar.f14005d);
            AbstractC1119a.g(byteBuffer.hasArray());
            AbstractC1119a.a(byteBuffer.arrayOffset() == 0);
            fVar2.f17850e = this.f17845o.a(byteBuffer.array(), byteBuffer.remaining());
            fVar2.f14013b = fVar.f14007f;
            return null;
        } catch (d e6) {
            return e6;
        }
    }

    @Override // f1.h, f1.d
    public /* bridge */ /* synthetic */ f a() {
        return (f) super.a();
    }

    @Override // f1.h
    public f1.f i() {
        return new f1.f(1);
    }

    @Override // f1.h
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public f j() {
        return new C0226a();
    }

    public C1836a(b bVar) {
        super(new f1.f[1], new f[1]);
        this.f17845o = bVar;
    }
}
