package i5;

import java.util.ArrayList;
import java.util.List;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1636a {

    /* renamed from: a, reason: collision with root package name */
    public final List f16073a = new ArrayList();

    /* renamed from: i5.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0208a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f16074a;

        /* renamed from: b, reason: collision with root package name */
        public final R4.d f16075b;

        public C0208a(Class cls, R4.d dVar) {
            this.f16074a = cls;
            this.f16075b = dVar;
        }

        public boolean a(Class cls) {
            return this.f16074a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, R4.d dVar) {
        this.f16073a.add(new C0208a(cls, dVar));
    }

    public synchronized R4.d b(Class cls) {
        for (C0208a c0208a : this.f16073a) {
            if (c0208a.a(cls)) {
                return c0208a.f16075b;
            }
        }
        return null;
    }
}
