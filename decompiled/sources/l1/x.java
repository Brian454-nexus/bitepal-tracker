package l1;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import c1.AbstractC1117K;
import l1.C1738h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class x {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return AbstractC1117K.Y(AbstractC1117K.Z(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Throwable th, int i6) {
        int i7 = AbstractC1117K.f10560a;
        if (i7 >= 21 && a.a(th)) {
            return a.b(th);
        }
        if (i7 >= 23 && b.a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || b(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof N) {
            return 6001;
        }
        if (th instanceof C1738h.e) {
            return 6003;
        }
        if (th instanceof K) {
            return 6008;
        }
        if (i6 == 1) {
            return 6006;
        }
        if (i6 == 2) {
            return 6004;
        }
        if (i6 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(Throwable th) {
        return AbstractC1117K.f10560a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return AbstractC1117K.f10560a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
