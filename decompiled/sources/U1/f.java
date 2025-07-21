package U1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.C1144z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends U1.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f5188a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i6) {
            return new f[i6];
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f5189a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5190b;

        public /* synthetic */ b(int i6, long j6, a aVar) {
            this(i6, j6);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f5189a);
            parcel.writeLong(this.f5190b);
        }

        public b(int i6, long j6) {
            this.f5189a = i6;
            this.f5190b = j6;
        }
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static f a(C1144z c1144z) {
        int G6 = c1144z.G();
        ArrayList arrayList = new ArrayList(G6);
        for (int i6 = 0; i6 < G6; i6++) {
            arrayList.add(c.e(c1144z));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        int size = this.f5188a.size();
        parcel.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((c) this.f5188a.get(i7)).f(parcel);
        }
    }

    public f(List list) {
        this.f5188a = Collections.unmodifiableList(list);
    }

    public f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(c.d(parcel));
        }
        this.f5188a = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f5191a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5192b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f5193c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f5194d;

        /* renamed from: e, reason: collision with root package name */
        public final long f5195e;

        /* renamed from: f, reason: collision with root package name */
        public final List f5196f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f5197g;

        /* renamed from: h, reason: collision with root package name */
        public final long f5198h;

        /* renamed from: i, reason: collision with root package name */
        public final int f5199i;

        /* renamed from: j, reason: collision with root package name */
        public final int f5200j;

        /* renamed from: k, reason: collision with root package name */
        public final int f5201k;

        public c(long j6, boolean z6, boolean z7, boolean z8, List list, long j7, boolean z9, long j8, int i6, int i7, int i8) {
            this.f5191a = j6;
            this.f5192b = z6;
            this.f5193c = z7;
            this.f5194d = z8;
            this.f5196f = Collections.unmodifiableList(list);
            this.f5195e = j7;
            this.f5197g = z9;
            this.f5198h = j8;
            this.f5199i = i6;
            this.f5200j = i7;
            this.f5201k = i8;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(C1144z c1144z) {
            boolean z6;
            ArrayList arrayList;
            boolean z7;
            boolean z8;
            long j6;
            boolean z9;
            long j7;
            int i6;
            int i7;
            int i8;
            boolean z10;
            long j8;
            long I6 = c1144z.I();
            boolean z11 = true;
            if ((c1144z.G() & 128) != 0) {
                z6 = true;
            } else {
                z6 = true;
                z11 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z11) {
                arrayList = arrayList2;
                z7 = false;
                z8 = false;
                j6 = -9223372036854775807L;
                z9 = false;
                j7 = -9223372036854775807L;
                i6 = 0;
                i7 = 0;
                i8 = 0;
            } else {
                int G6 = c1144z.G();
                boolean z12 = (G6 & 128) != 0 ? z6 : false;
                boolean z13 = (G6 & 64) != 0 ? z6 : false;
                boolean z14 = (G6 & 32) != 0 ? z6 : false;
                long I7 = z13 ? c1144z.I() : -9223372036854775807L;
                if (!z13) {
                    int G7 = c1144z.G();
                    ArrayList arrayList3 = new ArrayList(G7);
                    int i9 = 0;
                    while (i9 < G7) {
                        arrayList3.add(new b(c1144z.G(), c1144z.I(), null));
                        i9++;
                        G7 = G7;
                    }
                    arrayList2 = arrayList3;
                }
                if (z14) {
                    long G8 = c1144z.G();
                    boolean z15 = (128 & G8) != 0;
                    j8 = ((((G8 & 1) << 32) | c1144z.I()) * 1000) / 90;
                    z10 = z15;
                } else {
                    z10 = false;
                    j8 = -9223372036854775807L;
                }
                int M5 = c1144z.M();
                int G9 = c1144z.G();
                boolean z16 = z12;
                z9 = z10;
                z7 = z16;
                i8 = c1144z.G();
                long j9 = I7;
                i6 = M5;
                i7 = G9;
                long j10 = j8;
                arrayList = arrayList2;
                z8 = z13;
                j6 = j9;
                j7 = j10;
            }
            return new c(I6, z11, z7, z8, arrayList, j6, z9, j7, i6, i7, i8);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f5191a);
            parcel.writeByte(this.f5192b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f5193c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f5194d ? (byte) 1 : (byte) 0);
            int size = this.f5196f.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                ((b) this.f5196f.get(i6)).d(parcel);
            }
            parcel.writeLong(this.f5195e);
            parcel.writeByte(this.f5197g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f5198h);
            parcel.writeInt(this.f5199i);
            parcel.writeInt(this.f5200j);
            parcel.writeInt(this.f5201k);
        }

        public c(Parcel parcel) {
            this.f5191a = parcel.readLong();
            this.f5192b = parcel.readByte() == 1;
            this.f5193c = parcel.readByte() == 1;
            this.f5194d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i6 = 0; i6 < readInt; i6++) {
                arrayList.add(b.c(parcel));
            }
            this.f5196f = Collections.unmodifiableList(arrayList);
            this.f5195e = parcel.readLong();
            this.f5197g = parcel.readByte() == 1;
            this.f5198h = parcel.readLong();
            this.f5199i = parcel.readInt();
            this.f5200j = parcel.readInt();
            this.f5201k = parcel.readInt();
        }
    }
}
