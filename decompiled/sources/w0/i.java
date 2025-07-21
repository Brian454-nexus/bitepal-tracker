package w0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q0.AbstractC2002e;
import q0.AbstractC2003f;
import w0.j;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.j f19700a = new j0.j(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f19701b = k.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19702c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final j0.k f19703d = new j0.k();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19704a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f19705b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w0.e f19706c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f19707d;

        public a(String str, Context context, w0.e eVar, int i6) {
            this.f19704a = str;
            this.f19705b = context;
            this.f19706c = eVar;
            this.f19707d = i6;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            List a6;
            String str = this.f19704a;
            Context context = this.f19705b;
            a6 = AbstractC2002e.a(new Object[]{this.f19706c});
            return i.c(str, context, a6, this.f19707d);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements InterfaceC2343a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2206a f19708a;

        public b(C2206a c2206a) {
            this.f19708a = c2206a;
        }

        @Override // y0.InterfaceC2343a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f19708a.b(eVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19709a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f19710b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f19711c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f19712d;

        public c(String str, Context context, List list, int i6) {
            this.f19709a = str;
            this.f19710b = context;
            this.f19711c = list;
            this.f19712d = i6;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.f19709a, this.f19710b, this.f19711c, this.f19712d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements InterfaceC2343a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19713a;

        public d(String str) {
            this.f19713a = str;
        }

        @Override // y0.InterfaceC2343a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.f19702c) {
                try {
                    j0.k kVar = i.f19703d;
                    ArrayList arrayList = (ArrayList) kVar.get(this.f19713a);
                    if (arrayList == null) {
                        return;
                    }
                    kVar.remove(this.f19713a);
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        ((InterfaceC2343a) arrayList.get(i6)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(List list, int i6) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((w0.e) list.get(i7)).d());
            sb.append("-");
            sb.append(i6);
            if (i7 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static int b(j.a aVar) {
        int i6 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        j.b[] c6 = aVar.c();
        if (c6 != null && c6.length != 0) {
            i6 = 0;
            for (j.b bVar : c6) {
                int b6 = bVar.b();
                if (b6 != 0) {
                    if (b6 < 0) {
                        return -3;
                    }
                    return b6;
                }
            }
        }
        return i6;
    }

    public static e c(String str, Context context, List list, int i6) {
        G2.a.c("getFontSync");
        try {
            j0.j jVar = f19700a;
            Typeface typeface = (Typeface) jVar.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            j.a e6 = w0.d.e(context, list, null);
            int b6 = b(e6);
            if (b6 != 0) {
                return new e(b6);
            }
            Typeface b7 = (!e6.f() || Build.VERSION.SDK_INT < 29) ? AbstractC2003f.b(context, null, e6.c(), i6) : AbstractC2003f.c(context, null, e6.d(), i6);
            if (b7 == null) {
                return new e(-3);
            }
            jVar.put(str, b7);
            return new e(b7);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            G2.a.f();
        }
    }

    public static Typeface d(Context context, List list, int i6, Executor executor, C2206a c2206a) {
        String a6 = a(list, i6);
        Typeface typeface = (Typeface) f19700a.get(a6);
        if (typeface != null) {
            c2206a.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c2206a);
        synchronized (f19702c) {
            try {
                j0.k kVar = f19703d;
                ArrayList arrayList = (ArrayList) kVar.get(a6);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                kVar.put(a6, arrayList2);
                c cVar = new c(a6, context, list, i6);
                if (executor == null) {
                    executor = f19701b;
                }
                k.c(executor, cVar, new d(a6));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, w0.e eVar, C2206a c2206a, int i6, int i7) {
        List a6;
        List a7;
        a6 = AbstractC2002e.a(new Object[]{eVar});
        String a8 = a(a6, i6);
        Typeface typeface = (Typeface) f19700a.get(a8);
        if (typeface != null) {
            c2206a.b(new e(typeface));
            return typeface;
        }
        if (i7 == -1) {
            a7 = AbstractC2002e.a(new Object[]{eVar});
            e c6 = c(a8, context, a7, i6);
            c2206a.b(c6);
            return c6.f19714a;
        }
        try {
            e eVar2 = (e) k.d(f19701b, new a(a8, context, eVar, i6), i7);
            c2206a.b(eVar2);
            return eVar2.f19714a;
        } catch (InterruptedException unused) {
            c2206a.b(new e(-3));
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f19714a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19715b;

        public e(int i6) {
            this.f19714a = null;
            this.f19715b = i6;
        }

        public boolean a() {
            return this.f19715b == 0;
        }

        public e(Typeface typeface) {
            this.f19714a = typeface;
            this.f19715b = 0;
        }
    }
}
