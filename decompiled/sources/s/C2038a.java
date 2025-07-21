package s;

import java.util.HashMap;
import java.util.Map;
import s.C2039b;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2038a extends C2039b {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f18726e = new HashMap();

    @Override // s.C2039b
    public C2039b.c b(Object obj) {
        return (C2039b.c) this.f18726e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f18726e.containsKey(obj);
    }

    @Override // s.C2039b
    public Object k(Object obj, Object obj2) {
        C2039b.c b6 = b(obj);
        if (b6 != null) {
            return b6.f18732b;
        }
        this.f18726e.put(obj, i(obj, obj2));
        return null;
    }

    @Override // s.C2039b
    public Object l(Object obj) {
        Object l6 = super.l(obj);
        this.f18726e.remove(obj);
        return l6;
    }

    public Map.Entry m(Object obj) {
        if (contains(obj)) {
            return ((C2039b.c) this.f18726e.get(obj)).f18734d;
        }
        return null;
    }
}
