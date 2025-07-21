package S2;

import Q2.c;
import Q2.d;
import Q2.j;
import Q2.k;
import Q2.o;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4703a = new f();

    public final Q2.c a(k windowMetrics, FoldingFeature oemFeature) {
        d.b a6;
        c.b bVar;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            a6 = d.b.f4461b.a();
        } else {
            if (type != 2) {
                return null;
            }
            a6 = d.b.f4461b.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar = c.b.f4454c;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = c.b.f4455d;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        if (!d(windowMetrics, new N2.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
        return new Q2.d(new N2.b(bounds2), a6, bVar);
    }

    public final j b(k windowMetrics, WindowLayoutInfo info) {
        Q2.c cVar;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                f fVar = f4703a;
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                cVar = fVar.a(windowMetrics, feature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new j(arrayList);
    }

    public final j c(Context context, WindowLayoutInfo info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            return b(o.f4495b.d(context), info);
        }
        if (i6 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return b(o.f4495b.c((Activity) context), info);
    }

    public final boolean d(k kVar, N2.b bVar) {
        Rect a6 = kVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != a6.width() && bVar.a() != a6.height()) {
            return false;
        }
        if (bVar.d() >= a6.width() || bVar.a() >= a6.height()) {
            return (bVar.d() == a6.width() && bVar.a() == a6.height()) ? false : true;
        }
        return false;
    }
}
