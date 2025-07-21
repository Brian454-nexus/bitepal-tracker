package com.braze.models;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends n {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l() {
        /*
            r6 = this;
            com.braze.models.o r1 = new com.braze.models.o
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r2 = "randomUUID(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1.<init>(r0)
            double r2 = com.braze.support.DateTimeUtils.nowInSecondsPrecise()
            java.lang.String r0 = "sessionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r5 = 0
            r4 = 0
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.l.<init>():void");
    }

    @Override // com.braze.models.n
    public final Double d() {
        return this.f12600c;
    }

    @Override // com.braze.models.n
    public final String toString() {
        return "\nMutableSession(sessionId=" + this.f12598a + ", startTime=" + this.f12599b + ", endTime=" + this.f12600c + ", isSealed=" + this.f12601d + ", duration=" + c() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o sessionId, double d6, Double d7, boolean z6) {
        super(sessionId, d6, d7, z6);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }
}
