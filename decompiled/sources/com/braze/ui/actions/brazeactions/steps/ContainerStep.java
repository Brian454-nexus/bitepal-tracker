package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/ContainerStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "data", "", "isValid", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Z", "Landroid/content/Context;", "context", "", "run", "(Landroid/content/Context;Lcom/braze/ui/actions/brazeactions/steps/StepData;)V", "", "Lorg/json/JSONObject;", "getChildStepIterator$android_sdk_ui_release", "(Lcom/braze/ui/actions/brazeactions/steps/StepData;)Ljava/util/Iterator;", "getChildStepIterator", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContainerStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContainerStep.kt\ncom/braze/ui/actions/brazeactions/steps/ContainerStep\n+ 2 JsonUtils.kt\ncom/braze/support/JsonUtils\n*L\n1#1,27:1\n322#2,9:28\n*S KotlinDebug\n*F\n+ 1 ContainerStep.kt\ncom/braze/ui/actions/brazeactions/steps/ContainerStep\n*L\n25#1:28,9\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ContainerStep extends BaseBrazeActionStep {

    @NotNull
    public static final ContainerStep INSTANCE = new ContainerStep();

    private ContainerStep() {
        super(null);
    }

    public final /* synthetic */ Iterator getChildStepIterator$android_sdk_ui_release(StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final JSONArray jSONArray = data.getSrcJson().getJSONArray("steps");
        return jSONArray == null ? CollectionsKt.emptyList().iterator() : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Boolean invoke(int i6) {
                return Boolean.valueOf(jSONArray.opt(i6) instanceof JSONObject);
            }
        }), new Function1<Integer, JSONObject>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$2
            public final JSONObject invoke(int i6) {
                Object obj = jSONArray.get(i6);
                if (obj != null) {
                    return (JSONObject) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [org.json.JSONObject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
                return invoke(num.intValue());
            }
        }).iterator();
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(@NotNull StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getSrcJson().has("steps");
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(@NotNull Context context, @NotNull StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator childStepIterator$android_sdk_ui_release = getChildStepIterator$android_sdk_ui_release(data);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            BrazeActionParser.INSTANCE.parse$android_sdk_ui_release(context, StepData.copy$default(data, (JSONObject) childStepIterator$android_sdk_ui_release.next(), null, 2, null));
        }
    }
}
