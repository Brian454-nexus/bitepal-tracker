package k3;

import B9.a;
import G9.i;
import G9.j;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\tR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk3/a;", "LB9/a;", "LG9/j$c;", "<init>", "()V", "LB9/a$b;", "flutterPluginBinding", "", "onAttachedToEngine", "(LB9/a$b;)V", "LG9/i;", "call", "LG9/j$d;", "result", "onMethodCall", "(LG9/i;LG9/j$d;)V", "binding", "onDetachedFromEngine", "LG9/j;", "a", "LG9/j;", AppsFlyerProperties.CHANNEL, "rive_common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1680a implements B9.a, j.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public j channel;

    public void onAttachedToEngine(a.b flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        j jVar = new j(flutterPluginBinding.b(), "rive");
        this.channel = jVar;
        jVar.e(this);
    }

    public void onDetachedFromEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        j jVar = this.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    public void onMethodCall(i call, j.d result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(call.a, "loadRiveLibrary")) {
            try {
                System.loadLibrary("rive_text");
                result.a((Object) null);
                return;
            } catch (Throwable th) {
                result.b(th.toString(), (String) null, (Object) null);
                return;
            }
        }
        if (!Intrinsics.areEqual(call.a, "getPlatformVersion")) {
            result.c();
            return;
        }
        result.a("Android " + Build.VERSION.RELEASE);
    }
}
