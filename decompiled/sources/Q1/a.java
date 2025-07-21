package Q1;

import Z0.w;
import Z0.x;
import Z0.y;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import c1.C1144z;
import java.util.Arrays;
import y6.e;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements x.b {
    public static final Parcelable.Creator<a> CREATOR = new C0072a();

    /* renamed from: a, reason: collision with root package name */
    public final int f4438a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4439b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4440c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4441d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4442e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4443f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4444g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f4445h;

    /* renamed from: Q1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0072a implements Parcelable.Creator {
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

    public a(int i6, String str, String str2, int i7, int i8, int i9, int i10, byte[] bArr) {
        this.f4438a = i6;
        this.f4439b = str;
        this.f4440c = str2;
        this.f4441d = i7;
        this.f4442e = i8;
        this.f4443f = i9;
        this.f4444g = i10;
        this.f4445h = bArr;
    }

    public static a a(C1144z c1144z) {
        int p6 = c1144z.p();
        String t6 = y.t(c1144z.E(c1144z.p(), e.a));
        String D6 = c1144z.D(c1144z.p());
        int p7 = c1144z.p();
        int p8 = c1144z.p();
        int p9 = c1144z.p();
        int p10 = c1144z.p();
        int p11 = c1144z.p();
        byte[] bArr = new byte[p11];
        c1144z.l(bArr, 0, p11);
        return new a(p6, t6, D6, p7, p8, p9, p10, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4438a == aVar.f4438a && this.f4439b.equals(aVar.f4439b) && this.f4440c.equals(aVar.f4440c) && this.f4441d == aVar.f4441d && this.f4442e == aVar.f4442e && this.f4443f == aVar.f4443f && this.f4444g == aVar.f4444g && Arrays.equals(this.f4445h, aVar.f4445h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f4438a) * 31) + this.f4439b.hashCode()) * 31) + this.f4440c.hashCode()) * 31) + this.f4441d) * 31) + this.f4442e) * 31) + this.f4443f) * 31) + this.f4444g) * 31) + Arrays.hashCode(this.f4445h);
    }

    @Override // Z0.x.b
    public void i(w.b bVar) {
        bVar.J(this.f4445h, this.f4438a);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f4439b + ", description=" + this.f4440c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f4438a);
        parcel.writeString(this.f4439b);
        parcel.writeString(this.f4440c);
        parcel.writeInt(this.f4441d);
        parcel.writeInt(this.f4442e);
        parcel.writeInt(this.f4443f);
        parcel.writeInt(this.f4444g);
        parcel.writeByteArray(this.f4445h);
    }

    public a(Parcel parcel) {
        this.f4438a = parcel.readInt();
        this.f4439b = (String) AbstractC1117K.i(parcel.readString());
        this.f4440c = (String) AbstractC1117K.i(parcel.readString());
        this.f4441d = parcel.readInt();
        this.f4442e = parcel.readInt();
        this.f4443f = parcel.readInt();
        this.f4444g = parcel.readInt();
        this.f4445h = (byte[]) AbstractC1117K.i(parcel.createByteArray());
    }
}
