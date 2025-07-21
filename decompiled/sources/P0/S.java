package P0;

import H2.C0404e;
import android.view.View;
import j0.C1638a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final S f4066a;

    /* renamed from: b, reason: collision with root package name */
    public static final U f4067b;

    /* renamed from: c, reason: collision with root package name */
    public static final U f4068c;

    static {
        S s6 = new S();
        f4066a = s6;
        f4067b = new T();
        f4068c = s6.b();
    }

    public static final void a(AbstractComponentCallbacksC0708p inFragment, AbstractComponentCallbacksC0708p outFragment, boolean z6, C1638a sharedElements, boolean z7) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if (z6) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    public static final void c(C1638a c1638a, C1638a namedViews) {
        Intrinsics.checkNotNullParameter(c1638a, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = c1638a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c1638a.j(size))) {
                c1638a.h(size);
            }
        }
    }

    public static final void d(List views, int i6) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i6);
        }
    }

    public final U b() {
        try {
            Intrinsics.checkNotNull(C0404e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (U) C0404e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
