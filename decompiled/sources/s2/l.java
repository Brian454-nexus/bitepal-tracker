package s2;

import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f18900a = {48, 49, 53, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18901b = {48, 49, 48, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f18902c = {48, 48, 57, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f18903d = {48, 48, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f18904e = {48, 48, 49, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f18905f = {48, 48, 49, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f18906g = {48, 48, 50, 0};

    public static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f18904e) || Arrays.equals(bArr, f18903d)) ? ":" : "!";
    }
}
