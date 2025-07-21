package com.bumptech.glide;

import T4.t;
import T4.v;
import X4.o;
import X4.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import f5.C1308f;
import f5.InterfaceC1307e;
import i5.C1636a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final p f13194a;

    /* renamed from: b, reason: collision with root package name */
    public final C1636a f13195b;

    /* renamed from: c, reason: collision with root package name */
    public final i5.e f13196c;

    /* renamed from: d, reason: collision with root package name */
    public final i5.f f13197d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f13198e;

    /* renamed from: f, reason: collision with root package name */
    public final C1308f f13199f;

    /* renamed from: g, reason: collision with root package name */
    public final i5.b f13200g;

    /* renamed from: h, reason: collision with root package name */
    public final i5.d f13201h = new i5.d();

    /* renamed from: i, reason: collision with root package name */
    public final i5.c f13202i = new i5.c();

    /* renamed from: j, reason: collision with root package name */
    public final y0.d f13203j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        y0.d e6 = o5.a.e();
        this.f13203j = e6;
        this.f13194a = new p(e6);
        this.f13195b = new C1636a();
        this.f13196c = new i5.e();
        this.f13197d = new i5.f();
        this.f13198e = new com.bumptech.glide.load.data.f();
        this.f13199f = new C1308f();
        this.f13200g = new i5.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    public i a(Class cls, R4.d dVar) {
        this.f13195b.a(cls, dVar);
        return this;
    }

    public i b(Class cls, R4.k kVar) {
        this.f13197d.a(cls, kVar);
        return this;
    }

    public i c(Class cls, Class cls2, R4.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public i d(Class cls, Class cls2, o oVar) {
        this.f13194a.a(cls, cls2, oVar);
        return this;
    }

    public i e(String str, Class cls, Class cls2, R4.j jVar) {
        this.f13196c.a(str, jVar, cls, cls2);
        return this;
    }

    public final List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f13196c.d(cls, cls2)) {
            for (Class cls5 : this.f13199f.b(cls4, cls3)) {
                arrayList.add(new T4.i(cls, cls4, cls5, this.f13196c.b(cls, cls4), this.f13199f.a(cls4, cls5), this.f13203j));
            }
        }
        return arrayList;
    }

    public List g() {
        List b6 = this.f13200g.b();
        if (b6.isEmpty()) {
            throw new b();
        }
        return b6;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        t a6 = this.f13202i.a(cls, cls2, cls3);
        t tVar = null;
        if (this.f13202i.c(a6)) {
            return null;
        }
        if (a6 != null) {
            return a6;
        }
        List f6 = f(cls, cls2, cls3);
        if (f6.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t(cls4, cls5, cls6, f6, this.f13203j);
        }
        this.f13202i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    public List i(Object obj) {
        return this.f13194a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List a6 = this.f13201h.a(cls, cls2, cls3);
        if (a6 == null) {
            a6 = new ArrayList();
            Iterator it = this.f13194a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f13196c.d((Class) it.next(), cls2)) {
                    if (!this.f13199f.b(cls4, cls3).isEmpty() && !a6.contains(cls4)) {
                        a6.add(cls4);
                    }
                }
            }
            this.f13201h.b(cls, cls2, cls3, Collections.unmodifiableList(a6));
        }
        return a6;
    }

    public R4.k k(v vVar) {
        R4.k b6 = this.f13197d.b(vVar.b());
        if (b6 != null) {
            return b6;
        }
        throw new d(vVar.b());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f13198e.a(obj);
    }

    public R4.d m(Object obj) {
        R4.d b6 = this.f13195b.b(obj.getClass());
        if (b6 != null) {
            return b6;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f13197d.b(vVar.b()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.f13200g.a(imageHeaderParser);
        return this;
    }

    public i p(e.a aVar) {
        this.f13198e.b(aVar);
        return this;
    }

    public i q(Class cls, Class cls2, InterfaceC1307e interfaceC1307e) {
        this.f13199f.c(cls, cls2, interfaceC1307e);
        return this;
    }

    public final i r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f13196c.e(arrayList);
        return this;
    }
}
