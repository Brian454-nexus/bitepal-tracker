package com.amazon.a.a.o.c.a;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f extends ObjectInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f11276a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f11277b;

    public f(InputStream inputStream) {
        super(inputStream);
        this.f11276a = new ArrayList();
        this.f11277b = new ArrayList();
    }

    private void b(String str) {
        Iterator<a> it = this.f11277b.iterator();
        while (it.hasNext()) {
            if (it.next().a(str)) {
                a(str);
            }
        }
        Iterator<a> it2 = this.f11276a.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(str)) {
                return;
            }
        }
        a(str);
    }

    public void a(String str) {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        b(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    public f a(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f11276a.add(new c(cls.getName()));
        }
        return this;
    }

    public f a(String... strArr) {
        for (String str : strArr) {
            this.f11276a.add(new g(str));
        }
        return this;
    }

    public f a(Pattern pattern) {
        this.f11276a.add(new e(pattern));
        return this;
    }

    public f a(a aVar) {
        this.f11276a.add(aVar);
        return this;
    }

    public f b(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f11277b.add(new c(cls.getName()));
        }
        return this;
    }

    public f b(String... strArr) {
        for (String str : strArr) {
            this.f11277b.add(new g(str));
        }
        return this;
    }

    public f b(Pattern pattern) {
        this.f11277b.add(new e(pattern));
        return this;
    }

    public f b(a aVar) {
        this.f11277b.add(aVar);
        return this;
    }
}
