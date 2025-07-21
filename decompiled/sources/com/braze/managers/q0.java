package com.braze.managers;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import ga.L;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* synthetic */ class q0 extends FunctionReferenceImpl implements Function4 {
    public q0(s0 s0Var) {
        super(4, s0Var, s0.class, "log", "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String tag = (String) obj;
        BrazeLogger.Priority priority = (BrazeLogger.Priority) obj2;
        String message = (String) obj3;
        Object obj5 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(tag, "p0");
        Intrinsics.checkNotNullParameter(priority, "p1");
        Intrinsics.checkNotNullParameter(message, "p2");
        s0 s0Var = (s0) this.receiver;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (s0Var.f12512c.f12481a && !StringsKt.contains$default(message, "Braze v36.0.0 .", false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(priority);
            sb.append(' ');
            sb.append(tag);
            sb.append(": ");
            sb.append(message);
            sb.append(' ');
            String str = "";
            if (obj5 == null) {
                obj5 = "";
            }
            sb.append(obj5);
            for (String str2 : StringsKt.split$default(sb.toString(), new String[]{"\n"}, false, 0, 6, (Object) null)) {
                if (str2.length() + str.length() > s0Var.f12512c.f12486f) {
                    s0Var.a(priority + ": " + str);
                    str = str2;
                } else {
                    str = str + '\n' + str2;
                }
            }
            if (str.length() > 0) {
                s0Var.a(str);
            }
            ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new r0(s0Var, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
