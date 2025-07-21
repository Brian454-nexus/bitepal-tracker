package U1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.C1111E;
import c1.C1144z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends U1.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f5172a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5173b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5174c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5175d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5176e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5177f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5178g;

    /* renamed from: h, reason: collision with root package name */
    public final List f5179h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5180i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5181j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5182k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5183l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5184m;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i6) {
            return new d[i6];
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f5185a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5186b;

        /* renamed from: c, reason: collision with root package name */
        public final long f5187c;

        public /* synthetic */ b(int i6, long j6, long j7, a aVar) {
            this(i6, j6, j7);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f5185a);
            parcel.writeLong(this.f5186b);
            parcel.writeLong(this.f5187c);
        }

        public b(int i6, long j6, long j7) {
            this.f5185a = i6;
            this.f5186b = j6;
            this.f5187c = j7;
        }
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d a(C1144z c1144z, long j6, C1111E c1111e) {
        List list;
        long j7;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i6;
        int i7;
        int i8;
        boolean z10;
        int i9;
        long j8;
        long I6 = c1144z.I();
        boolean z11 = (c1144z.G() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long j9 = -9223372036854775807L;
        if (z11) {
            list = list2;
            j7 = -9223372036854775807L;
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        } else {
            int G6 = c1144z.G();
            boolean z12 = (G6 & 128) != 0;
            boolean z13 = (G6 & 64) != 0;
            boolean z14 = (G6 & 32) != 0;
            boolean z15 = (G6 & 16) != 0;
            long c6 = (!z13 || z15) ? -9223372036854775807L : g.c(c1144z, j6);
            if (!z13) {
                int G7 = c1144z.G();
                ArrayList arrayList = new ArrayList(G7);
                int i10 = 0;
                while (i10 < G7) {
                    int G8 = c1144z.G();
                    if (z15) {
                        i9 = G7;
                        j8 = -9223372036854775807L;
                    } else {
                        i9 = G7;
                        j8 = g.c(c1144z, j6);
                    }
                    arrayList.add(new b(G8, j8, c1111e.b(j8), null));
                    i10++;
                    G7 = i9;
                }
                list2 = arrayList;
            }
            if (z14) {
                long G9 = c1144z.G();
                boolean z16 = (128 & G9) != 0;
                j9 = ((((G9 & 1) << 32) | c1144z.I()) * 1000) / 90;
                z10 = z16;
            } else {
                z10 = false;
            }
            int M5 = c1144z.M();
            long j10 = c6;
            j7 = j9;
            j9 = j10;
            i7 = c1144z.G();
            i8 = c1144z.G();
            i6 = M5;
            z9 = z10;
            z6 = z12;
            z7 = z13;
            list = list2;
            z8 = z15;
        }
        return new d(I6, z11, z6, z7, z8, j9, c1111e.b(j9), list, z9, j7, i6, i7, i8);
    }

    @Override // U1.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f5177f + ", programSplicePlaybackPositionUs= " + this.f5178g + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f5172a);
        parcel.writeByte(this.f5173b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5174c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5175d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5176e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5177f);
        parcel.writeLong(this.f5178g);
        int size = this.f5179h.size();
        parcel.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((b) this.f5179h.get(i7)).b(parcel);
        }
        parcel.writeByte(this.f5180i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5181j);
        parcel.writeInt(this.f5182k);
        parcel.writeInt(this.f5183l);
        parcel.writeInt(this.f5184m);
    }

    public d(long j6, boolean z6, boolean z7, boolean z8, boolean z9, long j7, long j8, List list, boolean z10, long j9, int i6, int i7, int i8) {
        this.f5172a = j6;
        this.f5173b = z6;
        this.f5174c = z7;
        this.f5175d = z8;
        this.f5176e = z9;
        this.f5177f = j7;
        this.f5178g = j8;
        this.f5179h = Collections.unmodifiableList(list);
        this.f5180i = z10;
        this.f5181j = j9;
        this.f5182k = i6;
        this.f5183l = i7;
        this.f5184m = i8;
    }

    public d(Parcel parcel) {
        this.f5172a = parcel.readLong();
        this.f5173b = parcel.readByte() == 1;
        this.f5174c = parcel.readByte() == 1;
        this.f5175d = parcel.readByte() == 1;
        this.f5176e = parcel.readByte() == 1;
        this.f5177f = parcel.readLong();
        this.f5178g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(b.a(parcel));
        }
        this.f5179h = Collections.unmodifiableList(arrayList);
        this.f5180i = parcel.readByte() == 1;
        this.f5181j = parcel.readLong();
        this.f5182k = parcel.readInt();
        this.f5183l = parcel.readInt();
        this.f5184m = parcel.readInt();
    }
}
