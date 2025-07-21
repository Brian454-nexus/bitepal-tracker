package H2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public View f2188b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f2187a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2189c = new ArrayList();

    public s(View view) {
        this.f2188b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2188b == sVar.f2188b && this.f2187a.equals(sVar.f2187a);
    }

    public int hashCode() {
        return (this.f2188b.hashCode() * 31) + this.f2187a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2188b + "\n") + "    values:";
        for (String str2 : this.f2187a.keySet()) {
            str = str + "    " + str2 + ": " + this.f2187a.get(str2) + "\n";
        }
        return str;
    }
}
