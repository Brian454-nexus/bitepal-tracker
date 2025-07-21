package com.dexterous.flutterlocalnotifications;

import G9.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.NotificationManagerCompat;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x9.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static b f13286b;

    /* renamed from: c, reason: collision with root package name */
    public static io.flutter.embedding.engine.a f13287c;

    /* renamed from: a, reason: collision with root package name */
    public p5.a f13288a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements c.d {

        /* renamed from: a, reason: collision with root package name */
        public final List f13289a;

        /* renamed from: b, reason: collision with root package name */
        public c.b f13290b;

        public b() {
            this.f13289a = new ArrayList();
        }

        public void a(Object obj, c.b bVar) {
            Iterator it = this.f13289a.iterator();
            while (it.hasNext()) {
                bVar.a((Map) it.next());
            }
            this.f13289a.clear();
            this.f13290b = bVar;
        }

        public void b(Object obj) {
            this.f13290b = null;
        }

        public void c(Map map) {
            c.b bVar = this.f13290b;
            if (bVar != null) {
                bVar.a(map);
            } else {
                this.f13289a.add(map);
            }
        }
    }

    @Keep
    public ActionBroadcastReceiver() {
    }

    public final void a(x9.a aVar) {
        new G9.c(aVar.k(), "dexterous.com/flutter/local_notifications/actions").d(f13286b);
    }

    public final void b(Context context) {
        if (f13287c != null) {
            Log.e("ActionBroadcastReceiver", "Engine is already initialised");
            return;
        }
        z9.f c6 = u9.a.e().c();
        c6.q(context);
        c6.h(context, (String[]) null);
        f13287c = new io.flutter.embedding.engine.a(context);
        FlutterCallbackInformation d6 = this.f13288a.d();
        if (d6 == null) {
            Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
            return;
        }
        x9.a k6 = f13287c.k();
        a(k6);
        k6.i(new a.b(context.getAssets(), c6.j(), d6));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            p5.a aVar = this.f13288a;
            if (aVar == null) {
                aVar = new p5.a(context);
            }
            this.f13288a = aVar;
            Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int intValue = ((Integer) extractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = extractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    NotificationManagerCompat.from(context).cancel((String) obj, intValue);
                } else {
                    NotificationManagerCompat.from(context).cancel(intValue);
                }
            }
            if (f13286b == null) {
                f13286b = new b();
            }
            f13286b.c(extractNotificationResponseMap);
            b(context);
        }
    }
}
