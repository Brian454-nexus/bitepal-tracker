package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f4679b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4680c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4681d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f4682e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4683f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i6) {
            return new l[i6];
        }
    }

    public l(int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4679b = i6;
        this.f4680c = i7;
        this.f4681d = i8;
        this.f4682e = iArr;
        this.f4683f = iArr2;
    }

    @Override // S1.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f4679b == lVar.f4679b && this.f4680c == lVar.f4680c && this.f4681d == lVar.f4681d && Arrays.equals(this.f4682e, lVar.f4682e) && Arrays.equals(this.f4683f, lVar.f4683f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f4679b) * 31) + this.f4680c) * 31) + this.f4681d) * 31) + Arrays.hashCode(this.f4682e)) * 31) + Arrays.hashCode(this.f4683f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f4679b);
        parcel.writeInt(this.f4680c);
        parcel.writeInt(this.f4681d);
        parcel.writeIntArray(this.f4682e);
        parcel.writeIntArray(this.f4683f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f4679b = parcel.readInt();
        this.f4680c = parcel.readInt();
        this.f4681d = parcel.readInt();
        this.f4682e = (int[]) AbstractC1117K.i(parcel.createIntArray());
        this.f4683f = (int[]) AbstractC1117K.i(parcel.createIntArray());
    }
}
