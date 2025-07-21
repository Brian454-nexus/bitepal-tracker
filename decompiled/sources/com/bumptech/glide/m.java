package com.bumptech.glide;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public l5.c f13285a = l5.a.b();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final l5.c b() {
        return this.f13285a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return n5.l.e(this.f13285a, ((m) obj).f13285a);
        }
        return false;
    }

    public int hashCode() {
        l5.c cVar = this.f13285a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
