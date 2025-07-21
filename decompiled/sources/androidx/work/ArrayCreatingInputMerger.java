package androidx.work;

import Q4.e;
import W2.h;
import androidx.work.b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "LW2/h;", "<init>", "()V", "", "Landroidx/work/b;", "inputs", "b", "(Ljava/util/List;)Landroidx/work/b;", "", "array1", "array2", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "array", "obj", "Ljava/lang/Class;", "valueClass", "c", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", e.f4542u, "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ArrayCreatingInputMerger extends h {
    @Override // W2.h
    public b b(List inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            Map h6 = ((b) it.next()).h();
            Intrinsics.checkNotNullExpressionValue(h6, "input.keyValueMap");
            for (Map.Entry entry : h6.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.areEqual(cls2, cls)) {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        value = d(obj, value);
                    } else {
                        if (!Intrinsics.areEqual(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = e(value, cls);
                }
                Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        aVar.c(hashMap);
        b a6 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a6, "output.build()");
        return a6;
    }

    public final Object c(Object array, Object obj, Class valueClass) {
        int length = Array.getLength(array);
        Object newArray = Array.newInstance((Class<?>) valueClass, length + 1);
        System.arraycopy(array, 0, newArray, 0, length);
        Array.set(newArray, length, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    public final Object d(Object array1, Object array2) {
        int length = Array.getLength(array1);
        int length2 = Array.getLength(array2);
        Class<?> componentType = array1.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(array1, 0, newArray, 0, length);
        System.arraycopy(array2, 0, newArray, length, length2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    public final Object e(Object obj, Class valueClass) {
        Object newArray = Array.newInstance((Class<?>) valueClass, 1);
        Array.set(newArray, 0, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }
}
