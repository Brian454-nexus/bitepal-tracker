package G3;

import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q {
    public static final void a(Exception exc, InterfaceC2355a logger, String message) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(message, "message");
        String message2 = exc.getMessage();
        if (message2 != null) {
            logger.a(message + ": " + message2);
        }
        if (exc.getStackTrace() != null) {
            logger.a("Stack trace: " + ExceptionsKt.stackTraceToString(exc));
        }
    }
}
