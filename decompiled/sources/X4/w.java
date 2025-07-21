package X4;

import X4.n;
import com.bumptech.glide.load.data.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class w implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final w f6312a = new w();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6313a = new a();

        public static a a() {
            return f6313a;
        }

        @Override // X4.o
        public n d(r rVar) {
            return w.c();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6314a;

        public b(Object obj) {
            this.f6314a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f6314a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public R4.a d() {
            return R4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.f(this.f6314a);
        }
    }

    public static w c() {
        return f6312a;
    }

    @Override // X4.n
    public n.a a(Object obj, int i6, int i7, R4.h hVar) {
        return new n.a(new m5.b(obj), new b(obj));
    }

    @Override // X4.n
    public boolean b(Object obj) {
        return true;
    }
}
