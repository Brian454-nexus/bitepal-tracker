package h;

import android.content.Context;
import android.content.Intent;
import g.C1310a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1397i extends AbstractC1389a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14976a = new a(null);

    /* renamed from: h.i$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // h.AbstractC1389a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, g.g input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    @Override // h.AbstractC1389a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1310a c(int i6, Intent intent) {
        return new C1310a(i6, intent);
    }
}
