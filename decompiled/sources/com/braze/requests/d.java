package com.braze.requests;

import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.h0;
import com.braze.managers.o0;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.framework.h f12749a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.communication.e f12750b;

    /* renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f12751c;

    /* renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f12752d;

    /* renamed from: e, reason: collision with root package name */
    public final com.braze.storage.x f12753e;

    /* renamed from: f, reason: collision with root package name */
    public final com.braze.managers.m f12754f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f12755g;

    /* renamed from: h, reason: collision with root package name */
    public final com.braze.storage.p f12756h;

    /* renamed from: i, reason: collision with root package name */
    public final com.braze.requests.util.a f12757i;

    /* renamed from: j, reason: collision with root package name */
    public final com.braze.requests.framework.c f12758j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f12759k;

    /* renamed from: l, reason: collision with root package name */
    public final n f12760l;

    public d(com.braze.requests.framework.h requestInfo, com.braze.communication.e httpConnector, com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.storage.x feedStorageProvider, com.braze.managers.m brazeManager, e0 serverConfigStorage, com.braze.storage.p contentCardsStorage, com.braze.requests.util.a endpointMetadataProvider, com.braze.requests.framework.c requestDispatchCallback) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(serverConfigStorage, "serverConfigStorage");
        Intrinsics.checkNotNullParameter(contentCardsStorage, "contentCardsStorage");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        this.f12749a = requestInfo;
        this.f12750b = httpConnector;
        this.f12751c = internalPublisher;
        this.f12752d = externalPublisher;
        this.f12753e = feedStorageProvider;
        this.f12754f = brazeManager;
        this.f12755g = serverConfigStorage;
        this.f12756h = contentCardsStorage;
        this.f12757i = endpointMetadataProvider;
        this.f12758j = requestDispatchCallback;
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put("Content-Type", "application/json");
        this.f12759k = hashMap;
        n nVar = requestInfo.f12805a;
        this.f12760l = nVar;
        nVar.a(hashMap);
    }

    public static final String a(String str) {
        return com.braze.j.a("Processing server response payload for user with id: ", str);
    }

    public static final String b() {
        return "Experienced network communication exception processing API response. Sending network error event.";
    }

    public static final String d() {
        return "Api response was null, failing task.";
    }

    public final void c() {
        com.braze.models.response.a a6 = a();
        if (!(a6 instanceof com.braze.models.response.g)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: k4.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.d();
                }
            }, 6, (Object) null);
            com.braze.models.response.f fVar = new com.braze.models.response.f(this.f12760l, a6.f12643a);
            this.f12760l.a(this.f12751c, this.f12752d, fVar);
            ((com.braze.events.d) this.f12751c).b(new com.braze.events.internal.f(this.f12760l), com.braze.events.internal.f.class);
            a(fVar);
            this.f12758j.a(a6);
            return;
        }
        com.braze.models.response.g apiResponse = (com.braze.models.response.g) a6;
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        com.braze.models.response.d dVar = apiResponse.f12656d;
        if (dVar == null) {
            this.f12757i.c(((b) this.f12760l).e());
            this.f12760l.a(this.f12751c, this.f12752d, apiResponse);
            this.f12758j.a(apiResponse);
        } else {
            a(dVar);
            this.f12760l.a(this.f12751c, this.f12752d, apiResponse.f12656d);
            this.f12758j.a((com.braze.models.response.a) apiResponse);
        }
        a(apiResponse);
        if (apiResponse.f12656d instanceof com.braze.models.response.h) {
            ((com.braze.events.d) this.f12751c).b(new com.braze.events.internal.f(this.f12760l), com.braze.events.internal.f.class);
        } else {
            ((com.braze.events.d) this.f12751c).b(new com.braze.events.internal.g(this.f12760l), com.braze.events.internal.g.class);
        }
    }

    public static final String b(com.braze.models.response.d dVar) {
        return "Received server error from request: " + dVar.a();
    }

    public final com.braze.models.response.a a() {
        ((b) this.f12760l).f12743d = Long.valueOf(DateTimeUtils.nowInSeconds());
        final com.braze.requests.util.c e6 = ((b) this.f12760l).e();
        JSONObject b6 = this.f12760l.b();
        if (b6 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: k4.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.util.c.this);
                }
            }, 6, (Object) null);
            return new com.braze.models.response.n(this.f12760l, new com.braze.communication.d(-1, (Map) null, 6));
        }
        this.f12759k.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(this.f12757i.a(e6)));
        this.f12759k.put("X-Braze-Req-Attempt", String.valueOf(this.f12757i.b(e6)));
        this.f12759k.put("X-Braze-Req-Tokens-Remaining", String.valueOf(this.f12749a.f12809e));
        Integer num = this.f12749a.f12810f;
        if (num != null) {
            this.f12759k.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
        }
        int i6 = com.braze.communication.c.f12072a;
        com.braze.communication.d a6 = this.f12750b.a(e6, this.f12759k, b6);
        if (a6.f12075c != null) {
            return new com.braze.models.response.g(this.f12760l, a6, this.f12754f);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) null, false, new Function0() { // from class: k4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.d.b();
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.f12752d).b(new BrazeNetworkFailureEvent(this.f12760l, a6), BrazeNetworkFailureEvent.class);
        return new com.braze.models.response.n(this.f12760l, a6);
    }

    public final void b(final ArrayList arrayList) {
        if (arrayList != null) {
            c.a(arrayList, new Function0() { // from class: k4.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.b(com.braze.requests.d.this, arrayList);
                }
            });
        }
    }

    public static final Unit b(d dVar, List list) {
        ((com.braze.events.d) dVar.f12751c).b(new h0(list), h0.class);
        return Unit.INSTANCE;
    }

    public static final String a(com.braze.requests.util.c cVar) {
        return "Could not parse request parameters for POST request to " + cVar + ", cancelling request.";
    }

    public final void a(com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        final String str = this.f12754f.f12452b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: k4.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.d.a(str);
            }
        }, 6, (Object) null);
        a(apiResponse.f12665m, str);
        a(apiResponse.f12658f, str);
        a(apiResponse.f12661i);
        b(apiResponse.f12660h);
        a(apiResponse.f12662j);
        a(apiResponse.f12663k);
        a(apiResponse.f12659g, str);
        String str2 = apiResponse.f12664l;
        if (str2 != null) {
            ((com.braze.events.d) this.f12751c).b(new com.braze.events.internal.h(str2), com.braze.events.internal.h.class);
        }
        a(apiResponse.f12667o);
        o0 o0Var = apiResponse.f12668p;
        if (o0Var != null) {
            ((com.braze.events.d) this.f12751c).b(new com.braze.events.internal.t(o0Var), com.braze.events.internal.t.class);
        }
    }

    public final void a(final com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: k4.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.d.b(com.braze.models.response.d.this);
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.f12751c).b(new com.braze.events.internal.x(responseError), com.braze.events.internal.x.class);
        n nVar = this.f12760l;
        if (nVar instanceof x) {
            com.braze.events.e eVar = this.f12752d;
            String a6 = ((x) nVar).f12885k.a();
            Intrinsics.checkNotNullExpressionValue(a6, "getTriggerEventType(...)");
            ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(a6), NoMatchingTriggerEvent.class);
        }
    }

    public final void a(final JSONArray jSONArray, final String str) {
        if (jSONArray != null) {
            c.a(jSONArray, new Function0() { // from class: k4.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.d.this, jSONArray, str);
                }
            });
        }
    }

    public static final Unit a(d dVar, JSONArray jSONArray, String str) {
        FeedUpdatedEvent a6 = dVar.f12753e.a(jSONArray, str);
        if (a6 != null) {
            ((com.braze.events.d) dVar.f12752d).b(a6, FeedUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    public final void a(final com.braze.models.response.c cVar, final String str) {
        if (cVar != null) {
            c.a(cVar, new Function0() { // from class: k4.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.d.this, cVar, str);
                }
            });
        }
    }

    public static final Unit a(d dVar, com.braze.models.response.c cVar, String str) {
        ContentCardsUpdatedEvent a6 = dVar.f12756h.a(cVar, str);
        if (a6 != null) {
            ((com.braze.events.d) dVar.f12752d).b(a6, ContentCardsUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    public final void a(final com.braze.models.response.m mVar) {
        if (mVar != null) {
            c.a(mVar, new Function0() { // from class: k4.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.d.this, mVar);
                }
            });
        }
    }

    public static final Unit a(d dVar, com.braze.models.response.m serverConfig) {
        dVar.f12755g.a(serverConfig);
        ((com.braze.events.d) dVar.f12751c).b(new com.braze.events.internal.w(serverConfig), com.braze.events.internal.w.class);
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        o0 o0Var = new o0(serverConfig.f12711y, serverConfig.f12680A, serverConfig.f12712z, serverConfig.f12681B, serverConfig.f12682C, serverConfig.f12683D);
        ((com.braze.events.d) dVar.f12751c).b(new com.braze.events.internal.t(o0Var), com.braze.events.internal.t.class);
        return Unit.INSTANCE;
    }

    public final void a(final ArrayList arrayList) {
        if (arrayList != null) {
            c.a(arrayList, new Function0() { // from class: k4.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.d.this, arrayList);
                }
            });
        }
    }

    public static final Unit a(d dVar, List list) {
        ((com.braze.events.d) dVar.f12751c).b(new com.braze.events.internal.l(list), com.braze.events.internal.l.class);
        return Unit.INSTANCE;
    }

    public final void a(final JSONArray jSONArray) {
        if (jSONArray != null) {
            c.a(jSONArray, new Function0() { // from class: k4.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.d.this, jSONArray);
                }
            });
        }
    }

    public static final Unit a(d dVar, JSONArray jSONArray) {
        ((com.braze.events.d) dVar.f12751c).b(new com.braze.events.internal.i(jSONArray), com.braze.events.internal.i.class);
        return Unit.INSTANCE;
    }

    public final void a(final JSONObject jSONObject) {
        if (jSONObject != null) {
            c.a(jSONObject, new Function0() { // from class: k4.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.d.this, jSONObject);
                }
            });
        }
    }

    public static final Unit a(d dVar, JSONObject jSONObject) {
        ((com.braze.events.d) dVar.f12751c).b(new com.braze.events.internal.a(jSONObject), com.braze.events.internal.a.class);
        return Unit.INSTANCE;
    }

    public final void a(final InAppMessageBase inAppMessageBase, final String str) {
        if (inAppMessageBase != null) {
            c.a(inAppMessageBase, new Function0() { // from class: k4.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.d.a(com.braze.requests.d.this, inAppMessageBase, str);
                }
            });
        }
    }

    public static final Unit a(d dVar, IInAppMessage iInAppMessage, String str) {
        n nVar = dVar.f12760l;
        if (nVar instanceof x) {
            iInAppMessage.setExpirationTimestamp(((x) nVar).f12889o);
            com.braze.events.e eVar = dVar.f12751c;
            x xVar = (x) dVar.f12760l;
            ((com.braze.events.d) eVar).b(new com.braze.events.internal.m(xVar.f12885k, xVar.f12890p, iInAppMessage, str), com.braze.events.internal.m.class);
        }
        return Unit.INSTANCE;
    }
}
