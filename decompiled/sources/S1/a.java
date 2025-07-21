package S1;

import Z0.w;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0079a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4646b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4647c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4648d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4649e;

    /* renamed from: S1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0079a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(String str, String str2, int i6, byte[] bArr) {
        super("APIC");
        this.f4646b = str;
        this.f4647c = str2;
        this.f4648d = i6;
        this.f4649e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4648d == aVar.f4648d && AbstractC1117K.c(this.f4646b, aVar.f4646b) && AbstractC1117K.c(this.f4647c, aVar.f4647c) && Arrays.equals(this.f4649e, aVar.f4649e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = (527 + this.f4648d) * 31;
        String str = this.f4646b;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4647c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f4649e);
    }

    @Override // Z0.x.b
    public void i(w.b bVar) {
        bVar.J(this.f4649e, this.f4648d);
    }

    @Override // S1.i
    public String toString() {
        return this.f4674a + ": mimeType=" + this.f4646b + ", description=" + this.f4647c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4646b);
        parcel.writeString(this.f4647c);
        parcel.writeInt(this.f4648d);
        parcel.writeByteArray(this.f4649e);
    }

    public a(Parcel parcel) {
        super("APIC");
        this.f4646b = (String) AbstractC1117K.i(parcel.readString());
        this.f4647c = parcel.readString();
        this.f4648d = parcel.readInt();
        this.f4649e = (byte[]) AbstractC1117K.i(parcel.createByteArray());
    }
}
