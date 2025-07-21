package androidx.work;

import W2.k;
import W2.v;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class WorkManagerInitializer implements D2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10211a = k.i("WrkMgrInitializer");

    @Override // D2.b
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // D2.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(Context context) {
        k.e().a(f10211a, "Initializing WorkManager with default configuration.");
        v.f(context, new a.b().a());
        return v.e(context);
    }
}
