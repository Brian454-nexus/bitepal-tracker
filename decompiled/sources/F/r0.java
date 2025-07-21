package F;

import F.C0332h;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1476a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {

        /* renamed from: F.r0$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static abstract class AbstractC0027a {
            public abstract a a();

            public abstract AbstractC0027a b(Rect rect);

            public abstract AbstractC0027a c(int i6);
        }

        public abstract Rect a();

        public abstract Size b();

        public abstract int c();
    }

    public r0(Size size, Rect rect, int i6) {
        this.f1476a = new C0332h.b().d(size).b(rect).c(i6).a();
    }

    public Size a() {
        return this.f1476a.b();
    }

    public boolean equals(Object obj) {
        return this.f1476a.equals(obj);
    }

    public int hashCode() {
        return this.f1476a.hashCode();
    }

    public String toString() {
        return this.f1476a.toString();
    }
}
