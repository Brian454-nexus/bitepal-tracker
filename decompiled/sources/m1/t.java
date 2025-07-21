package m1;

import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t implements x.b {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f17409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17410b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17411c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i6) {
            return new t[i6];
        }
    }

    public t(String str, String str2, List list) {
        this.f17409a = str;
        this.f17410b = str2;
        this.f17411c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f17409a, tVar.f17409a) && TextUtils.equals(this.f17410b, tVar.f17410b) && this.f17411c.equals(tVar.f17411c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f17409a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f17410b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f17411c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f17409a != null) {
            str = " [" + this.f17409a + ", " + this.f17410b + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f17409a);
        parcel.writeString(this.f17410b);
        int size = this.f17411c.size();
        parcel.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            parcel.writeParcelable((Parcelable) this.f17411c.get(i7), 0);
        }
    }

    public t(Parcel parcel) {
        this.f17409a = parcel.readString();
        this.f17410b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f17411c = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f17412a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17413b;

        /* renamed from: c, reason: collision with root package name */
        public final String f17414c;

        /* renamed from: d, reason: collision with root package name */
        public final String f17415d;

        /* renamed from: e, reason: collision with root package name */
        public final String f17416e;

        /* renamed from: f, reason: collision with root package name */
        public final String f17417f;

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

        public b(int i6, int i7, String str, String str2, String str3, String str4) {
            this.f17412a = i6;
            this.f17413b = i7;
            this.f17414c = str;
            this.f17415d = str2;
            this.f17416e = str3;
            this.f17417f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f17412a == bVar.f17412a && this.f17413b == bVar.f17413b && TextUtils.equals(this.f17414c, bVar.f17414c) && TextUtils.equals(this.f17415d, bVar.f17415d) && TextUtils.equals(this.f17416e, bVar.f17416e) && TextUtils.equals(this.f17417f, bVar.f17417f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i6 = ((this.f17412a * 31) + this.f17413b) * 31;
            String str = this.f17414c;
            int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f17415d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f17416e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f17417f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f17412a);
            parcel.writeInt(this.f17413b);
            parcel.writeString(this.f17414c);
            parcel.writeString(this.f17415d);
            parcel.writeString(this.f17416e);
            parcel.writeString(this.f17417f);
        }

        public b(Parcel parcel) {
            this.f17412a = parcel.readInt();
            this.f17413b = parcel.readInt();
            this.f17414c = parcel.readString();
            this.f17415d = parcel.readString();
            this.f17416e = parcel.readString();
            this.f17417f = parcel.readString();
        }
    }
}
