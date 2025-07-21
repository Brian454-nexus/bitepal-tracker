package E1;

import E1.O;
import Z0.InterfaceC0837i;
import c1.C1144z;
import java.io.EOFException;
import kotlin.io.ConstantsKt;

/* renamed from: E1.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0311m implements O {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1060a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    @Override // E1.O
    public void b(C1144z c1144z, int i6, int i7) {
        c1144z.U(i6);
    }

    @Override // E1.O
    public int d(InterfaceC0837i interfaceC0837i, int i6, boolean z6, int i7) {
        int read = interfaceC0837i.read(this.f1060a, 0, Math.min(this.f1060a.length, i6));
        if (read != -1) {
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // E1.O
    public void e(Z0.q qVar) {
    }

    @Override // E1.O
    public void f(long j6, int i6, int i7, int i8, O.a aVar) {
    }
}
