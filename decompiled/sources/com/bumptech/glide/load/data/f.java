package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e.a f13264b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f13265a = new HashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f13266a;

        public b(Object obj) {
            this.f13266a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f13266a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            n5.k.d(obj);
            aVar = (e.a) this.f13265a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f13265a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f13264b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f13265a.put(aVar.a(), aVar);
    }
}
