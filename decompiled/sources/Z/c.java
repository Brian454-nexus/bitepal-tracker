package Z;

import F.AbstractC0335i0;
import I.InterfaceC0421c0;
import I.InterfaceC0423d0;
import I.T0;
import android.util.Rational;
import android.util.Size;
import e0.i0;
import e0.m0;
import e0.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.ConstantsKt;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements InterfaceC0421c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC2069a f6597d = new InterfaceC2069a() { // from class: Z.b
        @Override // t.InterfaceC2069a
        public final Object apply(Object obj) {
            InterfaceC0423d0.c m6;
            m6 = c.m((InterfaceC0423d0.c) obj);
            return m6;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final T0 f6598e = T0.UPTIME;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0421c0 f6599a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069a f6600b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6601c = new HashMap();

    public c(InterfaceC0421c0 interfaceC0421c0, InterfaceC2069a interfaceC2069a) {
        this.f6599a = interfaceC0421c0;
        this.f6600b = interfaceC2069a;
    }

    public static int e(int i6) {
        if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i6);
    }

    public static String f(int i6) {
        return InterfaceC0423d0.g(i6);
    }

    public static int g(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return ConstantsKt.DEFAULT_BLOCK_SIZE;
        }
        if (i6 == 3) {
            return ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (i6 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i6);
    }

    public static InterfaceC0423d0.c h(InterfaceC0423d0.c cVar, int i6, int i7) {
        if (cVar == null) {
            return null;
        }
        int e6 = cVar.e();
        String i8 = cVar.i();
        int j6 = cVar.j();
        if (i6 != cVar.g()) {
            e6 = e(i6);
            i8 = f(e6);
            j6 = g(i6);
        }
        return InterfaceC0423d0.c.a(e6, i8, k(cVar.c(), i7, cVar.b()), cVar.f(), cVar.k(), cVar.h(), j6, i7, cVar.d(), i6);
    }

    private InterfaceC0423d0 i(int i6) {
        if (this.f6601c.containsKey(Integer.valueOf(i6))) {
            return (InterfaceC0423d0) this.f6601c.get(Integer.valueOf(i6));
        }
        if (!this.f6599a.a(i6)) {
            return null;
        }
        InterfaceC0423d0 d6 = d(this.f6599a.b(i6), 1, 10);
        this.f6601c.put(Integer.valueOf(i6), d6);
        return d6;
    }

    public static InterfaceC0423d0.c j(InterfaceC0423d0.c cVar, int i6) {
        return InterfaceC0423d0.c.a(cVar.e(), cVar.i(), i6, cVar.f(), cVar.k(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static int k(int i6, int i7, int i8) {
        if (i7 == i8) {
            return i6;
        }
        int doubleValue = (int) (i6 * new Rational(i7, i8).doubleValue());
        if (AbstractC0335i0.f("BackupHdrProfileEncoderProfilesProvider")) {
            AbstractC0335i0.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(doubleValue)));
        }
        return doubleValue;
    }

    public static m0 l(InterfaceC0423d0.c cVar) {
        return m0.d().h(cVar.i()).i(cVar.j()).j(new Size(cVar.k(), cVar.h())).e(cVar.f()).b(cVar.c()).g(f6598e).a();
    }

    public static InterfaceC0423d0.c m(InterfaceC0423d0.c cVar) {
        if (cVar == null) {
            return null;
        }
        m0 l6 = l(cVar);
        try {
            p0 j6 = p0.j(l6);
            int e6 = l6.e();
            int intValue = ((Integer) j6.b().clamp(Integer.valueOf(e6))).intValue();
            return intValue == e6 ? cVar : j(cVar, intValue);
        } catch (i0 unused) {
            return null;
        }
    }

    @Override // I.InterfaceC0421c0
    public boolean a(int i6) {
        return this.f6599a.a(i6) && i(i6) != null;
    }

    @Override // I.InterfaceC0421c0
    public InterfaceC0423d0 b(int i6) {
        return i(i6);
    }

    public final InterfaceC0423d0 d(InterfaceC0423d0 interfaceC0423d0, int i6, int i7) {
        InterfaceC0423d0.c cVar;
        if (interfaceC0423d0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(interfaceC0423d0.d());
        Iterator it = interfaceC0423d0.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = (InterfaceC0423d0.c) it.next();
            if (cVar.g() == 0) {
                break;
            }
        }
        InterfaceC0423d0.c cVar2 = (InterfaceC0423d0.c) this.f6600b.apply(h(cVar, i6, i7));
        if (cVar2 != null) {
            arrayList.add(cVar2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0423d0.b.h(interfaceC0423d0.a(), interfaceC0423d0.b(), interfaceC0423d0.c(), arrayList);
    }
}
