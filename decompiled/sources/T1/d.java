package T1;

import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements x.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f4902a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4903b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i6) {
            return new d[i6];
        }
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f4902a == dVar.f4902a && this.f4903b == dVar.f4903b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + C6.d.a(this.f4902a)) * 31) + this.f4903b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f4902a + ", svcTemporalLayerCount=" + this.f4903b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeFloat(this.f4902a);
        parcel.writeInt(this.f4903b);
    }

    public d(float f6, int i6) {
        this.f4902a = f6;
        this.f4903b = i6;
    }

    public d(Parcel parcel) {
        this.f4902a = parcel.readFloat();
        this.f4903b = parcel.readInt();
    }
}
