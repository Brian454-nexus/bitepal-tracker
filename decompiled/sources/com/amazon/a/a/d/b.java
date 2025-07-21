package com.amazon.a.a.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private static final long f10883a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final String f10884b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10885c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10886d;

    public b(String str) {
        this(str, (String) null);
    }

    public final String a() {
        return this.f10884b;
    }

    public final String b() {
        return this.f10885c;
    }

    public final String c() {
        return this.f10886d;
    }

    public b(String str, String str2) {
        this(str, str2, (String) null);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        Throwable c6 = c(th);
        StringBuilder sb = new StringBuilder();
        sb.append(b(th));
        sb.append(":");
        sb.append(th.getMessage());
        if (th != c6) {
            sb.append("/");
            sb.append(b(c6));
            sb.append(":");
            sb.append(c6.getMessage());
        }
        return sb.toString();
    }

    private static String b(Throwable th) {
        return th.getClass().getName();
    }

    private static Throwable c(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public b(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.f10884b = str;
        this.f10885c = str2;
        this.f10886d = str3;
    }

    public b(String str, Throwable th) {
        this(str, b(th), th);
    }

    public b(String str, String str2, Throwable th) {
        this(str, str2, a(th));
    }
}
