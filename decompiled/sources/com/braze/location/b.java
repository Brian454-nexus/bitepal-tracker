package com.braze.location;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {
    public b(Context context, EnumSet allowedProviders, BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        try {
            Object newInstance = Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.braze.location.IBrazeLocationApi");
            android.support.v4.media.session.b.a(newInstance);
        } catch (Exception unused) {
        }
    }
}
