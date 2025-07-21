package d3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import i3.InterfaceC1511b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d3.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1186e extends AbstractC1189h {

    /* renamed from: f, reason: collision with root package name */
    public final BroadcastReceiver f13485f;

    /* renamed from: d3.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            AbstractC1186e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1186e(Context context, InterfaceC1511b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f13485f = new a();
    }

    @Override // d3.AbstractC1189h
    public void h() {
        String str;
        W2.k e6 = W2.k.e();
        str = AbstractC1187f.f13487a;
        e6.a(str, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f13485f, j());
    }

    @Override // d3.AbstractC1189h
    public void i() {
        String str;
        W2.k e6 = W2.k.e();
        str = AbstractC1187f.f13487a;
        e6.a(str, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f13485f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
