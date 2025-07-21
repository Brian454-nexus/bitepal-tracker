package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4684b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4685c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i6) {
            return new m[i6];
        }
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f4684b = str;
        this.f4685c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (AbstractC1117K.c(this.f4684b, mVar.f4684b) && Arrays.equals(this.f4685c, mVar.f4685c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4684b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f4685c);
    }

    @Override // S1.i
    public String toString() {
        return this.f4674a + ": owner=" + this.f4684b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4684b);
        parcel.writeByteArray(this.f4685c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        this.f4684b = (String) AbstractC1117K.i(parcel.readString());
        this.f4685c = (byte[]) AbstractC1117K.i(parcel.createByteArray());
    }
}
