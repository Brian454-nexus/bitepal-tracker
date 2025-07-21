package w0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f19718a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19719b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19720c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f19721d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19722e;

        public b(Uri uri, int i6, int i7, boolean z6, int i8) {
            this.f19718a = (Uri) y0.g.f(uri);
            this.f19719b = i6;
            this.f19720c = i7;
            this.f19721d = z6;
            this.f19722e = i8;
        }

        public static b a(Uri uri, int i6, int i7, boolean z6, int i8) {
            return new b(uri, i6, i7, z6, i8);
        }

        public int b() {
            return this.f19722e;
        }

        public int c() {
            return this.f19719b;
        }

        public Uri d() {
            return this.f19718a;
        }

        public int e() {
            return this.f19720c;
        }

        public boolean f() {
            return this.f19721d;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public abstract void a(int i6);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, List list, int i6, boolean z6, int i7, Handler handler, c cVar) {
        C2206a c2206a = new C2206a(cVar, k.b(handler));
        if (!z6) {
            return i.d(context, list, i6, null, c2206a);
        }
        if (list.size() <= 1) {
            return i.e(context, (e) list.get(0), c2206a, i6, i7);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19716a;

        /* renamed from: b, reason: collision with root package name */
        public final List f19717b;

        public a(int i6, b[] bVarArr) {
            this.f19716a = i6;
            this.f19717b = Collections.singletonList(bVarArr);
        }

        public static a a(int i6, List list) {
            return new a(i6, list);
        }

        public static a b(int i6, b[] bVarArr) {
            return new a(i6, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f19717b.get(0);
        }

        public List d() {
            return this.f19717b;
        }

        public int e() {
            return this.f19716a;
        }

        public boolean f() {
            return this.f19717b.size() > 1;
        }

        public a(int i6, List list) {
            this.f19716a = i6;
            this.f19717b = list;
        }
    }
}
