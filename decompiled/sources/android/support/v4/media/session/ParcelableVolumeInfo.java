package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f7844a;

    /* renamed from: b, reason: collision with root package name */
    public int f7845b;

    /* renamed from: c, reason: collision with root package name */
    public int f7846c;

    /* renamed from: d, reason: collision with root package name */
    public int f7847d;

    /* renamed from: e, reason: collision with root package name */
    public int f7848e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i6) {
            return new ParcelableVolumeInfo[i6];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f7844a = parcel.readInt();
        this.f7846c = parcel.readInt();
        this.f7847d = parcel.readInt();
        this.f7848e = parcel.readInt();
        this.f7845b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f7844a);
        parcel.writeInt(this.f7846c);
        parcel.writeInt(this.f7847d);
        parcel.writeInt(this.f7848e);
        parcel.writeInt(this.f7845b);
    }
}
