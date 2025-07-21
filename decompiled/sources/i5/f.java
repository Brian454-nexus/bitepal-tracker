package i5;

import R4.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f16087a = new ArrayList();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f16088a;

        /* renamed from: b, reason: collision with root package name */
        public final k f16089b;

        public a(Class cls, k kVar) {
            this.f16088a = cls;
            this.f16089b = kVar;
        }

        public boolean a(Class cls) {
            return this.f16088a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f16087a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f16087a.size();
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = (a) this.f16087a.get(i6);
            if (aVar.a(cls)) {
                return aVar.f16089b;
            }
        }
        return null;
    }
}
