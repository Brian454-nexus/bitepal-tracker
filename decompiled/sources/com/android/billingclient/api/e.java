package com.android.billingclient.api;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11888a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11889b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11890a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11891b;

        public a() {
        }

        public e a() {
            if (!this.f11890a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new e(true, this.f11891b);
        }

        public a b() {
            this.f11890a = true;
            return this;
        }

        public a c() {
            this.f11891b = true;
            return this;
        }
    }

    public e(boolean z6, boolean z7) {
        this.f11888a = z6;
        this.f11889b = z7;
    }

    public static a c() {
        return new a();
    }

    public boolean a() {
        return this.f11888a;
    }

    public boolean b() {
        return this.f11889b;
    }
}
