package B;

import F.AbstractC0335i0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z.C2362A;
import z.T;

/* renamed from: B.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0288e implements K.a {

    /* renamed from: a, reason: collision with root package name */
    public final T f247a;

    /* renamed from: b, reason: collision with root package name */
    public List f248b = null;

    public C0288e(C2362A c2362a) {
        this.f247a = c2362a.b();
    }

    public static boolean d(C2362A c2362a) {
        Integer num = (Integer) c2362a.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    @Override // K.a
    public List b() {
        if (this.f248b == null) {
            Size[] b6 = this.f247a.b(34);
            this.f248b = b6 != null ? Arrays.asList((Size[]) b6.clone()) : Collections.EMPTY_LIST;
            AbstractC0335i0.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f248b);
        }
        return new ArrayList(this.f248b);
    }
}
