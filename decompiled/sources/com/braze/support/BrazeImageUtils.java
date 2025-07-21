package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a+\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroid/content/Context;", "context", "", "getDisplayWidthPixels", "(Landroid/content/Context;)I", "getDensityDpi", "dpi", "dp", "getPixelsFromDensityAndDp", "(II)I", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "resizeImageViewToBitmapDimensions", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "resizeToBitmapDimensions", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "getImageLoaderCacheSize", "()I", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", "getBitmapMetadataFromStream", "(Ljava/io/InputStream;)Landroid/graphics/BitmapFactory$Options;", "options", "destinationWidth", "destinationHeight", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "Landroid/net/Uri;", "uri", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lcom/braze/support/a;", "getBitmap", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lcom/braze/support/a;", "getLocalBitmap", "(Landroid/net/Uri;II)Landroid/graphics/Bitmap;", "getRemoteBitmap", "(Landroid/net/Uri;II)Lcom/braze/support/a;", "imageMetadata", "decodeSampledBitmapFromStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;II)Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "getDestinationHeightAndWidthPixels", "(Landroid/content/Context;Lcom/braze/enums/BrazeViewBounds;)Lkotlin/Pair;", "getDisplayHeightAndWidthPixels", "(Landroid/content/Context;)Lkotlin/Pair;", "", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class BrazeImageUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int calculateInSampleSize(final BitmapFactory.Options options, int i6, final int i7) {
        int i8;
        final int i9 = i6;
        Intrinsics.checkNotNullParameter(options, "options");
        if (i7 == 0 || i9 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String calculateInSampleSize$lambda$4;
                    calculateInSampleSize$lambda$4 = BrazeImageUtils.calculateInSampleSize$lambda$4();
                    return calculateInSampleSize$lambda$4;
                }
            }, 14, (Object) null);
            return 1;
        }
        final long j6 = options.outHeight;
        final long j7 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String calculateInSampleSize$lambda$5;
                calculateInSampleSize$lambda$5 = BrazeImageUtils.calculateInSampleSize$lambda$5(options, i9, i7);
                return calculateInSampleSize$lambda$5;
            }
        }, 14, (Object) null);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        long j8 = i7;
        if (j6 > j8 || j7 > i9) {
            long j9 = 2;
            long j10 = j6 / j9;
            long j11 = j7 / j9;
            while (true) {
                int i10 = intRef.element;
                long j12 = i10;
                if (j10 / j12 < j8 && j11 / j12 < i9) {
                    i8 = i10;
                    if ((j7 * j6) / (i10 * i10) <= 4194304) {
                        break;
                    }
                } else {
                    i8 = i10;
                }
                intRef.element = i8 * 2;
                i9 = i6;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String calculateInSampleSize$lambda$6;
                calculateInSampleSize$lambda$6 = BrazeImageUtils.calculateInSampleSize$lambda$6(Ref.IntRef.this, j7, j6);
                return calculateInSampleSize$lambda$6;
            }
        }, 14, (Object) null);
        return intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$4() {
        return "Not sampling on 0 destination width or height";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$5(BitmapFactory.Options options, int i6, int i7) {
        return "Calculating sample size for source image bounds: (width " + options.outWidth + " height " + options.outHeight + ") and destination image bounds: (width " + i6 + " height " + i7 + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$6(Ref.IntRef intRef, long j6, long j7) {
        return "Using image sample size of " + intRef.element + ". Image will be scaled to width: " + (j6 / intRef.element) + " and height: " + (j7 / intRef.element);
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i6, int i7) {
        options.inSampleSize = calculateInSampleSize(options, i6, i7);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final a getBitmap(Context context, final Uri uri, BrazeViewBounds viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(viewBounds, "viewBounds");
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, viewBounds);
        int intValue = ((Number) destinationHeightAndWidthPixels.component1()).intValue();
        int intValue2 = ((Number) destinationHeightAndWidthPixels.component2()).intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new a(getLocalBitmap(uri, intValue2, intValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, intValue2, intValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String bitmap$lambda$7;
                bitmap$lambda$7 = BrazeImageUtils.getBitmap$lambda$7(uri);
                return bitmap$lambda$7;
            }
        }, 12, (Object) null);
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmap$lambda$7(Uri uri) {
        return "Uri with unknown scheme received. Not getting image. Uri: " + uri;
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }

    private static final Pair<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        Pair<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        final int intValue = ((Number) displayHeightAndWidthPixels.component1()).intValue();
        final int intValue2 = ((Number) displayHeightAndWidthPixels.component2()).intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: p4.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String destinationHeightAndWidthPixels$lambda$23;
                destinationHeightAndWidthPixels$lambda$23 = BrazeImageUtils.getDestinationHeightAndWidthPixels$lambda$23(intValue2, intValue);
                return destinationHeightAndWidthPixels$lambda$23;
            }
        }, 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(intValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(intValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDestinationHeightAndWidthPixels$lambda$23(int i6, int i7) {
        return "Display width: " + i6 + " and height " + i7;
    }

    public static final Pair<Integer, Integer> getDisplayHeightAndWidthPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Pair<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ((Number) getDisplayHeightAndWidthPixels(context).getSecond()).intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), 33554432));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap getLocalBitmap(final android.net.Uri r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getLocalBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$10(File file) {
        return "Retrieving image from local path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$11() {
        return "Destination bounds unset. Loading entire bitmap into memory.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$12(int i6, int i7) {
        return "Sampling bitmap with destination image bounds: (width " + i6 + " height " + i7 + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$13(Uri uri, BitmapFactory.Options options) {
        return "The bitmap metadata with image uri " + uri + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$14() {
        return "Decoding sampled bitmap";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$15(Exception exc) {
        return "Exception occurred when attempting to retrieve local bitmap. " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$16() {
        return "IOException during closing of bitmap metadata image stream.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$8(Uri uri) {
        return "Local bitmap path is null. URI: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$9(Uri uri) {
        return "Local bitmap file does not exist. URI: " + uri;
    }

    public static final int getPixelsFromDensityAndDp(int i6, int i7) {
        return Math.abs((i6 * i7) / 160);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.braze.support.a getRemoteBitmap(android.net.Uri r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getRemoteBitmap(android.net.Uri, int, int):com.braze.support.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$17(String str) {
        return com.braze.j.a("SDK is in offline mode, not downloading remote bitmap with uri: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$18(int i6, URL url) {
        return "HTTP response code was " + i6 + ". Bitmap with url " + url + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$19(int i6, int i7) {
        return "Sampling bitmap with destination image bounds: (height " + i6 + " width " + i7 + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$20(URL url, BitmapFactory.Options options) {
        return "The bitmap metadata with image url " + url + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$21(String str, Exception exc) {
        return "Exception in image bitmap download for Uri: " + str + ' ' + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$22() {
        return "IOException during closing of bitmap metadata download stream.";
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(final ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String resizeToBitmapDimensions$lambda$0;
                    resizeToBitmapDimensions$lambda$0 = BrazeImageUtils.resizeToBitmapDimensions$lambda$0();
                    return resizeToBitmapDimensions$lambda$0;
                }
            }, 12, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String resizeToBitmapDimensions$lambda$1;
                    resizeToBitmapDimensions$lambda$1 = BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView);
                    return resizeToBitmapDimensions$lambda$1;
                }
            }, 12, (Object) null);
            return;
        }
        if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String resizeToBitmapDimensions$lambda$2;
                    resizeToBitmapDimensions$lambda$2 = BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView);
                    return resizeToBitmapDimensions$lambda$2;
                }
            }, 12, (Object) null);
            return;
        }
        final float width = bitmap.getWidth() / bitmap.getHeight();
        imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: p4.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resizeToBitmapDimensions$lambda$3;
                resizeToBitmapDimensions$lambda$3 = BrazeImageUtils.resizeToBitmapDimensions$lambda$3(width, imageView);
                return resizeToBitmapDimensions$lambda$3;
            }
        }, 12, (Object) null);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$0() {
        return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$1(ImageView imageView) {
        return "Bitmap dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$2(ImageView imageView) {
        return "ImageView dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$3(float f6, ImageView imageView) {
        return "Resizing ImageView to aspect ratio " + f6 + " based on width: " + imageView.getWidth() + " trueWidth: " + imageView.getLayoutParams().width + " height: " + imageView.getLayoutParams().height + " layoutParams: " + imageView.getLayoutParams() + ' ' + imageView;
    }
}
