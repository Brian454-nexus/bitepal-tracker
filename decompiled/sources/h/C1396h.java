package h;

import android.content.Context;
import android.content.Intent;
import g.C1310a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1396h extends AbstractC1389a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14975a = new a(null);

    /* renamed from: h.h$a */
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
    public Intent a(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // h.AbstractC1389a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1310a c(int i6, Intent intent) {
        return new C1310a(i6, intent);
    }
}
