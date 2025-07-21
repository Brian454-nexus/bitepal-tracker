package Y4;

import R4.g;
import X4.h;
import X4.m;
import X4.n;
import X4.o;
import X4.r;
import com.bumptech.glide.load.data.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final g f6566b = g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    public final m f6567a;

    /* renamed from: Y4.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0112a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final m f6568a = new m(500);

        @Override // X4.o
        public n d(r rVar) {
            return new a(this.f6568a);
        }
    }

    public a(m mVar) {
        this.f6567a = mVar;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(h hVar, int i6, int i7, R4.h hVar2) {
        m mVar = this.f6567a;
        if (mVar != null) {
            h hVar3 = (h) mVar.a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f6567a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) hVar2.c(f6566b)).intValue()));
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(h hVar) {
        return true;
    }
}
