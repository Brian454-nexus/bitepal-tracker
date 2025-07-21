package h;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1389a {

    /* renamed from: h.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0202a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14966a;

        public C0202a(Object obj) {
            this.f14966a = obj;
        }

        public final Object a() {
            return this.f14966a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0202a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i6, Intent intent);
}
