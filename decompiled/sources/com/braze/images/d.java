package com.braze.images;

import android.content.Context;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f12320b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, Continuation continuation) {
        super(2, continuation);
        this.f12319a = context;
        this.f12320b = defaultBrazeImageLoader;
    }

    public static final String a() {
        return "Initializing disk cache";
    }

    public static final String b() {
        return "Disk cache initialized";
    }

    public static final String c() {
        return "Caught exception creating new disk cache. Unable to create new disk cache";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f12319a, this.f12320b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f12319a, this.f12320b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ReentrantLock reentrantLock;
        String str;
        String str2;
        String str3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        c cVar = DefaultBrazeImageLoader.Companion;
        Context context = this.f12319a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("appboy.imageloader.lru.cache", "uniqueName");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        File file = new File(com.braze.c.a(sb, File.separator, "appboy.imageloader.lru.cache"));
        reentrantLock = this.f12320b.diskCacheLock;
        DefaultBrazeImageLoader defaultBrazeImageLoader = this.f12320b;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                str2 = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.images.d.a();
                    }
                }, 14, (Object) null);
                defaultBrazeImageLoader.diskLruCache = new a(file);
                str3 = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.images.d.b();
                    }
                }, 14, (Object) null);
                defaultBrazeImageLoader.isDiskCacheStarting = false;
            } catch (Exception e6) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                str = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger2, str, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Y3.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.images.d.c();
                    }
                }, 8, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return unit;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
