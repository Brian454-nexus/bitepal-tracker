package L2;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3109a = new String[0];

    @Override // L2.h
    public String[] a() {
        return f3109a;
    }

    @Override // L2.h
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
