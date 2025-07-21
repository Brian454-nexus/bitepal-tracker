package com.appsflyer.appsflyersdk;

import B9.a;
import G9.j;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J:\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\n*\u00020\r2\u0006\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010\u0013R\u0018\u0010-\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010=¨\u0006B"}, d2 = {"Lcom/appsflyer/appsflyersdk/AppsFlyerPurchaseConnector;", "LB9/a;", "LG9/j$c;", "<init>", "()V", "LG9/j;", "", "method", "", "args", "", "invokeMethodOnUI", "(LG9/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;", "LG9/i;", "call", "LG9/j$d;", "result", "", "configure", "(LG9/i;LG9/j$d;)V", "startObservingTransactions", "(LG9/j$d;)V", "stopObservingTransactions", "Lkotlin/Function1;", "Lcom/appsflyer/appsflyersdk/ConnectorWrapper;", "Lkotlin/ParameterName;", com.amazon.a.a.h.a.f10906a, "connectorWrapper", "exc", "connectorOperation", "(LG9/j$d;Lkotlin/jvm/functions/Function1;)V", "", "", "toMap", "(Ljava/lang/Throwable;)Ljava/util/Map;", "key", "defValue", "getBoolean", "(LG9/i;Ljava/lang/String;Z)Z", "LB9/a$b;", "binding", "onAttachedToEngine", "(LB9/a$b;)V", "onDetachedFromEngine", "onMethodCall", "methodChannel", "LG9/j;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "contextRef", "Ljava/lang/ref/WeakReference;", "Lcom/appsflyer/appsflyersdk/ConnectorWrapper;", "Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "getHandler", "()Landroid/os/Handler;", "handler", "Lcom/appsflyer/appsflyersdk/MappedValidationResultListener;", "arsListener$delegate", "getArsListener", "()Lcom/appsflyer/appsflyersdk/MappedValidationResultListener;", "arsListener", "viapListener$delegate", "getViapListener", "viapListener", "appsflyer_sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppsFlyerPurchaseConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppsFlyerPurchaseConnector.kt\ncom/appsflyer/appsflyersdk/AppsFlyerPurchaseConnector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AppsFlyerPurchaseConnector implements B9.a, j.c {

    @Nullable
    private static ConnectorWrapper connectorWrapper;

    @Nullable
    private static WeakReference<Context> contextRef;

    @Nullable
    private static j methodChannel;

    @NotNull
    public static final AppsFlyerPurchaseConnector INSTANCE = new AppsFlyerPurchaseConnector();

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy handler = LazyKt.lazy(new Function0() { // from class: com.appsflyer.appsflyersdk.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Handler handler_delegate$lambda$0;
            handler_delegate$lambda$0 = AppsFlyerPurchaseConnector.handler_delegate$lambda$0();
            return handler_delegate$lambda$0;
        }
    });

    /* renamed from: arsListener$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy arsListener = LazyKt.lazy(new Function0() { // from class: com.appsflyer.appsflyersdk.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppsFlyerPurchaseConnector$arsListener$2$1 arsListener_delegate$lambda$1;
            arsListener_delegate$lambda$1 = AppsFlyerPurchaseConnector.arsListener_delegate$lambda$1();
            return arsListener_delegate$lambda$1;
        }
    });

    /* renamed from: viapListener$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy viapListener = LazyKt.lazy(new Function0() { // from class: com.appsflyer.appsflyersdk.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppsFlyerPurchaseConnector$viapListener$2$1 viapListener_delegate$lambda$2;
            viapListener_delegate$lambda$2 = AppsFlyerPurchaseConnector.viapListener_delegate$lambda$2();
            return viapListener_delegate$lambda$2;
        }
    });

    private AppsFlyerPurchaseConnector() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.appsflyer.appsflyersdk.AppsFlyerPurchaseConnector$arsListener$2$1] */
    public static final AppsFlyerPurchaseConnector$arsListener$2$1 arsListener_delegate$lambda$1() {
        return new MappedValidationResultListener() { // from class: com.appsflyer.appsflyersdk.AppsFlyerPurchaseConnector$arsListener$2$1
            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public void onFailure(String result, Throwable error) {
                j jVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Map mapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("result", result), TuplesKt.to("error", error != null ? AppsFlyerPurchaseConnector.INSTANCE.toMap(error) : null)});
                jVar = AppsFlyerPurchaseConnector.methodChannel;
                if (jVar != null) {
                    AppsFlyerPurchaseConnector.INSTANCE.invokeMethodOnUI(jVar, "SubscriptionPurchaseValidationResultListener:onFailure", mapOf);
                }
            }

            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public void onResponse(Map<String, ? extends Object> p02) {
                j jVar;
                jVar = AppsFlyerPurchaseConnector.methodChannel;
                if (jVar != null) {
                    AppsFlyerPurchaseConnector.INSTANCE.invokeMethodOnUI(jVar, "SubscriptionPurchaseValidationResultListener:onResponse", p02);
                }
            }
        };
    }

    private final void configure(G9.i call, j.d result) {
        Context context;
        if (connectorWrapper != null) {
            result.b("401", "Connector already configured", (Object) null);
            return;
        }
        WeakReference<Context> weakReference = contextRef;
        if (weakReference == null || (context = weakReference.get()) == null) {
            result.b("402", "Missing context. Is plugin attached to engine?", (Object) null);
            return;
        }
        AppsFlyerPurchaseConnector appsFlyerPurchaseConnector = INSTANCE;
        connectorWrapper = new ConnectorWrapper(context, getBoolean$default(appsFlyerPurchaseConnector, call, "logSubscriptions", false, 2, null), getBoolean$default(appsFlyerPurchaseConnector, call, "logInApps", false, 2, null), getBoolean$default(appsFlyerPurchaseConnector, call, "sandbox", false, 2, null), appsFlyerPurchaseConnector.getArsListener(), appsFlyerPurchaseConnector.getViapListener());
        result.a((Object) null);
    }

    private final void connectorOperation(j.d result, Function1<? super ConnectorWrapper, Unit> exc) {
        ConnectorWrapper connectorWrapper2 = connectorWrapper;
        if (connectorWrapper2 == null) {
            result.b("404", "Connector not configured, did you called `configure` first?", (Object) null);
            return;
        }
        Intrinsics.checkNotNull(connectorWrapper2);
        exc.invoke(connectorWrapper2);
        result.a((Object) null);
    }

    private final MappedValidationResultListener getArsListener() {
        return (MappedValidationResultListener) arsListener.getValue();
    }

    private final boolean getBoolean(G9.i iVar, String str, boolean z6) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Object a6 = iVar.a(str);
            Intrinsics.checkNotNull(a6);
            Boolean bool = (Boolean) a6;
            bool.booleanValue();
            obj = Result.constructor-impl(bool);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean valueOf = Boolean.valueOf(z6);
        if (Result.isFailure-impl(obj)) {
            obj = valueOf;
        }
        return ((Boolean) obj).booleanValue();
    }

    public static /* synthetic */ boolean getBoolean$default(AppsFlyerPurchaseConnector appsFlyerPurchaseConnector, G9.i iVar, String str, boolean z6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return appsFlyerPurchaseConnector.getBoolean(iVar, str, z6);
    }

    private final Handler getHandler() {
        return (Handler) handler.getValue();
    }

    private final MappedValidationResultListener getViapListener() {
        return (MappedValidationResultListener) viapListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean invokeMethodOnUI(final j jVar, final String str, final Object obj) {
        if (jVar != null) {
            return Boolean.valueOf(INSTANCE.getHandler().post(new Runnable() { // from class: com.appsflyer.appsflyersdk.g
                @Override // java.lang.Runnable
                public final void run() {
                    AppsFlyerPurchaseConnector.invokeMethodOnUI$lambda$4$lambda$3(obj, jVar, str);
                }
            }));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeMethodOnUI$lambda$4$lambda$3(Object obj, j it, String method) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(method, "$method");
        if (obj instanceof Map) {
            obj = new JSONObject((Map) obj).toString();
        }
        it.c(method, obj);
    }

    private final void startObservingTransactions(j.d result) {
        connectorOperation(result, new Function1() { // from class: com.appsflyer.appsflyersdk.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit startObservingTransactions$lambda$8;
                startObservingTransactions$lambda$8 = AppsFlyerPurchaseConnector.startObservingTransactions$lambda$8((ConnectorWrapper) obj);
                return startObservingTransactions$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startObservingTransactions$lambda$8(ConnectorWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.startObservingTransactions();
        return Unit.INSTANCE;
    }

    private final void stopObservingTransactions(j.d result) {
        connectorOperation(result, new Function1() { // from class: com.appsflyer.appsflyersdk.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit stopObservingTransactions$lambda$9;
                stopObservingTransactions$lambda$9 = AppsFlyerPurchaseConnector.stopObservingTransactions$lambda$9((ConnectorWrapper) obj);
                return stopObservingTransactions$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopObservingTransactions$lambda$9(ConnectorWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.stopObservingTransactions();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> toMap(Throwable th) {
        Pair pair = TuplesKt.to("type", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName());
        Pair pair2 = TuplesKt.to("message", th.getMessage());
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        Pair pair3 = TuplesKt.to("stacktrace", ArraysKt.joinToString$default(stackTrace, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.appsflyer.appsflyersdk.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence map$lambda$10;
                map$lambda$10 = AppsFlyerPurchaseConnector.toMap$lambda$10((StackTraceElement) obj);
                return map$lambda$10;
            }
        }, 30, (Object) null));
        Throwable cause = th.getCause();
        return MapsKt.mapOf(new Pair[]{pair, pair2, pair3, TuplesKt.to("cause", cause != null ? toMap(cause) : null)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toMap$lambda$10(StackTraceElement stackTraceElement) {
        String stackTraceElement2 = stackTraceElement.toString();
        Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "toString(...)");
        return stackTraceElement2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.appsflyer.appsflyersdk.AppsFlyerPurchaseConnector$viapListener$2$1] */
    public static final AppsFlyerPurchaseConnector$viapListener$2$1 viapListener_delegate$lambda$2() {
        return new MappedValidationResultListener() { // from class: com.appsflyer.appsflyersdk.AppsFlyerPurchaseConnector$viapListener$2$1
            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public void onFailure(String result, Throwable error) {
                j jVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Map mapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("result", result), TuplesKt.to("error", error != null ? AppsFlyerPurchaseConnector.INSTANCE.toMap(error) : null)});
                jVar = AppsFlyerPurchaseConnector.methodChannel;
                if (jVar != null) {
                    AppsFlyerPurchaseConnector.INSTANCE.invokeMethodOnUI(jVar, "InAppValidationResultListener:onFailure", mapOf);
                }
            }

            @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
            public void onResponse(Map<String, ? extends Object> p02) {
                j jVar;
                jVar = AppsFlyerPurchaseConnector.methodChannel;
                if (jVar != null) {
                    AppsFlyerPurchaseConnector.INSTANCE.invokeMethodOnUI(jVar, "InAppValidationResultListener:onResponse", p02);
                }
            }
        };
    }

    public void onAttachedToEngine(@NotNull a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        j jVar = new j(binding.b(), "af-purchase-connector");
        jVar.e(INSTANCE);
        methodChannel = jVar;
        contextRef = new WeakReference<>(binding.a());
    }

    public void onDetachedFromEngine(@NotNull a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    public void onMethodCall(@NotNull G9.i call, @NotNull j.d result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -804429082) {
                if (hashCode != -130944116) {
                    if (hashCode == 1523790828 && str.equals("stopObservingTransactions")) {
                        stopObservingTransactions(result);
                        return;
                    }
                } else if (str.equals("startObservingTransactions")) {
                    startObservingTransactions(result);
                    return;
                }
            } else if (str.equals("configure")) {
                configure(call, result);
                return;
            }
        }
        result.c();
    }
}
