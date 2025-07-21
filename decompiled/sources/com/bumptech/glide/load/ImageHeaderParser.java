package com.bumptech.glide.load;

import U4.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface ImageHeaderParser {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: a, reason: collision with root package name */
        public final boolean f13243a;

        ImageType(boolean z6) {
            this.f13243a = z6;
        }

        public boolean hasAlpha() {
            return this.f13243a;
        }

        public boolean isWebp() {
            int i6 = a.f13244a[ordinal()];
            return i6 == 1 || i6 == 2 || i6 == 3;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13244a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f13244a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13244a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13244a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, b bVar);

    ImageType c(InputStream inputStream);

    int d(InputStream inputStream, b bVar);
}
