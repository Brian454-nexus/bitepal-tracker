package d1;

import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1119a;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1180b implements x.b {
    public static final Parcelable.Creator<C1180b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f13374a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13375b;

    /* renamed from: d1.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1180b createFromParcel(Parcel parcel) {
            return new C1180b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1180b[] newArray(int i6) {
            return new C1180b[i6];
        }
    }

    public /* synthetic */ C1180b(Parcel parcel, a aVar) {
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
        if (obj != null && C1180b.class == obj.getClass()) {
            C1180b c1180b = (C1180b) obj;
            if (this.f13374a == c1180b.f13374a && this.f13375b == c1180b.f13375b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + C6.d.a(this.f13374a)) * 31) + C6.d.a(this.f13375b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f13374a + ", longitude=" + this.f13375b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeFloat(this.f13374a);
        parcel.writeFloat(this.f13375b);
    }

    public C1180b(float f6, float f7) {
        AbstractC1119a.b(f6 >= -90.0f && f6 <= 90.0f && f7 >= -180.0f && f7 <= 180.0f, "Invalid latitude or longitude");
        this.f13374a = f6;
        this.f13375b = f7;
    }

    public C1180b(Parcel parcel) {
        this.f13374a = parcel.readFloat();
        this.f13375b = parcel.readFloat();
    }
}
