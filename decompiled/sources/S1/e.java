package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4662b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4663c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4664d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i6) {
            return new e[i6];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f4662b = str;
        this.f4663c = str2;
        this.f4664d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (AbstractC1117K.c(this.f4663c, eVar.f4663c) && AbstractC1117K.c(this.f4662b, eVar.f4662b) && AbstractC1117K.c(this.f4664d, eVar.f4664d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4662b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4663c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4664d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // S1.i
    public String toString() {
        return this.f4674a + ": language=" + this.f4662b + ", description=" + this.f4663c + ", text=" + this.f4664d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4674a);
        parcel.writeString(this.f4662b);
        parcel.writeString(this.f4664d);
    }

    public e(Parcel parcel) {
        super("COMM");
        this.f4662b = (String) AbstractC1117K.i(parcel.readString());
        this.f4663c = (String) AbstractC1117K.i(parcel.readString());
        this.f4664d = (String) AbstractC1117K.i(parcel.readString());
    }
}
