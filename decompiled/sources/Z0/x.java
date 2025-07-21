package Z0;

import Z0.w;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f7284a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7285b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x[] newArray(int i6) {
            return new x[i6];
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b extends Parcelable {
        default byte[] B() {
            return null;
        }

        default void i(w.b bVar) {
        }

        default q n() {
            return null;
        }
    }

    public x(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public x a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new x(this.f7285b, (b[]) AbstractC1117K.N0(this.f7284a, bVarArr));
    }

    public x c(x xVar) {
        return xVar == null ? this : a(xVar.f7284a);
    }

    public x d(long j6) {
        return this.f7285b == j6 ? this : new x(j6, this.f7284a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i6) {
        return this.f7284a[i6];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Arrays.equals(this.f7284a, xVar.f7284a) && this.f7285b == xVar.f7285b) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f7284a.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f7284a) * 31) + C6.i.a(this.f7285b);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f7284a));
        if (this.f7285b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f7285b;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f7284a.length);
        for (b bVar : this.f7284a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f7285b);
    }

    public x(long j6, b... bVarArr) {
        this.f7285b = j6;
        this.f7284a = bVarArr;
    }

    public x(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public x(long j6, List list) {
        this(j6, (b[]) list.toArray(new b[0]));
    }

    public x(Parcel parcel) {
        this.f7284a = new b[parcel.readInt()];
        int i6 = 0;
        while (true) {
            b[] bVarArr = this.f7284a;
            if (i6 < bVarArr.length) {
                bVarArr[i6] = (b) parcel.readParcelable(b.class.getClassLoader());
                i6++;
            } else {
                this.f7285b = parcel.readLong();
                return;
            }
        }
    }
}
