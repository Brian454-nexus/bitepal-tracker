package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.c;
import com.amazon.d.a.i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface d extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements d {

        /* renamed from: a, reason: collision with root package name */
        static final int f11434a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final String f11435b = "com.amazon.venezia.command.CommandService";

        /* renamed from: com.amazon.d.a.d$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0171a implements d {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11436a;

            public C0171a(IBinder iBinder) {
                this.f11436a = iBinder;
            }

            public String a() {
                return a.f11435b;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11436a;
            }

            @Override // com.amazon.d.a.d
            public void a(c cVar, i iVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11435b);
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.f11436a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, f11435b);
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11435b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new C0171a(iBinder) : (d) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 != 1) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11435b);
                return true;
            }
            parcel.enforceInterface(f11435b);
            a(c.a.a(parcel.readStrongBinder()), i.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void a(c cVar, i iVar);
}
