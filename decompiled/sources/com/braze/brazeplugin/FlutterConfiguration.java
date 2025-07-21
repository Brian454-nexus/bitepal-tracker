package com.braze.brazeplugin;

import android.annotation.SuppressLint;
import android.content.Context;
import com.braze.ui.inappmessage.InAppMessageOperation;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/brazeplugin/FlutterConfiguration;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isAutomaticInitializationEnabled", "", "automaticIntegrationInAppMessageOperation", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "Companion", "braze_plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlutterConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterConfiguration.kt\ncom/braze/brazeplugin/FlutterConfiguration\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,47:1\n8641#2,2:48\n8901#2,4:50\n*S KotlinDebug\n*F\n+ 1 FlutterConfiguration.kt\ncom/braze/brazeplugin/FlutterConfiguration\n*L\n43#1:48,2\n43#1:50,4\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class FlutterConfiguration {

    @NotNull
    private static final Map<String, InAppMessageOperation> IAM_OPERATION_ENUM_MAP;

    @NotNull
    private final Context context;

    static {
        InAppMessageOperation[] values = InAppMessageOperation.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (InAppMessageOperation inAppMessageOperation : values) {
            linkedHashMap.put(inAppMessageOperation.name(), inAppMessageOperation);
        }
        IAM_OPERATION_ENUM_MAP = linkedHashMap;
    }

    public FlutterConfiguration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @SuppressLint({"DiscouragedApi"})
    @NotNull
    public final InAppMessageOperation automaticIntegrationInAppMessageOperation() {
        InAppMessageOperation inAppMessageOperation = InAppMessageOperation.DISPLAY_NOW;
        int identifier = this.context.getResources().getIdentifier("com_braze_flutter_automatic_integration_iam_operation", "string", this.context.getPackageName());
        if (identifier != 0) {
            try {
                String string = this.context.getResources().getString(identifier);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                InAppMessageOperation inAppMessageOperation2 = IAM_OPERATION_ENUM_MAP.get(upperCase);
                if (inAppMessageOperation2 != null) {
                    return inAppMessageOperation2;
                }
            } catch (Exception unused) {
            }
        }
        return inAppMessageOperation;
    }

    @SuppressLint({"DiscouragedApi"})
    public final boolean isAutomaticInitializationEnabled() {
        int identifier = this.context.getResources().getIdentifier("com_braze_flutter_enable_automatic_integration_initializer", "bool", this.context.getPackageName());
        if (identifier != 0) {
            try {
                return this.context.getResources().getBoolean(identifier);
            } catch (Exception unused) {
                return true;
            }
        }
        return true;
    }
}
