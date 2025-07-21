package j0;

import java.lang.reflect.Array;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {
    public static Object[] a(Object[] objArr, int i6) {
        if (objArr.length < i6) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6);
        }
        if (objArr.length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
