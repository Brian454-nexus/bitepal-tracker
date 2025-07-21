package I;

import java.util.HashMap;
import java.util.Map;

/* renamed from: I.f0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0427f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2440a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2441b = new HashMap();

    public static InterfaceC0463y a(Object obj) {
        InterfaceC0463y interfaceC0463y;
        synchronized (f2440a) {
            interfaceC0463y = (InterfaceC0463y) f2441b.get(obj);
        }
        return interfaceC0463y == null ? InterfaceC0463y.f2572a : interfaceC0463y;
    }
}
