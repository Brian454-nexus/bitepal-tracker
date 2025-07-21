package com.braze.managers;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.util.EnumSet] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.EnumSet] */
    public final EnumSet a(BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
        if (!appConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
            objectRef.element = appConfigurationProvider.getCustomLocationProviderNames();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.G1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.j.a(Ref.ObjectRef.this);
                }
            }, 6, (Object) null);
        }
        T element = objectRef.element;
        Intrinsics.checkNotNullExpressionValue(element, "element");
        return (EnumSet) element;
    }

    public static final String a(Ref.ObjectRef objectRef) {
        return "Using location providers: " + objectRef.element;
    }
}
