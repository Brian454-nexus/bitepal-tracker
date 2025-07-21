package g3;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14896a;

    static {
        String i6 = W2.k.i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(i6, "tagWithPrefix(\"WakeLocks\")");
        f14896a = i6;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        x xVar = x.f14897a;
        synchronized (xVar) {
            linkedHashMap.putAll(xVar.a());
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                W2.k.e().k(f14896a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        x xVar = x.f14897a;
        synchronized (xVar) {
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
