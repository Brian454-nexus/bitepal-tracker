package androidx.work.impl.background.systemalarm;

import W2.k;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import b3.C1089e;
import b3.InterfaceC1087c;
import f3.u;
import f3.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f10292e = k.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10294b;

    /* renamed from: c, reason: collision with root package name */
    public final d f10295c;

    /* renamed from: d, reason: collision with root package name */
    public final C1089e f10296d;

    public b(Context context, int i6, d dVar) {
        this.f10293a = context;
        this.f10294b = i6;
        this.f10295c = dVar;
        this.f10296d = new C1089e(dVar.g().q(), (InterfaceC1087c) null);
    }

    public void a() {
        List<u> g6 = this.f10295c.g().r().J().g();
        ConstraintProxy.a(this.f10293a, g6);
        this.f10296d.b(g6);
        ArrayList<u> arrayList = new ArrayList(g6.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (u uVar : g6) {
            String str = uVar.f14117a;
            if (currentTimeMillis >= uVar.c() && (!uVar.h() || this.f10296d.e(str))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str2 = uVar2.f14117a;
            Intent c6 = a.c(this.f10293a, x.a(uVar2));
            k.e().a(f10292e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f10295c.f().a().execute(new d.b(this.f10295c, c6, this.f10294b));
        }
        this.f10296d.a();
    }
}
