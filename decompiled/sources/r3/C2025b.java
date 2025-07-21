package r3;

import P0.AbstractActivityC0712u;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2025b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2025b f18702a = new C2025b();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f18703b = new WeakHashMap();

    public final void a(Activity activity, Function2 track, InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(logger, "logger");
        AbstractActivityC0712u abstractActivityC0712u = activity instanceof AbstractActivityC0712u ? (AbstractActivityC0712u) activity : null;
        if (abstractActivityC0712u == null) {
            logger.b("Activity is not a FragmentActivity");
            return;
        }
        C2024a c2024a = new C2024a(track, logger);
        abstractActivityC0712u.getSupportFragmentManager().c1(c2024a, false);
        WeakHashMap weakHashMap = f18703b;
        Object obj = weakHashMap.get(abstractActivityC0712u);
        if (obj == null) {
            obj = new ArrayList();
            weakHashMap.put(abstractActivityC0712u, obj);
        }
        ((List) obj).add(c2024a);
    }

    public final void b(Activity activity, InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        AbstractActivityC0712u abstractActivityC0712u = activity instanceof AbstractActivityC0712u ? (AbstractActivityC0712u) activity : null;
        if (abstractActivityC0712u == null) {
            logger.b("Activity is not a FragmentActivity");
            return;
        }
        List list = (List) f18703b.remove(abstractActivityC0712u);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                abstractActivityC0712u.getSupportFragmentManager().r1((C2024a) it.next());
            }
        }
    }
}
