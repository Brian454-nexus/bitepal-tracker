package com.bumptech.glide;

import V4.a;
import V4.i;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import g5.o;
import h5.AbstractC1464a;
import j0.C1638a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public T4.k f13154c;

    /* renamed from: d, reason: collision with root package name */
    public U4.d f13155d;

    /* renamed from: e, reason: collision with root package name */
    public U4.b f13156e;

    /* renamed from: f, reason: collision with root package name */
    public V4.h f13157f;

    /* renamed from: g, reason: collision with root package name */
    public W4.a f13158g;

    /* renamed from: h, reason: collision with root package name */
    public W4.a f13159h;

    /* renamed from: i, reason: collision with root package name */
    public a.InterfaceC0093a f13160i;

    /* renamed from: j, reason: collision with root package name */
    public V4.i f13161j;

    /* renamed from: k, reason: collision with root package name */
    public g5.c f13162k;

    /* renamed from: n, reason: collision with root package name */
    public o.b f13165n;

    /* renamed from: o, reason: collision with root package name */
    public W4.a f13166o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13167p;

    /* renamed from: q, reason: collision with root package name */
    public List f13168q;

    /* renamed from: a, reason: collision with root package name */
    public final Map f13152a = new C1638a();

    /* renamed from: b, reason: collision with root package name */
    public final e.a f13153b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    public int f13163l = 4;

    /* renamed from: m, reason: collision with root package name */
    public b.a f13164m = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements b.a {
        public a() {
        }

        @Override // com.bumptech.glide.b.a
        public j5.h build() {
            return new j5.h();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0183c {
    }

    public com.bumptech.glide.b a(Context context, List list, AbstractC1464a abstractC1464a) {
        if (this.f13158g == null) {
            this.f13158g = W4.a.j();
        }
        if (this.f13159h == null) {
            this.f13159h = W4.a.h();
        }
        if (this.f13166o == null) {
            this.f13166o = W4.a.f();
        }
        if (this.f13161j == null) {
            this.f13161j = new i.a(context).a();
        }
        if (this.f13162k == null) {
            this.f13162k = new g5.e();
        }
        if (this.f13155d == null) {
            int b6 = this.f13161j.b();
            if (b6 > 0) {
                this.f13155d = new U4.j(b6);
            } else {
                this.f13155d = new U4.e();
            }
        }
        if (this.f13156e == null) {
            this.f13156e = new U4.i(this.f13161j.a());
        }
        if (this.f13157f == null) {
            this.f13157f = new V4.g(this.f13161j.d());
        }
        if (this.f13160i == null) {
            this.f13160i = new V4.f(context);
        }
        if (this.f13154c == null) {
            this.f13154c = new T4.k(this.f13157f, this.f13160i, this.f13159h, this.f13158g, W4.a.k(), this.f13166o, this.f13167p);
        }
        List list2 = this.f13168q;
        if (list2 == null) {
            this.f13168q = Collections.EMPTY_LIST;
        } else {
            this.f13168q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f13154c, this.f13157f, this.f13155d, this.f13156e, new o(this.f13165n), this.f13162k, this.f13163l, this.f13164m, this.f13152a, this.f13168q, list, abstractC1464a, this.f13153b.b());
    }

    public void b(o.b bVar) {
        this.f13165n = bVar;
    }
}
