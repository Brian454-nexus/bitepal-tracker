package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/braze/BrazeFlushPushDeliveryReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "com/braze/b0", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeFlushPushDeliveryReceiver extends BroadcastReceiver {
    public static final b0 Companion = new b0();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0(Intent intent) {
        return "BrazeFlushPushDeliveryReceiver received intent: " + intent.getAction();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.g3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onReceive$lambda$0;
                onReceive$lambda$0 = BrazeFlushPushDeliveryReceiver.onReceive$lambda$0(intent);
                return onReceive$lambda$0;
            }
        }, 7, (Object) null);
        if (Intrinsics.areEqual(intent.getAction(), "com.braze.FLUSH_PUSH_DELIVERY")) {
            BrazeInternal.INSTANCE.performPushDeliveryFlush(context);
        }
    }
}
