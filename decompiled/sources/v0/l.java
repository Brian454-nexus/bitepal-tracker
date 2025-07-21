package v0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f19290a;

    public l(Object obj) {
        this.f19290a = (LocaleList) obj;
    }

    @Override // v0.k
    public String a() {
        return this.f19290a.toLanguageTags();
    }

    @Override // v0.k
    public Object b() {
        return this.f19290a;
    }

    public boolean equals(Object obj) {
        return this.f19290a.equals(((k) obj).b());
    }

    @Override // v0.k
    public Locale get(int i6) {
        return this.f19290a.get(i6);
    }

    public int hashCode() {
        return this.f19290a.hashCode();
    }

    @Override // v0.k
    public boolean isEmpty() {
        return this.f19290a.isEmpty();
    }

    @Override // v0.k
    public int size() {
        return this.f19290a.size();
    }

    public String toString() {
        return this.f19290a.toString();
    }
}
