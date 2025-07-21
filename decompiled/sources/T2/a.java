package T2;

import N2.h;
import N2.j;
import Q2.c;
import Q2.d;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0083a f4904b = new C0083a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f4905c = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final j f4906a;

    /* renamed from: T2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0083a {
        public /* synthetic */ C0083a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            int a6 = a(sidecarDeviceState);
            if (a6 < 0 || a6 > 4) {
                return 0;
            }
            return a6;
        }

        public final List c(SidecarWindowLayoutInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            try {
                try {
                    List list = info.displayFeatures;
                    return list == null ? CollectionsKt.emptyList() : list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info, new Object[0]);
                    Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) invoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return CollectionsKt.emptyList();
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i6) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i6;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i6));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public C0083a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4907a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            boolean z6 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4908a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4909a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            boolean z6 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4910a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            Intrinsics.checkNotNullParameter(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    public a(j verificationMode) {
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f4906a = verificationMode;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (Intrinsics.areEqual(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0083a c0083a = f4904b;
        return c0083a.b(sidecarDeviceState) == c0083a.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.areEqual(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.areEqual(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!b((SidecarDisplayFeature) list.get(i6), (SidecarDisplayFeature) list2.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Intrinsics.areEqual(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0083a c0083a = f4904b;
        return c(c0083a.c(sidecarWindowLayoutInfo), c0083a.c(sidecarWindowLayoutInfo2));
    }

    public final Q2.j e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new Q2.j(CollectionsKt.emptyList());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        C0083a c0083a = f4904b;
        c0083a.d(sidecarDeviceState, c0083a.b(state));
        return new Q2.j(f(c0083a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final List f(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            Q2.a g6 = g((SidecarDisplayFeature) it.next(), deviceState);
            if (g6 != null) {
                arrayList.add(g6);
            }
        }
        return arrayList;
    }

    public final Q2.a g(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        d.b a6;
        c.b bVar;
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        h.a aVar = h.f3597a;
        String TAG = f4905c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) h.a.b(aVar, feature, TAG, this.f4906a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f4907a).c("Feature bounds must not be 0", c.f4908a).c("TYPE_FOLD must have 0 area", d.f4909a).c("Feature be pinned to either left or top", e.f4910a).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            a6 = d.b.f4461b.a();
        } else {
            if (type != 2) {
                return null;
            }
            a6 = d.b.f4461b.b();
        }
        int b6 = f4904b.b(deviceState);
        if (b6 == 0 || b6 == 1) {
            return null;
        }
        if (b6 == 2) {
            bVar = c.b.f4455d;
        } else if (b6 == 3) {
            bVar = c.b.f4454c;
        } else {
            if (b6 == 4) {
                return null;
            }
            bVar = c.b.f4454c;
        }
        Rect rect = feature.getRect();
        Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
        return new Q2.d(new N2.b(rect), a6, bVar);
    }

    public /* synthetic */ a(j jVar, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? j.QUIET : jVar);
    }
}
