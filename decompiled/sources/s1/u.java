package s1;

import Z0.z;
import c1.AbstractC1117K;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f18836c = new u(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f18837d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f18838a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18839b;

    public u(long j6, long j7) {
        this.f18838a = j6;
        this.f18839b = j7;
    }

    public static String b(long j6) {
        return AbstractC1117K.H("npt=%.3f-", Double.valueOf(j6 / 1000.0d));
    }

    public static u d(String str) {
        long parseFloat;
        Matcher matcher = f18837d.matcher(str);
        androidx.media3.exoplayer.rtsp.h.a(matcher.matches(), str);
        String group = matcher.group(1);
        androidx.media3.exoplayer.rtsp.h.a(group != null, str);
        long parseFloat2 = ((String) AbstractC1117K.i(group)).equals("now") ? 0L : Float.parseFloat(group) * 1000.0f;
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = Float.parseFloat(group2) * 1000.0f;
                androidx.media3.exoplayer.rtsp.h.a(parseFloat >= parseFloat2, str);
            } catch (NumberFormatException e6) {
                throw z.c(group2, e6);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new u(parseFloat2, parseFloat);
    }

    public long a() {
        return this.f18839b - this.f18838a;
    }

    public boolean c() {
        return this.f18839b == -9223372036854775807L;
    }
}
