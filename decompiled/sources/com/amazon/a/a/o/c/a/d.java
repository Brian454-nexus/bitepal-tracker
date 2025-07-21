package com.amazon.a.a.o.c.a;

import java.io.Serializable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public enum d implements Serializable {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !b.a());


    /* renamed from: d, reason: collision with root package name */
    private static final long f11271d = -6343169151696340687L;

    /* renamed from: e, reason: collision with root package name */
    private final String f11273e;

    /* renamed from: f, reason: collision with root package name */
    private final transient boolean f11274f;

    d(String str, boolean z6) {
        this.f11273e = str;
        this.f11274f = z6;
    }

    public static d a(String str) {
        for (d dVar : values()) {
            if (dVar.a().equals(str)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + str);
    }

    private Object c() {
        return a(this.f11273e);
    }

    public boolean b() {
        return this.f11274f;
    }

    public boolean d(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f11274f, str.length() - length, str2, 0, length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11273e;
    }

    public boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f11274f ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public boolean c(String str, String str2) {
        return str.regionMatches(!this.f11274f, 0, str2, 0, str2.length());
    }

    public String a() {
        return this.f11273e;
    }

    public boolean b(String str, int i6, String str2) {
        return str.regionMatches(!this.f11274f, i6, str2, 0, str2.length());
    }

    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f11274f ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public int a(String str, int i6, String str2) {
        int length = str.length() - str2.length();
        if (length < i6) {
            return -1;
        }
        while (i6 <= length) {
            if (b(str, i6, str2)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }
}
