package P0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import n0.AbstractC1809a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class A extends AbstractC0714w {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3915b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3916c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3917d;

    /* renamed from: e, reason: collision with root package name */
    public final I f3918e;

    public A(Activity activity, Context context, Handler handler, int i6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f3914a = activity;
        this.f3915b = context;
        this.f3916c = handler;
        this.f3917d = i6;
        this.f3918e = new J();
    }

    public final Activity e() {
        return this.f3914a;
    }

    public final Context f() {
        return this.f3915b;
    }

    public final I g() {
        return this.f3918e;
    }

    public final Handler h() {
        return this.f3916c;
    }

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object j();

    public abstract LayoutInflater k();

    public void l(AbstractComponentCallbacksC0708p fragment, Intent intent, int i6, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i6 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC1809a.startActivity(this.f3915b, intent, bundle);
    }

    public abstract void m();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(AbstractActivityC0712u activity) {
        this(activity, activity, new Handler(), 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
