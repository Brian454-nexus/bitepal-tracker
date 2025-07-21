package com.amazon.d.a;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.b;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface a extends IInterface {
    String a();

    void a(b bVar);

    Intent b();

    Map c();

    /* renamed from: com.amazon.d.a.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractBinderC0167a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        static final int f11419a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f11420b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f11421c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f11422d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final String f11423e = "com.amazon.venezia.command.Choice";

        public AbstractBinderC0167a() {
            attachInterface(this, f11423e);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11423e);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0168a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1) {
                parcel.enforceInterface(f11423e);
                String a6 = a();
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            }
            if (i6 == 2) {
                parcel.enforceInterface(f11423e);
                Intent b6 = b();
                parcel2.writeNoException();
                if (b6 != null) {
                    parcel2.writeInt(1);
                    b6.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i6 == 3) {
                parcel.enforceInterface(f11423e);
                a(b.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i6 != 4) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11423e);
                return true;
            }
            parcel.enforceInterface(f11423e);
            Map c6 = c();
            parcel2.writeNoException();
            parcel2.writeMap(c6);
            return true;
        }

        /* renamed from: com.amazon.d.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0168a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11424a;

            public C0168a(IBinder iBinder) {
                this.f11424a = iBinder;
            }

            @Override // com.amazon.d.a.a
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0167a.f11423e);
                    this.f11424a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11424a;
            }

            @Override // com.amazon.d.a.a
            public Intent b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0167a.f11423e);
                    this.f11424a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.a
            public Map c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0167a.f11423e);
                    this.f11424a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC0167a.f11423e;
            }

            @Override // com.amazon.d.a.a
            public void a(b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0167a.f11423e);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f11424a.transact(3, obtain, obtain2, 0);
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
    }
}
