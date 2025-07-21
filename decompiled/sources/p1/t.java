package p1;

import android.media.MediaCodecInfo;
import c1.AbstractC1117K;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f18205a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i7, double d6) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            p.a();
            int b6 = b(supportedPerformancePoints, o.a(i6, i7, (int) d6));
            if (b6 == 1 && t.f18205a == null) {
                Boolean unused = t.f18205a = Boolean.valueOf(c());
                if (t.f18205a.booleanValue()) {
                    return 0;
                }
            }
            return b6;
        }

        public static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i6 = 0; i6 < list.size(); i6++) {
                covers = r.a(list.get(i6)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            r4 = ((p1.n) r1.get(r3)).f18197d.getVideoCapabilities().getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean c() {
            /*
                int r0 = c1.AbstractC1117K.f10560a
                r1 = 35
                r2 = 0
                if (r0 < r1) goto L8
                return r2
            L8:
                r0 = 1
                Z0.q$b r1 = new Z0.q$b     // Catch: p1.G.c -> L71
                r1.<init>()     // Catch: p1.G.c -> L71
                java.lang.String r3 = "video/avc"
                Z0.q$b r1 = r1.o0(r3)     // Catch: p1.G.c -> L71
                Z0.q r1 = r1.K()     // Catch: p1.G.c -> L71
                java.lang.String r3 = r1.f6990n     // Catch: p1.G.c -> L71
                if (r3 == 0) goto L71
                p1.x r3 = p1.x.f18285a     // Catch: p1.G.c -> L71
                java.util.List r1 = p1.G.v(r3, r1, r2, r2)     // Catch: p1.G.c -> L71
                r3 = r2
            L23:
                int r4 = r1.size()     // Catch: p1.G.c -> L71
                if (r3 >= r4) goto L71
                java.lang.Object r4 = r1.get(r3)     // Catch: p1.G.c -> L71
                p1.n r4 = (p1.n) r4     // Catch: p1.G.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f18197d     // Catch: p1.G.c -> L71
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r1.get(r3)     // Catch: p1.G.c -> L71
                p1.n r4 = (p1.n) r4     // Catch: p1.G.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f18197d     // Catch: p1.G.c -> L71
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: p1.G.c -> L71
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r1.get(r3)     // Catch: p1.G.c -> L71
                p1.n r4 = (p1.n) r4     // Catch: p1.G.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f18197d     // Catch: p1.G.c -> L71
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: p1.G.c -> L71
                java.util.List r4 = p1.q.a(r4)     // Catch: p1.G.c -> L71
                if (r4 == 0) goto L6e
                boolean r5 = r4.isEmpty()     // Catch: p1.G.c -> L71
                if (r5 != 0) goto L6e
                p1.p.a()     // Catch: p1.G.c -> L71
                r1 = 720(0x2d0, float:1.009E-42)
                r3 = 60
                r5 = 1280(0x500, float:1.794E-42)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = p1.o.a(r5, r1, r3)     // Catch: p1.G.c -> L71
                int r1 = b(r4, r1)     // Catch: p1.G.c -> L71
                if (r1 != r0) goto L6d
                return r0
            L6d:
                return r2
            L6e:
                int r3 = r3 + 1
                goto L23
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.t.a.c():boolean");
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i7, double d6) {
        if (AbstractC1117K.f10560a < 29) {
            return 0;
        }
        Boolean bool = f18205a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i6, i7, d6);
        }
        return 0;
    }
}
