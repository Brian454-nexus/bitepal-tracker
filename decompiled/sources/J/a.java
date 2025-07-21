package J;

import F.AbstractC0335i0;
import I.InterfaceC0423d0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {
    public static InterfaceC0423d0 a(CamcorderProfile camcorderProfile) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            AbstractC0335i0.l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i6 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return d.a(camcorderProfile);
    }

    public static InterfaceC0423d0 b(EncoderProfiles encoderProfiles) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i6 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i6 + ". Version 31 or higher required.");
    }
}
