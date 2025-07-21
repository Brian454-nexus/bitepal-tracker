package com.braze.ui.actions.brazeactions;

import android.net.Uri;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u0004\u0018\u00010\u0002H\u0000\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¨\u0006\u000f"}, d2 = {"containsAnyPushPermissionBrazeActions", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "containsInvalidBrazeAction", "Lcom/braze/models/cards/Card;", "getAllUris", "", "Landroid/net/Uri;", "getAllBrazeActionStepTypes", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "json", "Lorg/json/JSONObject;", "doAnyTypesMatch", "actionType", "uriList", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "BrazeActionUtils")
@SourceDebugExtension({"SMAP\nBrazeActionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeActionUtils.kt\ncom/braze/ui/actions/brazeactions/BrazeActionUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,92:1\n1#2:93\n1#2:104\n1611#3,9:94\n1863#3:103\n1864#3:105\n1620#3:106\n774#3:109\n865#3,2:110\n1557#3:112\n1628#3,3:113\n1368#3:116\n1454#3,5:117\n1755#3,3:122\n32#4,2:107\n*S KotlinDebug\n*F\n+ 1 BrazeActionUtils.kt\ncom/braze/ui/actions/brazeactions/BrazeActionUtils\n*L\n57#1:104\n57#1:94,9\n57#1:103\n57#1:105\n57#1:106\n85#1:109\n85#1:110,2\n89#1:112\n89#1:113,3\n90#1:116\n90#1:117,5\n91#1:122,3\n71#1:107,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class BrazeActionUtils {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeActionParser.ActionType.values().length];
            try {
                iArr[BrazeActionParser.ActionType.CONTAINER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean containsAnyPushPermissionBrazeActions(@NotNull IInAppMessage iInAppMessage) {
        Intrinsics.checkNotNullParameter(iInAppMessage, "<this>");
        return doAnyTypesMatch(BrazeActionParser.ActionType.REQUEST_PUSH_PERMISSION, getAllUris(iInAppMessage));
    }

    public static final boolean containsInvalidBrazeAction(@NotNull IInAppMessage iInAppMessage) {
        Intrinsics.checkNotNullParameter(iInAppMessage, "<this>");
        return doAnyTypesMatch(BrazeActionParser.ActionType.INVALID, getAllUris(iInAppMessage));
    }

    public static final boolean doAnyTypesMatch(@NotNull BrazeActionParser.ActionType actionType, @NotNull List<? extends Uri> uriList) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : uriList) {
            if (BrazeActionParser.INSTANCE.isBrazeActionUri((Uri) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair brazeActionVersionAndJson$android_sdk_ui_release = BrazeActionParser.INSTANCE.getBrazeActionVersionAndJson$android_sdk_ui_release((Uri) it.next());
            if (brazeActionVersionAndJson$android_sdk_ui_release == null || (jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.getSecond()) == null) {
                jSONObject = new JSONObject();
            }
            arrayList2.add(jSONObject);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList3, getAllBrazeActionStepTypes((JSONObject) it2.next()));
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            if (((BrazeActionParser.ActionType) it3.next()) == actionType) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ List getAllBrazeActionStepTypes(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        StepData stepData = new StepData(json, null, 2, null);
        BrazeActionParser.ActionType actionType$android_sdk_ui_release = BrazeActionParser.INSTANCE.getActionType$android_sdk_ui_release(stepData);
        if (WhenMappings.$EnumSwitchMapping$0[actionType$android_sdk_ui_release.ordinal()] != 1) {
            arrayList.add(actionType$android_sdk_ui_release);
            return arrayList;
        }
        Iterator childStepIterator$android_sdk_ui_release = ContainerStep.INSTANCE.getChildStepIterator$android_sdk_ui_release(stepData);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            arrayList.addAll(getAllBrazeActionStepTypes((JSONObject) childStepIterator$android_sdk_ui_release.next()));
        }
        return arrayList;
    }

    public static final /* synthetic */ List getAllUris(IInAppMessage iInAppMessage) {
        if (iInAppMessage == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Uri internalUri = iInAppMessage.getInternalUri();
        if (internalUri != null) {
            arrayList.add(internalUri);
        }
        if (iInAppMessage instanceof IInAppMessageImmersive) {
            List<MessageButton> messageButtons = ((IInAppMessageImmersive) iInAppMessage).getMessageButtons();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = messageButtons.iterator();
            while (it.hasNext()) {
                Uri uri = ((MessageButton) it.next()).getUri();
                if (uri != null) {
                    arrayList2.add(uri);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static final boolean containsInvalidBrazeAction(@NotNull Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        if (card.getUrl() != null) {
            return doAnyTypesMatch(BrazeActionParser.ActionType.INVALID, CollectionsKt.listOf(Uri.parse(card.getUrl())));
        }
        return false;
    }
}
