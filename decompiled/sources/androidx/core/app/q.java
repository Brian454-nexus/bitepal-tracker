package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8555a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8556b = new Object();

    public static Bundle a(m.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d6 = aVar.d();
        bundle.putInt("icon", d6 != null ? d6.m() : 0);
        bundle.putCharSequence(com.amazon.a.a.o.b.f11189S, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(v vVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", vVar.i());
        bundle.putCharSequence("label", vVar.h());
        bundle.putCharSequenceArray("choices", vVar.e());
        bundle.putBoolean("allowFreeFormInput", vVar.c());
        bundle.putBundle("extras", vVar.g());
        Set d6 = vVar.d();
        if (d6 != null && !d6.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d6.size());
            Iterator it = d6.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] c(v[] vVarArr) {
        if (vVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[vVarArr.length];
        for (int i6 = 0; i6 < vVarArr.length; i6++) {
            bundleArr[i6] = b(vVarArr[i6]);
        }
        return bundleArr;
    }
}
