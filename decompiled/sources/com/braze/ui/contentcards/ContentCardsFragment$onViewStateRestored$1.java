package com.braze.ui.contentcards;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import ga.J;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lga/J;", "", "<anonymous>", "(Lga/J;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1", f = "ContentCardsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ContentCardsFragment$onViewStateRestored$1 extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $savedInstanceState;
    int label;
    final /* synthetic */ ContentCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$onViewStateRestored$1(Bundle bundle, ContentCardsFragment contentCardsFragment, Continuation<? super ContentCardsFragment$onViewStateRestored$1> continuation) {
        super(2, continuation);
        this.$savedInstanceState = bundle;
        this.this$0 = contentCardsFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentCardsFragment$onViewStateRestored$1(this.$savedInstanceState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(J j6, Continuation<? super Unit> continuation) {
        return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Parcelable parcelable;
        ArrayList<String> stringArrayList;
        Object parcelable2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = this.$savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", Parcelable.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            parcelable = this.$savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY");
        }
        RecyclerView contentCardsRecyclerView = this.this$0.getContentCardsRecyclerView();
        if (contentCardsRecyclerView != null) {
            RecyclerView.p layoutManager = contentCardsRecyclerView.getLayoutManager();
            if (parcelable != null && layoutManager != null) {
                layoutManager.b1(parcelable);
            }
        }
        ContentCardAdapter contentCardAdapter = this.this$0.cardAdapter;
        if (contentCardAdapter != null && (stringArrayList = this.$savedInstanceState.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")) != null) {
            contentCardAdapter.setImpressedCardIds(stringArrayList);
        }
        return Unit.INSTANCE;
    }
}
