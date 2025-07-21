package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f8706c = new a0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f8708b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f8707a = new G();

    public static a0 a() {
        return f8706c;
    }

    public e0 b(Class cls, e0 e0Var) {
        AbstractC1047y.b(cls, "messageType");
        AbstractC1047y.b(e0Var, com.amazon.device.simplesignin.a.a.a.f11704E);
        return (e0) this.f8708b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        e0 b6;
        AbstractC1047y.b(cls, "messageType");
        e0 e0Var = (e0) this.f8708b.get(cls);
        return (e0Var != null || (b6 = b(cls, (e0Var = this.f8707a.a(cls)))) == null) ? e0Var : b6;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}
