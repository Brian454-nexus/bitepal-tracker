package c3;

import W2.k;
import W2.l;
import b3.C1086b;
import d3.AbstractC1189h;
import f3.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c3.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1150e extends AbstractC1148c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f10753f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f10754g;

    /* renamed from: c3.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        String i6 = k.i("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(i6, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f10754g = i6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1150e(AbstractC1189h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // c3.AbstractC1148c
    public boolean b(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f14126j.d() == l.METERED;
    }

    @Override // c3.AbstractC1148c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C1086b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.a() && value.b()) ? false : true;
    }
}
