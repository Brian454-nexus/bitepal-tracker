package U1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.C1111E;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f5202a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5203b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i6) {
            return new g[i6];
        }
    }

    public /* synthetic */ g(long j6, long j7, a aVar) {
        this(j6, j7);
    }

    public static g a(C1144z c1144z, long j6, C1111E c1111e) {
        long c6 = c(c1144z, j6);
        return new g(c6, c1111e.b(c6));
    }

    public static long c(C1144z c1144z, long j6) {
        long G6 = c1144z.G();
        if ((128 & G6) != 0) {
            return 8589934591L & ((((G6 & 1) << 32) | c1144z.I()) + j6);
        }
        return -9223372036854775807L;
    }

    @Override // U1.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f5202a + ", playbackPositionUs= " + this.f5203b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f5202a);
        parcel.writeLong(this.f5203b);
    }

    public g(long j6, long j7) {
        this.f5202a = j6;
        this.f5203b = j7;
    }
}
