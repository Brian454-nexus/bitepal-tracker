package androidx.credentials.playservices;

import E0.a;
import Q5.f;
import Q5.g;
import Q5.i;
import Q5.j;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l6.u;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ)\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "x", "r", "Landroid/os/ResultReceiver;", "resultReceiver", "", "errName", "errMsg", "y", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "u", "l", "o", "a", "Landroid/os/ResultReceiver;", "", "b", "Z", "mWaitingForActivityResult", "c", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class HiddenActivity extends Activity {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ResultReceiver resultReceiver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean mWaitingForActivityResult;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8635b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i6) {
            super(1);
            this.f8635b = i6;
        }

        public final void a(Q5.c cVar) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(cVar.C().getIntentSender(), this.f8635b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e6) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                Intrinsics.checkNotNull(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e6.getMessage());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q5.c) obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8637b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i6) {
            super(1);
            this.f8637b = i6;
        }

        public final void a(j jVar) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(jVar.C().getIntentSender(), this.f8637b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e6) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                Intrinsics.checkNotNull(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e6.getMessage());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((j) obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i6) {
            super(1);
            this.f8639b = i6;
        }

        public final void a(PendingIntent result) {
            Intrinsics.checkNotNullParameter(result, "result");
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(result.getIntentSender(), this.f8639b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e6) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                Intrinsics.checkNotNull(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e6.getMessage());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingIntent) obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends Lambda implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i6) {
            super(1);
            this.f8641b = i6;
        }

        public final void a(PendingIntent pendingIntent) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f8641b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e6) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                Intrinsics.checkNotNull(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e6.getMessage());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingIntent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final void m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void n(HiddenActivity this$0, Exception e6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e6, "e");
        String str = ((e6 instanceof com.google.android.gms.common.api.b) && a.f872a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e6).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = this$0.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        this$0.y(resultReceiver, str, "During begin sign in, failure response from one tap: " + e6.getMessage());
    }

    public static final void p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void q(HiddenActivity this$0, Exception e6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e6, "e");
        String str = ((e6 instanceof com.google.android.gms.common.api.b) && a.f872a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e6).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = this$0.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        this$0.y(resultReceiver, str, "During save password, found password failure response from one tap " + e6.getMessage());
    }

    public static final void s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void t(HiddenActivity this$0, Exception e6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e6, "e");
        String str = ((e6 instanceof com.google.android.gms.common.api.b) && a.f872a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e6).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = this$0.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        this$0.y(resultReceiver, str, "During create public key credential, fido registration failure: " + e6.getMessage());
    }

    public static final void v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void w(HiddenActivity this$0, Exception e6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e6, "e");
        String str = ((e6 instanceof com.google.android.gms.common.api.b) && a.f872a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e6).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = this$0.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        this$0.y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e6.getMessage());
    }

    public final void l() {
        Task task;
        Q5.b parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (parcelableExtra != null) {
            Task beginSignIn = g.b(this).beginSignIn(parcelableExtra);
            final b bVar = new b(intExtra);
            task = beginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: D0.g
                public final void onSuccess(Object obj) {
                    HiddenActivity.m(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: D0.h
                public final void onFailure(Exception exc) {
                    HiddenActivity.n(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    public final void o() {
        Task task;
        i parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (parcelableExtra != null) {
            Task savePassword = g.a(this).savePassword(parcelableExtra);
            final c cVar = new c(intExtra);
            task = savePassword.addOnSuccessListener(new OnSuccessListener() { // from class: D0.c
                public final void onSuccess(Object obj) {
                    HiddenActivity.p(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: D0.d
                public final void onFailure(Exception exc) {
                    HiddenActivity.q(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", requestCode);
        bundle.putParcelable("RESULT_DATA", data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(resultCode, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        x(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        u();
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }

    public final void r() {
        Task task;
        u parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (parcelableExtra != null) {
            Task d6 = j6.a.a(this).d(parcelableExtra);
            final d dVar = new d(intExtra);
            task = d6.addOnSuccessListener(new OnSuccessListener() { // from class: D0.a
                public final void onSuccess(Object obj) {
                    HiddenActivity.s(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: D0.b
                public final void onFailure(Exception exc) {
                    HiddenActivity.t(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    public final void u() {
        Task task;
        f parcelableExtra = getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (parcelableExtra != null) {
            Task signInIntent = g.b(this).getSignInIntent(parcelableExtra);
            final e eVar = new e(intExtra);
            task = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: D0.e
                public final void onSuccess(Object obj) {
                    HiddenActivity.v(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: D0.f
                public final void onFailure(Exception exc) {
                    HiddenActivity.w(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    public final void x(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    public final void y(ResultReceiver resultReceiver, String errName, String errMsg) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", errName);
        bundle.putString("EXCEPTION_MESSAGE", errMsg);
        resultReceiver.send(IntCompanionObject.MAX_VALUE, bundle);
        finish();
    }
}
