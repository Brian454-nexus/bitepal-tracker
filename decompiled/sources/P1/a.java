package P1;

import Z0.q;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements x.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4296c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4297d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4298e;

    /* renamed from: f, reason: collision with root package name */
    public int f4299f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f4292g = new q.b().o0("application/id3").K();

    /* renamed from: h, reason: collision with root package name */
    public static final q f4293h = new q.b().o0("application/x-scte35").K();
    public static final Parcelable.Creator<a> CREATOR = new C0069a();

    /* renamed from: P1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0069a implements Parcelable.Creator {
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

    public a(String str, String str2, long j6, long j7, byte[] bArr) {
        this.f4294a = str;
        this.f4295b = str2;
        this.f4296c = j6;
        this.f4297d = j7;
        this.f4298e = bArr;
    }

    @Override // Z0.x.b
    public byte[] B() {
        if (n() != null) {
            return this.f4298e;
        }
        return null;
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
            if (this.f4296c == aVar.f4296c && this.f4297d == aVar.f4297d && AbstractC1117K.c(this.f4294a, aVar.f4294a) && AbstractC1117K.c(this.f4295b, aVar.f4295b) && Arrays.equals(this.f4298e, aVar.f4298e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f4299f == 0) {
            String str = this.f4294a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4295b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j6 = this.f4296c;
            int i6 = (((hashCode + hashCode2) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.f4297d;
            this.f4299f = ((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Arrays.hashCode(this.f4298e);
        }
        return this.f4299f;
    }

    @Override // Z0.x.b
    public q n() {
        String str = this.f4294a;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c6 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c6 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c6 = 2;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return f4293h;
            case 1:
            case 2:
                return f4292g;
            default:
                return null;
        }
    }

    public String toString() {
        return "EMSG: scheme=" + this.f4294a + ", id=" + this.f4297d + ", durationMs=" + this.f4296c + ", value=" + this.f4295b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4294a);
        parcel.writeString(this.f4295b);
        parcel.writeLong(this.f4296c);
        parcel.writeLong(this.f4297d);
        parcel.writeByteArray(this.f4298e);
    }

    public a(Parcel parcel) {
        this.f4294a = (String) AbstractC1117K.i(parcel.readString());
        this.f4295b = (String) AbstractC1117K.i(parcel.readString());
        this.f4296c = parcel.readLong();
        this.f4297d = parcel.readLong();
        this.f4298e = (byte[]) AbstractC1117K.i(parcel.createByteArray());
    }
}
