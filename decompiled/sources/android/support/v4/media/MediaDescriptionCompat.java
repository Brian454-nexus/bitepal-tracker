package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f7813a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f7814b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f7815c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f7816d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f7817e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f7818f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f7819g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f7820h;

    /* renamed from: i, reason: collision with root package name */
    public MediaDescription f7821i;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i6) {
            return new MediaDescriptionCompat[i6];
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f7822a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f7823b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f7824c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f7825d;

        /* renamed from: e, reason: collision with root package name */
        public Bitmap f7826e;

        /* renamed from: f, reason: collision with root package name */
        public Uri f7827f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f7828g;

        /* renamed from: h, reason: collision with root package name */
        public Uri f7829h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f7822a, this.f7823b, this.f7824c, this.f7825d, this.f7826e, this.f7827f, this.f7828g, this.f7829h);
        }

        public b b(CharSequence charSequence) {
            this.f7825d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f7828g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f7826e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f7827f = uri;
            return this;
        }

        public b f(String str) {
            this.f7822a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f7829h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f7824c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f7823b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f7813a = str;
        this.f7814b = charSequence;
        this.f7815c = charSequence2;
        this.f7816d = charSequence3;
        this.f7817e = bitmap;
        this.f7818f = uri;
        this.f7819g = bundle;
        this.f7820h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L76
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.f(r2)
            java.lang.CharSequence r2 = r8.getTitle()
            r1.i(r2)
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.h(r2)
            java.lang.CharSequence r2 = r8.getDescription()
            r1.b(r2)
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.d(r2)
            android.net.Uri r2 = r8.getIconUri()
            r1.e(r2)
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L46
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L47
        L46:
            r4 = r0
        L47:
            if (r4 == 0) goto L5f
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L59
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L59
            goto L60
        L59:
            r2.remove(r3)
            r2.remove(r5)
        L5f:
            r0 = r2
        L60:
            r1.c(r0)
            if (r4 == 0) goto L69
            r1.g(r4)
            goto L70
        L69:
            android.net.Uri r0 = r8.getMediaUri()
            r1.g(r0)
        L70:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f7821i = r8
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object c() {
        MediaDescription mediaDescription = this.f7821i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f7813a);
        builder.setTitle(this.f7814b);
        builder.setSubtitle(this.f7815c);
        builder.setDescription(this.f7816d);
        builder.setIconBitmap(this.f7817e);
        builder.setIconUri(this.f7818f);
        builder.setExtras(this.f7819g);
        builder.setMediaUri(this.f7820h);
        MediaDescription build = builder.build();
        this.f7821i = build;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f7814b) + ", " + ((Object) this.f7815c) + ", " + ((Object) this.f7816d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        ((MediaDescription) c()).writeToParcel(parcel, i6);
    }
}
