package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4689b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4690c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i6) {
            return new o[i6];
        }
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f4689b = str2;
        this.f4690c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f4674a.equals(oVar.f4674a) && AbstractC1117K.c(this.f4689b, oVar.f4689b) && AbstractC1117K.c(this.f4690c, oVar.f4690c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (527 + this.f4674a.hashCode()) * 31;
        String str = this.f4689b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4690c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // S1.i
    public String toString() {
        return this.f4674a + ": url=" + this.f4690c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4674a);
        parcel.writeString(this.f4689b);
        parcel.writeString(this.f4690c);
    }

    public o(Parcel parcel) {
        super((String) AbstractC1117K.i(parcel.readString()));
        this.f4689b = parcel.readString();
        this.f4690c = (String) AbstractC1117K.i(parcel.readString());
    }
}
