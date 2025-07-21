package F;

import F.r0;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0332h extends r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Size f1427a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1428b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1429c;

    /* renamed from: F.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends r0.a.AbstractC0027a {

        /* renamed from: a, reason: collision with root package name */
        public Size f1430a;

        /* renamed from: b, reason: collision with root package name */
        public Rect f1431b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f1432c;

        @Override // F.r0.a.AbstractC0027a
        public r0.a a() {
            String str = "";
            if (this.f1430a == null) {
                str = " resolution";
            }
            if (this.f1431b == null) {
                str = str + " cropRect";
            }
            if (this.f1432c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C0332h(this.f1430a, this.f1431b, this.f1432c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // F.r0.a.AbstractC0027a
        public r0.a.AbstractC0027a b(Rect rect) {
            if (rect == null) {
                throw new NullPointerException("Null cropRect");
            }
            this.f1431b = rect;
            return this;
        }

        @Override // F.r0.a.AbstractC0027a
        public r0.a.AbstractC0027a c(int i6) {
            this.f1432c = Integer.valueOf(i6);
            return this;
        }

        public r0.a.AbstractC0027a d(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f1430a = size;
            return this;
        }
    }

    @Override // F.r0.a
    public Rect a() {
        return this.f1428b;
    }

    @Override // F.r0.a
    public Size b() {
        return this.f1427a;
    }

    @Override // F.r0.a
    public int c() {
        return this.f1429c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0.a) {
            r0.a aVar = (r0.a) obj;
            if (this.f1427a.equals(aVar.b()) && this.f1428b.equals(aVar.a()) && this.f1429c == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1427a.hashCode() ^ 1000003) * 1000003) ^ this.f1428b.hashCode()) * 1000003) ^ this.f1429c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f1427a + ", cropRect=" + this.f1428b + ", rotationDegrees=" + this.f1429c + "}";
    }

    public C0332h(Size size, Rect rect, int i6) {
        this.f1427a = size;
        this.f1428b = rect;
        this.f1429c = i6;
    }
}
