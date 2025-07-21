package L0;

import androidx.datastore.preferences.protobuf.AbstractC1024a;
import androidx.datastore.preferences.protobuf.AbstractC1045w;
import androidx.datastore.preferences.protobuf.AbstractC1047y;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends AbstractC1045w implements P {
    private static final g DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC1047y.b strings_ = AbstractC1045w.q();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC1045w.a implements P {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a n(Iterable iterable) {
            i();
            ((g) this.f8957b).N(iterable);
            return this;
        }

        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1045w.I(g.class, gVar);
    }

    public static g P() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.m();
    }

    public final void N(Iterable iterable) {
        O();
        AbstractC1024a.b(iterable, this.strings_);
    }

    public final void O() {
        AbstractC1047y.b bVar = this.strings_;
        if (bVar.g()) {
            return;
        }
        this.strings_ = AbstractC1045w.C(bVar);
    }

    public List Q() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1045w
    public final Object p(AbstractC1045w.d dVar, Object obj, Object obj2) {
        X x6;
        e eVar = null;
        switch (e.f3094a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1045w.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 != null) {
                    return x7;
                }
                synchronized (g.class) {
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
