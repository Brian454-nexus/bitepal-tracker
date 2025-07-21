package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4658c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4659d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f4660e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f4661f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i6) {
            return new d[i6];
        }
    }

    public d(String str, boolean z6, boolean z7, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f4657b = str;
        this.f4658c = z6;
        this.f4659d = z7;
        this.f4660e = strArr;
        this.f4661f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f4658c == dVar.f4658c && this.f4659d == dVar.f4659d && AbstractC1117K.c(this.f4657b, dVar.f4657b) && Arrays.equals(this.f4660e, dVar.f4660e) && Arrays.equals(this.f4661f, dVar.f4661f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = (((527 + (this.f4658c ? 1 : 0)) * 31) + (this.f4659d ? 1 : 0)) * 31;
        String str = this.f4657b;
        return i6 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4657b);
        parcel.writeByte(this.f4658c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4659d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f4660e);
        parcel.writeInt(this.f4661f.length);
        for (i iVar : this.f4661f) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.f4657b = (String) AbstractC1117K.i(parcel.readString());
        this.f4658c = parcel.readByte() != 0;
        this.f4659d = parcel.readByte() != 0;
        this.f4660e = (String[]) AbstractC1117K.i(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f4661f = new i[readInt];
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f4661f[i6] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
