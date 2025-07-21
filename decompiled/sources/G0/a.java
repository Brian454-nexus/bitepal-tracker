package G0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f1716a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f1715b = new C0034a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: G0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0034a extends a {
        public C0034a() {
            super((C0034a) null);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f1715b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public /* synthetic */ a(C0034a c0034a) {
        this();
    }

    public final Parcelable a() {
        return this.f1716a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f1716a, i6);
    }

    public a() {
        this.f1716a = null;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1716a = parcelable == f1715b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1716a = readParcelable == null ? f1715b : readParcelable;
    }
}
