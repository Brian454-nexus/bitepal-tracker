package P0;

import P0.I;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3996a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3997b;

    /* renamed from: c, reason: collision with root package name */
    public C0694b[] f3998c;

    /* renamed from: d, reason: collision with root package name */
    public int f3999d;

    /* renamed from: e, reason: collision with root package name */
    public String f4000e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f4001f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f4002g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4003h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K createFromParcel(Parcel parcel) {
            return new K(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public K[] newArray(int i6) {
            return new K[i6];
        }
    }

    public K() {
        this.f4000e = null;
        this.f4001f = new ArrayList();
        this.f4002g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f3996a);
        parcel.writeStringList(this.f3997b);
        parcel.writeTypedArray(this.f3998c, i6);
        parcel.writeInt(this.f3999d);
        parcel.writeString(this.f4000e);
        parcel.writeStringList(this.f4001f);
        parcel.writeTypedList(this.f4002g);
        parcel.writeTypedList(this.f4003h);
    }

    public K(Parcel parcel) {
        this.f4000e = null;
        this.f4001f = new ArrayList();
        this.f4002g = new ArrayList();
        this.f3996a = parcel.createStringArrayList();
        this.f3997b = parcel.createStringArrayList();
        this.f3998c = (C0694b[]) parcel.createTypedArray(C0694b.CREATOR);
        this.f3999d = parcel.readInt();
        this.f4000e = parcel.readString();
        this.f4001f = parcel.createStringArrayList();
        this.f4002g = parcel.createTypedArrayList(C0695c.CREATOR);
        this.f4003h = parcel.createTypedArrayList(I.l.CREATOR);
    }
}
