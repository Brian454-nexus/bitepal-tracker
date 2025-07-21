package com.braze.ui.actions.brazeactions.steps;

import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000e\b\u0080\b\u0018\u0000 62\u00020\u0001:\u00016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00102\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00101¨\u00067"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData;", "", "Lorg/json/JSONObject;", "srcJson", "Lcom/braze/enums/Channel;", AppsFlyerProperties.CHANNEL, "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)V", "", "index", "getArg$android_sdk_ui_release", "(I)Ljava/lang/Object;", "getArg", "Lcom/braze/models/outgoing/BrazeProperties;", "coerceArgToPropertiesOrNull", "(I)Lcom/braze/models/outgoing/BrazeProperties;", "fixedArgCount", "Lkotlin/ranges/IntRange;", "rangedArgCount", "", "isArgCountInBounds", "(ILkotlin/ranges/IntRange;)Z", "isArgString", "(I)Z", "isArgOptionalJsonObject", "", "toString", "()Ljava/lang/String;", "copy", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)Lcom/braze/ui/actions/brazeactions/steps/StepData;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/json/JSONObject;", "getSrcJson", "()Lorg/json/JSONObject;", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "", "args$delegate", "Lkotlin/Lazy;", "getArgs", "()Ljava/util/List;", "args", "firstArg$delegate", "getFirstArg", "()Ljava/lang/Object;", "firstArg", "secondArg$delegate", "getSecondArg", "secondArg", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepData.kt\ncom/braze/ui/actions/brazeactions/steps/StepData\n+ 2 JsonUtils.kt\ncom/braze/support/JsonUtils\n*L\n1#1,96:1\n322#2,9:97\n*S KotlinDebug\n*F\n+ 1 StepData.kt\ncom/braze/ui/actions/brazeactions/steps/StepData\n*L\n21#1:97,9\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class StepData {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy args;

    @NotNull
    private final Channel channel;

    /* renamed from: firstArg$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy firstArg;

    /* renamed from: secondArg$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy secondArg;

    @NotNull
    private final JSONObject srcJson;

    public StepData(@NotNull JSONObject srcJson, @NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.srcJson = srcJson;
        this.channel = channel;
        this.args = LazyKt.lazy(new Function0() { // from class: y4.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List args_delegate$lambda$0;
                args_delegate$lambda$0 = StepData.args_delegate$lambda$0(StepData.this);
                return args_delegate$lambda$0;
            }
        });
        this.firstArg = LazyKt.lazy(new Function0() { // from class: y4.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object arg$android_sdk_ui_release;
                arg$android_sdk_ui_release = StepData.this.getArg$android_sdk_ui_release(0);
                return arg$android_sdk_ui_release;
            }
        });
        this.secondArg = LazyKt.lazy(new Function0() { // from class: y4.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object arg$android_sdk_ui_release;
                arg$android_sdk_ui_release = StepData.this.getArg$android_sdk_ui_release(1);
                return arg$android_sdk_ui_release;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List args_delegate$lambda$0(StepData stepData) {
        final JSONArray optJSONArray = stepData.srcJson.optJSONArray("args");
        return SequencesKt.toList(SequencesKt.asSequence(optJSONArray == null ? CollectionsKt.emptyList().iterator() : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Boolean invoke(int i6) {
                return Boolean.valueOf(Objects.nonNull(optJSONArray.opt(i6)));
            }
        }), new Function1<Integer, Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$2
            public final Object invoke(int i6) {
                Object obj = optJSONArray.get(i6);
                if (obj != null) {
                    return obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }).iterator()));
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i6 & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    private final List<Object> getArgs() {
        return (List) this.args.getValue();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i6, IntRange intRange, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = -1;
        }
        if ((i7 & 2) != 0) {
            intRange = null;
        }
        return stepData.isArgCountInBounds(i6, intRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$3(int i6, StepData stepData) {
        return "Expected " + i6 + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$4(IntRange intRange, StepData stepData) {
        return "Expected " + intRange + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgOptionalJsonObject$lambda$6(int i6, StepData stepData) {
        return "Argument [" + i6 + "] is not a JSONObject. Source: " + stepData.srcJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgString$lambda$5(int i6, StepData stepData) {
        return "Argument [" + i6 + "] is not a String. Source: " + stepData.srcJson;
    }

    @Nullable
    public final BrazeProperties coerceArgToPropertiesOrNull(int index) {
        Object orNull = CollectionsKt.getOrNull(getArgs(), index);
        if (orNull == null || !(orNull instanceof JSONObject)) {
            return null;
        }
        return new BrazeProperties((JSONObject) orNull);
    }

    @NotNull
    public final StepData copy(@NotNull JSONObject srcJson, @NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new StepData(srcJson, channel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        return Intrinsics.areEqual(this.srcJson, stepData.srcJson) && this.channel == stepData.channel;
    }

    @Nullable
    public final Object getArg$android_sdk_ui_release(int index) {
        return CollectionsKt.getOrNull(getArgs(), index);
    }

    @NotNull
    public final Channel getChannel() {
        return this.channel;
    }

    @Nullable
    public final Object getFirstArg() {
        return this.firstArg.getValue();
    }

    @Nullable
    public final Object getSecondArg() {
        return this.secondArg.getValue();
    }

    @NotNull
    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public int hashCode() {
        return (this.srcJson.hashCode() * 31) + this.channel.hashCode();
    }

    public final boolean isArgCountInBounds(final int fixedArgCount, @Nullable final IntRange rangedArgCount) {
        if (fixedArgCount != -1 && getArgs().size() != fixedArgCount) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: y4.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isArgCountInBounds$lambda$3;
                    isArgCountInBounds$lambda$3 = StepData.isArgCountInBounds$lambda$3(fixedArgCount, this);
                    return isArgCountInBounds$lambda$3;
                }
            }, 7, (Object) null);
            return false;
        }
        if (rangedArgCount == null || rangedArgCount.contains(getArgs().size())) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: y4.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isArgCountInBounds$lambda$4;
                isArgCountInBounds$lambda$4 = StepData.isArgCountInBounds$lambda$4(IntRange.this, this);
                return isArgCountInBounds$lambda$4;
            }
        }, 7, (Object) null);
        return false;
    }

    public final boolean isArgOptionalJsonObject(final int index) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(index);
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: y4.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isArgOptionalJsonObject$lambda$6;
                isArgOptionalJsonObject$lambda$6 = StepData.isArgOptionalJsonObject$lambda$6(index, this);
                return isArgOptionalJsonObject$lambda$6;
            }
        }, 7, (Object) null);
        return false;
    }

    public final boolean isArgString(final int index) {
        if (getArg$android_sdk_ui_release(index) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: y4.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isArgString$lambda$5;
                isArgString$lambda$5 = StepData.isArgString$lambda$5(index, this);
                return isArgString$lambda$5;
            }
        }, 7, (Object) null);
        return false;
    }

    @NotNull
    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i6 & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
