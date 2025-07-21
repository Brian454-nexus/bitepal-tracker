package v5;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import x5.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f19658c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f19659d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f19660e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f19661f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f19662g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f19663h;

    /* renamed from: a, reason: collision with root package name */
    public final String f19664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19665b;

    static {
        String a6 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f19658c = a6;
        String a7 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f19659d = a7;
        String a8 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f19660e = a8;
        f19661f = Collections.unmodifiableSet(new HashSet(Arrays.asList(u5.c.b("proto"), u5.c.b("json"))));
        f19662g = new a(a6, null);
        f19663h = new a(a7, a8);
    }

    public a(String str, String str2) {
        this.f19664a = str;
        this.f19665b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // x5.g
    public Set a() {
        return f19661f;
    }

    public byte[] b() {
        String str = this.f19665b;
        if (str == null && this.f19664a == null) {
            return null;
        }
        String str2 = this.f19664a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f19665b;
    }

    public String e() {
        return this.f19664a;
    }

    @Override // x5.f
    public byte[] getExtras() {
        return b();
    }

    @Override // x5.f
    public String getName() {
        return "cct";
    }
}
