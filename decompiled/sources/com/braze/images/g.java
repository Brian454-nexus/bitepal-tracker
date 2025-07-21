package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.widget.ImageView;
import com.braze.R$string;
import com.braze.enums.BrazeViewBounds;
import com.braze.j;
import com.braze.support.BrazeLogger;
import ga.G0;
import ga.J;
import ga.Y;
import ga.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f12326a;

    /* renamed from: b, reason: collision with root package name */
    public int f12327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f12328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f12329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f12331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImageView f12332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.f12328c = defaultBrazeImageLoader;
        this.f12329d = context;
        this.f12330e = str;
        this.f12331f = brazeViewBounds;
        this.f12332g = imageView;
    }

    public static final String a(String str) {
        return j.a("Failed to retrieve bitmap from url: ", str);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f12328c, this.f12329d, this.f12330e, this.f12331f, this.f12332g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12327b;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            TrafficStats.setThreadStatsTag(1337);
            Bitmap bitmapFromUrl = this.f12328c.getBitmapFromUrl(this.f12329d, this.f12330e, this.f12331f);
            if (bitmapFromUrl == null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                str = DefaultBrazeImageLoader.TAG;
                final String str2 = this.f12330e;
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.images.g.a(str2);
                    }
                }, 14, (Object) null);
            } else {
                String str3 = this.f12330e;
                Object tag = this.f12332g.getTag(R$string.com_braze_image_lru_cache_image_url_key);
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
                if (Intrinsics.areEqual(str3, (String) tag)) {
                    G0 c6 = Y.c();
                    e eVar = new e(this.f12332g, bitmapFromUrl, null);
                    this.f12326a = bitmapFromUrl;
                    this.f12327b = 1;
                    if (i.g(c6, eVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bitmap = bitmapFromUrl;
                }
            }
            return Unit.INSTANCE;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bitmap = this.f12326a;
        ResultKt.throwOnFailure(obj);
        BrazeViewBounds brazeViewBounds = this.f12331f;
        ImageView imageView = this.f12332g;
        imageView.addOnLayoutChangeListener(new f(brazeViewBounds, imageView, bitmap));
        return Unit.INSTANCE;
    }
}
