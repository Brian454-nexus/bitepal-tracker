package R1;

import Z0.w;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements x.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f4574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4575b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4576c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4577d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4578e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4579f;

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

    public b(int i6, String str, String str2, String str3, boolean z6, int i7) {
        AbstractC1119a.a(i7 == -1 || i7 > 0);
        this.f4574a = i6;
        this.f4575b = str;
        this.f4576c = str2;
        this.f4577d = str3;
        this.f4578e = z6;
        this.f4579f = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static R1.b a(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.b.a(java.util.Map):R1.b");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4574a == bVar.f4574a && AbstractC1117K.c(this.f4575b, bVar.f4575b) && AbstractC1117K.c(this.f4576c, bVar.f4576c) && AbstractC1117K.c(this.f4577d, bVar.f4577d) && this.f4578e == bVar.f4578e && this.f4579f == bVar.f4579f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = (527 + this.f4574a) * 31;
        String str = this.f4575b;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4576c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4577d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f4578e ? 1 : 0)) * 31) + this.f4579f;
    }

    @Override // Z0.x.b
    public void i(w.b bVar) {
        String str = this.f4576c;
        if (str != null) {
            bVar.l0(str);
        }
        String str2 = this.f4575b;
        if (str2 != null) {
            bVar.b0(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f4576c + "\", genre=\"" + this.f4575b + "\", bitrate=" + this.f4574a + ", metadataInterval=" + this.f4579f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f4574a);
        parcel.writeString(this.f4575b);
        parcel.writeString(this.f4576c);
        parcel.writeString(this.f4577d);
        AbstractC1117K.l1(parcel, this.f4578e);
        parcel.writeInt(this.f4579f);
    }

    public b(Parcel parcel) {
        this.f4574a = parcel.readInt();
        this.f4575b = parcel.readString();
        this.f4576c = parcel.readString();
        this.f4577d = parcel.readString();
        this.f4578e = AbstractC1117K.T0(parcel);
        this.f4579f = parcel.readInt();
    }
}
