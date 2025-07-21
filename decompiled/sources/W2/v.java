package W2;

import X2.E;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class v {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    public static v e(Context context) {
        return E.m(context);
    }

    public static void f(Context context, androidx.work.a aVar) {
        E.f(context, aVar);
    }

    public abstract n a(String str);

    public final n b(w wVar) {
        return c(Collections.singletonList(wVar));
    }

    public abstract n c(List list);

    public abstract n d(String str, d dVar, p pVar);
}
