package U1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0089a();

    /* renamed from: a, reason: collision with root package name */
    public final long f5166a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5167b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5168c;

    /* renamed from: U1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0089a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public /* synthetic */ a(Parcel parcel, C0089a c0089a) {
        this(parcel);
    }

    public static a a(C1144z c1144z, int i6, long j6) {
        long I6 = c1144z.I();
        int i7 = i6 - 4;
        byte[] bArr = new byte[i7];
        c1144z.l(bArr, 0, i7);
        return new a(I6, bArr, j6);
    }

    @Override // U1.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f5166a + ", identifier= " + this.f5167b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f5166a);
        parcel.writeLong(this.f5167b);
        parcel.writeByteArray(this.f5168c);
    }

    public a(long j6, byte[] bArr, long j7) {
        this.f5166a = j7;
        this.f5167b = j6;
        this.f5168c = bArr;
    }

    public a(Parcel parcel) {
        this.f5166a = parcel.readLong();
        this.f5167b = parcel.readLong();
        this.f5168c = (byte[]) AbstractC1117K.i(parcel.createByteArray());
    }
}
