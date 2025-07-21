package Q1;

import Z0.w;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import com.amazon.a.a.o.b.f;
import y6.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements x.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f4446a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4447b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(String str, String str2) {
        this.f4446a = c.f(str);
        this.f4447b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4446a.equals(bVar.f4446a) && this.f4447b.equals(bVar.f4447b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f4446a.hashCode()) * 31) + this.f4447b.hashCode();
    }

    @Override // Z0.x.b
    public void i(w.b bVar) {
        String str = this.f4446a;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c6 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c6 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c6 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                bVar.O(this.f4447b);
                return;
            case 1:
                bVar.n0(this.f4447b);
                return;
            case 2:
                bVar.V(this.f4447b);
                return;
            case 3:
                bVar.N(this.f4447b);
                return;
            case 4:
                bVar.P(this.f4447b);
                return;
            default:
                return;
        }
    }

    public String toString() {
        return "VC: " + this.f4446a + f.f11249b + this.f4447b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4446a);
        parcel.writeString(this.f4447b);
    }

    public b(Parcel parcel) {
        this.f4446a = (String) AbstractC1117K.i(parcel.readString());
        this.f4447b = (String) AbstractC1117K.i(parcel.readString());
    }
}
