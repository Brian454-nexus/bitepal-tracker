package d3;

import android.content.Context;
import i3.InterfaceC1511b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1189h f13501a;

    /* renamed from: b, reason: collision with root package name */
    public final C1184c f13502b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1189h f13503c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1189h f13504d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, InterfaceC1511b taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    public final AbstractC1189h a() {
        return this.f13501a;
    }

    public final C1184c b() {
        return this.f13502b;
    }

    public final AbstractC1189h c() {
        return this.f13503c;
    }

    public final AbstractC1189h d() {
        return this.f13504d;
    }

    public n(Context context, InterfaceC1511b taskExecutor, AbstractC1189h batteryChargingTracker, C1184c batteryNotLowTracker, AbstractC1189h networkStateTracker, AbstractC1189h storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f13501a = batteryChargingTracker;
        this.f13502b = batteryNotLowTracker;
        this.f13503c = networkStateTracker;
        this.f13504d = storageNotLowTracker;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ n(android.content.Context r8, i3.InterfaceC1511b r9, d3.AbstractC1189h r10, d3.C1184c r11, d3.AbstractC1189h r12, d3.AbstractC1189h r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            d3.a r0 = new d3.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            d3.c r0 = new d3.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            d3.h r0 = d3.k.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            d3.l r0 = new d3.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L53
        L4f:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L53:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.n.<init>(android.content.Context, i3.b, d3.h, d3.c, d3.h, d3.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
