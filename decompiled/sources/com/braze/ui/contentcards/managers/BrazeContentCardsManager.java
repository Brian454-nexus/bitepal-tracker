package com.braze.ui.contentcards.managers;

import com.amazon.a.a.o.b;
import com.braze.ui.contentcards.listeners.DefaultContentCardsActionListener;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "", "<init>", "()V", "Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", b.f11195Y, "contentCardsActionListener", "Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "getContentCardsActionListener", "()Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "setContentCardsActionListener", "(Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeContentCardsManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<BrazeContentCardsManager> instance$delegate = LazyKt.lazy(new Function0() { // from class: E4.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BrazeContentCardsManager instance_delegate$lambda$0;
            instance_delegate$lambda$0 = BrazeContentCardsManager.instance_delegate$lambda$0();
            return instance_delegate$lambda$0;
        }
    });

    @Nullable
    private IContentCardsActionListener contentCardsActionListener = new DefaultContentCardsActionListener();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager$Companion;", "", "<init>", "()V", "Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "getInstance$annotations", "instance", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BrazeContentCardsManager getInstance() {
            return (BrazeContentCardsManager) BrazeContentCardsManager.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BrazeContentCardsManager instance_delegate$lambda$0() {
        return new BrazeContentCardsManager();
    }

    @Nullable
    public final IContentCardsActionListener getContentCardsActionListener() {
        return this.contentCardsActionListener;
    }
}
