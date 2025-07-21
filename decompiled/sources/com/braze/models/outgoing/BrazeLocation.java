package com.braze.models.outgoing;

import com.braze.models.IBrazeLocation;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 ¨\u0006("}, d2 = {"Lcom/braze/models/outgoing/BrazeLocation;", "Lcom/braze/models/IBrazeLocation;", "", "_latitude", "_longitude", "_altitude", "_accuracy", "_verticalAccuracy", "<init>", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "Lorg/json/JSONObject;", "forJsonPut", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "Ljava/lang/Double;", "getLatitude", "()D", "latitude", "getLongitude", "longitude", "getAltitude", "()Ljava/lang/Double;", "altitude", "getAccuracy", "accuracy", "getVerticalAccuracy", "verticalAccuracy", "Companion", "com/braze/models/outgoing/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class BrazeLocation implements IBrazeLocation {
    private static final c Companion = new c();
    private final Double _accuracy;
    private final Double _altitude;
    private final double _latitude;
    private final double _longitude;
    private final Double _verticalAccuracy;

    public BrazeLocation(double d6, double d7, Double d8, Double d9, Double d10) {
        this._latitude = d6;
        this._longitude = d7;
        this._altitude = d8;
        this._accuracy = d9;
        this._verticalAccuracy = d10;
        if (!ValidationUtils.isValidLocation(get_latitude(), get_longitude())) {
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Caught exception creating location Json.";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrazeLocation)) {
            return false;
        }
        BrazeLocation brazeLocation = (BrazeLocation) other;
        return Double.compare(this._latitude, brazeLocation._latitude) == 0 && Double.compare(this._longitude, brazeLocation._longitude) == 0 && Intrinsics.areEqual((Object) this._altitude, (Object) brazeLocation._altitude) && Intrinsics.areEqual((Object) this._accuracy, (Object) brazeLocation._accuracy) && Intrinsics.areEqual((Object) this._verticalAccuracy, (Object) brazeLocation._verticalAccuracy);
    }

    /* renamed from: getAccuracy, reason: from getter */
    public Double get_accuracy() {
        return this._accuracy;
    }

    /* renamed from: getAltitude, reason: from getter */
    public Double get_altitude() {
        return this._altitude;
    }

    @Override // com.braze.models.IBrazeLocation
    /* renamed from: getLatitude, reason: from getter */
    public double get_latitude() {
        return this._latitude;
    }

    @Override // com.braze.models.IBrazeLocation
    /* renamed from: getLongitude, reason: from getter */
    public double get_longitude() {
        return this._longitude;
    }

    /* renamed from: getVerticalAccuracy, reason: from getter */
    public Double get_verticalAccuracy() {
        return this._verticalAccuracy;
    }

    public int hashCode() {
        int hashCode = (Double.hashCode(this._longitude) + (Double.hashCode(this._latitude) * 31)) * 31;
        Double d6 = this._altitude;
        int hashCode2 = (hashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this._accuracy;
        int hashCode3 = (hashCode2 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this._verticalAccuracy;
        return hashCode3 + (d8 != null ? d8.hashCode() : 0);
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this._latitude + ", _longitude=" + this._longitude + ", _altitude=" + this._altitude + ", _accuracy=" + this._accuracy + ", _verticalAccuracy=" + this._verticalAccuracy + ')';
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", get_latitude());
            jSONObject.put("longitude", get_longitude());
            if (get_altitude() != null) {
                jSONObject.put("altitude", get_altitude());
            }
            if (get_accuracy() != null) {
                jSONObject.put("ll_accuracy", get_accuracy());
            }
            if (get_verticalAccuracy() != null) {
                jSONObject.put("alt_accuracy", get_verticalAccuracy());
                return jSONObject;
            }
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: e4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$1;
                    forJsonPut$lambda$1 = BrazeLocation.forJsonPut$lambda$1();
                    return forJsonPut$lambda$1;
                }
            }, 4, (Object) null);
        }
        return jSONObject;
    }
}
