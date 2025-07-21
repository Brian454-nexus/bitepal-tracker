package z0;

import android.view.MotionEvent;

/* renamed from: z0.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2391B {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21377a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f21378b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    public float f21379c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public int f21380d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f21381e = 0;

    public static float f(float f6) {
        return (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f21380d != 0 && eventTime - this.f21378b[this.f21381e] > 40) {
            b();
        }
        int i6 = (this.f21381e + 1) % 20;
        this.f21381e = i6;
        int i7 = this.f21380d;
        if (i7 != 20) {
            this.f21380d = i7 + 1;
        }
        this.f21377a[i6] = motionEvent.getAxisValue(26);
        this.f21378b[this.f21381e] = eventTime;
    }

    public final void b() {
        this.f21380d = 0;
        this.f21379c = 0.0f;
    }

    public void c(int i6, float f6) {
        float e6 = e() * i6;
        this.f21379c = e6;
        if (e6 < (-Math.abs(f6))) {
            this.f21379c = -Math.abs(f6);
        } else if (this.f21379c > Math.abs(f6)) {
            this.f21379c = Math.abs(f6);
        }
    }

    public float d(int i6) {
        if (i6 != 26) {
            return 0.0f;
        }
        return this.f21379c;
    }

    public final float e() {
        long[] jArr;
        long j6;
        int i6 = this.f21380d;
        if (i6 < 2) {
            return 0.0f;
        }
        int i7 = this.f21381e;
        int i8 = ((i7 + 20) - (i6 - 1)) % 20;
        long j7 = this.f21378b[i7];
        while (true) {
            jArr = this.f21378b;
            j6 = jArr[i8];
            if (j7 - j6 <= 100) {
                break;
            }
            this.f21380d--;
            i8 = (i8 + 1) % 20;
        }
        int i9 = this.f21380d;
        if (i9 < 2) {
            return 0.0f;
        }
        if (i9 == 2) {
            int i10 = (i8 + 1) % 20;
            long j8 = jArr[i10];
            if (j6 == j8) {
                return 0.0f;
            }
            return this.f21377a[i10] / ((float) (j8 - j6));
        }
        float f6 = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f21380d - 1; i12++) {
            int i13 = i12 + i8;
            long[] jArr2 = this.f21378b;
            long j9 = jArr2[i13 % 20];
            int i14 = (i13 + 1) % 20;
            if (jArr2[i14] != j9) {
                i11++;
                float f7 = f(f6);
                float f8 = this.f21377a[i14] / ((float) (this.f21378b[i14] - j9));
                f6 += (f8 - f7) * Math.abs(f8);
                if (i11 == 1) {
                    f6 *= 0.5f;
                }
            }
        }
        return f(f6);
    }
}
