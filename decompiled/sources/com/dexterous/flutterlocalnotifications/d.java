package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationDetails f13310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13311b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13312c;

    public d(NotificationDetails notificationDetails, int i6, ArrayList arrayList) {
        this.f13310a = notificationDetails;
        this.f13311b = i6;
        this.f13312c = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f13310a + ", startMode=" + this.f13311b + ", foregroundServiceTypes=" + this.f13312c + '}';
    }
}
