package e1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1244b implements InterfaceC1248f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13799a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13800b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f13801c;

    /* renamed from: d, reason: collision with root package name */
    public C1252j f13802d;

    public AbstractC1244b(boolean z6) {
        this.f13799a = z6;
    }

    @Override // e1.InterfaceC1248f
    public final void l(InterfaceC1266x interfaceC1266x) {
        AbstractC1119a.e(interfaceC1266x);
        if (this.f13800b.contains(interfaceC1266x)) {
            return;
        }
        this.f13800b.add(interfaceC1266x);
        this.f13801c++;
    }

    public final void t(int i6) {
        C1252j c1252j = (C1252j) AbstractC1117K.i(this.f13802d);
        for (int i7 = 0; i7 < this.f13801c; i7++) {
            ((InterfaceC1266x) this.f13800b.get(i7)).c(this, c1252j, this.f13799a, i6);
        }
    }

    public final void u() {
        C1252j c1252j = (C1252j) AbstractC1117K.i(this.f13802d);
        for (int i6 = 0; i6 < this.f13801c; i6++) {
            ((InterfaceC1266x) this.f13800b.get(i6)).e(this, c1252j, this.f13799a);
        }
        this.f13802d = null;
    }

    public final void v(C1252j c1252j) {
        for (int i6 = 0; i6 < this.f13801c; i6++) {
            ((InterfaceC1266x) this.f13800b.get(i6)).g(this, c1252j, this.f13799a);
        }
    }

    public final void w(C1252j c1252j) {
        this.f13802d = c1252j;
        for (int i6 = 0; i6 < this.f13801c; i6++) {
            ((InterfaceC1266x) this.f13800b.get(i6)).a(this, c1252j, this.f13799a);
        }
    }
}
