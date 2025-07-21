package i5;

import R4.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f16082a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Map f16083b = new HashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f16084a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f16085b;

        /* renamed from: c, reason: collision with root package name */
        public final j f16086c;

        public a(Class cls, Class cls2, j jVar) {
            this.f16084a = cls;
            this.f16085b = cls2;
            this.f16086c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f16084a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f16085b);
        }
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f16082a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f16083b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f16086c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List c(String str) {
        List list;
        try {
            if (!this.f16082a.contains(str)) {
                this.f16082a.add(str);
            }
            list = (List) this.f16083b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f16083b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f16082a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f16083b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f16085b)) {
                        arrayList.add(aVar.f16085b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f16082a);
            this.f16082a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f16082a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f16082a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
