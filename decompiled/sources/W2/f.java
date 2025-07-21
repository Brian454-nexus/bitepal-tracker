package W2;

import android.app.Notification;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f5566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5567b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f5568c;

    public f(int i6, Notification notification, int i7) {
        this.f5566a = i6;
        this.f5568c = notification;
        this.f5567b = i7;
    }

    public int a() {
        return this.f5567b;
    }

    public Notification b() {
        return this.f5568c;
    }

    public int c() {
        return this.f5566a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f5566a == fVar.f5566a && this.f5567b == fVar.f5567b) {
            return this.f5568c.equals(fVar.f5568c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5566a * 31) + this.f5567b) * 31) + this.f5568c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f5566a + ", mForegroundServiceType=" + this.f5567b + ", mNotification=" + this.f5568c + '}';
    }
}
