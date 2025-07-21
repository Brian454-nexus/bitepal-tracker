package Y4;

import R4.h;
import X4.n;
import X4.o;
import X4.r;
import android.content.Context;
import android.net.Uri;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6569a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6570a;

        public a(Context context) {
            this.f6570a = context;
        }

        @Override // X4.o
        public n d(r rVar) {
            return new b(this.f6570a);
        }
    }

    public b(Context context) {
        this.f6569a = context.getApplicationContext();
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, h hVar) {
        if (S4.b.e(i6, i7)) {
            return new n.a(new m5.b(uri), S4.c.f(this.f6569a, uri));
        }
        return null;
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return S4.b.b(uri);
    }
}
