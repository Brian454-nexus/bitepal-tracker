package X2;

import android.text.TextUtils;
import g3.RunnableC1371c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class x extends W2.t {

    /* renamed from: j, reason: collision with root package name */
    public static final String f6204j = W2.k.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final E f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6206b;

    /* renamed from: c, reason: collision with root package name */
    public final W2.e f6207c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6208d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6209e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6210f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6211g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6212h;

    /* renamed from: i, reason: collision with root package name */
    public W2.n f6213i;

    public x(E e6, List list) {
        this(e6, null, W2.e.KEEP, list, null);
    }

    public static boolean i(x xVar, Set set) {
        set.addAll(xVar.c());
        Set l6 = l(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l6.contains((String) it.next())) {
                return true;
            }
        }
        List e6 = xVar.e();
        if (e6 != null && !e6.isEmpty()) {
            Iterator it2 = e6.iterator();
            while (it2.hasNext()) {
                if (i((x) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set l(x xVar) {
        HashSet hashSet = new HashSet();
        List e6 = xVar.e();
        if (e6 != null && !e6.isEmpty()) {
            Iterator it = e6.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((x) it.next()).c());
            }
        }
        return hashSet;
    }

    public W2.n a() {
        if (this.f6212h) {
            W2.k.e().k(f6204j, "Already enqueued work ids (" + TextUtils.join(", ", this.f6209e) + ")");
        } else {
            RunnableC1371c runnableC1371c = new RunnableC1371c(this);
            this.f6205a.s().c(runnableC1371c);
            this.f6213i = runnableC1371c.d();
        }
        return this.f6213i;
    }

    public W2.e b() {
        return this.f6207c;
    }

    public List c() {
        return this.f6209e;
    }

    public String d() {
        return this.f6206b;
    }

    public List e() {
        return this.f6211g;
    }

    public List f() {
        return this.f6208d;
    }

    public E g() {
        return this.f6205a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f6212h;
    }

    public void k() {
        this.f6212h = true;
    }

    public x(E e6, String str, W2.e eVar, List list) {
        this(e6, str, eVar, list, null);
    }

    public x(E e6, String str, W2.e eVar, List list, List list2) {
        this.f6205a = e6;
        this.f6206b = str;
        this.f6207c = eVar;
        this.f6208d = list;
        this.f6211g = list2;
        this.f6209e = new ArrayList(list.size());
        this.f6210f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f6210f.addAll(((x) it.next()).f6210f);
            }
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            String b6 = ((W2.w) list.get(i6)).b();
            this.f6209e.add(b6);
            this.f6210f.add(b6);
        }
    }
}
