package com.braze.ui.inappmessage;

@Deprecated
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class InAppMessageCloser {
    private final IInAppMessageViewWrapper mInAppMessageViewWrapper;

    public InAppMessageCloser(IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        this.mInAppMessageViewWrapper = iInAppMessageViewWrapper;
    }

    public void close(boolean z6) {
        this.mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(z6);
        this.mInAppMessageViewWrapper.close();
    }
}
