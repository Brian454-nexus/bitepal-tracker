package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1045w;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1038o {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8804b = true;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1038o f8805c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1038o f8806d = new C1038o(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f8807a = Collections.EMPTY_MAP;

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f8808a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8809b;

        public a(Object obj, int i6) {
            this.f8808a = obj;
            this.f8809b = i6;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8808a == aVar.f8808a && this.f8809b == aVar.f8809b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8808a) * 65535) + this.f8809b;
        }
    }

    public C1038o(boolean z6) {
    }

    public static C1038o b() {
        C1038o c1038o;
        if (!f8804b) {
            return f8806d;
        }
        C1038o c1038o2 = f8805c;
        if (c1038o2 != null) {
            return c1038o2;
        }
        synchronized (C1038o.class) {
            try {
                c1038o = f8805c;
                if (c1038o == null) {
                    c1038o = AbstractC1037n.a();
                    f8805c = c1038o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1038o;
    }

    public AbstractC1045w.c a(O o6, int i6) {
        android.support.v4.media.session.b.a(this.f8807a.get(new a(o6, i6)));
        return null;
    }
}
