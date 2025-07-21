package P0;

import P0.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1057i;
import java.util.ArrayList;

/* renamed from: P0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0694b implements Parcelable {
    public static final Parcelable.Creator<C0694b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4142a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4143b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4144c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4145d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4146e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4147f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4148g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4149h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f4150i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4151j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f4152k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4153l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f4154m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4155n;

    /* renamed from: P0.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0694b createFromParcel(Parcel parcel) {
            return new C0694b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0694b[] newArray(int i6) {
            return new C0694b[i6];
        }
    }

    public C0694b(C0693a c0693a) {
        int size = c0693a.f4040c.size();
        this.f4142a = new int[size * 6];
        if (c0693a.f4046i) {
            this.f4143b = new ArrayList(size);
            this.f4144c = new int[size];
            this.f4145d = new int[size];
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                Q.a aVar = (Q.a) c0693a.f4040c.get(i7);
                int i8 = i6 + 1;
                this.f4142a[i6] = aVar.f4057a;
                ArrayList arrayList = this.f4143b;
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = aVar.f4058b;
                arrayList.add(abstractComponentCallbacksC0708p != null ? abstractComponentCallbacksC0708p.mWho : null);
                int[] iArr = this.f4142a;
                iArr[i8] = aVar.f4059c ? 1 : 0;
                iArr[i6 + 2] = aVar.f4060d;
                iArr[i6 + 3] = aVar.f4061e;
                int i9 = i6 + 5;
                iArr[i6 + 4] = aVar.f4062f;
                i6 += 6;
                iArr[i9] = aVar.f4063g;
                this.f4144c[i7] = aVar.f4064h.ordinal();
                this.f4145d[i7] = aVar.f4065i.ordinal();
            }
            this.f4146e = c0693a.f4045h;
            this.f4147f = c0693a.f4048k;
            this.f4148g = c0693a.f4106v;
            this.f4149h = c0693a.f4049l;
            this.f4150i = c0693a.f4050m;
            this.f4151j = c0693a.f4051n;
            this.f4152k = c0693a.f4052o;
            this.f4153l = c0693a.f4053p;
            this.f4154m = c0693a.f4054q;
            this.f4155n = c0693a.f4055r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(C0693a c0693a) {
        int i6 = 0;
        int i7 = 0;
        while (true) {
            boolean z6 = true;
            if (i6 >= this.f4142a.length) {
                c0693a.f4045h = this.f4146e;
                c0693a.f4048k = this.f4147f;
                c0693a.f4046i = true;
                c0693a.f4049l = this.f4149h;
                c0693a.f4050m = this.f4150i;
                c0693a.f4051n = this.f4151j;
                c0693a.f4052o = this.f4152k;
                c0693a.f4053p = this.f4153l;
                c0693a.f4054q = this.f4154m;
                c0693a.f4055r = this.f4155n;
                return;
            }
            Q.a aVar = new Q.a();
            int i8 = i6 + 1;
            aVar.f4057a = this.f4142a[i6];
            if (I.I0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0693a + " op #" + i7 + " base fragment #" + this.f4142a[i8]);
            }
            aVar.f4064h = AbstractC1057i.b.values()[this.f4144c[i7]];
            aVar.f4065i = AbstractC1057i.b.values()[this.f4145d[i7]];
            int[] iArr = this.f4142a;
            int i9 = i6 + 2;
            if (iArr[i8] == 0) {
                z6 = false;
            }
            aVar.f4059c = z6;
            int i10 = iArr[i9];
            aVar.f4060d = i10;
            int i11 = iArr[i6 + 3];
            aVar.f4061e = i11;
            int i12 = i6 + 5;
            int i13 = iArr[i6 + 4];
            aVar.f4062f = i13;
            i6 += 6;
            int i14 = iArr[i12];
            aVar.f4063g = i14;
            c0693a.f4041d = i10;
            c0693a.f4042e = i11;
            c0693a.f4043f = i13;
            c0693a.f4044g = i14;
            c0693a.e(aVar);
            i7++;
        }
    }

    public C0693a c(I i6) {
        C0693a c0693a = new C0693a(i6);
        a(c0693a);
        c0693a.f4106v = this.f4148g;
        for (int i7 = 0; i7 < this.f4143b.size(); i7++) {
            String str = (String) this.f4143b.get(i7);
            if (str != null) {
                ((Q.a) c0693a.f4040c.get(i7)).f4058b = i6.f0(str);
            }
        }
        c0693a.n(1);
        return c0693a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeIntArray(this.f4142a);
        parcel.writeStringList(this.f4143b);
        parcel.writeIntArray(this.f4144c);
        parcel.writeIntArray(this.f4145d);
        parcel.writeInt(this.f4146e);
        parcel.writeString(this.f4147f);
        parcel.writeInt(this.f4148g);
        parcel.writeInt(this.f4149h);
        TextUtils.writeToParcel(this.f4150i, parcel, 0);
        parcel.writeInt(this.f4151j);
        TextUtils.writeToParcel(this.f4152k, parcel, 0);
        parcel.writeStringList(this.f4153l);
        parcel.writeStringList(this.f4154m);
        parcel.writeInt(this.f4155n ? 1 : 0);
    }

    public C0694b(Parcel parcel) {
        this.f4142a = parcel.createIntArray();
        this.f4143b = parcel.createStringArrayList();
        this.f4144c = parcel.createIntArray();
        this.f4145d = parcel.createIntArray();
        this.f4146e = parcel.readInt();
        this.f4147f = parcel.readString();
        this.f4148g = parcel.readInt();
        this.f4149h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4150i = (CharSequence) creator.createFromParcel(parcel);
        this.f4151j = parcel.readInt();
        this.f4152k = (CharSequence) creator.createFromParcel(parcel);
        this.f4153l = parcel.createStringArrayList();
        this.f4154m = parcel.createStringArrayList();
        this.f4155n = parcel.readInt() != 0;
    }
}
