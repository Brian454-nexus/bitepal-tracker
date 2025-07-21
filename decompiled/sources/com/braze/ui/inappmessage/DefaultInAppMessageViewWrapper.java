package com.braze.ui.inappmessage;

import I4.AbstractC0486i0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.C1999b;
import z0.AbstractC2393D;
import z0.C2400K;
import z0.InterfaceC2437w;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 }2\u00020\u0001:\u0001}Be\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u0019J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010\u0019J'\u0010.\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bH\u0010GR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010KR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\bQ\u0010;\"\u0004\bR\u0010KR \u0010T\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bX\u0010\u0019\u001a\u0004\bV\u0010WR\"\u0010Y\u001a\u00020)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[\"\u0004\b\\\u0010,R$\u0010^\u001a\u0004\u0018\u00010]8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010d\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u00109\u001a\u0004\be\u0010;\"\u0004\bf\u0010KR>\u0010j\u001a\u001e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020h0gj\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020h`i8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010p\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010w\u001a\u0004\u0018\u00010v8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006~"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Landroid/view/View;", "inAppMessageView", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Landroid/view/animation/Animation;", "openingAnimation", "closingAnimation", "clickableInAppMessageView", "", "buttonViews", "closeButton", "<init>", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)V", "Landroid/app/Activity;", "activity", "", "open", "(Landroid/app/Activity;)V", "close", "()V", "Landroid/view/ViewGroup;", "getParentViewGroup", "(Landroid/app/Activity;)Landroid/view/ViewGroup;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "(Lcom/braze/models/inappmessage/IInAppMessage;)Landroid/view/ViewGroup$LayoutParams;", "parentViewGroup", "addInAppMessageViewToViewGroup", "(Landroid/view/ViewGroup;Lcom/braze/models/inappmessage/IInAppMessage;Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;)V", "Landroid/view/View$OnClickListener;", "createClickListener", "()Landroid/view/View$OnClickListener;", "createButtonClickListeners", "createCloseInAppMessageClickListener", "addDismissRunnable", "", "opening", "setAndStartAnimation", "(Z)V", "closeInAppMessageView", "finalizeViewBeforeDisplay", "(Lcom/braze/models/inappmessage/IInAppMessage;Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;)V", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "createDismissCallbacks", "()Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "createTouchAwareListener", "()Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "Landroid/view/animation/Animation$AnimationListener;", "createAnimationListener", "(Z)Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/View;", "getInAppMessageView", "()Landroid/view/View;", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "getInAppMessageViewLifecycleListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "Landroid/view/animation/Animation;", "getOpeningAnimation", "()Landroid/view/animation/Animation;", "getClosingAnimation", "getClickableInAppMessageView", "setClickableInAppMessageView", "(Landroid/view/View;)V", "Ljava/util/List;", "getButtonViews", "()Ljava/util/List;", "setButtonViews", "(Ljava/util/List;)V", "getCloseButton", "setCloseButton", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "inAppMessageCloser", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "getInAppMessageCloser", "()Lcom/braze/ui/inappmessage/InAppMessageCloser;", "getInAppMessageCloser$annotations", "isAnimatingClose", "Z", "()Z", "setAnimatingClose", "Ljava/lang/Runnable;", "dismissRunnable", "Ljava/lang/Runnable;", "getDismissRunnable", "()Ljava/lang/Runnable;", "setDismissRunnable", "(Ljava/lang/Runnable;)V", "previouslyFocusedView", "getPreviouslyFocusedView", "setPreviouslyFocusedView", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "viewAccessibilityFlagMap", "Ljava/util/HashMap;", "getViewAccessibilityFlagMap", "()Ljava/util/HashMap;", "setViewAccessibilityFlagMap", "(Ljava/util/HashMap;)V", "contentViewGroupParentLayout", "Landroid/view/ViewGroup;", "getContentViewGroupParentLayout", "()Landroid/view/ViewGroup;", "setContentViewGroupParentLayout", "(Landroid/view/ViewGroup;)V", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "getOnBackInvokedCallback", "()Landroid/window/OnBackInvokedCallback;", "setOnBackInvokedCallback", "(Landroid/window/OnBackInvokedCallback;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultInAppMessageViewWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultInAppMessageViewWrapper.kt\ncom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,554:1\n1872#2,3:555\n*S KotlinDebug\n*F\n+ 1 DefaultInAppMessageViewWrapper.kt\ncom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper\n*L\n336#1:555,3\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<? extends View> buttonViews;

    @Nullable
    private View clickableInAppMessageView;

    @Nullable
    private View closeButton;

    @Nullable
    private final Animation closingAnimation;

    @NotNull
    private final BrazeConfigurationProvider configurationProvider;

    @Nullable
    private ViewGroup contentViewGroupParentLayout;

    @Nullable
    private Runnable dismissRunnable;

    @NotNull
    private final IInAppMessage inAppMessage;

    @NotNull
    private final InAppMessageCloser inAppMessageCloser;

    @NotNull
    private final View inAppMessageView;

    @NotNull
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;

    @Nullable
    private OnBackInvokedCallback onBackInvokedCallback;

    @Nullable
    private final Animation openingAnimation;

    @Nullable
    private View previouslyFocusedView;

    @NotNull
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tJ$\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$Companion;", "", "<init>", "()V", "setAllViewGroupChildrenAsNonAccessibilityImportant", "", "viewGroup", "Landroid/view/ViewGroup;", "viewAccessibilityFlagMap", "", "", "resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$1() {
            return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setAllViewGroupChildrenAsNonAccessibilityImportant$lambda$0() {
            return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(@Nullable ViewGroup viewGroup, @NotNull Map<Integer, Integer> viewAccessibilityFlagMap) {
            Intrinsics.checkNotNullParameter(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.H0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$1;
                        resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$1 = DefaultInAppMessageViewWrapper.Companion.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$1();
                        return resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$1;
                    }
                }, 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (viewAccessibilityFlagMap.containsKey(Integer.valueOf(id))) {
                        Integer num = viewAccessibilityFlagMap.get(Integer.valueOf(id));
                        if (num != null) {
                            childAt.setImportantForAccessibility(num.intValue());
                        }
                    } else {
                        childAt.setImportantForAccessibility(0);
                    }
                }
            }
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(@Nullable ViewGroup viewGroup, @NotNull Map<Integer, Integer> viewAccessibilityFlagMap) {
            Intrinsics.checkNotNullParameter(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.G0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String allViewGroupChildrenAsNonAccessibilityImportant$lambda$0;
                        allViewGroupChildrenAsNonAccessibilityImportant$lambda$0 = DefaultInAppMessageViewWrapper.Companion.setAllViewGroupChildrenAsNonAccessibilityImportant$lambda$0();
                        return allViewGroupChildrenAsNonAccessibilityImportant$lambda$0;
                    }
                }, 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt != null) {
                    viewAccessibilityFlagMap.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                }
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmOverloads
    public DefaultInAppMessageViewWrapper(@NotNull View inAppMessageView, @NotNull IInAppMessage inAppMessage, @NotNull IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, @NotNull BrazeConfigurationProvider configurationProvider, @Nullable Animation animation, @Nullable Animation animation2, @Nullable View view, @Nullable List<? extends View> list, @Nullable View view2) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.inAppMessageView = inAppMessageView;
        this.inAppMessage = inAppMessage;
        this.inAppMessageViewLifecycleListener = inAppMessageViewLifecycleListener;
        this.configurationProvider = configurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view;
        this.buttonViews = list;
        this.closeButton = view2;
        this.inAppMessageCloser = new InAppMessageCloser(this);
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        if (getInAppMessage() instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        createButtonClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDismissRunnable$lambda$23() {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C2400K addInAppMessageViewToViewGroup$lambda$12(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view, View view2, C2400K c2400k) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addInAppMessageViewToViewGroup$lambda$12$lambda$8;
                addInAppMessageViewToViewGroup$lambda$12$lambda$8 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$8();
                return addInAppMessageViewToViewGroup$lambda$12$lambda$8;
            }
        }, 7, (Object) null);
        if (c2400k == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addInAppMessageViewToViewGroup$lambda$12$lambda$9;
                    addInAppMessageViewToViewGroup$lambda$12$lambda$9 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$9();
                    return addInAppMessageViewToViewGroup$lambda$12$lambda$9;
                }
            }, 7, (Object) null);
            return new C2400K(c2400k);
        }
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.IInAppMessageView");
        IInAppMessageView iInAppMessageView = (IInAppMessageView) view;
        if (iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addInAppMessageViewToViewGroup$lambda$12$lambda$11;
                    addInAppMessageViewToViewGroup$lambda$12$lambda$11 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$11();
                    return addInAppMessageViewToViewGroup$lambda$12$lambda$11;
                }
            }, 7, (Object) null);
            return c2400k;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: I4.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addInAppMessageViewToViewGroup$lambda$12$lambda$10;
                addInAppMessageViewToViewGroup$lambda$12$lambda$10 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$10();
                return addInAppMessageViewToViewGroup$lambda$12$lambda$10;
            }
        }, 6, (Object) null);
        iInAppMessageView.applyWindowInsets(c2400k);
        return c2400k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$10() {
        return "Calling applyWindowInsets on in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$11() {
        return "Not reapplying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$8() {
        return "In-app message view received window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$12$lambda$9() {
        return "Window insets were null, so not applying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$13() {
        return "Requesting to apply insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$14() {
        return "In-app message view will animate into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$15() {
        return "In-app message view will be placed instantly into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$6() {
        return "Adding In-app message view to parent view group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$7(int i6) {
        return "Adding status bar height of " + i6 + " padding to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$3() {
        return "Closing in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$5$lambda$4() {
        return "Unregistering iam back invoked callback";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$24() {
        return "Closing in-app message view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$25(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        return "Returning focus to view after closing message. View: " + defaultInAppMessageViewWrapper.getPreviouslyFocusedView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$26() {
        return "Failed to request focus on previous view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createButtonClickListeners$lambda$21$lambda$17() {
        return "Cannot create button click listener since this in-app message does not have message buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButtonClickListeners$lambda$21$lambda$20$lambda$19$lambda$18(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive, View view) {
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onButtonClicked(defaultInAppMessageViewWrapper.getInAppMessageCloser(), messageButton, iInAppMessageImmersive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createClickListener$lambda$16(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        List<MessageButton> messageButtons;
        IInAppMessage inAppMessage = defaultInAppMessageViewWrapper.getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if ((iInAppMessageImmersive == null || (messageButtons = iInAppMessageImmersive.getMessageButtons()) == null || !messageButtons.isEmpty()) && (defaultInAppMessageViewWrapper.getInAppMessage() instanceof IInAppMessageImmersive)) {
            return;
        }
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onClicked(defaultInAppMessageViewWrapper.getInAppMessageCloser(), defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCloseInAppMessageClickListener$lambda$22(View view) {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$0() {
        return "Opening in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$1(int i6) {
        return "Detected root view height of " + i6;
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new Runnable() { // from class: I4.z0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultInAppMessageViewWrapper.addDismissRunnable$lambda$23();
                }
            });
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addInAppMessageViewToViewGroup(@NotNull ViewGroup parentViewGroup, @NotNull IInAppMessage inAppMessage, @NotNull final View inAppMessageView, @NotNull IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        Intrinsics.checkNotNullParameter(parentViewGroup, "parentViewGroup");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        inAppMessageViewLifecycleListener.beforeOpened(inAppMessageView, inAppMessage);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addInAppMessageViewToViewGroup$lambda$6;
                addInAppMessageViewToViewGroup$lambda$6 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$6();
                return addInAppMessageViewToViewGroup$lambda$6;
            }
        }, 7, (Object) null);
        parentViewGroup.addView(inAppMessageView, getLayoutParams(inAppMessage));
        if (inAppMessageView instanceof IInAppMessageView) {
            if (getConfigurationProvider().getShouldAddStatusBarPaddingToInAppMessages()) {
                Context context = inAppMessageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                final int statusBarHeight = ViewUtils.getStatusBarHeight(context);
                C2400K a6 = new C2400K.a().b(C2400K.l.h(), C1999b.b(0, statusBarHeight, 0, 0)).a();
                Intrinsics.checkNotNullExpressionValue(a6, "build(...)");
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addInAppMessageViewToViewGroup$lambda$7;
                        addInAppMessageViewToViewGroup$lambda$7 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$7(statusBarHeight);
                        return addInAppMessageViewToViewGroup$lambda$7;
                    }
                }, 7, (Object) null);
                ((IInAppMessageView) inAppMessageView).applyWindowInsets(a6);
            } else {
                AbstractC2393D.X(parentViewGroup, new InterfaceC2437w() { // from class: I4.r0
                    @Override // z0.InterfaceC2437w
                    public final C2400K a(View view, C2400K c2400k) {
                        C2400K addInAppMessageViewToViewGroup$lambda$12;
                        addInAppMessageViewToViewGroup$lambda$12 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12(DefaultInAppMessageViewWrapper.this, inAppMessageView, view, c2400k);
                        return addInAppMessageViewToViewGroup$lambda$12;
                    }
                });
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addInAppMessageViewToViewGroup$lambda$13;
                        addInAppMessageViewToViewGroup$lambda$13 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$13();
                        return addInAppMessageViewToViewGroup$lambda$13;
                    }
                }, 7, (Object) null);
                AbstractC2393D.K(parentViewGroup);
            }
        }
        if (inAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addInAppMessageViewToViewGroup$lambda$14;
                    addInAppMessageViewToViewGroup$lambda$14 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$14();
                    return addInAppMessageViewToViewGroup$lambda$14;
                }
            }, 7, (Object) null);
            setAndStartAnimation(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addInAppMessageViewToViewGroup$lambda$15;
                    addInAppMessageViewToViewGroup$lambda$15 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$15();
                    return addInAppMessageViewToViewGroup$lambda$15;
                }
            }, 7, (Object) null);
            if (inAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                addDismissRunnable();
            }
            finalizeViewBeforeDisplay(inAppMessage, inAppMessageView, inAppMessageViewLifecycleListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        r0 = r0.getOnBackInvokedDispatcher();
     */
    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r9 = this;
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            I4.B0 r5 = new I4.B0
            r5.<init>()
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r9
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.braze.configuration.BrazeConfigurationProvider r1 = r9.getConfigurationProvider()
            boolean r1 = r1.isInAppMessageAccessibilityExclusiveModeEnabled()
            if (r1 == 0) goto L27
            com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$Companion r1 = com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.INSTANCE
            android.view.ViewGroup r2 = r9.getContentViewGroupParentLayout()
            java.util.HashMap r3 = r9.getViewAccessibilityFlagMap()
            r1.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(r2, r3)
        L27:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L57
            android.window.OnBackInvokedCallback r8 = r9.getOnBackInvokedCallback()
            if (r8 == 0) goto L57
            I4.C0 r5 = new I4.C0
            r5.<init>()
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r9
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.braze.ui.inappmessage.BrazeInAppMessageManager$Companion r0 = com.braze.ui.inappmessage.BrazeInAppMessageManager.INSTANCE
            com.braze.ui.inappmessage.BrazeInAppMessageManager r0 = r0.getInstance()
            android.app.Activity r0 = r0.getMActivity()
            if (r0 == 0) goto L58
            android.window.OnBackInvokedDispatcher r0 = I4.AbstractC0482g0.a(r0)
            if (r0 == 0) goto L58
            I4.AbstractC0484h0.a(r0, r8)
            goto L58
        L57:
            r1 = r9
        L58:
            android.view.View r0 = r9.getInAppMessageView()
            java.lang.Runnable r2 = r9.getDismissRunnable()
            r0.removeCallbacks(r2)
            com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener r0 = r9.getInAppMessageViewLifecycleListener()
            android.view.View r2 = r9.getInAppMessageView()
            com.braze.models.inappmessage.IInAppMessage r3 = r9.getInAppMessage()
            r0.beforeClosed(r2, r3)
            com.braze.models.inappmessage.IInAppMessage r0 = r9.getInAppMessage()
            boolean r0 = r0.getAnimateOut()
            if (r0 == 0) goto L85
            r0 = 1
            r9.setAnimatingClose(r0)
            r0 = 0
            r9.setAndStartAnimation(r0)
            return
        L85:
            r9.closeInAppMessageView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.close():void");
    }

    public void closeInAppMessageView() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String closeInAppMessageView$lambda$24;
                closeInAppMessageView$lambda$24 = DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$24();
                return closeInAppMessageView$lambda$24;
            }
        }, 7, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = inAppMessageView instanceof InAppMessageHtmlBaseView ? (InAppMessageHtmlBaseView) inAppMessageView : null;
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String closeInAppMessageView$lambda$25;
                    closeInAppMessageView$lambda$25 = DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$25(DefaultInAppMessageViewWrapper.this);
                    return closeInAppMessageView$lambda$25;
                }
            }, 7, (Object) null);
            try {
                View previouslyFocusedView = getPreviouslyFocusedView();
                if (previouslyFocusedView != null) {
                    previouslyFocusedView.requestFocus();
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: I4.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String closeInAppMessageView$lambda$26;
                        closeInAppMessageView$lambda$26 = DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$26();
                        return closeInAppMessageView$lambda$26;
                    }
                }, 4, (Object) null);
            }
        }
        getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
    }

    @NotNull
    public Animation.AnimationListener createAnimationListener(boolean opening) {
        return opening ? new DefaultInAppMessageViewWrapper$createAnimationListener$1(this) : new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
    }

    public void createButtonClickListeners() {
        IInAppMessage inAppMessage = getInAppMessage();
        final IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if (iInAppMessageImmersive != null) {
            if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.D0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String createButtonClickListeners$lambda$21$lambda$17;
                        createButtonClickListeners$lambda$21$lambda$17 = DefaultInAppMessageViewWrapper.createButtonClickListeners$lambda$21$lambda$17();
                        return createButtonClickListeners$lambda$21$lambda$17;
                    }
                }, 7, (Object) null);
                return;
            }
            List<View> buttonViews = getButtonViews();
            if (buttonViews != null) {
                int i6 = 0;
                for (Object obj : buttonViews) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    View view = (View) obj;
                    final MessageButton messageButton = (MessageButton) CollectionsKt.getOrNull(iInAppMessageImmersive.getMessageButtons(), i6);
                    if (messageButton != null) {
                        view.setOnClickListener(new View.OnClickListener() { // from class: I4.E0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                DefaultInAppMessageViewWrapper.createButtonClickListeners$lambda$21$lambda$20$lambda$19$lambda$18(DefaultInAppMessageViewWrapper.this, messageButton, iInAppMessageImmersive, view2);
                            }
                        });
                    }
                    i6 = i7;
                }
            }
        }
    }

    @NotNull
    public View.OnClickListener createClickListener() {
        return new View.OnClickListener() { // from class: I4.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppMessageViewWrapper.createClickListener$lambda$16(DefaultInAppMessageViewWrapper.this, view);
            }
        };
    }

    @NotNull
    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new View.OnClickListener() { // from class: I4.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppMessageViewWrapper.createCloseInAppMessageClickListener$lambda$22(view);
            }
        };
    }

    @NotNull
    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createDismissCallbacks$1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object token) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object token) {
                Intrinsics.checkNotNullParameter(view, "view");
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    @NotNull
    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createTouchAwareListener$1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public void finalizeViewBeforeDisplay(@NotNull IInAppMessage inAppMessage, @NotNull View inAppMessageView, @NotNull IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageView)) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
        }
        inAppMessageViewLifecycleListener.afterOpened(inAppMessageView, inAppMessage);
    }

    @Nullable
    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    @Nullable
    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    @Nullable
    public View getCloseButton() {
        return this.closeButton;
    }

    @Nullable
    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    @NotNull
    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    @Nullable
    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    @Nullable
    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    @NotNull
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    @NotNull
    public InAppMessageCloser getInAppMessageCloser() {
        return this.inAppMessageCloser;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    @NotNull
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    @NotNull
    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    @NotNull
    public ViewGroup.LayoutParams getLayoutParams(@Nullable IInAppMessage inAppMessage) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (inAppMessage instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) inAppMessage).getSlideFrom() == SlideFrom.TOP ? 48 : 80;
        }
        return layoutParams;
    }

    @Nullable
    public OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    @Nullable
    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    @NotNull
    public ViewGroup getParentViewGroup(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View findViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (ViewGroup) findViewById;
    }

    @Nullable
    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    @NotNull
    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    /* renamed from: isAnimatingClose, reason: from getter */
    public boolean getIsAnimatingClose() {
        return this.isAnimatingClose;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(@NotNull Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        Intrinsics.checkNotNullParameter(activity, "activity");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: I4.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String open$lambda$0;
                open$lambda$0 = DefaultInAppMessageViewWrapper.open$lambda$0();
                return open$lambda$0;
            }
        }, 6, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        final int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            INSTANCE.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new DefaultInAppMessageViewWrapper$open$2(parentViewGroup, this));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String open$lambda$1;
                    open$lambda$1 = DefaultInAppMessageViewWrapper.open$lambda$1(height);
                    return open$lambda$1;
                }
            }, 7, (Object) null);
            addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
        }
        if (!BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 = new DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1(activity);
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, AbstractC0486i0.a(defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1));
        setOnBackInvokedCallback(AbstractC0486i0.a(defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1));
    }

    public void setAndStartAnimation(boolean opening) {
        Animation openingAnimation = opening ? getOpeningAnimation() : getClosingAnimation();
        if (openingAnimation != null) {
            openingAnimation.setAnimationListener(createAnimationListener(opening));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(openingAnimation);
        if (openingAnimation != null) {
            openingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public void setAnimatingClose(boolean z6) {
        this.isAnimatingClose = z6;
    }

    public void setClickableInAppMessageView(@Nullable View view) {
        this.clickableInAppMessageView = view;
    }

    public void setContentViewGroupParentLayout(@Nullable ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    public void setDismissRunnable(@Nullable Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public void setOnBackInvokedCallback(@Nullable OnBackInvokedCallback onBackInvokedCallback) {
        this.onBackInvokedCallback = onBackInvokedCallback;
    }

    public void setPreviouslyFocusedView(@Nullable View view) {
        this.previouslyFocusedView = view;
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i6 & 128) != 0 ? null : list, (i6 & 256) != 0 ? null : view3);
    }
}
