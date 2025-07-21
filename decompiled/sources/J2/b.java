package J2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import j0.C1638a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2868d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2869e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2870f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2871g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2872h;

    /* renamed from: i, reason: collision with root package name */
    public int f2873i;

    /* renamed from: j, reason: collision with root package name */
    public int f2874j;

    /* renamed from: k, reason: collision with root package name */
    public int f2875k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1638a(), new C1638a(), new C1638a());
    }

    @Override // J2.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2869e.writeInt(-1);
        } else {
            this.f2869e.writeInt(bArr.length);
            this.f2869e.writeByteArray(bArr);
        }
    }

    @Override // J2.a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2869e, 0);
    }

    @Override // J2.a
    public void E(int i6) {
        this.f2869e.writeInt(i6);
    }

    @Override // J2.a
    public void G(Parcelable parcelable) {
        this.f2869e.writeParcelable(parcelable, 0);
    }

    @Override // J2.a
    public void I(String str) {
        this.f2869e.writeString(str);
    }

    @Override // J2.a
    public void a() {
        int i6 = this.f2873i;
        if (i6 >= 0) {
            int i7 = this.f2868d.get(i6);
            int dataPosition = this.f2869e.dataPosition();
            this.f2869e.setDataPosition(i7);
            this.f2869e.writeInt(dataPosition - i7);
            this.f2869e.setDataPosition(dataPosition);
        }
    }

    @Override // J2.a
    public a b() {
        Parcel parcel = this.f2869e;
        int dataPosition = parcel.dataPosition();
        int i6 = this.f2874j;
        if (i6 == this.f2870f) {
            i6 = this.f2871g;
        }
        return new b(parcel, dataPosition, i6, this.f2872h + "  ", this.f2865a, this.f2866b, this.f2867c);
    }

    @Override // J2.a
    public boolean g() {
        return this.f2869e.readInt() != 0;
    }

    @Override // J2.a
    public byte[] i() {
        int readInt = this.f2869e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2869e.readByteArray(bArr);
        return bArr;
    }

    @Override // J2.a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2869e);
    }

    @Override // J2.a
    public boolean m(int i6) {
        while (this.f2874j < this.f2871g) {
            int i7 = this.f2875k;
            if (i7 == i6) {
                return true;
            }
            if (String.valueOf(i7).compareTo(String.valueOf(i6)) > 0) {
                return false;
            }
            this.f2869e.setDataPosition(this.f2874j);
            int readInt = this.f2869e.readInt();
            this.f2875k = this.f2869e.readInt();
            this.f2874j += readInt;
        }
        return this.f2875k == i6;
    }

    @Override // J2.a
    public int o() {
        return this.f2869e.readInt();
    }

    @Override // J2.a
    public Parcelable q() {
        return this.f2869e.readParcelable(getClass().getClassLoader());
    }

    @Override // J2.a
    public String s() {
        return this.f2869e.readString();
    }

    @Override // J2.a
    public void w(int i6) {
        a();
        this.f2873i = i6;
        this.f2868d.put(i6, this.f2869e.dataPosition());
        E(0);
        E(i6);
    }

    @Override // J2.a
    public void y(boolean z6) {
        this.f2869e.writeInt(z6 ? 1 : 0);
    }

    public b(Parcel parcel, int i6, int i7, String str, C1638a c1638a, C1638a c1638a2, C1638a c1638a3) {
        super(c1638a, c1638a2, c1638a3);
        this.f2868d = new SparseIntArray();
        this.f2873i = -1;
        this.f2875k = -1;
        this.f2869e = parcel;
        this.f2870f = i6;
        this.f2871g = i7;
        this.f2874j = i6;
        this.f2872h = str;
    }
}
