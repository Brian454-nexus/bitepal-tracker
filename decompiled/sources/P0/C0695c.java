package P0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: P0.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0695c implements Parcelable {
    public static final Parcelable.Creator<C0695c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f4156a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4157b;

    /* renamed from: P0.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0695c createFromParcel(Parcel parcel) {
            return new C0695c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0695c[] newArray(int i6) {
            return new C0695c[i6];
        }
    }

    public C0695c(Parcel parcel) {
        this.f4156a = parcel.createStringArrayList();
        this.f4157b = parcel.createTypedArrayList(C0694b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f4156a);
        parcel.writeTypedList(this.f4157b);
    }
}
