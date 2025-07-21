package android.support.v4.media.session;

import J2.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final MediaDescriptionCompat f7838a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7839b;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i6) {
                return new QueueItem[i6];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f7838a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f7839b = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f7838a + ", Id=" + this.f7839b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            this.f7838a.writeToParcel(parcel, i6);
            parcel.writeLong(this.f7839b);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public ResultReceiver f7840a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i6) {
                return new ResultReceiverWrapper[i6];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f7840a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            this.f7840a.writeToParcel(parcel, i6);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Object f7841a;

        /* renamed from: b, reason: collision with root package name */
        public android.support.v4.media.session.a f7842b;

        /* renamed from: c, reason: collision with root package name */
        public c f7843c;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i6) {
                return new Token[i6];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        public Object a() {
            return this.f7841a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f7841a;
            if (obj2 == null) {
                return token.f7841a == null;
            }
            Object obj3 = token.f7841a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f7841a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable((Parcelable) this.f7841a, i6);
        }

        public Token(Object obj, android.support.v4.media.session.a aVar, c cVar) {
            this.f7841a = obj;
            this.f7842b = aVar;
            this.f7843c = cVar;
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
