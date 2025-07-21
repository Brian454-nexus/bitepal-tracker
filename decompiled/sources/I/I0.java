package I;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class I0 implements InterfaceC0421c0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0421c0 f2254a;

    /* renamed from: b, reason: collision with root package name */
    public final C0425e0 f2255b;

    public I0(InterfaceC0421c0 interfaceC0421c0, G0 g02) {
        this.f2254a = interfaceC0421c0;
        this.f2255b = new C0425e0(g02.c(K.a.class));
    }

    @Override // I.InterfaceC0421c0
    public boolean a(int i6) {
        if (!this.f2254a.a(i6)) {
            return false;
        }
        if (!this.f2255b.c()) {
            return true;
        }
        return this.f2255b.d(this.f2254a.b(i6));
    }

    @Override // I.InterfaceC0421c0
    public InterfaceC0423d0 b(int i6) {
        if (!this.f2254a.a(i6)) {
            return null;
        }
        InterfaceC0423d0 b6 = this.f2254a.b(i6);
        return this.f2255b.c() ? this.f2255b.a(b6) : b6;
    }
}
