package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4666c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4667d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4668e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i6) {
            return new f[i6];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f4665b = str;
        this.f4666c = str2;
        this.f4667d = str3;
        this.f4668e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (AbstractC1117K.c(this.f4665b, fVar.f4665b) && AbstractC1117K.c(this.f4666c, fVar.f4666c) && AbstractC1117K.c(this.f4667d, fVar.f4667d) && Arrays.equals(this.f4668e, fVar.f4668e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4665b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4666c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4667d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f4668e);
    }

    @Override // S1.i
    public String toString() {
        return this.f4674a + ": mimeType=" + this.f4665b + ", filename=" + this.f4666c + ", description=" + this.f4667d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4665b);
        parcel.writeString(this.f4666c);
        parcel.writeString(this.f4667d);
        parcel.writeByteArray(this.f4668e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.f4665b = (String) AbstractC1117K.i(parcel.readString());
        this.f4666c = (String) AbstractC1117K.i(parcel.readString());
        this.f4667d = (String) AbstractC1117K.i(parcel.readString());
        this.f4668e = (byte[]) AbstractC1117K.i(parcel.createByteArray());
    }
}
