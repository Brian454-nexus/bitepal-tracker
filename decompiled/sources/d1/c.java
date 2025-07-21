package d1;

import C6.i;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements x.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f13376a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13377b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13378c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i6) {
            return new c[i6];
        }
    }

    public /* synthetic */ c(Parcel parcel, a aVar) {
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13376a == cVar.f13376a && this.f13377b == cVar.f13377b && this.f13378c == cVar.f13378c;
    }

    public int hashCode() {
        return ((((527 + i.a(this.f13376a)) * 31) + i.a(this.f13377b)) * 31) + i.a(this.f13378c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f13376a + ", modification time=" + this.f13377b + ", timescale=" + this.f13378c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f13376a);
        parcel.writeLong(this.f13377b);
        parcel.writeLong(this.f13378c);
    }

    public c(long j6, long j7, long j8) {
        this.f13376a = j6;
        this.f13377b = j7;
        this.f13378c = j8;
    }

    public c(Parcel parcel) {
        this.f13376a = parcel.readLong();
        this.f13377b = parcel.readLong();
        this.f13378c = parcel.readLong();
    }
}
