package com.braze.push.support;

import android.text.Html;
import android.text.Spanned;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG", "", "getHtmlSpannedTextIfEnabled", "", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "HtmlUtils")
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class HtmlUtils {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("HtmlUtils");

    @NotNull
    public static final CharSequence getHtmlSpannedTextIfEnabled(@NotNull String str, @NotNull BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: j4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String htmlSpannedTextIfEnabled$lambda$0;
                    htmlSpannedTextIfEnabled$lambda$0 = HtmlUtils.getHtmlSpannedTextIfEnabled$lambda$0();
                    return htmlSpannedTextIfEnabled$lambda$0;
                }
            }, 14, (Object) null);
            return str;
        }
        if (!configurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        }
        Spanned fromHtml = Html.fromHtml(str, 0);
        Intrinsics.checkNotNull(fromHtml);
        return fromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHtmlSpannedTextIfEnabled$lambda$0() {
        return "Cannot create html spanned text on blank text. Returning blank string.";
    }
}
