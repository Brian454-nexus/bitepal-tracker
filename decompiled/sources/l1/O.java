package l1;

import android.util.Pair;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class O {
    public static long a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair b(InterfaceC1743m interfaceC1743m) {
        Map e6 = interfaceC1743m.e();
        if (e6 == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(e6, "LicenseDurationRemaining")), Long.valueOf(a(e6, "PlaybackDurationRemaining")));
    }
}
