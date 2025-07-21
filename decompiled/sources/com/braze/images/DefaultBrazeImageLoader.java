package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import com.braze.R$string;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.j;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import ga.L;
import ga.i;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001NB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J9\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J3\u0010-\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\u001a\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060+\u0018\u00010*H\u0007¢\u0006\u0004\b-\u0010.J+\u0010/\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b/\u00100J+\u00102\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00105J\u0019\u00107\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b7\u00105J'\u00109\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00108\u001a\u00020$H\u0007¢\u0006\u0004\b9\u0010:J1\u0010=\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R#\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100A8G¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u00020$2\u0006\u0010I\u001a\u00020$8G@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010K¨\u0006O"}, d2 = {"Lcom/braze/images/DefaultBrazeImageLoader;", "Lcom/braze/images/IBrazeImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "", "renderUrlIntoView", "(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "key", "Landroid/graphics/Bitmap;", "bitmap", "kotlin.jvm.PlatformType", "putBitmapIntoMemCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "initDiskCacheTask", "Lcom/braze/models/cards/Card;", "card", "renderUrlIntoCardView", "(Landroid/content/Context;Lcom/braze/models/cards/Card;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "renderUrlIntoInAppMessageView", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;)V", "Landroid/os/Bundle;", "extras", "getPushBitmapFromUrl", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "getInAppMessageBitmapFromUrl", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "", "isOffline", "setOffline", "(Z)V", "Landroid/net/Uri;", "imageUri", "", "", "headers", "shouldSkipCaching", "(Landroid/net/Uri;Ljava/util/Map;)Z", "getBitmapFromUrl", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/enums/BrazeViewBounds;)Landroid/graphics/Bitmap;", "Lcom/braze/support/a;", "downloadBitmapFromUrl", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lcom/braze/support/a;", "getBitmapFromCache", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "getBitmapFromMemCache", "getBitmapFromDiskCache", "skipDiskCache", "putBitmapIntoCache", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "renderUrlIntoViewTask$android_sdk_base_release", "(Landroid/content/Context;Landroid/widget/ImageView;Lcom/braze/enums/BrazeViewBounds;Ljava/lang/String;)V", "renderUrlIntoViewTask", "Ljava/util/concurrent/locks/ReentrantLock;", "diskCacheLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/util/LruCache;", "memoryCache", "Landroid/util/LruCache;", "getMemoryCache", "()Landroid/util/LruCache;", "Lcom/braze/images/a;", "diskLruCache", "Lcom/braze/images/a;", com.amazon.a.a.o.b.f11195Y, "isDiskCacheStarting", "Z", "()Z", "Companion", "com/braze/images/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final c Companion = new c();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);
    private final ReentrantLock diskCacheLock;
    private a diskLruCache;
    private boolean isDiskCacheStarting;
    private boolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;

    public DefaultBrazeImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.memoryCache = new b(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$13$lambda$12(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
        return "Got bitmap from mem cache for key " + str + "\nMemory cache stats: " + defaultBrazeImageLoader.memoryCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$15$lambda$14(String str) {
        return j.a("Got bitmap from disk cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$16(String str) {
        return j.a("No cache hit for bitmap: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$19$lambda$17(String str) {
        return j.a("Disk cache still starting. Cannot retrieve key from disk cache: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$19$lambda$18(String str) {
        return j.a("Getting bitmap from disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$10() {
        return "Cache is currently in offline mode. Not downloading bitmap.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$11(String str) {
        return j.a("Failed to get bitmap from url. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$8() {
        return "Cannot retrieve bitmap with blank image url";
    }

    private final void initDiskCacheTask(Context context) {
        i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new d(context, this, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$20(String str) {
        return j.a("Adding bitmap to mem cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$21(String str) {
        return j.a("Skipping disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$23$lambda$22(String str) {
        return j.a("Adding bitmap to disk cache for key ", str);
    }

    private final Bitmap putBitmapIntoMemCache(String key, Bitmap bitmap) {
        return this.memoryCache.put(key, bitmap);
    }

    private final void renderUrlIntoView(Context context, final String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String renderUrlIntoView$lambda$1;
                    renderUrlIntoView$lambda$1 = DefaultBrazeImageLoader.renderUrlIntoView$lambda$1();
                    return renderUrlIntoView$lambda$1;
                }
            }, 7, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask$android_sdk_base_release(context, imageView, viewBounds, imageUrl);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: Y3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String renderUrlIntoView$lambda$2;
                    renderUrlIntoView$lambda$2 = DefaultBrazeImageLoader.renderUrlIntoView$lambda$2(imageUrl);
                    return renderUrlIntoView$lambda$2;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$1() {
        return "Cannot retrieve bitmap with a blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$2(String str) {
        return j.a("Failed to render url into view. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setOffline$lambda$0(boolean z6) {
        return "DefaultBrazeImageLoader outbound network requests are now ".concat(z6 ? "disabled" : "enabled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$3(Uri uri) {
        return "Image url specifies that it should not be cached. Not caching " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$7$lambda$6(Map.Entry entry, Uri uri) {
        return "Headers specify that this image should not be cached (" + entry + "). Not caching " + uri;
    }

    public final com.braze.support.a downloadBitmapFromUrl(Context context, Uri imageUri, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (viewBounds == null) {
            viewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, imageUri, viewBounds);
    }

    public final Bitmap getBitmapFromCache(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bitmap bitmap = this.memoryCache.get(key);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Y3.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromCache$lambda$13$lambda$12;
                    bitmapFromCache$lambda$13$lambda$12 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$13$lambda$12(key, this);
                    return bitmapFromCache$lambda$13$lambda$12;
                }
            }, 6, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(key);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromCache$lambda$16;
                    bitmapFromCache$lambda$16 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$16(key);
                    return bitmapFromCache$lambda$16;
                }
            }, 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Y3.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String bitmapFromCache$lambda$15$lambda$14;
                bitmapFromCache$lambda$15$lambda$14 = DefaultBrazeImageLoader.getBitmapFromCache$lambda$15$lambda$14(key);
                return bitmapFromCache$lambda$15$lambda$14;
            }
        }, 6, (Object) null);
        putBitmapIntoMemCache(key, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            a aVar = null;
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Y3.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String bitmapFromDiskCache$lambda$19$lambda$17;
                        bitmapFromDiskCache$lambda$19$lambda$17 = DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$19$lambda$17(key);
                        return bitmapFromDiskCache$lambda$19$lambda$17;
                    }
                }, 6, (Object) null);
            } else {
                a aVar2 = this.diskLruCache;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    aVar2 = null;
                }
                if (aVar2.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Y3.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String bitmapFromDiskCache$lambda$19$lambda$18;
                            bitmapFromDiskCache$lambda$19$lambda$18 = DefaultBrazeImageLoader.getBitmapFromDiskCache$lambda$19$lambda$18(key);
                            return bitmapFromDiskCache$lambda$19$lambda$18;
                        }
                    }, 6, (Object) null);
                    a aVar3 = this.diskLruCache;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        aVar = aVar3;
                    }
                    Bitmap b6 = aVar.b(key);
                    reentrantLock.unlock();
                    return b6;
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Bitmap getBitmapFromMemCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.memoryCache.get(key);
    }

    public final Bitmap getBitmapFromUrl(Context context, final String imageUrl, BrazeViewBounds viewBounds) {
        Bitmap bitmapFromCache;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromUrl$lambda$8;
                    bitmapFromUrl$lambda$8 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$8();
                    return bitmapFromUrl$lambda$8;
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            bitmapFromCache = getBitmapFromCache(imageUrl);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: Y3.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromUrl$lambda$11;
                    bitmapFromUrl$lambda$11 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$11(imageUrl);
                    return bitmapFromUrl$lambda$11;
                }
            }, 4, (Object) null);
        }
        if (bitmapFromCache != null) {
            return bitmapFromCache;
        }
        if (this.isOffline) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bitmapFromUrl$lambda$10;
                    bitmapFromUrl$lambda$10 = DefaultBrazeImageLoader.getBitmapFromUrl$lambda$10();
                    return bitmapFromUrl$lambda$10;
                }
            }, 7, (Object) null);
        } else {
            Uri parse = Uri.parse(imageUrl);
            Intrinsics.checkNotNull(parse);
            com.braze.support.a downloadBitmapFromUrl = downloadBitmapFromUrl(context, parse, viewBounds);
            if (downloadBitmapFromUrl.f12985a != null) {
                if (!shouldSkipCaching(parse, downloadBitmapFromUrl.f12986b)) {
                    putBitmapIntoCache(imageUrl, downloadBitmapFromUrl.f12985a, BrazeFileUtils.isLocalUri(parse));
                }
                return downloadBitmapFromUrl.f12985a;
            }
        }
        return null;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage inAppMessage, String imageUrl, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle extras, String imageUrl, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, viewBounds);
    }

    public final void putBitmapIntoCache(final String key, Bitmap bitmap, boolean skipDiskCache) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getBitmapFromMemCache(key) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String putBitmapIntoCache$lambda$20;
                    putBitmapIntoCache$lambda$20 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$20(key);
                    return putBitmapIntoCache$lambda$20;
                }
            }, 7, (Object) null);
            this.memoryCache.put(key, bitmap);
        }
        if (skipDiskCache) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String putBitmapIntoCache$lambda$21;
                    putBitmapIntoCache$lambda$21 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$21(key);
                    return putBitmapIntoCache$lambda$21;
                }
            }, 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                a aVar = this.diskLruCache;
                a aVar2 = null;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    aVar = null;
                }
                if (!aVar.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String putBitmapIntoCache$lambda$23$lambda$22;
                            putBitmapIntoCache$lambda$23$lambda$22 = DefaultBrazeImageLoader.putBitmapIntoCache$lambda$23$lambda$22(key);
                            return putBitmapIntoCache$lambda$23$lambda$22;
                        }
                    }, 7, (Object) null);
                    a aVar3 = this.diskLruCache;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        aVar2 = aVar3;
                    }
                    aVar2.a(key, bitmap);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage inAppMessage, String imageUrl, ImageView imageView, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, viewBounds);
    }

    public final void renderUrlIntoViewTask$android_sdk_base_release(Context context, ImageView imageView, BrazeViewBounds viewBounds, String imageUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        imageView.setTag(R$string.com_braze_image_lru_cache_image_url_key, imageUrl);
        i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new g(this, context, imageUrl, viewBounds, imageView, null), 3, (Object) null);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(final boolean isOffline) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Y3.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String offline$lambda$0;
                offline$lambda$0 = DefaultBrazeImageLoader.setOffline$lambda$0(isOffline);
                return offline$lambda$0;
            }
        }, 6, (Object) null);
        this.isOffline = isOffline;
    }

    public final boolean shouldSkipCaching(final Uri imageUri, Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (!imageUri.getBooleanQueryParameter("cache", true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String shouldSkipCaching$lambda$3;
                    shouldSkipCaching$lambda$3 = DefaultBrazeImageLoader.shouldSkipCaching$lambda$3(imageUri);
                    return shouldSkipCaching$lambda$3;
                }
            }, 7, (Object) null);
            return true;
        }
        if (headers == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            if (StringsKt.equals(entry.getKey(), "cache-control", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (final Map.Entry entry2 : linkedHashMap.entrySet()) {
            Iterable<String> iterable = (Iterable) entry2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    if (StringsKt.contains(str, "no-cache", true) || StringsKt.contains(str, "max-age=0", true)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String shouldSkipCaching$lambda$7$lambda$6;
                                shouldSkipCaching$lambda$7$lambda$6 = DefaultBrazeImageLoader.shouldSkipCaching$lambda$7$lambda$6(entry2, imageUri);
                                return shouldSkipCaching$lambda$7$lambda$6;
                            }
                        }, 7, (Object) null);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
