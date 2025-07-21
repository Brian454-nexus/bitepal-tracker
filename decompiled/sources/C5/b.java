package C5;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {
    public static Object a(int i6, Object obj, a aVar, c cVar) {
        Object apply;
        if (i6 < 1) {
            return aVar.apply(obj);
        }
        do {
            apply = aVar.apply(obj);
            obj = cVar.a(obj, apply);
            if (obj == null) {
                break;
            }
            i6--;
        } while (i6 >= 1);
        return apply;
    }
}
