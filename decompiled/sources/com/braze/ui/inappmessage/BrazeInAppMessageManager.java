package com.braze.ui.inappmessage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import ga.L;
import ga.Y;
import ga.i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J \u0010!\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0019H\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020\rH\u0000¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010,\u001a\u00020\rH\u0000¢\u0006\u0004\b+\u0010\u0003R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\u0003R&\u00105\u001a\b\u0012\u0004\u0012\u00020\u0015048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010\u0003\u001a\u0004\b7\u00108R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010MR*\u0010N\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bS\u0010\u0003\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u0018R*\u0010T\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bT\u0010O\u0012\u0004\bW\u0010\u0003\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010\u0018R\u0011\u0010X\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bX\u0010\u001b¨\u0006Z"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "<init>", "()V", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "createInAppMessageEventSubscriber", "()Lcom/braze/events/IEventSubscriber;", "Landroid/content/Context;", "context", "Lcom/braze/events/BrazeUserChangeEvent;", "createBrazeUserChangeEventSubscriber", "(Landroid/content/Context;)Lcom/braze/events/IEventSubscriber;", "", "ensureSubscribedToInAppMessageEvents", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "registerInAppMessageManager", "(Landroid/app/Activity;)V", "unregisterInAppMessageManager", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "addInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "requestDisplayInAppMessage", "()Z", "dismissed", "hideCurrentlyDisplayingInAppMessage", "(Z)V", "resetAfterInAppMessageClose", "isCarryOver", "displayInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOrientationStatus", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "", "currentUserId", "isInAppMessageForTheSameUser", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)Z", "pauseWebviewIfNecessary$android_sdk_ui_release", "pauseWebviewIfNecessary", "resumeWebviewIfNecessary$android_sdk_ui_release", "resumeWebviewIfNecessary", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "Ljava/util/Stack;", "inAppMessageStack", "Ljava/util/Stack;", "getInAppMessageStack", "()Ljava/util/Stack;", "getInAppMessageStack$annotations", "", "inAppMessageEventMap", "Ljava/util/Map;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "brazeUserChangeEventSubscriber", "", "originalOrientation", "Ljava/lang/Integer;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Ljava/lang/String;", "carryoverInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "getCarryoverInAppMessage$annotations", "unregisteredInAppMessage", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "isCurrentlyDisplayingInAppMessage", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nBrazeInAppMessageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeInAppMessageManager.kt\ncom/braze/ui/inappmessage/BrazeInAppMessageManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,808:1\n1#2:809\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeInAppMessageManager extends InAppMessageManagerBase {

    @Nullable
    private static volatile BrazeInAppMessageManager instance;

    @Nullable
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;

    @Nullable
    private IInAppMessage carryoverInAppMessage;

    @Nullable
    private BrazeConfigurationProvider configurationProvider;

    @Nullable
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;

    @Nullable
    private IInAppMessageViewWrapper inAppMessageViewWrapper;

    @Nullable
    private Integer originalOrientation;

    @Nullable
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;

    @Nullable
    private IInAppMessage unregisteredInAppMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReentrantLock instanceLock = new ReentrantLock();

    @NotNull
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();

    @JvmField
    @NotNull
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);

    @NotNull
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();

    @NotNull
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    @NotNull
    private String currentUserId = "";

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "", "containsPushPermissionPrompt", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInstance", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Ljava/util/concurrent/locks/ReentrantLock;", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", "instance", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        @JvmStatic
        @NotNull
        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                Intrinsics.checkNotNull(brazeInAppMessageManager, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                Intrinsics.checkNotNull(brazeInAppMessageManager2, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MessageType.values().length];
            try {
                iArr2[MessageType.HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MessageType.HTML_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber(Context context) {
        return new IEventSubscriber() { // from class: I4.u
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57(BrazeInAppMessageManager.this, (BrazeUserChangeEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBrazeUserChangeEventSubscriber$lambda$57(final BrazeInAppMessageManager brazeInAppMessageManager, final BrazeUserChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: I4.Y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createBrazeUserChangeEventSubscriber$lambda$57$lambda$54;
                createBrazeUserChangeEventSubscriber$lambda$57$lambda$54 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(BrazeUserChangeEvent.this);
                return createBrazeUserChangeEventSubscriber$lambda$57$lambda$54;
            }
        }, 6, (Object) null);
        final String currentUserId = event.getCurrentUserId();
        brazeInAppMessageManager.currentUserId = currentUserId;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createBrazeUserChangeEventSubscriber$lambda$57$lambda$55;
                createBrazeUserChangeEventSubscriber$lambda$57$lambda$55 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(currentUserId);
                return createBrazeUserChangeEventSubscriber$lambda$57$lambda$55;
            }
        }, 7, (Object) null);
        CollectionsKt.removeAll(brazeInAppMessageManager.inAppMessageStack, new Function1() { // from class: I4.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean createBrazeUserChangeEventSubscriber$lambda$57$lambda$56;
                createBrazeUserChangeEventSubscriber$lambda$57$lambda$56 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$56(BrazeInAppMessageManager.this, currentUserId, (IInAppMessage) obj);
                return Boolean.valueOf(createBrazeUserChangeEventSubscriber$lambda$57$lambda$56);
            }
        });
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.carryoverInAppMessage, currentUserId)) {
            brazeInAppMessageManager.carryoverInAppMessage = null;
        }
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.unregisteredInAppMessage, currentUserId)) {
            brazeInAppMessageManager.unregisteredInAppMessage = null;
        }
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "InAppMessage manager handling new current user id: '" + brazeUserChangeEvent + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(String str) {
        return "Removing in-app messages not from user " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createBrazeUserChangeEventSubscriber$lambda$57$lambda$56(BrazeInAppMessageManager brazeInAppMessageManager, String str, IInAppMessage iInAppMessage) {
        return !brazeInAppMessageManager.isInAppMessageForTheSameUser(iInAppMessage, str);
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new IEventSubscriber() { // from class: I4.L
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$53(BrazeInAppMessageManager.this, (InAppMessageEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$53(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        IInAppMessage inAppMessage = event.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, event);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$37(IInAppMessage iInAppMessage) {
        return "Attempting to display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$38() {
        return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$39() {
        return "Expiration timestamp not defined. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$40() {
        return "Not displaying control in-app message. Logging impression and ending display execution.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$41() {
        return "Cannot show message containing an invalid Braze Action.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$42() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$43() {
        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$44() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$45() {
        return "Creating view wrapper for immersive in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$46() {
        return "Creating view wrapper for base in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$47() {
        return "Creating view wrapper for in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$48() {
        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$51(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$51$lambda$49;
                        displayInAppMessage$lambda$51$lambda$49 = BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$49();
                        return displayInAppMessage$lambda$51$lambda$49;
                    }
                }, 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: I4.X
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String displayInAppMessage$lambda$51$lambda$50;
                        displayInAppMessage$lambda$51$lambda$50 = BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$50();
                        return displayInAppMessage$lambda$51$lambda$50;
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$49() {
        return "Page has finished loading. Opening in-app message view wrapper.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$50() {
        return "Failed to open view wrapper in page finished listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$52(IInAppMessage iInAppMessage) {
        return "Could not display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getKey());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(4:10|11|12|13)(2:44|45))(2:46|(2:48|49)(3:50|51|(4:53|(2:55|(1:57)(2:115|116))(1:117)|58|(2:60|(2:62|(2:64|(2:66|67)(4:68|69|70|(4:72|(3:74|75|76)(1:79)|77|78)(2:80|(2:92|(4:94|(1:103)(1:98)|99|(1:101)(1:102))(2:104|105))(4:84|(3:86|87|88)(1:91)|89|90))))(2:109|110))(2:111|112))(2:113|114))(2:118|119)))|14|15|(2:17|(6:19|(1:21)(2:30|(1:32)(1:33))|22|(1:24)(1:(1:29))|25|26)(2:34|35))(2:36|37)))|121|6|7|(0)(0)|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0226, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0227, code lost:
    
        r4 = r0;
        r8 = r2;
        r2 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c8 A[Catch: all -> 0x0226, TryCatch #1 {all -> 0x0226, blocks: (B:15:0x01c3, B:17:0x01c8, B:19:0x01ce, B:21:0x01e6, B:22:0x026c, B:24:0x0272, B:29:0x0292, B:30:0x022c, B:32:0x0230, B:33:0x0252, B:34:0x0296, B:35:0x029d, B:36:0x029e, B:37:0x02a5), top: B:14:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x029e A[Catch: all -> 0x0226, TryCatch #1 {all -> 0x0226, blocks: (B:15:0x01c3, B:17:0x01c8, B:19:0x01ce, B:21:0x01e6, B:22:0x026c, B:24:0x0272, B:29:0x0292, B:30:0x022c, B:32:0x0230, B:33:0x0252, B:34:0x0296, B:35:0x029d, B:36:0x029e, B:37:0x02a5), top: B:14:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object displayInAppMessage$suspendImpl(com.braze.ui.inappmessage.BrazeInAppMessageManager r22, com.braze.models.inappmessage.IInAppMessage r23, boolean r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage$suspendImpl(com.braze.ui.inappmessage.BrazeInAppMessageManager, com.braze.models.inappmessage.IInAppMessage, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$0() {
        return "Removing existing in-app message event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$1() {
        return "Subscribing in-app message event subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$3() {
        return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$4() {
        return "Subscribing sdk data wipe subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager brazeInAppMessageManager, SdkDataWipeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$7() {
        return "Removing existing user change event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$62() {
        return "Pausing InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$10(Activity activity) {
        return "Registering InAppMessageManager with activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$11() {
        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$14$lambda$13() {
        return "Requesting display of carryover in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$16$lambda$15() {
        return "Adding previously unregistered in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$18() {
        return "Error while calling attempting to register the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$9() {
        return "Null Activity passed to registerInAppMessageManager. Doing nothing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$24() {
        return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$25() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$26() {
        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$27() {
        return "The in-app message stack is empty. No in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$28() {
        return "Using the control in-app message manager listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$29() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$30() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$31() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$32() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$33(IInAppMessage iInAppMessage) {
        return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$34() {
        return "Error running requestDisplayInAppMessage";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$35() {
        return "Resetting after in-app message close.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$36(Integer num) {
        return "Setting requested orientation to original orientation " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resumeWebviewIfNecessary$lambda$63() {
        return "Resuming InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$19(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ");
        sb.append(activity != null ? activity.getLocalClassName() : null);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$20() {
        return "Null Activity passed to unregisterInAppMessageManager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$21(Activity activity) {
        return "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$22() {
        return "In-app message view includes HTML. Removing the page finished listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$23() {
        return "Error while calling attempting to unregister the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$58() {
        return "Cannot verify orientation status with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$59() {
        return "Running on tablet. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$60() {
        return "Any orientation specified. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$61() {
        return "Requesting orientation lock.";
    }

    public void addInAppMessage(@Nullable IInAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.inAppMessageStack.push(inAppMessage);
            requestDisplayInAppMessage();
        }
    }

    @Nullable
    public Object displayInAppMessage(@NotNull IInAppMessage iInAppMessage, boolean z6, @NotNull Continuation<? super Unit> continuation) {
        return displayInAppMessage$suspendImpl(this, iInAppMessage, z6, continuation);
    }

    public void ensureSubscribedToInAppMessageEvents(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$0;
                    ensureSubscribedToInAppMessageEvents$lambda$0 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$0();
                    return ensureSubscribedToInAppMessageEvents$lambda$0;
                }
            }, 7, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String ensureSubscribedToInAppMessageEvents$lambda$1;
                ensureSubscribedToInAppMessageEvents$lambda$1 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1();
                return ensureSubscribedToInAppMessageEvents$lambda$1;
            }
        }, 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(context).subscribeToNewInAppMessages(createInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = createInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: I4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$3;
                    ensureSubscribedToInAppMessageEvents$lambda$3 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$3();
                    return ensureSubscribedToInAppMessageEvents$lambda$3;
                }
            }, 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: I4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String ensureSubscribedToInAppMessageEvents$lambda$4;
                ensureSubscribedToInAppMessageEvents$lambda$4 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$4();
                return ensureSubscribedToInAppMessageEvents$lambda$4;
            }
        }, 6, (Object) null);
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber = new IEventSubscriber() { // from class: I4.g
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager.this, (SdkDataWipeEvent) obj);
            }
        };
        companion.getInstance(context).addSingleSynchronousSubscription(iEventSubscriber, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: I4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureSubscribedToInAppMessageEvents$lambda$7;
                    ensureSubscribedToInAppMessageEvents$lambda$7 = BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$7();
                    return ensureSubscribedToInAppMessageEvents$lambda$7;
                }
            }, 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber(context);
        companion.getInstance(context).addSingleSynchronousSubscription(createBrazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        this.brazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean dismissed) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (dismissed) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            i.d(BrazeCoroutineScope.INSTANCE, Y.c(), (L) null, new BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1(iInAppMessageViewWrapper, null), 2, (Object) null);
        }
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public boolean isInAppMessageForTheSameUser(@Nullable IInAppMessage inAppMessage, @NotNull String currentUserId) {
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        if (inAppMessage == null) {
            return true;
        }
        InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
        String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
        return userId == null || Intrinsics.areEqual(userId, currentUserId);
    }

    public final void pauseWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String pauseWebviewIfNecessary$lambda$62;
                pauseWebviewIfNecessary$lambda$62 = BrazeInAppMessageManager.pauseWebviewIfNecessary$lambda$62();
                return pauseWebviewIfNecessary$lambda$62;
            }
        }, 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onPause();
        }
    }

    public void registerInAppMessageManager(@Nullable final Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerInAppMessageManager$lambda$9;
                        registerInAppMessageManager$lambda$9 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$9();
                        return registerInAppMessageManager$lambda$9;
                    }
                }, 6, (Object) null);
                return;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: I4.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerInAppMessageManager$lambda$10;
                    registerInAppMessageManager$lambda$10 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$10(activity);
                    return registerInAppMessageManager$lambda$10;
                }
            }, 6, (Object) null);
            this.mActivity = activity;
            if (this.mApplicationContext == null) {
                Context applicationContext = activity.getApplicationContext();
                this.mApplicationContext = applicationContext;
                if (applicationContext == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$11;
                            registerInAppMessageManager$lambda$11 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$11();
                            return registerInAppMessageManager$lambda$11;
                        }
                    }, 6, (Object) null);
                    return;
                }
            }
            if (this.configurationProvider == null) {
                Context context = this.mApplicationContext;
                this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
            }
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            if (iInAppMessage != null) {
                if (iInAppMessage != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.e0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$14$lambda$13;
                            registerInAppMessageManager$lambda$14$lambda$13 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$14$lambda$13();
                            return registerInAppMessageManager$lambda$14$lambda$13;
                        }
                    }, 7, (Object) null);
                    iInAppMessage.setAnimateIn(false);
                    i.d(BrazeCoroutineScope.INSTANCE, Y.c(), (L) null, new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this, iInAppMessage, null), 2, (Object) null);
                }
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.f0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerInAppMessageManager$lambda$16$lambda$15;
                            registerInAppMessageManager$lambda$16$lambda$15 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$16$lambda$15();
                            return registerInAppMessageManager$lambda$16$lambda$15;
                        }
                    }, 7, (Object) null);
                    addInAppMessage(iInAppMessage2);
                    this.unregisteredInAppMessage = null;
                }
            }
            Context context2 = this.mApplicationContext;
            if (context2 != null) {
                ensureSubscribedToInAppMessageEvents(context2);
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: I4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerInAppMessageManager$lambda$18;
                    registerInAppMessageManager$lambda$18 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$18();
                    return registerInAppMessageManager$lambda$18;
                }
            }, 4, (Object) null);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation beforeInAppMessageDisplayed;
        try {
            Activity activity = this.mActivity;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestDisplayInAppMessage$lambda$25;
                            requestDisplayInAppMessage$lambda$25 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$25();
                            return requestDisplayInAppMessage$lambda$25;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestDisplayInAppMessage$lambda$24;
                            requestDisplayInAppMessage$lambda$24 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$24();
                            return requestDisplayInAppMessage$lambda$24;
                        }
                    }, 6, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                }
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$26;
                        requestDisplayInAppMessage$lambda$26 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$26();
                        return requestDisplayInAppMessage$lambda$26;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$27;
                        requestDisplayInAppMessage$lambda$27 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$27();
                        return requestDisplayInAppMessage$lambda$27;
                    }
                }, 7, (Object) null);
                return false;
            }
            final IInAppMessage pop = this.inAppMessageStack.pop();
            if (pop.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$28;
                        requestDisplayInAppMessage$lambda$28 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$28();
                        return requestDisplayInAppMessage$lambda$28;
                    }
                }, 7, (Object) null);
                IInAppMessageManagerListener controlInAppMessageManagerListener = getControlInAppMessageManagerListener();
                Intrinsics.checkNotNull(pop);
                beforeInAppMessageDisplayed = controlInAppMessageManagerListener.beforeInAppMessageDisplayed(pop);
            } else {
                IInAppMessageManagerListener inAppMessageManagerListener = getInAppMessageManagerListener();
                Intrinsics.checkNotNull(pop);
                beforeInAppMessageDisplayed = inAppMessageManagerListener.beforeInAppMessageDisplayed(pop);
            }
            int i6 = WhenMappings.$EnumSwitchMapping$0[beforeInAppMessageDisplayed.ordinal()];
            if (i6 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$29;
                        requestDisplayInAppMessage$lambda$29 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$29();
                        return requestDisplayInAppMessage$lambda$29;
                    }
                }, 7, (Object) null);
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(pop);
                return true;
            }
            if (i6 == 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$30;
                        requestDisplayInAppMessage$lambda$30 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$30();
                        return requestDisplayInAppMessage$lambda$30;
                    }
                }, 7, (Object) null);
                this.inAppMessageStack.push(pop);
                return false;
            }
            if (i6 == 3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$31;
                        requestDisplayInAppMessage$lambda$31 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$31();
                        return requestDisplayInAppMessage$lambda$31;
                    }
                }, 7, (Object) null);
                return false;
            }
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(pop);
            if (inAppMessageEvent != null) {
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$32;
                        requestDisplayInAppMessage$lambda$32 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$32();
                        return requestDisplayInAppMessage$lambda$32;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String requestDisplayInAppMessage$lambda$33;
                        requestDisplayInAppMessage$lambda$33 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$33(IInAppMessage.this);
                        return requestDisplayInAppMessage$lambda$33;
                    }
                }, 7, (Object) null);
            }
            return false;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: I4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestDisplayInAppMessage$lambda$34;
                    requestDisplayInAppMessage$lambda$34 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$34();
                    return requestDisplayInAppMessage$lambda$34;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: I4.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetAfterInAppMessageClose$lambda$35;
                resetAfterInAppMessageClose$lambda$35 = BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$35();
                return resetAfterInAppMessageClose$lambda$35;
            }
        }, 6, (Object) null);
        this.inAppMessageViewWrapper = null;
        Activity activity = this.mActivity;
        final Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetAfterInAppMessageClose$lambda$36;
                resetAfterInAppMessageClose$lambda$36 = BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$36(num);
                return resetAfterInAppMessageClose$lambda$36;
            }
        }, 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    public final void resumeWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resumeWebviewIfNecessary$lambda$63;
                resumeWebviewIfNecessary$lambda$63 = BrazeInAppMessageManager.resumeWebviewIfNecessary$lambda$63();
                return resumeWebviewIfNecessary$lambda$63;
            }
        }, 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onResume();
        }
    }

    public void unregisterInAppMessageManager(@Nullable final Activity activity) {
        IInAppMessage inAppMessage;
        try {
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$19;
                        unregisterInAppMessageManager$lambda$19 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$19(activity);
                        return unregisterInAppMessageManager$lambda$19;
                    }
                }, 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
                return;
            }
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$20;
                        unregisterInAppMessageManager$lambda$20 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$20();
                        return unregisterInAppMessageManager$lambda$20;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: I4.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String unregisterInAppMessageManager$lambda$21;
                        unregisterInAppMessageManager$lambda$21 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$21(activity);
                        return unregisterInAppMessageManager$lambda$21;
                    }
                }, 6, (Object) null);
            }
            IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
            if (iInAppMessageViewWrapper != null) {
                View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
                if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.H
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String unregisterInAppMessageManager$lambda$22;
                            unregisterInAppMessageManager$lambda$22 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$22();
                            return unregisterInAppMessageManager$lambda$22;
                        }
                    }, 7, (Object) null);
                    ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
                }
                ViewUtils.removeViewFromParent(inAppMessageView);
                if (iInAppMessageViewWrapper.getIsAnimatingClose()) {
                    this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                    inAppMessage = null;
                } else {
                    inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
                }
                this.carryoverInAppMessage = inAppMessage;
                this.inAppMessageViewWrapper = null;
            } else {
                this.carryoverInAppMessage = null;
            }
            this.mActivity = null;
            this.displayingInAppMessage.set(false);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: I4.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterInAppMessageManager$lambda$23;
                    unregisterInAppMessageManager$lambda$23 = BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$23();
                    return unregisterInAppMessageManager$lambda$23;
                }
            }, 4, (Object) null);
        }
    }

    @SuppressLint({"InlinedApi"})
    public boolean verifyOrientationStatus(@NotNull IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Activity activity = this.mActivity;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: I4.P
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$58;
                    verifyOrientationStatus$lambda$58 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$58();
                    return verifyOrientationStatus$lambda$58;
                }
            }, 6, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$59;
                    verifyOrientationStatus$lambda$59 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$59();
                    return verifyOrientationStatus$lambda$59;
                }
            }, 7, (Object) null);
        } else {
            if (orientation != Orientation.ANY) {
                if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                    return false;
                }
                if (this.originalOrientation == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.U
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String verifyOrientationStatus$lambda$61;
                            verifyOrientationStatus$lambda$61 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$61();
                            return verifyOrientationStatus$lambda$61;
                        }
                    }, 7, (Object) null);
                    this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                    ViewUtils.setActivityRequestedOrientation(activity, 14);
                }
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: I4.S
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyOrientationStatus$lambda$60;
                    verifyOrientationStatus$lambda$60 = BrazeInAppMessageManager.verifyOrientationStatus$lambda$60();
                    return verifyOrientationStatus$lambda$60;
                }
            }, 7, (Object) null);
        }
        return true;
    }
}
