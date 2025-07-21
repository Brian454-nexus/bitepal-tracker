package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.f;
import com.amazon.d.a.g;
import com.amazon.d.a.h;
import com.amazon.d.a.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface i extends IInterface {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a extends Binder implements i {

        /* renamed from: a, reason: collision with root package name */
        private static final String f11465a = "com.amazon.venezia.command.ResultCallback";

        /* renamed from: b, reason: collision with root package name */
        static final int f11466b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f11467c = 2;

        /* renamed from: d, reason: collision with root package name */
        static final int f11468d = 3;

        /* renamed from: e, reason: collision with root package name */
        static final int f11469e = 4;

        /* renamed from: com.amazon.d.a.i$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0176a implements i {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11470a;

            public C0176a(IBinder iBinder) {
                this.f11470a = iBinder;
            }

            public String a() {
                return a.f11465a;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11470a;
            }

            @Override // com.amazon.d.a.i
            public void a(j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11465a);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f11470a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.amazon.d.a.i
            public void a(h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11465a);
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f11470a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.amazon.d.a.i
            public void a(f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11465a);
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f11470a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.amazon.d.a.i
            public void a(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11465a);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f11470a.transact(4, obtain, obtain2, 0);
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
            attachInterface(this, f11465a);
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f11465a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new C0176a(iBinder) : (i) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1) {
                parcel.enforceInterface(f11465a);
                a(j.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i6 == 2) {
                parcel.enforceInterface(f11465a);
                a(h.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i6 == 3) {
                parcel.enforceInterface(f11465a);
                a(f.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i6 != 4) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                parcel2.writeString(f11465a);
                return true;
            }
            parcel.enforceInterface(f11465a);
            a(g.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void a(f fVar);

    void a(g gVar);

    void a(h hVar);

    void a(j jVar);
}
