package b2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b1.C1076a;
import c1.AbstractC1120b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1080d {
    public byte[] a(List list, long j6) {
        ArrayList<? extends Parcelable> b6 = AbstractC1120b.b(list, new y6.g() { // from class: b2.c
            public final Object apply(Object obj) {
                return ((C1076a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", b6);
        bundle.putLong("d", j6);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
