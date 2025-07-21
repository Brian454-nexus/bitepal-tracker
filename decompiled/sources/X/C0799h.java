package X;

import android.net.Uri;

/* renamed from: X.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0799h extends AbstractC0809s {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5885a;

    public C0799h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f5885a = uri;
    }

    @Override // X.AbstractC0809s
    public Uri a() {
        return this.f5885a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0809s) {
            return this.f5885a.equals(((AbstractC0809s) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f5885a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f5885a + "}";
    }
}
