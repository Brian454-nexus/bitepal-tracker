package com.braze.models.response;

import com.braze.managers.o0;
import com.braze.managers.s0;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: A, reason: collision with root package name */
    public Long f12680A;

    /* renamed from: B, reason: collision with root package name */
    public long f12681B;

    /* renamed from: C, reason: collision with root package name */
    public long f12682C;

    /* renamed from: D, reason: collision with root package name */
    public long f12683D;

    /* renamed from: E, reason: collision with root package name */
    public Map f12684E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f12685F;

    /* renamed from: G, reason: collision with root package name */
    public int f12686G;

    /* renamed from: a, reason: collision with root package name */
    public long f12687a;

    /* renamed from: b, reason: collision with root package name */
    public Set f12688b;

    /* renamed from: c, reason: collision with root package name */
    public Set f12689c;

    /* renamed from: d, reason: collision with root package name */
    public Set f12690d;

    /* renamed from: e, reason: collision with root package name */
    public int f12691e;

    /* renamed from: f, reason: collision with root package name */
    public int f12692f;

    /* renamed from: g, reason: collision with root package name */
    public int f12693g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12694h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12695i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12696j;

    /* renamed from: k, reason: collision with root package name */
    public long f12697k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12698l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12699m;

    /* renamed from: n, reason: collision with root package name */
    public int f12700n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12701o;

    /* renamed from: p, reason: collision with root package name */
    public long f12702p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12703q;

    /* renamed from: r, reason: collision with root package name */
    public int f12704r;

    /* renamed from: s, reason: collision with root package name */
    public int f12705s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12706t;

    /* renamed from: u, reason: collision with root package name */
    public long f12707u;

    /* renamed from: v, reason: collision with root package name */
    public int f12708v;

    /* renamed from: w, reason: collision with root package name */
    public int f12709w;

    /* renamed from: x, reason: collision with root package name */
    public int f12710x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12711y;

    /* renamed from: z, reason: collision with root package name */
    public String f12712z;

    public m() {
        int i6 = e0.f12906f;
        int i7 = e0.f12907g;
        this.f12687a = 0L;
        this.f12688b = null;
        this.f12689c = null;
        this.f12690d = null;
        this.f12691e = -1;
        this.f12692f = -1;
        this.f12693g = -1;
        this.f12694h = false;
        this.f12695i = false;
        this.f12696j = false;
        this.f12697k = -1L;
        this.f12698l = false;
        this.f12699m = false;
        this.f12700n = -1;
        this.f12701o = false;
        this.f12702p = 86400L;
        this.f12703q = true;
        this.f12704r = 30;
        this.f12705s = 30;
        this.f12706t = false;
        this.f12707u = -1L;
        this.f12708v = i6;
        this.f12709w = i7;
        this.f12710x = 3;
        this.f12711y = false;
        this.f12712z = null;
        this.f12680A = null;
        this.f12681B = 0L;
        this.f12682C = 0L;
        this.f12683D = 0L;
        this.f12684E = null;
        this.f12685F = false;
        this.f12686G = 0;
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public static final String k(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public final void a(JSONObject jSONObject) {
        int i6;
        JSONObject optJSONObject = jSONObject.optJSONObject("banners");
        if (optJSONObject != null) {
            try {
                this.f12685F = optJSONObject.getBoolean("enabled");
                i6 = optJSONObject.getInt("max_placements");
                this.f12686G = i6;
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.response.m.a();
                    }
                }, 4, (Object) null);
            }
            if (!this.f12685F || i6 > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: h4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.response.m.a(com.braze.models.response.m.this);
                }
            }, 7, (Object) null);
            this.f12685F = false;
            this.f12686G = 0;
        }
    }

    public final void b(JSONObject jSONObject) {
        m mVar;
        boolean z6;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z6 = optJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e6) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.response.m.b();
                    }
                }, 4, (Object) null);
                z6 = false;
            }
            mVar.f12696j = z6;
        }
    }

    public final void c(JSONObject jSONObject) {
        m mVar;
        boolean z6;
        JSONObject optJSONObject = jSONObject.optJSONObject("dust");
        if (optJSONObject != null) {
            try {
                z6 = optJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e6) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.response.m.c();
                    }
                }, 4, (Object) null);
                z6 = false;
            }
            mVar.f12706t = z6;
        }
    }

    public final void d(JSONObject jSONObject) {
        m mVar;
        boolean z6;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z6 = optJSONObject.getBoolean("enabled");
                mVar = this;
            } catch (JSONException e6) {
                mVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mVar, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.response.m.d();
                    }
                }, 4, (Object) null);
                z6 = false;
            }
            mVar.f12698l = z6;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.f12699m = optJSONObject.optBoolean("enabled");
                this.f12700n = optJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.response.m.e();
                    }
                }, 4, (Object) null);
                this.f12699m = false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f12687a == mVar.f12687a && Intrinsics.areEqual(this.f12688b, mVar.f12688b) && Intrinsics.areEqual(this.f12689c, mVar.f12689c) && Intrinsics.areEqual(this.f12690d, mVar.f12690d) && this.f12691e == mVar.f12691e && this.f12692f == mVar.f12692f && this.f12693g == mVar.f12693g && this.f12694h == mVar.f12694h && this.f12695i == mVar.f12695i && this.f12696j == mVar.f12696j && this.f12697k == mVar.f12697k && this.f12698l == mVar.f12698l && this.f12699m == mVar.f12699m && this.f12700n == mVar.f12700n && this.f12701o == mVar.f12701o && this.f12702p == mVar.f12702p && this.f12703q == mVar.f12703q && this.f12704r == mVar.f12704r && this.f12705s == mVar.f12705s && this.f12706t == mVar.f12706t && this.f12707u == mVar.f12707u && this.f12708v == mVar.f12708v && this.f12709w == mVar.f12709w && this.f12710x == mVar.f12710x && this.f12711y == mVar.f12711y && Intrinsics.areEqual(this.f12712z, mVar.f12712z) && Intrinsics.areEqual(this.f12680A, mVar.f12680A) && this.f12681B == mVar.f12681B && this.f12682C == mVar.f12682C && this.f12683D == mVar.f12683D && Intrinsics.areEqual(this.f12684E, mVar.f12684E) && this.f12685F == mVar.f12685F && this.f12686G == mVar.f12686G;
    }

    public final void f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.f12691e = optJSONObject.getInt("min_time_since_last_request");
                this.f12692f = optJSONObject.getInt("min_time_since_last_report");
                this.f12695i = optJSONObject.getBoolean("enabled");
                this.f12694h = true;
                this.f12693g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.response.m.f();
                    }
                }, 4, (Object) null);
                this.f12691e = -1;
                this.f12692f = -1;
                this.f12693g = -1;
                this.f12695i = false;
                this.f12694h = false;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (optJSONObject != null) {
                if (!optJSONObject.getBoolean("enabled")) {
                    this.f12703q = false;
                    return;
                }
                int i6 = optJSONObject.getInt("refill_rate");
                int i7 = optJSONObject.getInt("capacity");
                if (i7 < 10) {
                    this.f12703q = false;
                } else if (i6 > 0) {
                    this.f12703q = true;
                    this.f12705s = i7;
                    this.f12704r = i6;
                    g(optJSONObject);
                }
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.response.m.g();
                }
            }, 4, (Object) null);
            this.f12703q = false;
            this.f12684E = null;
        }
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f12687a) * 31;
        Set set = this.f12688b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f12689c;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f12690d;
        int hashCode4 = (Boolean.hashCode(this.f12711y) + ((Integer.hashCode(this.f12710x) + ((Integer.hashCode(this.f12709w) + ((Integer.hashCode(this.f12708v) + ((Long.hashCode(this.f12707u) + ((Boolean.hashCode(this.f12706t) + ((Integer.hashCode(this.f12705s) + ((Integer.hashCode(this.f12704r) + ((Boolean.hashCode(this.f12703q) + ((Long.hashCode(this.f12702p) + ((Boolean.hashCode(this.f12701o) + ((Integer.hashCode(this.f12700n) + ((Boolean.hashCode(this.f12699m) + ((Boolean.hashCode(this.f12698l) + ((Long.hashCode(this.f12697k) + ((Boolean.hashCode(this.f12696j) + ((Boolean.hashCode(this.f12695i) + ((Boolean.hashCode(this.f12694h) + ((Integer.hashCode(this.f12693g) + ((Integer.hashCode(this.f12692f) + ((Integer.hashCode(this.f12691e) + ((hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f12712z;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l6 = this.f12680A;
        int hashCode6 = (Long.hashCode(this.f12683D) + ((Long.hashCode(this.f12682C) + ((Long.hashCode(this.f12681B) + ((hashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.f12684E;
        return Integer.hashCode(this.f12686G) + ((Boolean.hashCode(this.f12685F) + ((hashCode6 + (map != null ? map.hashCode() : 0)) * 31)) * 31);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("push_max");
        if (optJSONObject != null) {
            try {
                this.f12701o = optJSONObject.optBoolean("enabled");
                this.f12702p = optJSONObject.optLong("redeliver_buffer", 86400L);
                this.f12707u = optJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.response.m.h();
                    }
                }, 4, (Object) null);
                this.f12701o = false;
                this.f12702p = 0L;
                this.f12707u = -1L;
            }
        }
    }

    public final void j(JSONObject jSONObject) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (optJSONObject == null) {
            return;
        }
        try {
            o0 a6 = s0.f12509k.a(optJSONObject, false);
            if (a6.f12481a) {
                this.f12711y = true;
                this.f12712z = a6.f12483c;
                Long l6 = a6.f12482b;
                if (l6 != null) {
                    this.f12680A = Long.valueOf(l6.longValue());
                }
                this.f12681B = a6.f12484d;
                this.f12682C = a6.f12485e;
                this.f12683D = a6.f12486f;
            }
            String str = this.f12712z;
            if (str != null && !StringsKt.isBlank(str) && this.f12681B > 0 && this.f12682C > 0 && this.f12683D > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: h4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.response.m.k(optJSONObject);
                }
            }, 7, (Object) null);
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: h4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.response.m.i();
                }
            }, 4, (Object) null);
        }
        this.f12711y = false;
        this.f12712z = null;
        this.f12681B = 0L;
        this.f12682C = 0L;
        this.f12683D = 0L;
    }

    public final String toString() {
        return "ServerConfig(configTime=" + this.f12687a + ", blocklistedEvents=" + this.f12688b + ", blocklistedAttributes=" + this.f12689c + ", blocklistedPurchases=" + this.f12690d + ", minTimeSinceLastRequest=" + this.f12691e + ", minTimeSinceLastReport=" + this.f12692f + ", maxNumToRegister=" + this.f12693g + ", geofencesEnabledSet=" + this.f12694h + ", geofencesEnabled=" + this.f12695i + ", isContentCardsFeatureEnabled=" + this.f12696j + ", messagingSessionTimeout=" + this.f12697k + ", ephemeralEventsEnabled=" + this.f12698l + ", featureFlagsEnabled=" + this.f12699m + ", featureFlagsRefreshRateLimit=" + this.f12700n + ", pushMaxEnabled=" + this.f12701o + ", pushMaxRedeliverBuffer=" + this.f12702p + ", globalRequestRateLimitEnabled=" + this.f12703q + ", globalRequestRateLimitBucketRefillRate=" + this.f12704r + ", globalRequestRateLimitBucketCapacity=" + this.f12705s + ", isDustFeatureEnabled=" + this.f12706t + ", pushMaxRedeliverDedupeBuffer=" + this.f12707u + ", defaultBackoffMinSleepMs=" + this.f12708v + ", defaultBackoffMaxSleepMs=" + this.f12709w + ", defaultBackoffScaleFactor=" + this.f12710x + ", sdkDebuggerEnabled=" + this.f12711y + ", sdkDebuggerAuthCode=" + this.f12712z + ", sdkDebuggerExpirationTime=" + this.f12680A + ", sdkDebuggerFlushIntervalBytes=" + this.f12681B + ", sdkDebuggerFlushIntervalSeconds=" + this.f12682C + ", sdkDebuggerMaxPayloadBytes=" + this.f12683D + ", globalRequestRateLimitOverrides=" + this.f12684E + ", bannersEnabled=" + this.f12685F + ", maxBannerPlacements=" + this.f12686G + ')';
    }

    public final void g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (optJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String destinationSuffix = keys.next();
                com.braze.requests.l lVar = com.braze.requests.m.f12829b;
                Intrinsics.checkNotNull(destinationSuffix);
                lVar.getClass();
                Intrinsics.checkNotNullParameter(destinationSuffix, "destinationSuffix");
                com.braze.requests.m mVar = (com.braze.requests.m) com.braze.requests.m.f12830c.get(destinationSuffix);
                if (mVar != null) {
                    JSONObject jSONObject2 = optJSONObject.getJSONObject(destinationSuffix);
                    int i6 = jSONObject2.getInt("capacity");
                    int i7 = jSONObject2.getInt("refill_rate");
                    if (i6 > 0 && i7 > 0) {
                        linkedHashMap.put(mVar, new j(i6, i7));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.f12684E = linkedHashMap;
        }
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String a(m mVar) {
        return "Banners enabled but maxBannerPlacement is " + mVar.f12686G + ". Not enabling banners.";
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator it;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                it = CollectionsKt.emptyList().iterator();
            } else {
                it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new k(optJSONArray)), new l(optJSONArray)).iterator();
            }
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String f() {
        return "Error getting required geofence fields. Using defaults.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(JSONObject configJson) {
        this();
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        this.f12687a = configJson.optLong(com.amazon.a.a.h.a.f10907b, 0L);
        this.f12697k = configJson.optLong("messaging_session_timeout", -1L);
        this.f12688b = a(configJson, "events_blacklist");
        this.f12689c = a(configJson, "attributes_blacklist");
        this.f12690d = a(configJson, "purchases_blacklist");
        b(configJson);
        f(configJson);
        d(configJson);
        e(configJson);
        i(configJson);
        h(configJson);
        c(configJson);
        JSONObject optJSONObject = configJson.optJSONObject("request_backoff");
        if (optJSONObject != null) {
            this.f12708v = optJSONObject.optInt("min_sleep_duration_ms", this.f12708v);
            this.f12709w = optJSONObject.optInt("max_sleep_duration_ms", this.f12709w);
            this.f12710x = optJSONObject.optInt("scale_factor", this.f12710x);
        }
        j(configJson);
        a(configJson);
    }
}
