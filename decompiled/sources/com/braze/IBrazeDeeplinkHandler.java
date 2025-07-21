package com.braze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J,\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J*\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lcom/braze/IBrazeDeeplinkHandler;", "", "gotoNewsFeed", "", "context", "Landroid/content/Context;", "newsfeedAction", "Lcom/braze/ui/actions/NewsfeedAction;", "gotoUri", "uriAction", "Lcom/braze/ui/actions/UriAction;", "getIntentFlags", "", "intentFlagPurpose", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "createUriActionFromUrlString", "url", "", "extras", "Landroid/os/Bundle;", "openInWebView", "", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "createUriActionFromUri", "uri", "Landroid/net/Uri;", "IntentFlagPurpose", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface IBrazeDeeplinkHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "", "<init>", "(Ljava/lang/String;I)V", "NOTIFICATION_ACTION_WITH_DEEPLINK", "NOTIFICATION_PUSH_STORY_PAGE_CLICK", "URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY", "URI_ACTION_OPEN_WITH_ACTION_VIEW", "URI_ACTION_BACK_STACK_GET_ROOT_INTENT", "URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT", "URI_UTILS_GET_MAIN_ACTIVITY_INTENT", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class IntentFlagPurpose {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IntentFlagPurpose[] $VALUES;
        public static final IntentFlagPurpose NOTIFICATION_ACTION_WITH_DEEPLINK = new IntentFlagPurpose("NOTIFICATION_ACTION_WITH_DEEPLINK", 0);
        public static final IntentFlagPurpose NOTIFICATION_PUSH_STORY_PAGE_CLICK = new IntentFlagPurpose("NOTIFICATION_PUSH_STORY_PAGE_CLICK", 1);
        public static final IntentFlagPurpose URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY = new IntentFlagPurpose("URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY", 2);
        public static final IntentFlagPurpose URI_ACTION_OPEN_WITH_ACTION_VIEW = new IntentFlagPurpose("URI_ACTION_OPEN_WITH_ACTION_VIEW", 3);
        public static final IntentFlagPurpose URI_ACTION_BACK_STACK_GET_ROOT_INTENT = new IntentFlagPurpose("URI_ACTION_BACK_STACK_GET_ROOT_INTENT", 4);
        public static final IntentFlagPurpose URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT = new IntentFlagPurpose("URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT", 5);
        public static final IntentFlagPurpose URI_UTILS_GET_MAIN_ACTIVITY_INTENT = new IntentFlagPurpose("URI_UTILS_GET_MAIN_ACTIVITY_INTENT", 6);

        private static final /* synthetic */ IntentFlagPurpose[] $values() {
            return new IntentFlagPurpose[]{NOTIFICATION_ACTION_WITH_DEEPLINK, NOTIFICATION_PUSH_STORY_PAGE_CLICK, URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY, URI_ACTION_OPEN_WITH_ACTION_VIEW, URI_ACTION_BACK_STACK_GET_ROOT_INTENT, URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT, URI_UTILS_GET_MAIN_ACTIVITY_INTENT};
        }

        static {
            IntentFlagPurpose[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private IntentFlagPurpose(String str, int i6) {
        }

        public static IntentFlagPurpose valueOf(String str) {
            return (IntentFlagPurpose) Enum.valueOf(IntentFlagPurpose.class, str);
        }

        public static IntentFlagPurpose[] values() {
            return (IntentFlagPurpose[]) $VALUES.clone();
        }
    }

    @NotNull
    UriAction createUriActionFromUri(@NotNull Uri uri, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel);

    @Nullable
    UriAction createUriActionFromUrlString(@NotNull String url, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel);

    int getIntentFlags(@NotNull IntentFlagPurpose intentFlagPurpose);

    void gotoNewsFeed(@NotNull Context context, @NotNull NewsfeedAction newsfeedAction);

    void gotoUri(@NotNull Context context, @NotNull UriAction uriAction);
}
