package s1;

import java.util.Comparator;
import java.util.TreeSet;
import s1.C2046f;

/* renamed from: s1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2046f {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f18799a = new TreeSet(new Comparator() { // from class: s1.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int c6;
            c6 = C2046f.c(((C2046f.a) obj).f18803a.f18786g, ((C2046f.a) obj2).f18803a.f18786g);
            return c6;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public int f18800b;

    /* renamed from: c, reason: collision with root package name */
    public int f18801c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18802d;

    /* renamed from: s1.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C2044d f18803a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18804b;

        public a(C2044d c2044d, long j6) {
            this.f18803a = c2044d;
            this.f18804b = j6;
        }
    }

    public C2046f() {
        f();
    }

    public static int c(int i6, int i7) {
        int min;
        int i8 = i6 - i7;
        return (Math.abs(i8) <= 1000 || (min = (Math.min(i6, i7) - Math.max(i6, i7)) + 65535) >= 1000) ? i8 : i6 < i7 ? min : -min;
    }

    public final synchronized void b(a aVar) {
        this.f18800b = aVar.f18803a.f18786g;
        this.f18799a.add(aVar);
    }

    public synchronized boolean d(C2044d c2044d, long j6) {
        if (this.f18799a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i6 = c2044d.f18786g;
        if (!this.f18802d) {
            f();
            this.f18801c = C2044d.c(i6);
            this.f18802d = true;
            b(new a(c2044d, j6));
            return true;
        }
        if (Math.abs(c(i6, C2044d.b(this.f18800b))) < 1000) {
            if (c(i6, this.f18801c) <= 0) {
                return false;
            }
            b(new a(c2044d, j6));
            return true;
        }
        this.f18801c = C2044d.c(i6);
        this.f18799a.clear();
        b(new a(c2044d, j6));
        return true;
    }

    public synchronized C2044d e(long j6) {
        if (this.f18799a.isEmpty()) {
            return null;
        }
        a aVar = (a) this.f18799a.first();
        int i6 = aVar.f18803a.f18786g;
        if (i6 != C2044d.b(this.f18801c) && j6 < aVar.f18804b) {
            return null;
        }
        this.f18799a.pollFirst();
        this.f18801c = i6;
        return aVar.f18803a;
    }

    public synchronized void f() {
        this.f18799a.clear();
        this.f18802d = false;
        this.f18801c = -1;
        this.f18800b = -1;
    }
}
