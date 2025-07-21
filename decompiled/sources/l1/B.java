package l1;

import c1.AbstractC1117K;
import f1.InterfaceC1286b;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class B implements InterfaceC1286b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f16904d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f16905a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16907c;

    static {
        boolean z6;
        if ("Amazon".equals(AbstractC1117K.f10562c)) {
            String str = AbstractC1117K.f10563d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z6 = true;
                f16904d = z6;
            }
        }
        z6 = false;
        f16904d = z6;
    }

    public B(UUID uuid, byte[] bArr, boolean z6) {
        this.f16905a = uuid;
        this.f16906b = bArr;
        this.f16907c = z6;
    }
}
