package y;

import I.Z0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class t1 {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21076a;

        static {
            int[] iArr = new int[Z0.b.values().length];
            f21076a = iArr;
            try {
                iArr[Z0.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21076a[Z0.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21076a[Z0.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21076a[Z0.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21076a[Z0.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(Z0.b bVar, int i6) {
        int i7 = a.f21076a[bVar.ordinal()];
        return i7 != 1 ? (i7 == 2 || i7 == 3) ? 3 : 1 : i6 == 2 ? 5 : 2;
    }

    public static int b(Z0.b bVar, int i6) {
        int i7 = a.f21076a[bVar.ordinal()];
        return i7 != 1 ? (i7 == 2 || i7 == 3) ? 3 : 1 : i6 == 2 ? 5 : 1;
    }
}
