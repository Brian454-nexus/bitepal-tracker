package T1;

import C6.i;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements x.b {
    public static final Parcelable.Creator<a> CREATOR = new C0081a();

    /* renamed from: a, reason: collision with root package name */
    public final long f4892a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4893b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4894c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4895d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4896e;

    /* renamed from: T1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0081a implements Parcelable.Creator {
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

    public /* synthetic */ a(Parcel parcel, C0081a c0081a) {
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4892a == aVar.f4892a && this.f4893b == aVar.f4893b && this.f4894c == aVar.f4894c && this.f4895d == aVar.f4895d && this.f4896e == aVar.f4896e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + i.a(this.f4892a)) * 31) + i.a(this.f4893b)) * 31) + i.a(this.f4894c)) * 31) + i.a(this.f4895d)) * 31) + i.a(this.f4896e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f4892a + ", photoSize=" + this.f4893b + ", photoPresentationTimestampUs=" + this.f4894c + ", videoStartPosition=" + this.f4895d + ", videoSize=" + this.f4896e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f4892a);
        parcel.writeLong(this.f4893b);
        parcel.writeLong(this.f4894c);
        parcel.writeLong(this.f4895d);
        parcel.writeLong(this.f4896e);
    }

    public a(long j6, long j7, long j8, long j9, long j10) {
        this.f4892a = j6;
        this.f4893b = j7;
        this.f4894c = j8;
        this.f4895d = j9;
        this.f4896e = j10;
    }

    public a(Parcel parcel) {
        this.f4892a = parcel.readLong();
        this.f4893b = parcel.readLong();
        this.f4894c = parcel.readLong();
        this.f4895d = parcel.readLong();
        this.f4896e = parcel.readLong();
    }
}
