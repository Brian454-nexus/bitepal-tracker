package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1024a implements O {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractC0127a implements O.a {
        public static void b(Iterable iterable, List list) {
            AbstractC1047y.a(iterable);
            if (!(iterable instanceof D)) {
                if (iterable instanceof Y) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    d(iterable, list);
                    return;
                }
            }
            List underlyingElements = ((D) iterable).getUnderlyingElements();
            D d6 = (D) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (d6.size() - size) + " is null.";
                    for (int size2 = d6.size() - 1; size2 >= size; size2--) {
                        d6.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1030g) {
                    d6.q((AbstractC1030g) obj);
                } else {
                    d6.add((String) obj);
                }
            }
        }

        public static void d(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static k0 e(O o6) {
            return new k0(o6);
        }
    }

    public static void b(Iterable iterable, List list) {
        AbstractC0127a.b(iterable, list);
    }

    public abstract int d(e0 e0Var);

    public k0 e() {
        return new k0(this);
    }

    public void f(OutputStream outputStream) {
        AbstractC1033j Y5 = AbstractC1033j.Y(outputStream, AbstractC1033j.C(getSerializedSize()));
        a(Y5);
        Y5.V();
    }
}
