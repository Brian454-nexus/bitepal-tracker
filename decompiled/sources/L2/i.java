package L2;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public WebViewProviderFactoryBoundaryInterface f3163a;

    public i(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f3163a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // L2.h
    public String[] a() {
        return this.f3163a.getSupportedFeatures();
    }

    @Override // L2.h
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) Ga.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f3163a.getWebkitToCompatConverter());
    }
}
