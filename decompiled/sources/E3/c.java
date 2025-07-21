package E3;

import B3.f;
import G3.h;
import G3.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1126a = a.f1127a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f1127a = new a();

        public final c a(f storage, InterfaceC2355a logger, B3.a amplitude) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            if (storage instanceof h) {
                return new E3.a((h) storage, logger, amplitude);
            }
            if (storage instanceof l) {
                return new b((l) storage);
            }
            logger.e("Custom storage, identify intercept not started");
            return null;
        }
    }

    Object a(Continuation continuation);

    Object b(Continuation continuation);
}
