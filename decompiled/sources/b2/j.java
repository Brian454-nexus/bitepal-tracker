package b2;

import c1.AbstractC1119a;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j extends f1.h implements l {

    /* renamed from: o, reason: collision with root package name */
    public final String f10471o;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends q {
        public a() {
        }

        @Override // f1.g
        public void n() {
            j.this.t(this);
        }
    }

    public j(String str) {
        super(new p[2], new q[2]);
        this.f10471o = str;
        w(1024);
    }

    @Override // f1.h
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final m k(Throwable th) {
        return new m("Unexpected decode error", th);
    }

    public abstract k B(byte[] bArr, int i6, boolean z6);

    @Override // f1.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final m l(p pVar, q qVar, boolean z6) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1119a.e(pVar.f14005d);
            qVar.o(pVar.f14007f, B(byteBuffer.array(), byteBuffer.limit(), z6), pVar.f10487j);
            qVar.f14015d = false;
            return null;
        } catch (m e6) {
            return e6;
        }
    }

    @Override // b2.l
    public void c(long j6) {
    }

    @Override // f1.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return new p();
    }

    @Override // f1.h
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final q j() {
        return new a();
    }
}
