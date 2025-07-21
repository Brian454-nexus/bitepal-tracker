package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.a;
import com.amazon.d.a.e;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface f extends IInterface {
    String a();

    void a(e eVar);

    String b();

    String c();

    long d();

    com.amazon.d.a.a e();

    com.amazon.d.a.a f();

    com.amazon.d.a.a g();

    Map h();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements f {

        /* renamed from: a, reason: collision with root package name */
        static final int f11441a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f11442b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f11443c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f11444d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f11445e = 5;

        /* renamed from: f, reason: collision with root package name */
        static final int f11446f = 6;

        /* renamed from: g, reason: collision with root package name */
        static final int f11447g = 7;

        /* renamed from: h, reason: collision with root package name */
        static final int f11448h = 8;

        /* renamed from: i, reason: collision with root package name */
        static final int f11449i = 9;

        /* renamed from: j, reason: collision with root package name */
        private static final String f11450j = "com.amazon.venezia.command.DecisionResult";

        public a() {
            attachInterface(this, f11450j);
        }

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11450j);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof f)) ? new C0173a(iBinder) : (f) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1598968902) {
                parcel2.writeString(f11450j);
                return true;
            }
            switch (i6) {
                case 1:
                    parcel.enforceInterface(f11450j);
                    String a6 = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a6);
                    return true;
                case 2:
                    parcel.enforceInterface(f11450j);
                    String b6 = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b6);
                    return true;
                case 3:
                    parcel.enforceInterface(f11450j);
                    String c6 = c();
                    parcel2.writeNoException();
                    parcel2.writeString(c6);
                    return true;
                case 4:
                    parcel.enforceInterface(f11450j);
                    long d6 = d();
                    parcel2.writeNoException();
                    parcel2.writeLong(d6);
                    return true;
                case 5:
                    parcel.enforceInterface(f11450j);
                    a(e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(f11450j);
                    com.amazon.d.a.a e6 = e();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(e6 != null ? e6.asBinder() : null);
                    return true;
                case 7:
                    parcel.enforceInterface(f11450j);
                    com.amazon.d.a.a f6 = f();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(f6 != null ? f6.asBinder() : null);
                    return true;
                case 8:
                    parcel.enforceInterface(f11450j);
                    com.amazon.d.a.a g6 = g();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(g6 != null ? g6.asBinder() : null);
                    return true;
                case 9:
                    parcel.enforceInterface(f11450j);
                    Map h6 = h();
                    parcel2.writeNoException();
                    parcel2.writeMap(h6);
                    return true;
                default:
                    return super.onTransact(i6, parcel, parcel2, i7);
            }
        }

        /* renamed from: com.amazon.d.a.f$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0173a implements f {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11451a;

            public C0173a(IBinder iBinder) {
                this.f11451a = iBinder;
            }

            @Override // com.amazon.d.a.f
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11451a;
            }

            @Override // com.amazon.d.a.f
            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.f
            public String c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.f
            public long d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.f
            public com.amazon.d.a.a e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return a.AbstractBinderC0167a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.f
            public com.amazon.d.a.a f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return a.AbstractBinderC0167a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.f
            public com.amazon.d.a.a g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return a.AbstractBinderC0167a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.f
            public Map h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    this.f11451a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String i() {
                return a.f11450j;
            }

            @Override // com.amazon.d.a.f
            public void a(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11450j);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f11451a.transact(5, obtain, obtain2, 0);
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
