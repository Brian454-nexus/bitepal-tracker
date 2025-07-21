package a5;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final p f7804a;

    public y(p pVar) {
        this.f7804a = pVar;
    }

    @Override // R4.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T4.v a(ParcelFileDescriptor parcelFileDescriptor, int i6, int i7, R4.h hVar) {
        return this.f7804a.e(parcelFileDescriptor, i6, i7, hVar);
    }

    @Override // R4.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, R4.h hVar) {
        return e(parcelFileDescriptor) && this.f7804a.o(parcelFileDescriptor);
    }

    public final boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
