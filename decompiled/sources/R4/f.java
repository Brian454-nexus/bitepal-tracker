package R4;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4618a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
