package T1;

import T1.b;
import Z0.x;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import y6.k;
import z6.n;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements x.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f4897a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C0082b.class.getClassLoader());
            return new b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i6) {
            return new b[i6];
        }
    }

    /* renamed from: T1.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0082b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public final long f4899a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4900b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4901c;

        /* renamed from: d, reason: collision with root package name */
        public static final Comparator f4898d = new Comparator() { // from class: T1.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i6;
                i6 = n.j().e(r1.f4899a, r2.f4899a).e(r1.f4900b, r2.f4900b).d(((b.C0082b) obj).f4901c, ((b.C0082b) obj2).f4901c).i();
                return i6;
            }
        };
        public static final Parcelable.Creator<C0082b> CREATOR = new a();

        /* renamed from: T1.b$b$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0082b createFromParcel(Parcel parcel) {
                return new C0082b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0082b[] newArray(int i6) {
                return new C0082b[i6];
            }
        }

        public C0082b(long j6, long j7, int i6) {
            AbstractC1119a.a(j6 < j7);
            this.f4899a = j6;
            this.f4900b = j7;
            this.f4901c = i6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0082b.class == obj.getClass()) {
                C0082b c0082b = (C0082b) obj;
                if (this.f4899a == c0082b.f4899a && this.f4900b == c0082b.f4900b && this.f4901c == c0082b.f4901c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return k.b(new Object[]{Long.valueOf(this.f4899a), Long.valueOf(this.f4900b), Integer.valueOf(this.f4901c)});
        }

        public String toString() {
            return AbstractC1117K.H("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f4899a), Long.valueOf(this.f4900b), Integer.valueOf(this.f4901c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeLong(this.f4899a);
            parcel.writeLong(this.f4900b);
            parcel.writeInt(this.f4901c);
        }
    }

    public b(List list) {
        this.f4897a = list;
        AbstractC1119a.a(!a(list));
    }

    public static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j6 = ((C0082b) list.get(0)).f4900b;
        for (int i6 = 1; i6 < list.size(); i6++) {
            if (((C0082b) list.get(i6)).f4899a < j6) {
                return true;
            }
            j6 = ((C0082b) list.get(i6)).f4900b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f4897a.equals(((b) obj).f4897a);
    }

    public int hashCode() {
        return this.f4897a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f4897a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeList(this.f4897a);
    }
}
