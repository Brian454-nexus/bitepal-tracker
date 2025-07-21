package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1iSDKG18222$AFa1vSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private /* synthetic */ AFi1jSDK AFAdRevenueData;
    private final long getCurrencyIso4217Code;

    public AFi1iSDKG18222$AFa1vSDK(AFi1jSDK aFi1jSDK, long j6) {
        this.AFAdRevenueData = aFi1jSDK;
        this.getCurrencyIso4217Code = j6;
    }

    public final void onComplete(@NotNull Task<IntegrityTokenResponse> task) {
        int i6;
        char c6;
        char c7;
        Object invoke;
        String str;
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            str = ((IntegrityTokenResponse) task.getResult()).token();
            c6 = 2;
            c7 = 1;
            invoke = null;
            i6 = 64180;
        } else {
            try {
                Object[] objArr = {this.AFAdRevenueData, task.getException()};
                Map map = AFi1hSDK.registerClient;
                Object obj = map.get(2144477203);
                if (obj != null) {
                    c6 = 2;
                    c7 = 1;
                    i6 = 64180;
                } else {
                    i6 = 64180;
                    c6 = 2;
                    c7 = 1;
                    obj = ((Class) AFi1hSDK.getMonetizationNetwork(AndroidCharacter.getMirror('0') - 11, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (64180 - Color.red(0)))).getMethod("getMonetizationNetwork", (Class) AFi1hSDK.getMonetizationNetwork(38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64179)), Exception.class);
                    map.put(2144477203, obj);
                }
                invoke = ((Method) obj).invoke(null, objArr);
                str = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        AFi1jSDK aFi1jSDK = this.AFAdRevenueData;
        long j6 = this.getCurrencyIso4217Code;
        Object[] objArr2 = new Object[4];
        objArr2[3] = invoke;
        objArr2[c6] = str;
        objArr2[c7] = Long.valueOf(j6);
        objArr2[0] = aFi1jSDK;
        Map map2 = AFi1hSDK.registerClient;
        Object obj2 = map2.get(1691062553);
        if (obj2 == null) {
            obj2 = ((Class) AFi1hSDK.getMonetizationNetwork((ViewConfiguration.getScrollBarSize() >> 8) + 37, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-16713036) - Color.rgb(0, 0, 0)))).getMethod("getMonetizationNetwork", (Class) AFi1hSDK.getMonetizationNetwork(Gravity.getAbsoluteGravity(0, 0) + 37, Process.getGidForName("") + 1, (char) ((-16713036) - Color.rgb(0, 0, 0))), Long.TYPE, String.class, String.class);
            map2.put(1691062553, obj2);
        }
        ((Method) obj2).invoke(null, objArr2);
        Object[] objArr3 = {this.AFAdRevenueData};
        Object obj3 = map2.get(-650568520);
        if (obj3 == null) {
            obj3 = ((Class) AFi1hSDK.getMonetizationNetwork(36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ViewConfiguration.getWindowTouchSlop() >> 8, (char) (i6 - TextUtils.indexOf("", "", 0, 0)))).getMethod("getRevenue", (Class) AFi1hSDK.getMonetizationNetwork((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, KeyEvent.normalizeMetaState(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 64181)));
            map2.put(-650568520, obj3);
        }
        ((CountDownLatch) ((Method) obj3).invoke(null, objArr3)).countDown();
    }
}
