package O1;

import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements x.b {
    public static final Parcelable.Creator<a> CREATOR = new C0063a();

    /* renamed from: a, reason: collision with root package name */
    public final int f3891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3892b;

    /* renamed from: O1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0063a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) AbstractC1119a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(int i6, String str) {
        this.f3891a = i6;
        this.f3892b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f3891a + ",url=" + this.f3892b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f3892b);
        parcel.writeInt(this.f3891a);
    }
}
