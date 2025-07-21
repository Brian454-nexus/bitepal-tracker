package Y1;

import c1.C1144z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6327a;

    /* renamed from: Y1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0109a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f6328b;

        /* renamed from: c, reason: collision with root package name */
        public final List f6329c;

        /* renamed from: d, reason: collision with root package name */
        public final List f6330d;

        public C0109a(int i6, long j6) {
            super(i6);
            this.f6328b = j6;
            this.f6329c = new ArrayList();
            this.f6330d = new ArrayList();
        }

        public void d(C0109a c0109a) {
            this.f6330d.add(c0109a);
        }

        public void e(b bVar) {
            this.f6329c.add(bVar);
        }

        public C0109a f(int i6) {
            int size = this.f6330d.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0109a c0109a = (C0109a) this.f6330d.get(i7);
                if (c0109a.f6327a == i6) {
                    return c0109a;
                }
            }
            return null;
        }

        public b g(int i6) {
            int size = this.f6329c.size();
            for (int i7 = 0; i7 < size; i7++) {
                b bVar = (b) this.f6329c.get(i7);
                if (bVar.f6327a == i6) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // Y1.a
        public String toString() {
            return a.a(this.f6327a) + " leaves: " + Arrays.toString(this.f6329c.toArray()) + " containers: " + Arrays.toString(this.f6330d.toArray());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final C1144z f6331b;

        public b(int i6, C1144z c1144z) {
            super(i6);
            this.f6331b = c1144z;
        }
    }

    public a(int i6) {
        this.f6327a = i6;
    }

    public static String a(int i6) {
        return "" + ((char) ((i6 >> 24) & 255)) + ((char) ((i6 >> 16) & 255)) + ((char) ((i6 >> 8) & 255)) + ((char) (i6 & 255));
    }

    public static int b(int i6) {
        return i6 & 16777215;
    }

    public static int c(int i6) {
        return (i6 >> 24) & 255;
    }

    public String toString() {
        return a(this.f6327a);
    }
}
