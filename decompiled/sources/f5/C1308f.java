package f5;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f5.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1308f {

    /* renamed from: a, reason: collision with root package name */
    public final List f14226a = new ArrayList();

    /* renamed from: f5.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14227a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f14228b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1307e f14229c;

        public a(Class cls, Class cls2, InterfaceC1307e interfaceC1307e) {
            this.f14227a = cls;
            this.f14228b = cls2;
            this.f14229c = interfaceC1307e;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f14227a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f14228b);
        }
    }

    public synchronized InterfaceC1307e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1309g.b();
        }
        for (a aVar : this.f14226a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f14229c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f14226a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f14228b)) {
                arrayList.add(aVar.f14228b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, InterfaceC1307e interfaceC1307e) {
        this.f14226a.add(new a(cls, cls2, interfaceC1307e));
    }
}
