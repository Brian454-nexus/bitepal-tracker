package y;

import F.AbstractC0335i0;
import I.EnumC0446p;
import I.EnumC0448q;
import I.EnumC0451s;
import I.EnumC0453t;
import I.InterfaceC0455u;
import L.i;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;

/* renamed from: y.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2302g implements InterfaceC0455u {

    /* renamed from: a, reason: collision with root package name */
    public final I.S0 f20988a;

    /* renamed from: b, reason: collision with root package name */
    public final CaptureResult f20989b;

    public C2302g(I.S0 s02, CaptureResult captureResult) {
        this.f20988a = s02;
        this.f20989b = captureResult;
    }

    @Override // I.InterfaceC0455u
    public I.S0 a() {
        return this.f20988a;
    }

    @Override // I.InterfaceC0455u
    public void b(i.b bVar) {
        super.b(bVar);
        Rect rect = (Rect) this.f20989b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.j(rect.width()).i(rect.height());
        }
        try {
            Integer num = (Integer) this.f20989b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC0335i0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l6 = (Long) this.f20989b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l6 != null) {
            bVar.f(l6.longValue());
        }
        Float f6 = (Float) this.f20989b.get(CaptureResult.LENS_APERTURE);
        if (f6 != null) {
            bVar.l(f6.floatValue());
        }
        Integer num2 = (Integer) this.f20989b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) this.f20989b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f7 = (Float) this.f20989b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f7 != null) {
            bVar.h(f7.floatValue());
        }
        Integer num3 = (Integer) this.f20989b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            i.c cVar = i.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = i.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // I.InterfaceC0455u
    public long c() {
        Long l6 = (Long) this.f20989b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l6 == null) {
            return -1L;
        }
        return l6.longValue();
    }

    @Override // I.InterfaceC0455u
    public EnumC0451s d() {
        Integer num = (Integer) this.f20989b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC0451s.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC0451s.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC0451s.METERING;
        }
        if (intValue == 2) {
            return EnumC0451s.CONVERGED;
        }
        if (intValue == 3) {
            return EnumC0451s.LOCKED;
        }
        AbstractC0335i0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC0451s.UNKNOWN;
    }

    @Override // I.InterfaceC0455u
    public EnumC0453t e() {
        Integer num = (Integer) this.f20989b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC0453t.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC0453t.NONE;
        }
        if (intValue == 2) {
            return EnumC0453t.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return EnumC0453t.FIRED;
        }
        AbstractC0335i0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC0453t.UNKNOWN;
    }

    @Override // I.InterfaceC0455u
    public EnumC0446p f() {
        Integer num = (Integer) this.f20989b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC0446p.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC0446p.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return EnumC0446p.CONVERGED;
            }
            if (intValue == 3) {
                return EnumC0446p.LOCKED;
            }
            if (intValue == 4) {
                return EnumC0446p.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                AbstractC0335i0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC0446p.UNKNOWN;
            }
        }
        return EnumC0446p.SEARCHING;
    }

    @Override // I.InterfaceC0455u
    public CaptureResult g() {
        return this.f20989b;
    }

    @Override // I.InterfaceC0455u
    public I.r h() {
        Integer num = (Integer) this.f20989b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return I.r.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return I.r.INACTIVE;
            case 1:
            case 3:
                return I.r.SCANNING;
            case 2:
                return I.r.PASSIVE_FOCUSED;
            case 4:
                return I.r.LOCKED_FOCUSED;
            case 5:
                return I.r.LOCKED_NOT_FOCUSED;
            case 6:
                return I.r.PASSIVE_NOT_FOCUSED;
            default:
                AbstractC0335i0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return I.r.UNKNOWN;
        }
    }

    public EnumC0448q i() {
        Integer num = (Integer) this.f20989b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC0448q.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return EnumC0448q.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return EnumC0448q.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                AbstractC0335i0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC0448q.UNKNOWN;
            }
        }
        return EnumC0448q.OFF;
    }

    public C2302g(CaptureResult captureResult) {
        this(I.S0.b(), captureResult);
    }
}
