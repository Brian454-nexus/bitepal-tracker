package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.managers.o0;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import pa.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f12906f = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: g, reason: collision with root package name */
    public static final int f12907g = (int) TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f12908a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12909b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f12910c;

    /* renamed from: d, reason: collision with root package name */
    public final pa.a f12911d;

    /* renamed from: e, reason: collision with root package name */
    public com.braze.models.response.m f12912e;

    public e0(Context context, String apiKey, com.braze.events.d internalEventPublisher) {
        e0 e0Var;
        Map w6;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        this.f12908a = internalEventPublisher;
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.server_config.".concat(apiKey), 0);
        this.f12909b = sharedPreferences;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f12910c = reentrantLock;
        this.f12911d = pa.c.b(false, 1, (Object) null);
        final String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        final String str = "36.0.0";
        if (Intrinsics.areEqual("36.0.0", string)) {
            e0Var = this;
        } else {
            e0Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e0Var, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.e0.a(string, str);
                }
            }, 6, (Object) null);
            sharedPreferences.edit().putLong("config_time", 0L).putString("last_accessed_sdk_version", "36.0.0").apply();
        }
        com.braze.models.response.m mVar = new com.braze.models.response.m();
        mVar.f12689c = e();
        mVar.f12688b = f();
        mVar.f12690d = g();
        mVar.f12687a = i();
        mVar.f12697k = r();
        mVar.f12691e = t();
        mVar.f12692f = s();
        mVar.f12693g = q();
        mVar.f12695i = H();
        mVar.f12694h = I();
        mVar.f12696j = D();
        mVar.f12698l = F();
        mVar.f12699m = G();
        mVar.f12700n = m();
        mVar.f12701o = K();
        mVar.f12702p = u();
        mVar.f12706t = E();
        mVar.f12703q = J();
        mVar.f12704r = o();
        mVar.f12705s = n();
        mVar.f12707u = v();
        mVar.f12710x = l();
        mVar.f12708v = k();
        mVar.f12709w = j();
        mVar.f12711y = L();
        mVar.f12712z = y();
        mVar.f12681B = A();
        mVar.f12682C = B();
        mVar.f12683D = C();
        mVar.f12680A = Long.valueOf(z());
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar2 = e0Var.f12912e;
            try {
                if (mVar2 != null) {
                    w6 = mVar2.f12684E;
                    if (w6 == null) {
                    }
                    reentrantLock.unlock();
                    mVar.f12684E = w6;
                    mVar.f12685F = d();
                    mVar.f12686G = p();
                    reentrantLock.lock();
                    e0Var.f12912e = mVar;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                e0Var.f12912e = mVar;
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
                reentrantLock.unlock();
            }
            w6 = w();
            reentrantLock.unlock();
            mVar.f12684E = w6;
            mVar.f12685F = d();
            mVar.f12686G = p();
            reentrantLock.lock();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final String N() {
        return "Attempting to unlock server config info";
    }

    public static final String O() {
        return "Unlocking config info lock.";
    }

    public static final String P() {
        return "Could not persist server config to shared preferences.";
    }

    public static final String Q() {
        return "Could not persist server config to shared preferences.";
    }

    public static final String R() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String a(String str, String str2) {
        return "Detected SDK update from '" + str + "' -> '" + str2 + "'. Clearing config update time.";
    }

    public static final String b(com.braze.models.response.m mVar) {
        return "Finishing updating server config to " + mVar;
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning null.";
    }

    public static final String x() {
        return "Failed to parse endpoint override from storage";
    }

    public final long A() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = mVar != null ? mVar.f12681B : this.f12909b.getLong("sdk_debugger_flush_interval_bytes", 0L);
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long B() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = mVar != null ? mVar.f12682C : this.f12909b.getLong("sdk_debugger_flush_interval_seconds", 0L);
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long C() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = mVar != null ? mVar.f12683D : this.f12909b.getLong("sdk_debugger_max_payload_bytes", 0L);
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean D() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12696j : this.f12909b.getBoolean("content_cards_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean E() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12706t : this.f12909b.getBoolean("dust_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean F() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12698l : this.f12909b.getBoolean("ephemeral_events_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean G() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12699m : this.f12909b.getBoolean("feature_flags_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean H() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12695i : this.f12909b.getBoolean("geofences_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean I() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12694h : this.f12909b.getBoolean("geofences_enabled_set", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean J() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12703q : this.f12909b.getBoolean("global_req_rate_limit_enabled", true);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean K() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12701o : this.f12909b.getBoolean("push_max_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean L() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12711y : this.f12909b.getBoolean("sdk_debugger_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void M() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.e0.N();
            }
        }, 6, (Object) null);
        if (this.f12911d.c()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.e0.O();
                }
            }, 7, (Object) null);
            a.a.b(this.f12911d, (Object) null, 1, (Object) null);
        }
    }

    public final boolean d() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            boolean z6 = mVar != null ? mVar.f12685F : this.f12909b.getBoolean("banners_enabled", false);
            reentrantLock.unlock();
            return z6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set e() {
        Set a6;
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            if (mVar != null) {
                a6 = mVar.f12689c;
                if (a6 == null) {
                }
                reentrantLock.unlock();
                return a6;
            }
            a6 = a("blacklisted_attributes");
            reentrantLock.unlock();
            return a6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set f() {
        Set a6;
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            if (mVar != null) {
                a6 = mVar.f12688b;
                if (a6 == null) {
                }
                reentrantLock.unlock();
                return a6;
            }
            a6 = a("blacklisted_events");
            reentrantLock.unlock();
            return a6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set g() {
        Set a6;
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            if (mVar != null) {
                a6 = mVar.f12690d;
                if (a6 == null) {
                }
                reentrantLock.unlock();
                return a6;
            }
            a6 = a("blacklisted_purchases");
            reentrantLock.unlock();
            return a6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long i() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = mVar != null ? mVar.f12687a : this.f12909b.getLong("config_time", 0L);
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int j() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12709w : this.f12909b.getInt("default_backoff_max_sleep_duration_ms", f12907g);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int k() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12708v : this.f12909b.getInt("default_backoff_min_sleep_duration__ms", f12906f);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int l() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12710x : this.f12909b.getInt("default_backoff_scale_factor", 3);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int m() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12700n : this.f12909b.getInt("feature_flags_refresh_rate_limit", -1);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int n() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12705s : this.f12909b.getInt("global_req_rate_capacity", 30);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int o() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12704r : this.f12909b.getInt("global_req_rate_refill_rate", 30);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int p() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12686G : this.f12909b.getInt("max_banner_placements", 0);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int q() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12693g : this.f12909b.getInt("geofences_max_num_to_register", -1);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long r() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = mVar != null ? mVar.f12697k : this.f12909b.getLong("messaging_session_timeout", -1L);
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int s() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12692f : this.f12909b.getInt("geofences_min_time_since_last_report", -1);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int t() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            int i6 = mVar != null ? mVar.f12691e : this.f12909b.getInt("geofences_min_time_since_last_request", -1);
            reentrantLock.unlock();
            return i6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long u() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = mVar != null ? mVar.f12702p : this.f12909b.getLong("push_max_redeliver_buffer", 86400L);
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long v() {
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = mVar != null ? mVar.f12707u : this.f12909b.getLong("push_max_redeliver_dedupe_buffer", -1L);
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final LinkedHashMap w() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String string = this.f12909b.getString("global_req_rate_limit_endpoint_overrides", "");
            if (string != null && string.length() != 0) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    com.braze.requests.l lVar = com.braze.requests.m.f12829b;
                    Intrinsics.checkNotNull(next);
                    com.braze.requests.m a6 = lVar.a(next);
                    if (a6 != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(a6, new com.braze.models.response.j(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.e0.x();
                }
            }, 4, (Object) null);
        }
        return linkedHashMap;
    }

    public final String y() {
        String string;
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            if (mVar != null) {
                string = mVar.f12712z;
                if (string == null) {
                }
                reentrantLock.unlock();
                return string;
            }
            string = this.f12909b.getString("sdk_debugger_authorization_code", null);
            reentrantLock.unlock();
            return string;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long z() {
        Long l6;
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            long j6 = (mVar == null || (l6 = mVar.f12680A) == null) ? this.f12909b.getLong("sdk_debugger_expiration_time", -1L) : l6.longValue();
            reentrantLock.unlock();
            return j6;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public final void a(final com.braze.models.response.m serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            this.f12912e = serverConfig;
            Unit unit = Unit.INSTANCE;
            try {
                SharedPreferences.Editor edit = this.f12909b.edit();
                if (serverConfig.f12688b != null) {
                    edit.putString("blacklisted_events", new JSONArray((Collection) serverConfig.f12688b).toString());
                }
                if (serverConfig.f12689c != null) {
                    edit.putString("blacklisted_attributes", new JSONArray((Collection) serverConfig.f12689c).toString());
                }
                if (serverConfig.f12690d != null) {
                    edit.putString("blacklisted_purchases", new JSONArray((Collection) serverConfig.f12690d).toString());
                }
                Map map = serverConfig.f12684E;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (com.braze.requests.m mVar2 : map.keySet()) {
                        com.braze.models.response.j jVar = (com.braze.models.response.j) map.get(mVar2);
                        if (jVar != null) {
                            jSONObject.put(mVar2.name(), new JSONObject().put("refill", jVar.f12677b).put("capacity", jVar.f12676a));
                        }
                    }
                    edit.putString("global_req_rate_limit_endpoint_overrides", jSONObject.toString());
                }
                edit.putLong("config_time", serverConfig.f12687a).putInt("geofences_min_time_since_last_request", serverConfig.f12691e).putInt("geofences_min_time_since_last_report", serverConfig.f12692f).putInt("geofences_max_num_to_register", serverConfig.f12693g).putBoolean("geofences_enabled", serverConfig.f12695i).putBoolean("geofences_enabled_set", serverConfig.f12694h).putLong("messaging_session_timeout", serverConfig.f12697k).putBoolean("ephemeral_events_enabled", serverConfig.f12698l).putBoolean("feature_flags_enabled", serverConfig.f12699m).putInt("feature_flags_refresh_rate_limit", serverConfig.f12700n).putBoolean("content_cards_enabled", serverConfig.f12696j).putBoolean("push_max_enabled", serverConfig.f12701o).putLong("push_max_redeliver_buffer", serverConfig.f12702p).putBoolean("dust_enabled", serverConfig.f12706t).putBoolean("global_req_rate_limit_enabled", serverConfig.f12703q).putInt("global_req_rate_capacity", serverConfig.f12705s).putInt("global_req_rate_refill_rate", serverConfig.f12704r).putLong("push_max_redeliver_dedupe_buffer", serverConfig.f12707u).putInt("default_backoff_scale_factor", serverConfig.f12710x).putInt("default_backoff_min_sleep_duration__ms", serverConfig.f12708v).putInt("default_backoff_max_sleep_duration_ms", serverConfig.f12709w).putBoolean("sdk_debugger_enabled", serverConfig.f12711y).putString("sdk_debugger_authorization_code", serverConfig.f12712z).putLong("sdk_debugger_flush_interval_bytes", serverConfig.f12681B).putLong("sdk_debugger_flush_interval_seconds", serverConfig.f12682C).putLong("sdk_debugger_max_payload_bytes", serverConfig.f12683D).putBoolean("banners_enabled", serverConfig.f12685F).putInt("max_banner_placements", serverConfig.f12686G);
                Long l6 = serverConfig.f12680A;
                if (l6 != null) {
                    edit.putLong("sdk_debugger_expiration_time", l6.longValue());
                }
                edit.apply();
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.e0.Q();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.e0.b(com.braze.models.response.m.this);
                }
            }, 6, (Object) null);
            if (mVar != null) {
                if (serverConfig.f12687a > mVar.f12687a) {
                    this.f12908a.b(new com.braze.events.internal.d(mVar, serverConfig), com.braze.events.internal.d.class);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.storage.e0.R();
                        }
                    }, 7, (Object) null);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(o0 sdkDebugConfig) {
        Intrinsics.checkNotNullParameter(sdkDebugConfig, "sdkDebugConfig");
        ReentrantLock reentrantLock = this.f12910c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f12912e;
            if (mVar != null) {
                mVar.f12711y = sdkDebugConfig.f12481a;
            }
            if (mVar != null) {
                mVar.f12681B = sdkDebugConfig.f12484d;
            }
            if (mVar != null) {
                mVar.f12682C = sdkDebugConfig.f12485e;
            }
            if (mVar != null) {
                mVar.f12683D = sdkDebugConfig.f12486f;
            }
            String str = sdkDebugConfig.f12483c;
            if (str != null && mVar != null) {
                mVar.f12712z = str;
            }
            Long l6 = sdkDebugConfig.f12482b;
            if (l6 != null) {
                long longValue = l6.longValue();
                com.braze.models.response.m mVar2 = this.f12912e;
                if (mVar2 != null) {
                    mVar2.f12680A = Long.valueOf(longValue);
                }
                Unit unit = Unit.INSTANCE;
            }
            reentrantLock.unlock();
            try {
                com.braze.models.response.m mVar3 = this.f12912e;
                if (mVar3 != null) {
                    SharedPreferences.Editor edit = this.f12909b.edit();
                    edit.putBoolean("sdk_debugger_enabled", mVar3.f12711y).putString("sdk_debugger_authorization_code", mVar3.f12712z).putLong("sdk_debugger_flush_interval_bytes", mVar3.f12681B).putLong("sdk_debugger_flush_interval_seconds", mVar3.f12682C).putLong("sdk_debugger_max_payload_bytes", mVar3.f12683D);
                    Long l7 = mVar3.f12680A;
                    if (l7 != null) {
                        edit.putLong("sdk_debugger_expiration_time", l7.longValue());
                    }
                    edit.apply();
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.storage.e0.P();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: o4.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.e0.a(com.braze.storage.e0.this);
                }
            }, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(e0 e0Var) {
        return "Finishing updating server config to " + e0Var.f12912e;
    }

    public final Pair a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: o4.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.e0.b();
            }
        }, 6, (Object) null);
        if (!a.a.a(this.f12911d, (Object) null, 1, (Object) null)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: o4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.e0.c();
                }
            }, 6, (Object) null);
            return null;
        }
        return new Pair(Long.valueOf(i()), Boolean.valueOf(i() <= 0));
    }

    public final HashSet a(String str) {
        try {
            String string = this.f12909b.getString(str, "");
            HashSet hashSet = new HashSet();
            if (string != null && !StringsKt.isBlank(string)) {
                JSONArray jSONArray = new JSONArray(string);
                Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new c0(jSONArray)), new d0(jSONArray)).iterator();
                while (it.hasNext()) {
                    hashSet.add((String) it.next());
                }
            }
            return hashSet;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: o4.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.e0.h();
                }
            }, 4, (Object) null);
            return new HashSet();
        }
    }
}
