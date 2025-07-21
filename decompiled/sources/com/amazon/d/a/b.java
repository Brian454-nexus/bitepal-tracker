package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface b extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        static final int f11425a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final String f11426b = "com.amazon.venezia.command.ChoiceContext";

        /* renamed from: com.amazon.d.a.b$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0169a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11427a;

            public C0169a(IBinder iBinder) {
                this.f11427a = iBinder;
            }

            @Override // com.amazon.d.a.b
            public Map a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11426b);
                    this.f11427a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11427a;
            }

            public String b() {
                return a.f11426b;
            }
        }

        public a() {
            attachInterface(this, f11426b);
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11426b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0169a(iBinder) : (b) queryLocalInterface;
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
                parcel2.writeString(f11426b);
                return true;
            }
            parcel.enforceInterface(f11426b);
            Map a6 = a();
            parcel2.writeNoException();
            parcel2.writeMap(a6);
            return true;
        }
    }

    Map a();
}
