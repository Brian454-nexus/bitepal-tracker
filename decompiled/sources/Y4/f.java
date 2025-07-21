package Y4;

import X4.h;
import X4.n;
import X4.o;
import X4.r;
import java.io.InputStream;
import java.net.URL;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f6590a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements o {
        @Override // X4.o
        public n d(r rVar) {
            return new f(rVar.d(h.class, InputStream.class));
        }
    }

    public f(n nVar) {
        this.f6590a = nVar;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(URL url, int i6, int i7, R4.h hVar) {
        return this.f6590a.a(new h(url), i6, i7, hVar);
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
