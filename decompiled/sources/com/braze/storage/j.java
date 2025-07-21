package com.braze.storage;

import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import ga.J;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f12926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f12926b = pVar;
        this.f12927c = arrayList;
    }

    public static final String a(String str) {
        return com.braze.j.a("Removing card from storage with id: ", str);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f12926b, this.f12927c, continuation);
        jVar.f12925a = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12925a;
        SharedPreferences.Editor edit = this.f12926b.f12945i.edit();
        Iterator it = this.f12927c.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.j.a(str);
                }
            }, 7, (Object) null);
            edit.remove(str);
        }
        edit.apply();
        return Unit.INSTANCE;
    }
}
