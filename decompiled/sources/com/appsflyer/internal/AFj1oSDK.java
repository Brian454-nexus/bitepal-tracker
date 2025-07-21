package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFj1oSDK;", "", "", "", "getCurrencyIso4217Code", "()Ljava/util/Map;", "", "getMediationNetwork", "()V", "getRevenue", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFj1oSDK {

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getMonetizationNetwork;

    /* renamed from: com.appsflyer.internal.AFj1oSDK$AFa1tSDK, reason: from kotlin metadata */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion getMonetizationNetwork = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Map<String, Object> getCurrencyIso4217Code();

    void getMediationNetwork();

    void getRevenue();
}
