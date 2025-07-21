package B;

import I.F0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import z.C2362A;

/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0284a implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Range f246a;

    public C0284a(C2362A c2362a) {
        this.f246a = g((Range[]) c2362a.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    public static boolean f(C2362A c2362a) {
        Integer num = (Integer) c2362a.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public final Range d(Range range) {
        int intValue = ((Integer) range.getUpper()).intValue();
        int intValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            intValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            intValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    public Range e() {
        return this.f246a;
    }

    public final Range g(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range d6 = d(range2);
                if (((Integer) d6.getUpper()).intValue() == 30 && (range == null || ((Integer) d6.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = d6;
                }
            }
        }
        return range;
    }
}
