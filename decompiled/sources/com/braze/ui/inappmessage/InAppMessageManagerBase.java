package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.InAppMessageManagerBase;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageAnimationFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.DefaultHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u0003R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0003R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010(R\u0018\u00106\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010/R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0018\u00108\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0018\u00109\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010&R\u0018\u0010:\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00101R\u0014\u0010<\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0015R\u0014\u0010>\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0015R\u0016\u0010A\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0014\u0010K\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "getDefaultInAppMessageViewFactory", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "getInAppMessageViewFactory", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "inAppMessageManagerListener", "", "setCustomInAppMessageManagerListener", "(Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;)V", "", "doesClickOutsideModalViewDismissInAppMessageViewField", "Z", "shouldSkip", "shouldNextUnregisterBeSkipped", "getShouldNextUnregisterBeSkipped", "()Z", "setShouldNextUnregisterBeSkipped", "(Z)V", "doesBackButtonDismissInAppMessageViewField", "Landroid/app/Activity;", "mActivity", "Landroid/app/Activity;", "getMActivity$annotations", "Landroid/content/Context;", "mApplicationContext", "Landroid/content/Context;", "getMApplicationContext$annotations", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "defaultHtmlInAppMessageActionListener", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageSlideupViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageModalViewFactory", "inAppMessageFullViewFactory", "inAppMessageHtmlFullViewFactory", "inAppMessageHtmlViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "inAppMessageAnimationFactoryField", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "defaultInAppMessageManagerListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "defaultInAppMessageViewWrapperFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "customInAppMessageViewFactory", "customInAppMessageAnimationFactory", "customInAppMessageManagerListener", "customInAppMessageViewWrapperFactory", "customHtmlInAppMessageActionListener", "customControlInAppMessageManagerListener", "getDoesClickOutsideModalViewDismissInAppMessageView", "doesClickOutsideModalViewDismissInAppMessageView", "getDoesBackButtonDismissInAppMessageView", "doesBackButtonDismissInAppMessageView", "getActivity", "()Landroid/app/Activity;", "activity", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "getInAppMessageManagerListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "getControlInAppMessageManagerListener", "controlInAppMessageManagerListener", "getHtmlInAppMessageActionListener", "()Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "htmlInAppMessageActionListener", "getInAppMessageViewWrapperFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "inAppMessageViewWrapperFactory", "getInAppMessageAnimationFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "inAppMessageAnimationFactory", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageManagerBase {

    @Nullable
    private IInAppMessageManagerListener customControlInAppMessageManagerListener;

    @Nullable
    private IHtmlInAppMessageActionListener customHtmlInAppMessageActionListener;

    @Nullable
    private IInAppMessageAnimationFactory customInAppMessageAnimationFactory;

    @Nullable
    private IInAppMessageManagerListener customInAppMessageManagerListener;

    @Nullable
    private IInAppMessageViewFactory customInAppMessageViewFactory;

    @Nullable
    private IInAppMessageViewWrapperFactory customInAppMessageViewWrapperFactory;

    @NotNull
    private final IHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener;

    @NotNull
    private final IInAppMessageManagerListener defaultInAppMessageManagerListener;

    @NotNull
    private final IInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory;
    private boolean doesBackButtonDismissInAppMessageViewField = true;
    private boolean doesClickOutsideModalViewDismissInAppMessageViewField;

    @NotNull
    private final IInAppMessageAnimationFactory inAppMessageAnimationFactoryField;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageFullViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageHtmlFullViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageHtmlViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageModalViewFactory;

    @NotNull
    private final IInAppMessageViewFactory inAppMessageSlideupViewFactory;

    @NotNull
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    @JvmField
    @Nullable
    protected Activity mActivity;

    @JvmField
    @Nullable
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InAppMessageManagerBase() {
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = new DefaultInAppMessageWebViewClientListener();
        this.inAppMessageWebViewClientListener = defaultInAppMessageWebViewClientListener;
        this.defaultHtmlInAppMessageActionListener = new DefaultHtmlInAppMessageActionListener();
        this.inAppMessageSlideupViewFactory = new DefaultInAppMessageSlideupViewFactory();
        this.inAppMessageModalViewFactory = new DefaultInAppMessageModalViewFactory();
        this.inAppMessageFullViewFactory = new DefaultInAppMessageFullViewFactory();
        this.inAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageAnimationFactoryField = new DefaultInAppMessageAnimationFactory();
        this.defaultInAppMessageManagerListener = new DefaultInAppMessageManagerListener();
        this.defaultInAppMessageViewWrapperFactory = new DefaultInAppMessageViewWrapperFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_shouldNextUnregisterBeSkipped_$lambda$0(boolean z6) {
        return "Setting setShouldNextUnregisterBeSkipped to " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDefaultInAppMessageViewFactory$lambda$1(IInAppMessage iInAppMessage) {
        return "Failed to find view factory for in-app message with type: " + iInAppMessage.getMessageType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageManagerListener$lambda$4() {
        return "Custom InAppMessageManagerListener set";
    }

    @Nullable
    /* renamed from: getActivity, reason: from getter */
    public Activity getMActivity() {
        return this.mActivity;
    }

    @Nullable
    /* renamed from: getApplicationContext, reason: from getter */
    public Context getMApplicationContext() {
        return this.mApplicationContext;
    }

    @NotNull
    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customControlInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    @Nullable
    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(@NotNull final IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        int i6 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        if (i6 == 1) {
            return this.inAppMessageSlideupViewFactory;
        }
        if (i6 == 2) {
            return this.inAppMessageModalViewFactory;
        }
        if (i6 == 3) {
            return this.inAppMessageFullViewFactory;
        }
        if (i6 == 4) {
            return this.inAppMessageHtmlFullViewFactory;
        }
        if (i6 == 5) {
            return this.inAppMessageHtmlViewFactory;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String defaultInAppMessageViewFactory$lambda$1;
                defaultInAppMessageViewFactory$lambda$1 = InAppMessageManagerBase.getDefaultInAppMessageViewFactory$lambda$1(IInAppMessage.this);
                return defaultInAppMessageViewFactory$lambda$1;
            }
        }, 6, (Object) null);
        return null;
    }

    /* renamed from: getDoesBackButtonDismissInAppMessageView, reason: from getter */
    public boolean getDoesBackButtonDismissInAppMessageViewField() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    /* renamed from: getDoesClickOutsideModalViewDismissInAppMessageView, reason: from getter */
    public boolean getDoesClickOutsideModalViewDismissInAppMessageViewField() {
        return this.doesClickOutsideModalViewDismissInAppMessageViewField;
    }

    @NotNull
    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.customHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener == null ? this.defaultHtmlInAppMessageActionListener : iHtmlInAppMessageActionListener;
    }

    @NotNull
    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.customInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory == null ? this.inAppMessageAnimationFactoryField : iInAppMessageAnimationFactory;
    }

    @NotNull
    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    @Nullable
    public IInAppMessageViewFactory getInAppMessageViewFactory(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        return iInAppMessageViewFactory == null ? getDefaultInAppMessageViewFactory(inAppMessage) : iInAppMessageViewFactory;
    }

    @NotNull
    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory = this.customInAppMessageViewWrapperFactory;
        return iInAppMessageViewWrapperFactory == null ? this.defaultInAppMessageViewWrapperFactory : iInAppMessageViewWrapperFactory;
    }

    public boolean getShouldNextUnregisterBeSkipped() {
        return this.shouldNextUnregisterBeSkipped;
    }

    public void setCustomInAppMessageManagerListener(@Nullable IInAppMessageManagerListener inAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.N0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customInAppMessageManagerListener$lambda$4;
                customInAppMessageManagerListener$lambda$4 = InAppMessageManagerBase.setCustomInAppMessageManagerListener$lambda$4();
                return customInAppMessageManagerListener$lambda$4;
            }
        }, 7, (Object) null);
        this.customInAppMessageManagerListener = inAppMessageManagerListener;
    }

    public void setShouldNextUnregisterBeSkipped(final boolean z6) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.M0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_shouldNextUnregisterBeSkipped_$lambda$0;
                _set_shouldNextUnregisterBeSkipped_$lambda$0 = InAppMessageManagerBase._set_shouldNextUnregisterBeSkipped_$lambda$0(z6);
                return _set_shouldNextUnregisterBeSkipped_$lambda$0;
            }
        }, 7, (Object) null);
        this.shouldNextUnregisterBeSkipped = z6;
    }
}
