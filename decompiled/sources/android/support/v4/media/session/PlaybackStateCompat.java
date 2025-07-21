package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f7849a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7850b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7851c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7852d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7853e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7854f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f7855g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7856h;

    /* renamed from: i, reason: collision with root package name */
    public List f7857i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7858j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f7859k;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f7860a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f7861b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7862c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f7863d;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i6) {
                return new CustomAction[i6];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f7860a = parcel.readString();
            this.f7861b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7862c = parcel.readInt();
            this.f7863d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f7861b) + ", mIcon=" + this.f7862c + ", mExtras=" + this.f7863d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f7860a);
            TextUtils.writeToParcel(this.f7861b, parcel, i6);
            parcel.writeInt(this.f7862c);
            parcel.writeBundle(this.f7863d);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i6) {
            return new PlaybackStateCompat[i6];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f7849a = parcel.readInt();
        this.f7850b = parcel.readLong();
        this.f7852d = parcel.readFloat();
        this.f7856h = parcel.readLong();
        this.f7851c = parcel.readLong();
        this.f7853e = parcel.readLong();
        this.f7855g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7857i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f7858j = parcel.readLong();
        this.f7859k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f7854f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f7849a + ", position=" + this.f7850b + ", buffered position=" + this.f7851c + ", speed=" + this.f7852d + ", updated=" + this.f7856h + ", actions=" + this.f7853e + ", error code=" + this.f7854f + ", error message=" + this.f7855g + ", custom actions=" + this.f7857i + ", active item id=" + this.f7858j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f7849a);
        parcel.writeLong(this.f7850b);
        parcel.writeFloat(this.f7852d);
        parcel.writeLong(this.f7856h);
        parcel.writeLong(this.f7851c);
        parcel.writeLong(this.f7853e);
        TextUtils.writeToParcel(this.f7855g, parcel, i6);
        parcel.writeTypedList(this.f7857i);
        parcel.writeLong(this.f7858j);
        parcel.writeBundle(this.f7859k);
        parcel.writeInt(this.f7854f);
    }
}
