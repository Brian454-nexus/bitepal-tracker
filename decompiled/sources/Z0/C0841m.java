package Z0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: Z0.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0841m implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0841m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f6919a;

    /* renamed from: b, reason: collision with root package name */
    public int f6920b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6921c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6922d;

    /* renamed from: Z0.m$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0841m createFromParcel(Parcel parcel) {
            return new C0841m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0841m[] newArray(int i6) {
            return new C0841m[i6];
        }
    }

    /* renamed from: Z0.m$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f6923a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f6924b;

        /* renamed from: c, reason: collision with root package name */
        public final String f6925c;

        /* renamed from: d, reason: collision with root package name */
        public final String f6926d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f6927e;

        /* renamed from: Z0.m$b$a */
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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return d() && !bVar.d() && e(bVar.f6924b);
        }

        public b c(byte[] bArr) {
            return new b(this.f6924b, this.f6925c, this.f6926d, bArr);
        }

        public boolean d() {
            return this.f6927e != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return AbstractC0835g.f6879a.equals(this.f6924b) || uuid.equals(this.f6924b);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return AbstractC1117K.c(this.f6925c, bVar.f6925c) && AbstractC1117K.c(this.f6926d, bVar.f6926d) && AbstractC1117K.c(this.f6924b, bVar.f6924b) && Arrays.equals(this.f6927e, bVar.f6927e);
        }

        public int hashCode() {
            if (this.f6923a == 0) {
                int hashCode = this.f6924b.hashCode() * 31;
                String str = this.f6925c;
                this.f6923a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6926d.hashCode()) * 31) + Arrays.hashCode(this.f6927e);
            }
            return this.f6923a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeLong(this.f6924b.getMostSignificantBits());
            parcel.writeLong(this.f6924b.getLeastSignificantBits());
            parcel.writeString(this.f6925c);
            parcel.writeString(this.f6926d);
            parcel.writeByteArray(this.f6927e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f6924b = (UUID) AbstractC1119a.e(uuid);
            this.f6925c = str;
            this.f6926d = y.t((String) AbstractC1119a.e(str2));
            this.f6927e = bArr;
        }

        public b(Parcel parcel) {
            this.f6924b = new UUID(parcel.readLong(), parcel.readLong());
            this.f6925c = parcel.readString();
            this.f6926d = (String) AbstractC1117K.i(parcel.readString());
            this.f6927e = parcel.createByteArray();
        }
    }

    public C0841m(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public static boolean c(ArrayList arrayList, int i6, UUID uuid) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (((b) arrayList.get(i7)).f6924b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static C0841m e(C0841m c0841m, C0841m c0841m2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c0841m != null) {
            str = c0841m.f6921c;
            for (b bVar : c0841m.f6919a) {
                if (bVar.d()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c0841m2 != null) {
            if (str == null) {
                str = c0841m2.f6921c;
            }
            int size = arrayList.size();
            for (b bVar2 : c0841m2.f6919a) {
                if (bVar2.d() && !c(arrayList, size, bVar2.f6924b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0841m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC0835g.f6879a;
        return uuid.equals(bVar.f6924b) ? uuid.equals(bVar2.f6924b) ? 0 : 1 : bVar.f6924b.compareTo(bVar2.f6924b);
    }

    public C0841m d(String str) {
        return AbstractC1117K.c(this.f6921c, str) ? this : new C0841m(str, false, this.f6919a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0841m.class == obj.getClass()) {
            C0841m c0841m = (C0841m) obj;
            if (AbstractC1117K.c(this.f6921c, c0841m.f6921c) && Arrays.equals(this.f6919a, c0841m.f6919a)) {
                return true;
            }
        }
        return false;
    }

    public b f(int i6) {
        return this.f6919a[i6];
    }

    public C0841m g(C0841m c0841m) {
        String str;
        String str2 = this.f6921c;
        AbstractC1119a.g(str2 == null || (str = c0841m.f6921c) == null || TextUtils.equals(str2, str));
        String str3 = this.f6921c;
        if (str3 == null) {
            str3 = c0841m.f6921c;
        }
        return new C0841m(str3, (b[]) AbstractC1117K.N0(this.f6919a, c0841m.f6919a));
    }

    public int hashCode() {
        if (this.f6920b == 0) {
            String str = this.f6921c;
            this.f6920b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6919a);
        }
        return this.f6920b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f6921c);
        parcel.writeTypedArray(this.f6919a, 0);
    }

    public C0841m(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C0841m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C0841m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C0841m(String str, boolean z6, b... bVarArr) {
        this.f6921c = str;
        bVarArr = z6 ? (b[]) bVarArr.clone() : bVarArr;
        this.f6919a = bVarArr;
        this.f6922d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C0841m(Parcel parcel) {
        this.f6921c = parcel.readString();
        b[] bVarArr = (b[]) AbstractC1117K.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f6919a = bVarArr;
        this.f6922d = bVarArr.length;
    }
}
