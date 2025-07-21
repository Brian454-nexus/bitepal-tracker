package t5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f19146a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19147b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public a(IBinder iBinder) {
        this.f19146a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19146a;
    }

    public final Parcel d0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19147b);
        return obtain;
    }

    public final Parcel e0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f19146a.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e6) {
                obtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }
}
