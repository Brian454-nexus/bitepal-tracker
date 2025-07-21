package com.amazon.device.simplesignin.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class RequestId implements Parcelable {
    public static final Parcelable.Creator<RequestId> CREATOR = new Parcelable.Creator<RequestId>() { // from class: com.amazon.device.simplesignin.model.RequestId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestId createFromParcel(Parcel parcel) {
            return new RequestId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestId[] newArray(int i6) {
            return new RequestId[i6];
        }
    };
    private final String id;

    public RequestId(String str) {
        this.id = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.id);
    }

    public RequestId() {
        this.id = UUID.randomUUID().toString();
    }
}
