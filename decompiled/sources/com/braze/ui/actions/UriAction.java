package com.braze.ui.actions;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.amazon.a.a.o.c.a.b;
import com.appsflyer.AppsFlyerProperties;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0015\u0010\u0012J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u0019\u0010\u0018J7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/braze/ui/actions/UriAction;", "Lcom/braze/ui/actions/IAction;", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "extras", "", "useWebView", "Lcom/braze/enums/Channel;", AppsFlyerProperties.CHANNEL, "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)V", "Landroid/content/Context;", "context", "", "execute", "(Landroid/content/Context;)V", "openUriWithWebViewActivity", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)V", "openUriWithActionView", "openUriWithWebViewActivityFromPush", "openUriWithActionViewFromPush", "Landroid/content/Intent;", "getWebViewActivityIntent", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/Intent;", "getActionViewIntent", "targetIntent", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getIntentArrayWithConfiguredBackStack", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;Lcom/braze/configuration/BrazeConfigurationProvider;)[Landroid/content/Intent;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Z", "getUseWebView", "()Z", "setUseWebView", "(Z)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class UriAction implements IAction {

    @NotNull
    private final Channel channel;

    @Nullable
    private final Bundle extras;

    @NotNull
    private Uri uri;
    private boolean useWebView;

    public UriAction(@NotNull Uri uri, @Nullable Bundle bundle, boolean z6, @NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z6;
        this.channel = channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(UriAction uriAction) {
        return "Not executing local Uri: " + uriAction.uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1(UriAction uriAction) {
        return "Executing BrazeActions uri:\n'" + uriAction.uri + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(UriAction uriAction) {
        return "Executing Uri action from channel " + uriAction.channel + ": " + uriAction.uri + ". UseWebView: " + uriAction.useWebView + ". Extras: " + uriAction.extras;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionViewIntent$lambda$8(ResolveInfo resolveInfo) {
        return "Setting deep link intent package to " + resolveInfo.activityInfo.packageName + b.f11260a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$10(String str) {
        return "Adding custom back stack activity while opening uri from push: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$12(String str) {
        return "Not adding unregistered activity to the back stack while opening uri from push: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$13() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$9() {
        return "Adding main activity intent to back stack while opening uri from push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWebViewActivityIntent$lambda$7(String str) {
        return "Launching custom WebView Activity with class name: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionView$lambda$4(Uri uri, Bundle bundle) {
        return "Failed to handle uri " + uri + " with extras: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionViewFromPush$lambda$6(Uri uri) {
        return "Could not find appropriate activity to open for deep link " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivity$lambda$3() {
        return "BrazeWebViewActivity not opened successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivityFromPush$lambda$5() {
        return "Braze WebView Activity not opened successfully.";
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: w4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$0;
                    execute$lambda$0 = UriAction.execute$lambda$0(UriAction.this);
                    return execute$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: w4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$1;
                    execute$lambda$1 = UriAction.execute$lambda$1(UriAction.this);
                    return execute$lambda$1;
                }
            }, 6, (Object) null);
            brazeActionParser.execute(context, this.uri, this.channel);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: w4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String execute$lambda$2;
                execute$lambda$2 = UriAction.execute$lambda$2(UriAction.this);
                return execute$lambda$2;
            }
        }, 7, (Object) null);
        if (this.useWebView && CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            if (this.channel == Channel.PUSH) {
                openUriWithWebViewActivityFromPush(context, this.uri, this.extras);
                return;
            } else {
                openUriWithWebViewActivity(context, this.uri, this.extras);
                return;
            }
        }
        if (this.channel == Channel.PUSH) {
            openUriWithActionViewFromPush(context, this.uri, this.extras);
        } else {
            openUriWithActionView(context, this.uri, this.extras);
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    @NotNull
    public final Intent getActionViewIntent(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (extras != null) {
            intent.putExtras(extras);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        }
        Intrinsics.checkNotNull(queryIntentActivities);
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final ResolveInfo next = it.next();
                if (Intrinsics.areEqual(next.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: w4.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String actionViewIntent$lambda$8;
                            actionViewIntent$lambda$8 = UriAction.getActionViewIntent$lambda$8(next);
                            return actionViewIntent$lambda$8;
                        }
                    }, 7, (Object) null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    @NotNull
    public final Intent[] getIntentArrayWithConfiguredBackStack(@NotNull Context context, @Nullable Bundle extras, @NotNull Intent targetIntent, @NotNull BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetIntent, "targetIntent");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intent intent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            final String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName == null || StringsKt.isBlank(pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: w4.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String intentArrayWithConfiguredBackStack$lambda$9;
                        intentArrayWithConfiguredBackStack$lambda$9 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$9();
                        return intentArrayWithConfiguredBackStack$lambda$9;
                    }
                }, 6, (Object) null);
                intent = UriUtils.getMainActivityIntent(context, extras);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: w4.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String intentArrayWithConfiguredBackStack$lambda$10;
                        intentArrayWithConfiguredBackStack$lambda$10 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$10(pushDeepLinkBackStackActivityClassName);
                        return intentArrayWithConfiguredBackStack$lambda$10;
                    }
                }, 6, (Object) null);
                if (extras != null) {
                    intent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(extras);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: w4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String intentArrayWithConfiguredBackStack$lambda$12;
                        intentArrayWithConfiguredBackStack$lambda$12 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$12(pushDeepLinkBackStackActivityClassName);
                        return intentArrayWithConfiguredBackStack$lambda$12;
                    }
                }, 6, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: w4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String intentArrayWithConfiguredBackStack$lambda$13;
                    intentArrayWithConfiguredBackStack$lambda$13 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$13();
                    return intentArrayWithConfiguredBackStack$lambda$13;
                }
            }, 6, (Object) null);
        }
        if (intent != null) {
            return new Intent[]{intent, targetIntent};
        }
        targetIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
        return new Intent[]{targetIntent};
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    @NotNull
    public final Intent getWebViewActivityIntent(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        final String customHtmlWebViewActivityClassName = BrazeInternal.INSTANCE.getConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName == null || StringsKt.isBlank(customHtmlWebViewActivityClassName) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: w4.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String webViewActivityIntent$lambda$7;
                    webViewActivityIntent$lambda$7 = UriAction.getWebViewActivityIntent$lambda$7(customHtmlWebViewActivityClassName);
                    return webViewActivityIntent$lambda$7;
                }
            }, 7, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            Intrinsics.checkNotNull(intent);
        }
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    public void openUriWithActionView(@NotNull Context context, @NotNull final Uri uri, @Nullable final Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent actionViewIntent = getActionViewIntent(context, uri, extras);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: w4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openUriWithActionView$lambda$4;
                    openUriWithActionView$lambda$4 = UriAction.openUriWithActionView$lambda$4(uri, extras);
                    return openUriWithActionView$lambda$4;
                }
            }, 4, (Object) null);
        }
    }

    public final void openUriWithActionViewFromPush(@NotNull Context context, @NotNull final Uri uri, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getActionViewIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (ActivityNotFoundException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: w4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openUriWithActionViewFromPush$lambda$6;
                    openUriWithActionViewFromPush$lambda$6 = UriAction.openUriWithActionViewFromPush$lambda$6(uri);
                    return openUriWithActionViewFromPush$lambda$6;
                }
            }, 4, (Object) null);
        }
    }

    public final void openUriWithWebViewActivity(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, extras);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: w4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openUriWithWebViewActivity$lambda$3;
                    openUriWithWebViewActivity$lambda$3 = UriAction.openUriWithWebViewActivity$lambda$3();
                    return openUriWithWebViewActivity$lambda$3;
                }
            }, 4, (Object) null);
        }
    }

    public final void openUriWithWebViewActivityFromPush(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getWebViewActivityIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: w4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openUriWithWebViewActivityFromPush$lambda$5;
                    openUriWithWebViewActivityFromPush$lambda$5 = UriAction.openUriWithWebViewActivityFromPush$lambda$5();
                    return openUriWithWebViewActivityFromPush$lambda$5;
                }
            }, 4, (Object) null);
        }
    }
}
