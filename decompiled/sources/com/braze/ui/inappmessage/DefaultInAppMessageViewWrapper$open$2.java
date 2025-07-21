package com.braze.ui.inappmessage;

import android.view.View;
import android.view.ViewGroup;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$2", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class DefaultInAppMessageViewWrapper$open$2 implements View.OnLayoutChangeListener {
    final /* synthetic */ ViewGroup $parentViewGroup;
    final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

    public DefaultInAppMessageViewWrapper$open$2(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        this.$parentViewGroup = viewGroup;
        this.this$0 = defaultInAppMessageViewWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLayoutChange$lambda$0(int i6, int i7) {
        return "Detected (bottom - top) of " + (i6 - i7) + " in OnLayoutChangeListener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChange$lambda$1(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, ViewGroup viewGroup) {
        defaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup(viewGroup, defaultInAppMessageViewWrapper.getInAppMessage(), defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, final int top, int right, final int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$parentViewGroup.removeOnLayoutChangeListener(this);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.J0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onLayoutChange$lambda$0;
                onLayoutChange$lambda$0 = DefaultInAppMessageViewWrapper$open$2.onLayoutChange$lambda$0(bottom, top);
                return onLayoutChange$lambda$0;
            }
        }, 7, (Object) null);
        this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
        final ViewGroup viewGroup = this.$parentViewGroup;
        final DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = this.this$0;
        viewGroup.post(new Runnable() { // from class: I4.K0
            @Override // java.lang.Runnable
            public final void run() {
                DefaultInAppMessageViewWrapper$open$2.onLayoutChange$lambda$1(DefaultInAppMessageViewWrapper.this, viewGroup);
            }
        });
    }
}
