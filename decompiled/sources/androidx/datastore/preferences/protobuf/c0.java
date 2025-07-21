package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c0 implements M {

    /* renamed from: a, reason: collision with root package name */
    public final O f8714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8715b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f8716c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8717d;

    public c0(O o6, String str, Object[] objArr) {
        this.f8714a = o6;
        this.f8715b = str;
        this.f8716c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f8717d = charAt;
            return;
        }
        int i6 = charAt & 8191;
        int i7 = 13;
        int i8 = 1;
        while (true) {
            int i9 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.f8717d = i6 | (charAt2 << i7);
                return;
            } else {
                i6 |= (charAt2 & 8191) << i7;
                i7 += 13;
                i8 = i9;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public boolean a() {
        return (this.f8717d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public O b() {
        return this.f8714a;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public Z c() {
        return (this.f8717d & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
    }

    public Object[] d() {
        return this.f8716c;
    }

    public String e() {
        return this.f8715b;
    }
}
