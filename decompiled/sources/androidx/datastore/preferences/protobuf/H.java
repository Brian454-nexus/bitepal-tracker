package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    public final a f8666a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8667b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8668c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f8669a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f8670b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f8671c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f8672d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f8669a = bVar;
            this.f8670b = obj;
            this.f8671c = bVar2;
            this.f8672d = obj2;
        }
    }

    public H(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f8666a = new a(bVar, obj, bVar2, obj2);
        this.f8667b = obj;
        this.f8668c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C1041s.b(aVar.f8669a, 1, obj) + C1041s.b(aVar.f8671c, 2, obj2);
    }

    public static H d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new H(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC1033j abstractC1033j, a aVar, Object obj, Object obj2) {
        C1041s.u(abstractC1033j, aVar.f8669a, 1, obj);
        C1041s.u(abstractC1033j, aVar.f8671c, 2, obj2);
    }

    public int a(int i6, Object obj, Object obj2) {
        return AbstractC1033j.O(i6) + AbstractC1033j.y(b(this.f8666a, obj, obj2));
    }

    public a c() {
        return this.f8666a;
    }
}
