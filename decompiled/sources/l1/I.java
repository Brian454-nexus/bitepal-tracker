package l1;

import Z0.AbstractC0835g;
import Z0.C0841m;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import h1.v1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.IntCompanionObject;
import l1.InterfaceC1730A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class I implements InterfaceC1730A {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC1730A.c f16910d = new InterfaceC1730A.c() { // from class: l1.C
        @Override // l1.InterfaceC1730A.c
        public final InterfaceC1730A a(UUID uuid) {
            return I.n(uuid);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final UUID f16911a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f16912b;

    /* renamed from: c, reason: collision with root package name */
    public int f16913c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, v1 v1Var) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId a6 = v1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a6.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            F.a(AbstractC1119a.e(playbackComponent)).setLogSessionId(a6);
        }
    }

    public I(UUID uuid) {
        AbstractC1119a.e(uuid);
        AbstractC1119a.b(!AbstractC0835g.f6880b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f16911a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f16912b = mediaDrm;
        this.f16913c = 1;
        if (AbstractC0835g.f6882d.equals(uuid) && A()) {
            w(mediaDrm);
        }
    }

    public static boolean A() {
        return "ASUS_Z00AD".equals(AbstractC1117K.f10563d);
    }

    public static I B(UUID uuid) {
        try {
            return new I(uuid);
        } catch (UnsupportedSchemeException e6) {
            throw new N(1, e6);
        } catch (Exception e7) {
            throw new N(2, e7);
        }
    }

    public static /* synthetic */ InterfaceC1730A n(UUID uuid) {
        try {
            return B(uuid);
        } catch (N unused) {
            AbstractC1133o.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    public static /* synthetic */ void o(I i6, InterfaceC1730A.b bVar, MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
        i6.getClass();
        bVar.a(i6, bArr, i7, i8, bArr2);
    }

    public static byte[] p(byte[] bArr) {
        C1144z c1144z = new C1144z(bArr);
        int t6 = c1144z.t();
        short v6 = c1144z.v();
        short v7 = c1144z.v();
        if (v6 != 1 || v7 != 1) {
            AbstractC1133o.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short v8 = c1144z.v();
        Charset charset = y6.e.e;
        String E6 = c1144z.E(v8, charset);
        if (E6.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = E6.indexOf("</DATA>");
        if (indexOf == -1) {
            AbstractC1133o.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = E6.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + E6.substring(indexOf);
        int i6 = t6 + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i6);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i6);
        allocate.putShort(v6);
        allocate.putShort(v7);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    public static byte[] r(UUID uuid, byte[] bArr) {
        return AbstractC0835g.f6881c.equals(uuid) ? AbstractC1731a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = Z0.AbstractC0835g.f6883e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = Y1.o.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = p(r4)
            byte[] r4 = Y1.o.a(r0, r4)
        L18:
            int r1 = c1.AbstractC1117K.f10560a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = Z0.AbstractC0835g.f6882d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = c1.AbstractC1117K.f10562c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = c1.AbstractC1117K.f10563d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = Y1.o.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.I.s(java.util.UUID, byte[]):byte[]");
    }

    public static String t(UUID uuid, String str) {
        return (AbstractC1117K.f10560a < 26 && AbstractC0835g.f6881c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    public static UUID u(UUID uuid) {
        return (AbstractC1117K.f10560a >= 27 || !AbstractC0835g.f6881c.equals(uuid)) ? uuid : AbstractC0835g.f6880b;
    }

    public static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static C0841m.b y(UUID uuid, List list) {
        if (!AbstractC0835g.f6882d.equals(uuid)) {
            return (C0841m.b) list.get(0);
        }
        if (AbstractC1117K.f10560a >= 28 && list.size() > 1) {
            C0841m.b bVar = (C0841m.b) list.get(0);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                C0841m.b bVar2 = (C0841m.b) list.get(i7);
                byte[] bArr = (byte[]) AbstractC1119a.e(bVar2.f6927e);
                if (AbstractC1117K.c(bVar2.f6926d, bVar.f6926d) && AbstractC1117K.c(bVar2.f6925c, bVar.f6925c) && Y1.o.c(bArr)) {
                    i6 += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i6];
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                byte[] bArr3 = (byte[]) AbstractC1119a.e(((C0841m.b) list.get(i9)).f6927e);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i8, length);
                i8 += length;
            }
            return bVar.c(bArr2);
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0841m.b bVar3 = (C0841m.b) list.get(i10);
            int g6 = Y1.o.g((byte[]) AbstractC1119a.e(bVar3.f6927e));
            int i11 = AbstractC1117K.f10560a;
            if ((i11 < 23 && g6 == 0) || (i11 >= 23 && g6 == 1)) {
                return bVar3;
            }
        }
        return (C0841m.b) list.get(0);
    }

    public final boolean C() {
        return AbstractC1117K.f10560a < 21 && AbstractC0835g.f6882d.equals(this.f16911a) && "L3".equals(x("securityLevel"));
    }

    @Override // l1.InterfaceC1730A
    public Map a(byte[] bArr) {
        return this.f16912b.queryKeyStatus(bArr);
    }

    @Override // l1.InterfaceC1730A
    public InterfaceC1730A.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f16912b.getProvisionRequest();
        return new InterfaceC1730A.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // l1.InterfaceC1730A
    public byte[] d() {
        return this.f16912b.openSession();
    }

    @Override // l1.InterfaceC1730A
    public void e(byte[] bArr, v1 v1Var) {
        if (AbstractC1117K.f10560a >= 31) {
            try {
                a.b(this.f16912b, bArr, v1Var);
            } catch (UnsupportedOperationException unused) {
                AbstractC1133o.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // l1.InterfaceC1730A
    public boolean f(byte[] bArr, String str) {
        boolean z6;
        MediaCrypto mediaCrypto;
        if (AbstractC1117K.f10560a < 31 || !z()) {
            MediaCrypto mediaCrypto2 = null;
            try {
                mediaCrypto = new MediaCrypto(this.f16911a, bArr);
            } catch (MediaCryptoException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                z6 = mediaCrypto.requiresSecureDecoderComponent(str);
                mediaCrypto.release();
            } catch (MediaCryptoException unused2) {
                mediaCrypto2 = mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                z6 = true;
                if (z6) {
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCrypto2 = mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            }
        } else {
            z6 = a.a(this.f16912b, str);
        }
        return (z6 || C()) ? false : true;
    }

    @Override // l1.InterfaceC1730A
    public void g(byte[] bArr, byte[] bArr2) {
        this.f16912b.restoreKeys(bArr, bArr2);
    }

    @Override // l1.InterfaceC1730A
    public void h(byte[] bArr) {
        this.f16912b.closeSession(bArr);
    }

    @Override // l1.InterfaceC1730A
    public byte[] i(byte[] bArr, byte[] bArr2) {
        if (AbstractC0835g.f6881c.equals(this.f16911a)) {
            bArr2 = AbstractC1731a.b(bArr2);
        }
        return this.f16912b.provideKeyResponse(bArr, bArr2);
    }

    @Override // l1.InterfaceC1730A
    public void j(byte[] bArr) {
        this.f16912b.provideProvisionResponse(bArr);
    }

    @Override // l1.InterfaceC1730A
    public InterfaceC1730A.a k(byte[] bArr, List list, int i6, HashMap hashMap) {
        C0841m.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = y(this.f16911a, list);
            bArr2 = s(this.f16911a, (byte[]) AbstractC1119a.e(bVar.f6927e));
            str = t(this.f16911a, bVar.f6926d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f16912b.getKeyRequest(bArr, bArr2, str, i6, hashMap);
        byte[] r6 = r(this.f16911a, keyRequest.getData());
        String q6 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q6) && bVar != null && !TextUtils.isEmpty(bVar.f6925c)) {
            q6 = bVar.f6925c;
        }
        return new InterfaceC1730A.a(r6, q6, AbstractC1117K.f10560a >= 23 ? keyRequest.getRequestType() : IntCompanionObject.MIN_VALUE);
    }

    @Override // l1.InterfaceC1730A
    public int l() {
        return 2;
    }

    @Override // l1.InterfaceC1730A
    public void m(final InterfaceC1730A.b bVar) {
        this.f16912b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: l1.D
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i6, int i7, byte[] bArr2) {
                I.o(I.this, bVar, mediaDrm, bArr, i6, i7, bArr2);
            }
        });
    }

    public final String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (AbstractC1117K.f10560a >= 33 && "https://default.url".equals(str)) {
            String x6 = x("version");
            if (Objects.equals(x6, "1.2") || Objects.equals(x6, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // l1.InterfaceC1730A
    public synchronized void release() {
        int i6 = this.f16913c - 1;
        this.f16913c = i6;
        if (i6 == 0) {
            this.f16912b.release();
        }
    }

    @Override // l1.InterfaceC1730A
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public B c(byte[] bArr) {
        return new B(u(this.f16911a), bArr, C());
    }

    public String x(String str) {
        return this.f16912b.getPropertyString(str);
    }

    public final boolean z() {
        if (!this.f16911a.equals(AbstractC0835g.f6882d)) {
            return this.f16911a.equals(AbstractC0835g.f6881c);
        }
        String x6 = x("version");
        return (x6.startsWith("v5.") || x6.startsWith("14.") || x6.startsWith("15.") || x6.startsWith("16.0")) ? false : true;
    }
}
