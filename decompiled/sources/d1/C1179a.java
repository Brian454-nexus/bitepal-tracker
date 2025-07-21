package d1;

import C6.g;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1179a implements x.b {
    public static final Parcelable.Creator<C1179a> CREATOR = new C0188a();

    /* renamed from: a, reason: collision with root package name */
    public final String f13370a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13371b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13372c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13373d;

    /* renamed from: d1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0188a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1179a createFromParcel(Parcel parcel) {
            return new C1179a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1179a[] newArray(int i6) {
            return new C1179a[i6];
        }
    }

    public /* synthetic */ C1179a(Parcel parcel, C0188a c0188a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1179a.class == obj.getClass()) {
            C1179a c1179a = (C1179a) obj;
            if (this.f13370a.equals(c1179a.f13370a) && Arrays.equals(this.f13371b, c1179a.f13371b) && this.f13372c == c1179a.f13372c && this.f13373d == c1179a.f13373d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f13370a.hashCode()) * 31) + Arrays.hashCode(this.f13371b)) * 31) + this.f13372c) * 31) + this.f13373d;
    }

    public String toString() {
        int i6 = this.f13373d;
        return "mdta: key=" + this.f13370a + ", value=" + (i6 != 1 ? i6 != 23 ? i6 != 67 ? AbstractC1117K.h1(this.f13371b) : String.valueOf(g.f(this.f13371b)) : String.valueOf(Float.intBitsToFloat(g.f(this.f13371b))) : AbstractC1117K.I(this.f13371b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f13370a);
        parcel.writeByteArray(this.f13371b);
        parcel.writeInt(this.f13372c);
        parcel.writeInt(this.f13373d);
    }

    public C1179a(String str, byte[] bArr, int i6, int i7) {
        this.f13370a = str;
        this.f13371b = bArr;
        this.f13372c = i6;
        this.f13373d = i7;
    }

    public C1179a(Parcel parcel) {
        this.f13370a = (String) AbstractC1117K.i(parcel.readString());
        this.f13371b = (byte[]) AbstractC1117K.i(parcel.createByteArray());
        this.f13372c = parcel.readInt();
        this.f13373d = parcel.readInt();
    }
}
