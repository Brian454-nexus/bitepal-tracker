package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements Serializable, Iterable<a> {

    /* renamed from: a, reason: collision with root package name */
    private static final long f10913a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f10914b = new ArrayList();

    public boolean a() {
        return this.f10914b.isEmpty();
    }

    public Collection<a> b() {
        return this.f10914b;
    }

    public int c() {
        return this.f10914b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f10914b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f10914b + "]";
    }

    public void a(a aVar) {
        this.f10914b.add(aVar);
    }
}
