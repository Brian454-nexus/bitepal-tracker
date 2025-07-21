package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.support.UriUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getQueryParameters", "", "Landroid/net/Uri;", "getMainActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "Landroid/os/Bundle;", "isActivityRegisteredInManifest", "", "className", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "UriUtils")
@SourceDebugExtension({"SMAP\nUriUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriUtils.kt\ncom/braze/ui/support/UriUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n774#2:88\n865#2,2:89\n*S KotlinDebug\n*F\n+ 1 UriUtils.kt\ncom/braze/ui/support/UriUtils\n*L\n43#1:88\n43#1:89,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class UriUtils {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    @Nullable
    public static final Intent getMainActivityIntent(@NotNull Context context, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v9, types: [T, android.net.Uri] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> getQueryParameters(@org.jetbrains.annotations.NotNull android.net.Uri r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.element = r11
            java.lang.String r11 = r11.getEncodedQuery()
            if (r11 != 0) goto L2a
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r3 = com.braze.ui.support.UriUtils.TAG
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.f12983V
            N4.b r7 = new N4.b
            r7.<init>()
            r8 = 12
            r9 = 0
            r5 = 0
            r6 = 0
            com.braze.support.BrazeLogger.brazelog$default(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r11 = kotlin.collections.MapsKt.emptyMap()
            return r11
        L2a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            T r0 = r1.element     // Catch: java.lang.Exception -> L4e
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Exception -> L4e
            boolean r0 = r0.isOpaque()     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L52
            java.lang.String r0 = "://"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L4e
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch: java.lang.Exception -> L4e
            android.net.Uri$Builder r11 = r0.encodedQuery(r11)     // Catch: java.lang.Exception -> L4e
            android.net.Uri r11 = r11.build()     // Catch: java.lang.Exception -> L4e
            r1.element = r11     // Catch: java.lang.Exception -> L4e
            goto L52
        L4e:
            r0 = move-exception
            r11 = r0
            r6 = r11
            goto Lac
        L52:
            T r11 = r1.element     // Catch: java.lang.Exception -> L4e
            android.net.Uri r11 = (android.net.Uri) r11     // Catch: java.lang.Exception -> L4e
            java.util.Set r11 = r11.getQueryParameterNames()     // Catch: java.lang.Exception -> L4e
            java.lang.String r0 = "getQueryParameterNames(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)     // Catch: java.lang.Exception -> L4e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4e
            r0.<init>()     // Catch: java.lang.Exception -> L4e
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L4e
        L68:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L87
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Exception -> L4e
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L4e
            if (r4 == 0) goto L80
            int r4 = r4.length()     // Catch: java.lang.Exception -> L4e
            if (r4 != 0) goto L7e
            goto L80
        L7e:
            r4 = 0
            goto L81
        L80:
            r4 = 1
        L81:
            if (r4 != 0) goto L68
            r0.add(r3)     // Catch: java.lang.Exception -> L4e
            goto L68
        L87:
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Exception -> L4e
        L8b:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Exception -> L4e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L4e
            T r3 = r1.element     // Catch: java.lang.Exception -> L4e
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Exception -> L4e
            java.lang.String r3 = r3.getQueryParameter(r0)     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L8b
            int r4 = r3.length()     // Catch: java.lang.Exception -> L4e
            if (r4 != 0) goto La8
            goto L8b
        La8:
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L4e
            goto L8b
        Lac:
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r4 = com.braze.ui.support.UriUtils.TAG
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.f12981E
            N4.c r8 = new N4.c
            r8.<init>()
            r9 = 8
            r10 = 0
            r7 = 0
            com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9, r10)
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.support.UriUtils.getQueryParameters(android.net.Uri):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$0(Ref.ObjectRef objectRef) {
        return "Encoded query is null for Uri: " + objectRef.element + " Returning empty map for query parameters";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$2(Ref.ObjectRef objectRef) {
        return "Failed to map the query parameters of Uri: " + objectRef.element;
    }

    public static final boolean isActivityRegisteredInManifest(@NotNull Context context, @NotNull final String className) {
        PackageManager.ComponentInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            if (Build.VERSION.SDK_INT < 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, className), 0);
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, className);
            of = PackageManager.ComponentInfoFlags.of(0L);
            packageManager.getActivityInfo(componentName, of);
            return true;
        } catch (PackageManager.NameNotFoundException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isActivityRegisteredInManifest$lambda$3;
                    isActivityRegisteredInManifest$lambda$3 = UriUtils.isActivityRegisteredInManifest$lambda$3(className);
                    return isActivityRegisteredInManifest$lambda$3;
                }
            }, 8, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isActivityRegisteredInManifest$lambda$3(String str) {
        return "Could not find activity info for class with name: " + str;
    }
}
