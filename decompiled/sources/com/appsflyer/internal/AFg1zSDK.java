package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1zSDK extends AFe1eSDK<AFf1bSDK> {
    private final AFg1ySDK areAllFieldsValid;
    public AFi1ySDK component1;
    public final AFg1xSDK component2;
    public AFf1bSDK component3;
    private final AFd1qSDK component4;
    private final String copy;
    private final AFg1wSDK copydefault;
    private final AFg1sSDK equals;
    private final AFg1vSDK hashCode;
    private final AFe1qSDK toString;

    public AFg1zSDK(@NonNull AFg1ySDK aFg1ySDK, @NonNull AFd1qSDK aFd1qSDK, @NonNull AFg1wSDK aFg1wSDK, @NonNull AFg1vSDK aFg1vSDK, @NonNull AFe1qSDK aFe1qSDK, @NonNull AFg1sSDK aFg1sSDK, @NonNull String str, AFg1xSDK aFg1xSDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.areAllFieldsValid = aFg1ySDK;
        this.component4 = aFd1qSDK;
        this.copydefault = aFg1wSDK;
        this.hashCode = aFg1vSDK;
        this.toString = aFe1qSDK;
        this.equals = aFg1sSDK;
        this.copy = str;
        this.component2 = aFg1xSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFf1bSDK areAllFieldsValid() {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1zSDK.areAllFieldsValid():com.appsflyer.internal.AFf1bSDK");
    }

    private void getRevenue(String str, long j6, AFi1wSDK aFi1wSDK, String str2, AFe1kSDK<AFi1vSDK> aFe1kSDK) {
        getMonetizationNetwork(str, j6, aFe1kSDK, aFe1kSDK != null ? aFe1kSDK.getBody() : null, aFi1wSDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NonNull
    public final AFe1cSDK AFAdRevenueData() {
        try {
            AFf1bSDK areAllFieldsValid = areAllFieldsValid();
            this.component3 = areAllFieldsValid;
            return areAllFieldsValid == AFf1bSDK.FAILURE ? AFe1cSDK.FAILURE : AFe1cSDK.SUCCESS;
        } catch (InterruptedIOException e6) {
            e = e6;
            AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        } catch (InterruptedException e7) {
            e = e7;
            AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 1500L;
    }

    private void getMonetizationNetwork(String str, long j6, AFe1kSDK<?> aFe1kSDK, AFi1vSDK aFi1vSDK, AFi1wSDK aFi1wSDK, String str2, Throwable th) {
        long j7;
        int i6;
        Throwable th2;
        if (aFe1kSDK != null) {
            j7 = aFe1kSDK.AFAdRevenueData.getRevenue;
            i6 = aFe1kSDK.getStatusCode();
        } else {
            j7 = 0;
            i6 = 0;
        }
        int i7 = i6;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j7 = ((HttpException) th).getMetrics().getRevenue;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.component1 = new AFi1ySDK(aFi1vSDK != null ? aFi1vSDK.getMediationNetwork : null, str, j7, System.currentTimeMillis() - j6, i7, aFi1wSDK, str2, th2);
    }
}
