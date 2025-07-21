package g0;

import I.D;
import I.G0;
import I.InterfaceC0421c0;
import I.InterfaceC0423d0;
import X.AbstractC0811u;
import c0.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements InterfaceC0421c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f14269d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0421c0 f14270a;

    /* renamed from: b, reason: collision with root package name */
    public final D f14271b;

    /* renamed from: c, reason: collision with root package name */
    public final G0 f14272c;

    static {
        HashMap hashMap = new HashMap();
        f14269d = hashMap;
        hashMap.put(1, AbstractC0811u.f5979f);
        hashMap.put(8, AbstractC0811u.f5977d);
        hashMap.put(6, AbstractC0811u.f5976c);
        hashMap.put(5, AbstractC0811u.f5975b);
        hashMap.put(4, AbstractC0811u.f5974a);
        hashMap.put(0, AbstractC0811u.f5978e);
    }

    public c(InterfaceC0421c0 interfaceC0421c0, D d6, G0 g02) {
        this.f14270a = interfaceC0421c0;
        this.f14271b = d6;
        this.f14272c = g02;
    }

    @Override // I.InterfaceC0421c0
    public boolean a(int i6) {
        return this.f14270a.a(i6) && c(i6);
    }

    @Override // I.InterfaceC0421c0
    public InterfaceC0423d0 b(int i6) {
        if (a(i6)) {
            return this.f14270a.b(i6);
        }
        return null;
    }

    public final boolean c(int i6) {
        AbstractC0811u abstractC0811u = (AbstractC0811u) f14269d.get(Integer.valueOf(i6));
        if (abstractC0811u == null) {
            return true;
        }
        for (u uVar : this.f14272c.c(u.class)) {
            if (uVar != null && uVar.a(this.f14271b, abstractC0811u) && !uVar.c()) {
                return false;
            }
        }
        return true;
    }
}
