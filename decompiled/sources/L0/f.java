package L0;

import androidx.datastore.preferences.protobuf.AbstractC1045w;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends AbstractC1045w implements P {
    private static final f DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.e();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC1045w.a implements P {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a n(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            i();
            ((f) this.f8957b).N().put(str, hVar);
            return this;
        }

        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final H f3095a = H.d(r0.b.f8855k, "", r0.b.f8857m, h.W());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1045w.I(f.class, fVar);
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.m();
    }

    public static f S(InputStream inputStream) {
        return (f) AbstractC1045w.G(DEFAULT_INSTANCE, inputStream);
    }

    public final Map N() {
        return P();
    }

    public Map O() {
        return Collections.unmodifiableMap(Q());
    }

    public final I P() {
        if (!this.preferences_.i()) {
            this.preferences_ = this.preferences_.l();
        }
        return this.preferences_;
    }

    public final I Q() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1045w
    public final Object p(AbstractC1045w.d dVar, Object obj, Object obj2) {
        X x6;
        e eVar = null;
        switch (e.f3094a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1045w.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f3095a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 != null) {
                    return x7;
                }
                synchronized (f.class) {
                    try {
                        x6 = PARSER;
                        if (x6 == null) {
                            x6 = new AbstractC1045w.b(DEFAULT_INSTANCE);
                            PARSER = x6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x6;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
