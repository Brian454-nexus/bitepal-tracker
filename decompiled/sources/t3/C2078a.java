package t3;

import android.view.View;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q3.C2012c;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2078a implements InterfaceC2079b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0248a f19071b = new C0248a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f19072a = new int[2];

    /* renamed from: t3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0248a {
        public /* synthetic */ C0248a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0248a() {
        }
    }

    @Override // t3.InterfaceC2079b
    public C2012c a(Object obj, Pair targetPosition, C2012c.a targetType) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            View view2 = (View) obj;
            if (!e(view2, targetPosition) || targetType != C2012c.a.f18681a || !d(view2)) {
                view = null;
            }
            if (view != null) {
                return b(view2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q3.C2012c b(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            if (r0 != 0) goto L12
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L12:
            r3 = r0
            q3.b r0 = q3.C2011b.f18672a
            java.lang.String r4 = r0.b(r10)
            java.lang.String r8 = r9.c(r10)
            java.lang.Object r0 = r10.getTag()
            r1 = 0
            if (r0 == 0) goto L3e
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L36
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 != 0) goto L36
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 != 0) goto L36
            boolean r2 = r0 instanceof java.lang.Character
            if (r2 == 0) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.toString()
            r5 = r0
            goto L3f
        L3e:
            r5 = r1
        L3f:
            boolean r0 = r10 instanceof android.widget.Button
            if (r0 == 0) goto L47
            r0 = r10
            android.widget.Button r0 = (android.widget.Button) r0
            goto L48
        L47:
            r0 = r1
        L48:
            if (r0 == 0) goto L54
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L54
            java.lang.String r1 = r0.toString()
        L54:
            r6 = r1
            q3.c r1 = new q3.c
            java.lang.String r7 = "android_view"
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C2078a.b(android.view.View):q3.c");
    }

    public final String c(View view) {
        ArrayList arrayList = new ArrayList();
        while (view != null) {
            String simpleName = view.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            arrayList.add(simpleName);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return CollectionsKt.joinToString$default(arrayList, " → ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final boolean d(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    public final boolean e(View view, Pair pair) {
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        view.getLocationOnScreen(this.f19072a);
        int[] iArr = this.f19072a;
        int i6 = iArr[0];
        int i7 = iArr[1];
        return floatValue >= ((float) i6) && floatValue <= ((float) (i6 + view.getWidth())) && floatValue2 >= ((float) i7) && floatValue2 <= ((float) (i7 + view.getHeight()));
    }
}
