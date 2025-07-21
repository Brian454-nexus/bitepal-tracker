package com.braze.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b!\b\u0007\u0018\u0000 =2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001>Bi\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u000b\u001a\u00020\n8G¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\"R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b,\u0010\"R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u0011\u001a\u00020\u000e8G¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0012\u001a\u00020\u000e8G¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b3\u00100R\u0017\u0010\u0013\u001a\u00020\n8G¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b4\u0010\"R(\u00105\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010&\u0012\u0004\b9\u0010:\u001a\u0004\b6\u0010(\"\u0004\b7\u00108R\u0011\u0010<\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010(¨\u0006?"}, d2 = {"Lcom/braze/models/BrazeGeofence;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "jsonObject", "", "id", "", "latitude", "longitude", "", "radiusMeter", "cooldownEnterSeconds", "cooldownExitSeconds", "", "analyticsEnabledEnter", "analyticsEnabledExit", "enterEvents", "exitEvents", "notificationResponsivenessMs", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;DDIIIZZZZI)V", "(Lorg/json/JSONObject;)V", "toString", "()Ljava/lang/String;", "forJsonPut", "()Lorg/json/JSONObject;", "other", "compareTo", "(Lcom/braze/models/BrazeGeofence;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "Ljava/lang/String;", "getId", "D", "getLatitude", "()D", "getLongitude", "I", "getRadiusMeter", "getCooldownEnterSeconds", "getCooldownExitSeconds", "Z", "getAnalyticsEnabledEnter", "()Z", "getAnalyticsEnabledExit", "getEnterEvents", "getExitEvents", "getNotificationResponsivenessMs", "distanceFromGeofenceRefresh", "getDistanceFromGeofenceRefresh", "setDistanceFromGeofenceRefresh", "(D)V", "getDistanceFromGeofenceRefresh$annotations", "()V", "getRadiusMeters", "radiusMeters", "Companion", "com/braze/models/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    public static final c Companion = new c();
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    public BrazeGeofence(JSONObject jsonObject, String id, double d6, double d7, int i6, int i7, int i8, boolean z6, boolean z7, boolean z8, boolean z9, int i9) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(id, "id");
        this.jsonObject = jsonObject;
        this.id = id;
        this.latitude = d6;
        this.longitude = d7;
        this.radiusMeter = i6;
        this.cooldownEnterSeconds = i7;
        this.cooldownExitSeconds = i8;
        this.analyticsEnabledEnter = z6;
        this.analyticsEnabledExit = z7;
        this.enterEvents = z8;
        this.exitEvents = z9;
        this.notificationResponsivenessMs = i9;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BrazeGeofence.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.braze.models.BrazeGeofence");
        BrazeGeofence brazeGeofence = (BrazeGeofence) other;
        return Intrinsics.areEqual(this.id, brazeGeofence.id) && this.latitude == brazeGeofence.latitude && this.longitude == brazeGeofence.longitude && this.radiusMeter == brazeGeofence.radiusMeter && this.cooldownEnterSeconds == brazeGeofence.cooldownEnterSeconds && this.cooldownExitSeconds == brazeGeofence.cooldownExitSeconds && this.analyticsEnabledEnter == brazeGeofence.analyticsEnabledEnter && this.analyticsEnabledExit == brazeGeofence.analyticsEnabledExit && this.enterEvents == brazeGeofence.enterEvents && this.exitEvents == brazeGeofence.exitEvents && this.notificationResponsivenessMs == brazeGeofence.notificationResponsivenessMs;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public int hashCode() {
        return Double.hashCode(getRadiusMeters()) + ((((Boolean.hashCode(this.exitEvents) + ((Boolean.hashCode(this.enterEvents) + ((Boolean.hashCode(this.analyticsEnabledExit) + ((Boolean.hashCode(this.analyticsEnabledEnter) + ((((((((Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + ((this.id.hashCode() + (this.jsonObject.hashCode() * 31)) * 31)) * 31)) * 31) + this.radiusMeter) * 31) + this.cooldownEnterSeconds) * 31) + this.cooldownExitSeconds) * 31)) * 31)) * 31)) * 31)) * 31) + this.notificationResponsivenessMs) * 31);
    }

    public final void setDistanceFromGeofenceRefresh(double d6) {
        this.distanceFromGeofenceRefresh = d6;
    }

    public String toString() {
        return StringsKt.trimMargin$default("BrazeGeofence{id=" + this.id + ", \n            |latitude, longitude=(" + this.latitude + ", " + this.longitude + "),\n            |radiusMeters=" + this.radiusMeter + ", \n            |cooldownEnterSeconds=" + this.cooldownEnterSeconds + ", \n            |cooldownExitSeconds=" + this.cooldownExitSeconds + ", \n            |analyticsEnabledEnter=" + this.analyticsEnabledEnter + ", \n            |analyticsEnabledExit=" + this.analyticsEnabledExit + ", \n            |enterEvents=" + this.enterEvents + ", \n            |exitEvents=" + this.exitEvents + ", \n            |notificationResponsivenessMs=" + this.notificationResponsivenessMs + ", \n            |distanceFromGeofenceRefresh=" + this.distanceFromGeofenceRefresh + " }\n            |\n        ", (String) null, 1, (Object) null);
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d6 = this.distanceFromGeofenceRefresh;
        return (d6 != -1.0d && d6 < other.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BrazeGeofence(org.json.JSONObject r16) {
        /*
            r15 = this;
            r1 = r16
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r0 = "latitude"
            double r3 = r1.getDouble(r0)
            java.lang.String r0 = "longitude"
            double r5 = r1.getDouble(r0)
            java.lang.String r0 = "radius"
            int r7 = r1.getInt(r0)
            java.lang.String r0 = "cooldown_enter"
            int r8 = r1.getInt(r0)
            java.lang.String r0 = "cooldown_exit"
            int r9 = r1.getInt(r0)
            java.lang.String r0 = "analytics_enabled_enter"
            boolean r10 = r1.getBoolean(r0)
            java.lang.String r0 = "analytics_enabled_exit"
            boolean r11 = r1.getBoolean(r0)
            java.lang.String r0 = "enter_events"
            r12 = 1
            boolean r0 = r1.optBoolean(r0, r12)
            java.lang.String r13 = "exit_events"
            boolean r13 = r1.optBoolean(r13, r12)
            java.lang.String r12 = "notification_responsiveness"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r14 = r1.optInt(r12, r14)
            r12 = r0
            r0 = r15
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.BrazeGeofence.<init>(org.json.JSONObject):void");
    }
}
