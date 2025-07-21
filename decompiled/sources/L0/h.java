package L0;

import L0.g;
import androidx.datastore.preferences.protobuf.AbstractC1030g;
import androidx.datastore.preferences.protobuf.AbstractC1045w;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends AbstractC1045w implements P {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC1045w.a implements P {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a n(boolean z6) {
            i();
            ((h) this.f8957b).f0(z6);
            return this;
        }

        public a o(AbstractC1030g abstractC1030g) {
            i();
            ((h) this.f8957b).g0(abstractC1030g);
            return this;
        }

        public a p(double d6) {
            i();
            ((h) this.f8957b).h0(d6);
            return this;
        }

        public a q(float f6) {
            i();
            ((h) this.f8957b).i0(f6);
            return this;
        }

        public a r(int i6) {
            i();
            ((h) this.f8957b).j0(i6);
            return this;
        }

        public a s(long j6) {
            i();
            ((h) this.f8957b).k0(j6);
            return this;
        }

        public a t(String str) {
            i();
            ((h) this.f8957b).l0(str);
            return this;
        }

        public a u(g.a aVar) {
            i();
            ((h) this.f8957b).m0((g) aVar.f());
            return this;
        }

        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f3106a;

        b(int i6) {
            this.f3106a = i6;
        }

        public static b b(int i6) {
            switch (i6) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1045w.I(h.class, hVar);
    }

    public static h W() {
        return DEFAULT_INSTANCE;
    }

    public static a e0() {
        return (a) DEFAULT_INSTANCE.m();
    }

    public boolean U() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC1030g V() {
        return this.valueCase_ == 8 ? (AbstractC1030g) this.value_ : AbstractC1030g.f8721b;
    }

    public double X() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float Y() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int Z() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long a0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String b0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g c0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.P();
    }

    public b d0() {
        return b.b(this.valueCase_);
    }

    public final void f0(boolean z6) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z6);
    }

    public final void g0(AbstractC1030g abstractC1030g) {
        abstractC1030g.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC1030g;
    }

    public final void h0(double d6) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d6);
    }

    public final void i0(float f6) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f6);
    }

    public final void j0(int i6) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i6);
    }

    public final void k0(long j6) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j6);
    }

    public final void l0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void m0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1045w
    public final Object p(AbstractC1045w.d dVar, Object obj, Object obj2) {
        X x6;
        e eVar = null;
        switch (e.f3094a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1045w.E(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 != null) {
                    return x7;
                }
                synchronized (h.class) {
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
