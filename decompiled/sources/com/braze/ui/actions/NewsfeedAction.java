package com.braze.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.activities.BrazeFeedActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/actions/NewsfeedAction;", "Lcom/braze/ui/actions/IAction;", "Landroid/os/Bundle;", "extras", "Lcom/braze/enums/Channel;", AppsFlyerProperties.CHANNEL, "<init>", "(Landroid/os/Bundle;Lcom/braze/enums/Channel;)V", "Landroid/content/Context;", "context", "", "execute", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class NewsfeedAction implements IAction {

    @NotNull
    private final Channel channel;

    @Nullable
    private final Bundle extras;

    public NewsfeedAction(@Nullable Bundle bundle, @NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.extras = bundle;
        this.channel = channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0() {
        return "BrazeFeedActivity was not opened successfully.";
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) BrazeFeedActivity.class);
            Bundle bundle = this.extras;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: w4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$0;
                    execute$lambda$0 = NewsfeedAction.execute$lambda$0();
                    return execute$lambda$0;
                }
            }, 4, (Object) null);
        }
    }
}
