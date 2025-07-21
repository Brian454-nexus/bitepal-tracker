package com.braze.requests;

import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b extends s implements n {

    /* renamed from: b, reason: collision with root package name */
    public String f12741b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f12742c;

    /* renamed from: d, reason: collision with root package name */
    public Long f12743d;

    /* renamed from: e, reason: collision with root package name */
    public String f12744e;

    /* renamed from: f, reason: collision with root package name */
    public String f12745f;

    /* renamed from: g, reason: collision with root package name */
    public String f12746g;

    /* renamed from: h, reason: collision with root package name */
    public com.braze.models.outgoing.h f12747h;

    /* renamed from: i, reason: collision with root package name */
    public String f12748i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.braze.requests.util.c requestTarget, String str, e0 serverConfigStorageProvider) {
        super(requestTarget);
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f12741b = str;
        this.f12742c = serverConfigStorageProvider;
    }

    public static final String a(String str) {
        return com.braze.j.a("Error occurred while executing Braze request: ", str);
    }

    public static final String c(b bVar) {
        return bVar + " for " + bVar.c() + " executed successfully.";
    }

    public static final String d() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    public static final String f() {
        return "******************************************************************";
    }

    public static final String g() {
        return "******************************************************************";
    }

    public static final String h() {
        return "**                        !! WARNING !!                         **";
    }

    public static final String i() {
        return "**  The current API key/endpoint combination is invalid. This   **";
    }

    public static final String j() {
        return "** is potentially an integration error. Please ensure that your **";
    }

    public static final String k() {
        return "**     API key AND custom endpoint information are correct.     **";
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.braze.models.outgoing.h hVar = this.f12747h;
            if (hVar != null && !hVar.isEmpty()) {
                jSONObject.put("device", hVar.getPropertiesJSONObject());
            }
            String str = this.f12744e;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l6 = this.f12743d;
            if (l6 != null) {
                jSONObject.put(com.amazon.a.a.h.a.f10907b, l6);
            }
            String str2 = this.f12745f;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.f12746g;
            if (str3 != null) {
                jSONObject.put("sdk_version", str3);
            }
            return jSONObject;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: k4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final com.braze.requests.util.c e() {
        return new com.braze.requests.util.c(Braze.INSTANCE.getApiEndpoint(this.f12852a.f12873b));
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(b()) + "\nto target: " + e();
    }

    @Override // com.braze.requests.o
    public void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        com.braze.models.response.i iVar = apiResponse.f12657e;
        if (iVar != null) {
            ((com.braze.events.d) externalPublisher).b(new BrazeSdkAuthenticationErrorEvent(new com.braze.models.response.h(iVar.f12673a, iVar.f12674b, iVar.f12675c, null)), BrazeSdkAuthenticationErrorEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c() == m.f12841n, new Function0() { // from class: k4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.b.c(com.braze.requests.b.this);
            }
        }, 3, (Object) null);
    }

    @Override // com.braze.requests.o
    public void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        final String a6 = responseError.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.b.a(a6);
            }
        }, 6, (Object) null);
        if (responseError instanceof com.braze.models.response.e) {
            ((com.braze.events.d) internalPublisher).b(responseError, com.braze.models.response.e.class);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.g();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.h();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.i();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.j();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.k();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.b(com.braze.requests.b.this);
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.a(com.braze.requests.b.this);
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: k4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.b.f();
                }
            }, 6, (Object) null);
        }
        if (responseError instanceof com.braze.models.response.h) {
            ((com.braze.events.d) externalPublisher).b(new BrazeSdkAuthenticationErrorEvent((com.braze.models.response.h) responseError), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    public static final String b(b bVar) {
        return ">> API key    : " + bVar.f12745f;
    }

    public static final String a(b bVar) {
        return ">> Request Uri: " + bVar.e();
    }

    @Override // com.braze.requests.o
    public void a(com.braze.events.d internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        internalPublisher.b(new com.braze.events.internal.r(this), com.braze.events.internal.r.class);
    }

    @Override // com.braze.requests.o
    public void a(com.braze.events.e internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.q(this), com.braze.events.internal.q.class);
    }

    public void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        existingHeaders.put("X-Braze-Api-Key", this.f12745f);
        String str = this.f12748i;
        if (str == null || str.length() == 0) {
            return;
        }
        existingHeaders.put("X-Braze-Auth-Signature", this.f12748i);
    }
}
