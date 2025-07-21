package o5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f18043a = new C0231a();

    /* renamed from: o5.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0231a implements g {
        @Override // o5.a.g
        public void a(Object obj) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements d {
        @Override // o5.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a() {
            return new ArrayList();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements g {
        @Override // o5.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        Object a();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements y0.d {

        /* renamed from: a, reason: collision with root package name */
        public final d f18044a;

        /* renamed from: b, reason: collision with root package name */
        public final g f18045b;

        /* renamed from: c, reason: collision with root package name */
        public final y0.d f18046c;

        public e(y0.d dVar, d dVar2, g gVar) {
            this.f18046c = dVar;
            this.f18044a = dVar2;
            this.f18045b = gVar;
        }

        @Override // y0.d
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).g().b(true);
            }
            this.f18045b.a(obj);
            return this.f18046c.a(obj);
        }

        @Override // y0.d
        public Object b() {
            Object b6 = this.f18046c.b();
            if (b6 == null) {
                b6 = this.f18044a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b6.getClass());
                }
            }
            if (b6 instanceof f) {
                ((f) b6).g().b(false);
            }
            return b6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        o5.c g();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface g {
        void a(Object obj);
    }

    public static y0.d a(y0.d dVar, d dVar2) {
        return b(dVar, dVar2, c());
    }

    public static y0.d b(y0.d dVar, d dVar2, g gVar) {
        return new e(dVar, dVar2, gVar);
    }

    public static g c() {
        return f18043a;
    }

    public static y0.d d(int i6, d dVar) {
        return a(new y0.f(i6), dVar);
    }

    public static y0.d e() {
        return f(20);
    }

    public static y0.d f(int i6) {
        return b(new y0.f(i6), new b(), new c());
    }
}
