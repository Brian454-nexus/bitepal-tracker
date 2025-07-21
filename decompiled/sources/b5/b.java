package b5;

import T4.v;
import n5.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10528a;

    public b(byte[] bArr) {
        this.f10528a = (byte[]) k.d(bArr);
    }

    @Override // T4.v
    public void a() {
    }

    @Override // T4.v
    public Class b() {
        return byte[].class;
    }

    @Override // T4.v
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f10528a;
    }

    @Override // T4.v
    public int f() {
        return this.f10528a.length;
    }
}
