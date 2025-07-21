package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1310a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f14232a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f14233b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f14231c = new b(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<C1310a> CREATOR = new C0196a();

    /* renamed from: g.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0196a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1310a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C1310a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1310a[] newArray(int i6) {
            return new C1310a[i6];
        }
    }

    /* renamed from: g.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i6) {
            return i6 != -1 ? i6 != 0 ? String.valueOf(i6) : "RESULT_CANCELED" : "RESULT_OK";
        }

        public b() {
        }
    }

    public C1310a(int i6, Intent intent) {
        this.f14232a = i6;
        this.f14233b = intent;
    }

    public final Intent a() {
        return this.f14233b;
    }

    public final int c() {
        return this.f14232a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f14231c.a(this.f14232a) + ", data=" + this.f14233b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i6) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f14232a);
        dest.writeInt(this.f14233b == null ? 0 : 1);
        Intent intent = this.f14233b;
        if (intent != null) {
            intent.writeToParcel(dest, i6);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1310a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
