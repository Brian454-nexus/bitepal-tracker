package S1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4652c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4653d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4654e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4655f;

    /* renamed from: g, reason: collision with root package name */
    public final i[] f4656g;

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

    public c(String str, int i6, int i7, long j6, long j7, i[] iVarArr) {
        super("CHAP");
        this.f4651b = str;
        this.f4652c = i6;
        this.f4653d = i7;
        this.f4654e = j6;
        this.f4655f = j7;
        this.f4656g = iVarArr;
    }

    @Override // S1.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f4652c == cVar.f4652c && this.f4653d == cVar.f4653d && this.f4654e == cVar.f4654e && this.f4655f == cVar.f4655f && AbstractC1117K.c(this.f4651b, cVar.f4651b) && Arrays.equals(this.f4656g, cVar.f4656g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = (((((((527 + this.f4652c) * 31) + this.f4653d) * 31) + ((int) this.f4654e)) * 31) + ((int) this.f4655f)) * 31;
        String str = this.f4651b;
        return i6 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4651b);
        parcel.writeInt(this.f4652c);
        parcel.writeInt(this.f4653d);
        parcel.writeLong(this.f4654e);
        parcel.writeLong(this.f4655f);
        parcel.writeInt(this.f4656g.length);
        for (i iVar : this.f4656g) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        this.f4651b = (String) AbstractC1117K.i(parcel.readString());
        this.f4652c = parcel.readInt();
        this.f4653d = parcel.readInt();
        this.f4654e = parcel.readLong();
        this.f4655f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f4656g = new i[readInt];
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f4656g[i6] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
