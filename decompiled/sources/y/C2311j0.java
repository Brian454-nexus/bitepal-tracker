package y;

import F.AbstractC0335i0;
import I.InterfaceC0421c0;
import I.InterfaceC0423d0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y.j0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2311j0 implements InterfaceC0421c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21007a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21009c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f21010d = new HashMap();

    /* renamed from: y.j0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static EncoderProfiles a(String str, int i6) {
            return CamcorderProfile.getAll(str, i6);
        }
    }

    public C2311j0(String str) {
        boolean z6;
        int i6;
        this.f21008b = str;
        try {
            i6 = Integer.parseInt(str);
            z6 = true;
        } catch (NumberFormatException unused) {
            AbstractC0335i0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z6 = false;
            i6 = -1;
        }
        this.f21007a = z6;
        this.f21009c = i6;
    }

    @Override // I.InterfaceC0421c0
    public boolean a(int i6) {
        if (this.f21007a) {
            return CamcorderProfile.hasProfile(this.f21009c, i6);
        }
        return false;
    }

    @Override // I.InterfaceC0421c0
    public InterfaceC0423d0 b(int i6) {
        if (!this.f21007a || !CamcorderProfile.hasProfile(this.f21009c, i6)) {
            return null;
        }
        if (this.f21010d.containsKey(Integer.valueOf(i6))) {
            return (InterfaceC0423d0) this.f21010d.get(Integer.valueOf(i6));
        }
        InterfaceC0423d0 d6 = d(i6);
        this.f21010d.put(Integer.valueOf(i6), d6);
        return d6;
    }

    public final InterfaceC0423d0 c(int i6) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f21009c, i6);
        } catch (RuntimeException e6) {
            AbstractC0335i0.m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i6, e6);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return J.a.a(camcorderProfile);
        }
        return null;
    }

    public final InterfaceC0423d0 d(int i6) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles a6 = a.a(this.f21008b, i6);
            if (a6 == null) {
                return null;
            }
            if (B.l.a(B.y.class) != null) {
                AbstractC0335i0.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return J.a.b(a6);
                } catch (NullPointerException e6) {
                    AbstractC0335i0.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e6);
                }
            }
        }
        return c(i6);
    }
}
