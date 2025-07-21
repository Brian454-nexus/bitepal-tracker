package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f11806a;

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f11807b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11808c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11809d;

    /* renamed from: e, reason: collision with root package name */
    public int f11810e;

    public final Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f11808c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f11806a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f11807b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f11809d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f11810e = bundle.getInt("activity_code", 100);
            return;
        }
        zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f11810e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f11809d = true;
                this.f11810e = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f11806a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f11807b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f11810e = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f11808c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f11810e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e6) {
            zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e6);
            ResultReceiver resultReceiver = this.f11806a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f11807b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent b6 = b();
                    if (this.f11809d) {
                        b6.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    b6.putExtra("RESPONSE_CODE", 6);
                    b6.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(b6);
                }
            }
            this.f11808c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f11808c) {
            Intent b6 = b();
            b6.putExtra("RESPONSE_CODE", 1);
            b6.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i6 = this.f11810e;
            if (i6 == 110 || i6 == 100) {
                b6.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(b6);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f11806a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f11807b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f11808c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f11809d);
        bundle.putInt("activity_code", this.f11810e);
    }
}
