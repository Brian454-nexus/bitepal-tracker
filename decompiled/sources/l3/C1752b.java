package l3;

import B9.a;
import C9.c;
import G9.i;
import G9.j;
import G9.l;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v.C2158c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\"B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0006J)\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010\f\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0016¨\u0006/"}, d2 = {"Ll3/b;", "LB9/a;", "LG9/j$c;", "LC9/a;", "LG9/l;", "<init>", "()V", "LB9/a$b;", "flutterPluginBinding", "", "onAttachedToEngine", "(LB9/a$b;)V", "binding", "onDetachedFromEngine", "LG9/i;", "call", "LG9/j$d;", "result", "onMethodCall", "(LG9/i;LG9/j$d;)V", "LC9/c;", "onAttachedToActivity", "(LC9/c;)V", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "onDetachedFromActivity", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)Z", "a", "I", "CUSTOM_TABS_REQUEST_CODE", "LG9/j;", "b", "LG9/j;", AppsFlyerProperties.CHANNEL, "c", "LC9/c;", "getBinding", "()LC9/c;", "setBinding", "d", "sign_in_with_apple_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1752b implements B9.a, j.c, C9.a, l {

    /* renamed from: e, reason: collision with root package name */
    public static j.d f17079e;

    /* renamed from: f, reason: collision with root package name */
    public static Function0 f17080f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int CUSTOM_TABS_REQUEST_CODE = 1001;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public j channel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public c binding;

    public static final Unit b(Activity activity) {
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(67108864);
        }
        activity.startActivity(launchIntentForPackage);
        return Unit.INSTANCE;
    }

    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        j.d dVar;
        if (requestCode != this.CUSTOM_TABS_REQUEST_CODE || (dVar = f17079e) == null) {
            return false;
        }
        dVar.b("authorization-error/canceled", "The user closed the Custom Tab", (Object) null);
        f17079e = null;
        f17080f = null;
        return false;
    }

    public void onAttachedToActivity(c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        binding.k(this);
    }

    public void onAttachedToEngine(a.b flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        j jVar = new j(flutterPluginBinding.b(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.channel = jVar;
        jVar.e(this);
    }

    public void onDetachedFromActivity() {
        c cVar = this.binding;
        if (cVar != null) {
            cVar.j(this);
        }
        this.binding = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        j jVar = this.channel;
        if (jVar != null) {
            jVar.e((j.c) null);
        }
        this.channel = null;
    }

    public void onMethodCall(i call, j.d result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.a;
        if (Intrinsics.areEqual(str, "isAvailable")) {
            result.a(Boolean.TRUE);
            return;
        }
        if (!Intrinsics.areEqual(str, "performAuthorizationRequest")) {
            result.c();
            return;
        }
        c cVar = this.binding;
        final Activity f6 = cVar != null ? cVar.f() : null;
        if (f6 == null) {
            result.b("MISSING_ACTIVITY", "Plugin is not attached to an activity", call.b);
            return;
        }
        String str2 = (String) call.a("url");
        if (str2 == null) {
            result.b("MISSING_ARG", "Missing 'url' argument", call.b);
            return;
        }
        j.d dVar = f17079e;
        if (dVar != null) {
            dVar.b("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", (Object) null);
        }
        Function0 function0 = f17080f;
        if (function0 != null) {
            Intrinsics.checkNotNull(function0);
            function0.invoke();
        }
        f17079e = result;
        f17080f = new Function0() { // from class: l3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit b6;
                b6 = C1752b.b(f6);
                return b6;
            }
        };
        C2158c a6 = new C2158c.d().a();
        Intrinsics.checkNotNullExpressionValue(a6, "build(...)");
        a6.f19262a.setData(Uri.parse(str2));
        f6.startActivityForResult(a6.f19262a, this.CUSTOM_TABS_REQUEST_CODE, a6.f19263b);
    }

    public void onReattachedToActivityForConfigChanges(c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onAttachedToActivity(binding);
    }
}
