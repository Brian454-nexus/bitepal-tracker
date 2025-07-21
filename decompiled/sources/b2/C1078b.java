package b2;

import android.os.Bundle;
import android.os.Parcel;
import b1.C1076a;
import c1.AbstractC1119a;
import c1.AbstractC1120b;
import java.util.ArrayList;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1078b {
    public C1081e a(long j6, byte[] bArr, int i6, int i7) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i6, i7);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new C1081e(AbstractC1120b.a(new y6.g() { // from class: b2.a
            public final Object apply(Object obj) {
                return C1076a.b((Bundle) obj);
            }
        }, (ArrayList) AbstractC1119a.e(readBundle.getParcelableArrayList("c"))), j6, readBundle.getLong("d"));
    }
}
