package R1;

import Z0.w;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1119a;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements x.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4582c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i6) {
            return new c[i6];
        }
    }

    public c(byte[] bArr, String str, String str2) {
        this.f4580a = bArr;
        this.f4581b = str;
        this.f4582c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4580a, ((c) obj).f4580a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4580a);
    }

    @Override // Z0.x.b
    public void i(w.b bVar) {
        String str = this.f4581b;
        if (str != null) {
            bVar.n0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f4581b, this.f4582c, Integer.valueOf(this.f4580a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeByteArray(this.f4580a);
        parcel.writeString(this.f4581b);
        parcel.writeString(this.f4582c);
    }

    public c(Parcel parcel) {
        this.f4580a = (byte[]) AbstractC1119a.e(parcel.createByteArray());
        this.f4581b = parcel.readString();
        this.f4582c = parcel.readString();
    }
}
