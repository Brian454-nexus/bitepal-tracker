package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class K implements J {
    public static int i(int i6, Object obj, Object obj2) {
        I i7 = (I) obj;
        H h6 = (H) obj2;
        int i8 = 0;
        if (i7.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : i7.entrySet()) {
            i8 += h6.a(i6, entry.getKey(), entry.getValue());
        }
        return i8;
    }

    public static I j(Object obj, Object obj2) {
        I i6 = (I) obj;
        I i7 = (I) obj2;
        if (!i7.isEmpty()) {
            if (!i6.i()) {
                i6 = i6.l();
            }
            i6.k(i7);
        }
        return i6;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object b(Object obj) {
        ((I) obj).j();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public H.a c(Object obj) {
        return ((H) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map d(Object obj) {
        return (I) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object e(Object obj) {
        return I.e().l();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int f(int i6, Object obj, Object obj2) {
        return i(i6, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean g(Object obj) {
        return !((I) obj).i();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map h(Object obj) {
        return (I) obj;
    }
}
