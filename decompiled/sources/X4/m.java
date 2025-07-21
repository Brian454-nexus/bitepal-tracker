package X4;

import java.util.Queue;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final n5.h f6270a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends n5.h {
        public a(long j6) {
            super(j6);
        }

        @Override // n5.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final Queue f6272d = n5.l.g(0);

        /* renamed from: a, reason: collision with root package name */
        public int f6273a;

        /* renamed from: b, reason: collision with root package name */
        public int f6274b;

        /* renamed from: c, reason: collision with root package name */
        public Object f6275c;

        public static b a(Object obj, int i6, int i7) {
            b bVar;
            Queue queue = f6272d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i6, i7);
            return bVar;
        }

        public final void b(Object obj, int i6, int i7) {
            this.f6275c = obj;
            this.f6274b = i6;
            this.f6273a = i7;
        }

        public void c() {
            Queue queue = f6272d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f6274b == bVar.f6274b && this.f6273a == bVar.f6273a && this.f6275c.equals(bVar.f6275c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f6273a * 31) + this.f6274b) * 31) + this.f6275c.hashCode();
        }
    }

    public m(long j6) {
        this.f6270a = new a(j6);
    }

    public Object a(Object obj, int i6, int i7) {
        b a6 = b.a(obj, i6, i7);
        Object g6 = this.f6270a.g(a6);
        a6.c();
        return g6;
    }

    public void b(Object obj, int i6, int i7, Object obj2) {
        this.f6270a.k(b.a(obj, i6, i7), obj2);
    }
}
