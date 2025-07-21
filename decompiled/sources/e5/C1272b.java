package e5;

import Q4.a;
import android.graphics.Bitmap;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1272b implements a.InterfaceC0077a {

    /* renamed from: a, reason: collision with root package name */
    public final U4.d f13940a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.b f13941b;

    public C1272b(U4.d dVar, U4.b bVar) {
        this.f13940a = dVar;
        this.f13941b = bVar;
    }

    @Override // Q4.a.InterfaceC0077a
    public Bitmap a(int i6, int i7, Bitmap.Config config) {
        return this.f13940a.e(i6, i7, config);
    }

    @Override // Q4.a.InterfaceC0077a
    public int[] b(int i6) {
        U4.b bVar = this.f13941b;
        return bVar == null ? new int[i6] : (int[]) bVar.d(i6, int[].class);
    }

    @Override // Q4.a.InterfaceC0077a
    public void c(Bitmap bitmap) {
        this.f13940a.c(bitmap);
    }

    @Override // Q4.a.InterfaceC0077a
    public void d(byte[] bArr) {
        U4.b bVar = this.f13941b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // Q4.a.InterfaceC0077a
    public byte[] e(int i6) {
        U4.b bVar = this.f13941b;
        return bVar == null ? new byte[i6] : (byte[]) bVar.d(i6, byte[].class);
    }

    @Override // Q4.a.InterfaceC0077a
    public void f(int[] iArr) {
        U4.b bVar = this.f13941b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
