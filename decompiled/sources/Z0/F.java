package Z0;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class F implements Comparable, Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final String f6646d = AbstractC1117K.x0(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f6647e = AbstractC1117K.x0(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f6648f = AbstractC1117K.x0(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f6649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6651c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public F createFromParcel(Parcel parcel) {
            return new F(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public F[] newArray(int i6) {
            return new F[i6];
        }
    }

    public F(int i6, int i7, int i8) {
        this.f6649a = i6;
        this.f6650b = i7;
        this.f6651c = i8;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(F f6) {
        int i6 = this.f6649a - f6.f6649a;
        if (i6 != 0) {
            return i6;
        }
        int i7 = this.f6650b - f6.f6650b;
        return i7 == 0 ? this.f6651c - f6.f6651c : i7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f6 = (F) obj;
            if (this.f6649a == f6.f6649a && this.f6650b == f6.f6650b && this.f6651c == f6.f6651c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6649a * 31) + this.f6650b) * 31) + this.f6651c;
    }

    public String toString() {
        return this.f6649a + "." + this.f6650b + "." + this.f6651c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f6649a);
        parcel.writeInt(this.f6650b);
        parcel.writeInt(this.f6651c);
    }

    public F(Parcel parcel) {
        this.f6649a = parcel.readInt();
        this.f6650b = parcel.readInt();
        this.f6651c = parcel.readInt();
    }
}
