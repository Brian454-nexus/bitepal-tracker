package N2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3597a = new a(null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i6, Object obj2) {
            if ((i6 & 2) != 0) {
                jVar = c.f3580a.a();
            }
            if ((i6 & 4) != 0) {
                gVar = N2.a.f3575a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final h a(Object obj, String tag, j verificationMode, g logger) {
            Intrinsics.checkNotNullParameter(obj, "<this>");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new i(obj, tag, verificationMode, logger);
        }

        public a() {
        }
    }

    public abstract Object a();

    public final String b(Object value, String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + " value: " + value;
    }

    public abstract h c(String str, Function1 function1);
}
