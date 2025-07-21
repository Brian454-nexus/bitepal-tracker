package p5;

import android.content.Context;
import android.content.SharedPreferences;
import io.flutter.view.FlutterCallbackInformation;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18386a = "com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY";

    /* renamed from: b, reason: collision with root package name */
    public final String f18387b = "com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY";

    /* renamed from: c, reason: collision with root package name */
    public final Context f18388c;

    public a(Context context) {
        this.f18388c = context;
    }

    public final SharedPreferences a() {
        return this.f18388c.getSharedPreferences("flutter_local_notifications_plugin", 0);
    }

    public Long b() {
        return Long.valueOf(a().getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
    }

    public Long c() {
        return Long.valueOf(a().getLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", -1L));
    }

    public FlutterCallbackInformation d() {
        return FlutterCallbackInformation.lookupCallbackInformation(b().longValue());
    }

    public void e(Long l6, Long l7) {
        a().edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", l6.longValue()).apply();
        a().edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", l7.longValue()).apply();
    }
}
