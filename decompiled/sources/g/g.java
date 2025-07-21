package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f14258a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f14259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14260c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14261d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f14257e = new c(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final IntentSender f14262a;

        /* renamed from: b, reason: collision with root package name */
        public Intent f14263b;

        /* renamed from: c, reason: collision with root package name */
        public int f14264c;

        /* renamed from: d, reason: collision with root package name */
        public int f14265d;

        public a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f14262a = intentSender;
        }

        public final g a() {
            return new g(this.f14262a, this.f14263b, this.f14264c, this.f14265d);
        }

        public final a b(Intent intent) {
            this.f14263b = intent;
            return this;
        }

        public final a c(int i6, int i7) {
            this.f14265d = i6;
            this.f14264c = i7;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.app.PendingIntent r2) {
            /*
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.g.a.<init>(android.app.PendingIntent):void");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i6) {
            return new g[i6];
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    public g(IntentSender intentSender, Intent intent, int i6, int i7) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f14258a = intentSender;
        this.f14259b = intent;
        this.f14260c = i6;
        this.f14261d = i7;
    }

    public final Intent a() {
        return this.f14259b;
    }

    public final int c() {
        return this.f14260c;
    }

    public final int d() {
        return this.f14261d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final IntentSender e() {
        return this.f14258a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i6) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f14258a, i6);
        dest.writeParcelable(this.f14259b, i6);
        dest.writeInt(this.f14260c);
        dest.writeInt(this.f14261d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.<init>(android.os.Parcel):void");
    }
}
