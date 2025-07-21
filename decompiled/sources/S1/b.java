package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4650b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f4650b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4674a.equals(bVar.f4674a) && Arrays.equals(this.f4650b, bVar.f4650b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f4674a.hashCode()) * 31) + Arrays.hashCode(this.f4650b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4674a);
        parcel.writeByteArray(this.f4650b);
    }

    public b(Parcel parcel) {
        super((String) AbstractC1117K.i(parcel.readString()));
        this.f4650b = (byte[]) AbstractC1117K.i(parcel.createByteArray());
    }
}
