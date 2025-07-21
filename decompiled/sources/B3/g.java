package B3;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface g {
    static /* synthetic */ f a(g gVar, a aVar, String str, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStorage");
        }
        if ((i6 & 2) != 0) {
            str = null;
        }
        return gVar.b(aVar, str);
    }

    f b(a aVar, String str);
}
