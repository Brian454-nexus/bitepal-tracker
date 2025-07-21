package V1;

import Q1.b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0092a();

    /* renamed from: V1.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0092a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    public a(Parcel parcel) {
        super(parcel);
    }
}
