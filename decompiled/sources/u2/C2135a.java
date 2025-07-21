package u2;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2135a implements InterfaceC2138d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2138d f19151a;

    /* renamed from: b, reason: collision with root package name */
    public int f19152b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19153c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f19154d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f19155e = null;

    public C2135a(InterfaceC2138d interfaceC2138d) {
        this.f19151a = interfaceC2138d;
    }

    @Override // u2.InterfaceC2138d
    public void a(int i6, int i7) {
        e();
        this.f19151a.a(i6, i7);
    }

    @Override // u2.InterfaceC2138d
    public void b(int i6, int i7) {
        int i8;
        if (this.f19152b == 1 && i6 >= (i8 = this.f19153c)) {
            int i9 = this.f19154d;
            if (i6 <= i8 + i9) {
                this.f19154d = i9 + i7;
                this.f19153c = Math.min(i6, i8);
                return;
            }
        }
        e();
        this.f19153c = i6;
        this.f19154d = i7;
        this.f19152b = 1;
    }

    @Override // u2.InterfaceC2138d
    public void c(int i6, int i7) {
        int i8;
        if (this.f19152b == 2 && (i8 = this.f19153c) >= i6 && i8 <= i6 + i7) {
            this.f19154d += i7;
            this.f19153c = i6;
        } else {
            e();
            this.f19153c = i6;
            this.f19154d = i7;
            this.f19152b = 2;
        }
    }

    @Override // u2.InterfaceC2138d
    public void d(int i6, int i7, Object obj) {
        int i8;
        if (this.f19152b == 3) {
            int i9 = this.f19153c;
            int i10 = this.f19154d;
            if (i6 <= i9 + i10 && (i8 = i6 + i7) >= i9 && this.f19155e == obj) {
                this.f19153c = Math.min(i6, i9);
                this.f19154d = Math.max(i10 + i9, i8) - this.f19153c;
                return;
            }
        }
        e();
        this.f19153c = i6;
        this.f19154d = i7;
        this.f19155e = obj;
        this.f19152b = 3;
    }

    public void e() {
        int i6 = this.f19152b;
        if (i6 == 0) {
            return;
        }
        if (i6 == 1) {
            this.f19151a.b(this.f19153c, this.f19154d);
        } else if (i6 == 2) {
            this.f19151a.c(this.f19153c, this.f19154d);
        } else if (i6 == 3) {
            this.f19151a.d(this.f19153c, this.f19154d, this.f19155e);
        }
        this.f19155e = null;
        this.f19152b = 0;
    }
}
