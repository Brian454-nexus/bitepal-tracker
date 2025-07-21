package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4676b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4677c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4678d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i6) {
            return new k[i6];
        }
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f4676b = str;
        this.f4677c = str2;
        this.f4678d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (AbstractC1117K.c(this.f4677c, kVar.f4677c) && AbstractC1117K.c(this.f4676b, kVar.f4676b) && AbstractC1117K.c(this.f4678d, kVar.f4678d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4676b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4677c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4678d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // S1.i
    public String toString() {
        return this.f4674a + ": domain=" + this.f4676b + ", description=" + this.f4677c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4674a);
        parcel.writeString(this.f4676b);
        parcel.writeString(this.f4678d);
    }

    public k(Parcel parcel) {
        super("----");
        this.f4676b = (String) AbstractC1117K.i(parcel.readString());
        this.f4677c = (String) AbstractC1117K.i(parcel.readString());
        this.f4678d = (String) AbstractC1117K.i(parcel.readString());
    }
}
