package Y4;

import R4.h;
import X4.n;
import X4.o;
import X4.r;
import a5.C1017F;
import android.content.Context;
import android.net.Uri;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6571a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6572a;

        public a(Context context) {
            this.f6572a = context;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new c(this.f6572a);
        }
    }

    public c(Context context) {
        this.f6571a = context.getApplicationContext();
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, h hVar) {
        if (S4.b.e(i6, i7) && e(hVar)) {
            return new n.a(new m5.b(uri), S4.c.g(this.f6571a, uri));
        }
        return null;
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return S4.b.d(uri);
    }

    public final boolean e(h hVar) {
        Long l6 = (Long) hVar.c(C1017F.f7724d);
        return l6 != null && l6.longValue() == -1;
    }
}
