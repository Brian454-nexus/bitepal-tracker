package com.amazon.a.a.i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f10933a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10934b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10935c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f10936d;

    /* renamed from: e, reason: collision with root package name */
    private final a[] f10937e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10938f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10939g;

    /* renamed from: h, reason: collision with root package name */
    private final int f10940h;

    /* renamed from: i, reason: collision with root package name */
    private final int f10941i;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z6) {
        this(str, str2, str3, z6, false);
    }

    public String a() {
        return this.f10936d[this.f10940h];
    }

    public String[] b() {
        return this.f10936d;
    }

    public a[] c() {
        return this.f10937e;
    }

    public String d() {
        return this.f10935c;
    }

    public String e() {
        return this.f10934b;
    }

    public String f() {
        return this.f10933a;
    }

    public int g() {
        return this.f10941i;
    }

    public boolean h() {
        return this.f10938f;
    }

    public boolean i() {
        return this.f10939g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f10933a + ", message: " + this.f10935c + ", label: " + this.f10936d[0] + ", visible: " + this.f10938f + ", shouldShowFixup: " + this.f10939g + "]";
    }

    public c(String str, String str2, String str3, boolean z6, boolean z7) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z6, z7, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z6, boolean z7, int i6) {
        this(new String[]{str}, str2, strArr, aVarArr, z6, z7, i6);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z6, boolean z7, int i6) {
        this(strArr, str, strArr2, aVarArr, z6, z7, i6, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z6, boolean z7, int i6, int i7) {
        String str2 = strArr[0];
        this.f10933a = str2;
        if (strArr.length > 1) {
            this.f10934b = strArr[1];
        } else {
            this.f10934b = str2;
        }
        this.f10935c = str;
        this.f10936d = strArr2;
        this.f10937e = aVarArr;
        this.f10938f = z6;
        this.f10939g = z7;
        this.f10940h = i6;
        this.f10941i = i7;
    }
}
