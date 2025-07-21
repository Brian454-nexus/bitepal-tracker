package P0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1057i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f4012a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4015d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4016e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4017f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4018g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4019h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4020i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4021j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4022k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4023l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4024m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4025n;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public N createFromParcel(Parcel parcel) {
            return new N(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public N[] newArray(int i6) {
            return new N[i6];
        }
    }

    public N(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        this.f4012a = abstractComponentCallbacksC0708p.getClass().getName();
        this.f4013b = abstractComponentCallbacksC0708p.mWho;
        this.f4014c = abstractComponentCallbacksC0708p.mFromLayout;
        this.f4015d = abstractComponentCallbacksC0708p.mFragmentId;
        this.f4016e = abstractComponentCallbacksC0708p.mContainerId;
        this.f4017f = abstractComponentCallbacksC0708p.mTag;
        this.f4018g = abstractComponentCallbacksC0708p.mRetainInstance;
        this.f4019h = abstractComponentCallbacksC0708p.mRemoving;
        this.f4020i = abstractComponentCallbacksC0708p.mDetached;
        this.f4021j = abstractComponentCallbacksC0708p.mHidden;
        this.f4022k = abstractComponentCallbacksC0708p.mMaxState.ordinal();
        this.f4023l = abstractComponentCallbacksC0708p.mTargetWho;
        this.f4024m = abstractComponentCallbacksC0708p.mTargetRequestCode;
        this.f4025n = abstractComponentCallbacksC0708p.mUserVisibleHint;
    }

    public AbstractComponentCallbacksC0708p a(AbstractC0717z abstractC0717z, ClassLoader classLoader) {
        AbstractComponentCallbacksC0708p a6 = abstractC0717z.a(classLoader, this.f4012a);
        a6.mWho = this.f4013b;
        a6.mFromLayout = this.f4014c;
        a6.mRestored = true;
        a6.mFragmentId = this.f4015d;
        a6.mContainerId = this.f4016e;
        a6.mTag = this.f4017f;
        a6.mRetainInstance = this.f4018g;
        a6.mRemoving = this.f4019h;
        a6.mDetached = this.f4020i;
        a6.mHidden = this.f4021j;
        a6.mMaxState = AbstractC1057i.b.values()[this.f4022k];
        a6.mTargetWho = this.f4023l;
        a6.mTargetRequestCode = this.f4024m;
        a6.mUserVisibleHint = this.f4025n;
        return a6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4012a);
        sb.append(" (");
        sb.append(this.f4013b);
        sb.append(")}:");
        if (this.f4014c) {
            sb.append(" fromLayout");
        }
        if (this.f4016e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4016e));
        }
        String str = this.f4017f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4017f);
        }
        if (this.f4018g) {
            sb.append(" retainInstance");
        }
        if (this.f4019h) {
            sb.append(" removing");
        }
        if (this.f4020i) {
            sb.append(" detached");
        }
        if (this.f4021j) {
            sb.append(" hidden");
        }
        if (this.f4023l != null) {
            sb.append(" targetWho=");
            sb.append(this.f4023l);
            sb.append(" targetRequestCode=");
            sb.append(this.f4024m);
        }
        if (this.f4025n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4012a);
        parcel.writeString(this.f4013b);
        parcel.writeInt(this.f4014c ? 1 : 0);
        parcel.writeInt(this.f4015d);
        parcel.writeInt(this.f4016e);
        parcel.writeString(this.f4017f);
        parcel.writeInt(this.f4018g ? 1 : 0);
        parcel.writeInt(this.f4019h ? 1 : 0);
        parcel.writeInt(this.f4020i ? 1 : 0);
        parcel.writeInt(this.f4021j ? 1 : 0);
        parcel.writeInt(this.f4022k);
        parcel.writeString(this.f4023l);
        parcel.writeInt(this.f4024m);
        parcel.writeInt(this.f4025n ? 1 : 0);
    }

    public N(Parcel parcel) {
        this.f4012a = parcel.readString();
        this.f4013b = parcel.readString();
        this.f4014c = parcel.readInt() != 0;
        this.f4015d = parcel.readInt();
        this.f4016e = parcel.readInt();
        this.f4017f = parcel.readString();
        this.f4018g = parcel.readInt() != 0;
        this.f4019h = parcel.readInt() != 0;
        this.f4020i = parcel.readInt() != 0;
        this.f4021j = parcel.readInt() != 0;
        this.f4022k = parcel.readInt();
        this.f4023l = parcel.readString();
        this.f4024m = parcel.readInt();
        this.f4025n = parcel.readInt() != 0;
    }
}
