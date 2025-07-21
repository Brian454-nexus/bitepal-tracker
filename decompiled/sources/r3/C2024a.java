package r3;

import P0.AbstractActivityC0712u;
import P0.AbstractComponentCallbacksC0708p;
import P0.I;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x3.i;
import y3.InterfaceC2355a;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2024a extends I.k {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f18700a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2355a f18701b;

    public C2024a(Function2 track, InterfaceC2355a logger) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f18700a = track;
        this.f18701b = logger;
    }

    @Override // P0.I.k
    public void i(I fm, AbstractComponentCallbacksC0708p f6) {
        Object obj;
        Object obj2;
        String str;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f6, "f");
        super.i(fm, f6);
        String canonicalName = f6.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = f6.getClass().getSimpleName();
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(f6.getResources().getResourceEntryName(f6.getId()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            this.f18701b.a("Failed to get resource entry name: " + th2);
        }
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        try {
            AbstractActivityC0712u activity = f6.getActivity();
            if (activity != null) {
                i.a aVar = i.f20543c;
                Intrinsics.checkNotNull(activity);
                str = aVar.a(activity);
            } else {
                str = null;
            }
            obj2 = Result.constructor-impl(str);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj2);
        if (th4 != null) {
            this.f18701b.a("Failed to get screen name: " + th4);
        }
        this.f18700a.invoke("[Amplitude] Fragment Viewed", MapsKt.mapOf(new Pair[]{TuplesKt.to("[Amplitude] Fragment Class", canonicalName), TuplesKt.to("[Amplitude] Fragment Identifier", str2), TuplesKt.to("[Amplitude] Screen Name", (String) (Result.isFailure-impl(obj2) ? null : obj2)), TuplesKt.to("[Amplitude] Fragment Tag", f6.getTag())}));
    }
}
