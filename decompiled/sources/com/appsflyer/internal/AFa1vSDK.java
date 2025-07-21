package com.appsflyer.internal;

import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFa1vSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map AFInAppEventParameterName;
    private static Object AFLogger;
    private static long afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f11994d;

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f11995e;
    private static long force;

    /* renamed from: i, reason: collision with root package name */
    private static byte f11996i;
    public static final Map registerClient;
    private static Object unregisterClient;

    /* renamed from: w, reason: collision with root package name */
    private static long f11997w;

    private static String $$c(short s6, int i6, int i7) {
        int i8 = ($11 + 119) % 128;
        $10 = i8;
        int i9 = -s6;
        int i10 = (i9 * 881) + 104839;
        int i11 = ~i9;
        int i12 = ~(i11 | (-120));
        int i13 = ~(i11 | i6);
        int i14 = (i13 & i12) | (i12 ^ i13);
        int i15 = ~(((-120) & i6) | ((-120) ^ i6));
        int i16 = -(-(((i14 & i15) | (i14 ^ i15)) * (-880)));
        int i17 = (i10 ^ i16) + ((i10 & i16) << 1);
        int i18 = ~i9;
        int i19 = ~i6;
        int i20 = ~(i18 | i19);
        int i21 = ~((i9 & i6) | (i9 ^ i6));
        int i22 = i17 + (((i20 & 119) | (i20 ^ 119) | i21) * (-880));
        int i23 = i21 * 880;
        int i24 = (i22 & i23) + (i23 | i22);
        int i25 = -i7;
        int i26 = i25 * 399;
        int i27 = (i26 ^ 450870) + ((i26 & 450870) << 1);
        int i28 = ~i25;
        int i29 = (~((i28 & 1130) | (i28 ^ 1130))) | (~(((-1131) ^ i25) | ((-1131) & i25)));
        int i30 = ~(((-1131) ^ i6) | ((-1131) & i6));
        int i31 = (((i27 - (~(((i29 & i30) | (i29 ^ i30)) * 398))) - 1) - (~((i25 | 1130) * (-1194)))) - 1;
        int i32 = ~((-1131) | i19);
        int i33 = ~i25;
        int i34 = i32 | (~((i33 & 1130) | (i33 ^ 1130)));
        int i35 = ~((i25 & (-1131)) | ((-1131) ^ i25));
        int i36 = -(-(((i35 & i34) | (i34 ^ i35)) * 398));
        int i37 = (i31 & i36) + (i36 | i31);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[36 - i6];
        int i38 = 35 - i6;
        int i39 = -1;
        if (bArr == null) {
            int i40 = ((i8 | 83) << 1) - (i8 ^ 83);
            $11 = i40 % 128;
            if (i40 % 2 == 0) {
                int i41 = 22 / 0;
            }
            $11 = (((i8 | 123) << 1) - (i8 ^ 123)) % 128;
            int i42 = i38 * 71;
            int i43 = i37 * (-69);
            int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
            int i45 = ~i38;
            int i46 = (i45 & i37) | (i45 ^ i37);
            int i47 = ~i46;
            int i48 = ~(i37 | i6);
            int i49 = -(-(((i47 & i48) | (i47 ^ i48)) * (-140)));
            int i50 = (i44 & i49) + (i49 | i44);
            int i51 = i38 | i37;
            int i52 = i50 + ((~((i51 & i6) | (i51 ^ i6))) * 70);
            int i53 = ((~(i38 | i6)) | (~((~i37) | i38)) | (~i46)) * 70;
            i24 = ((i52 ^ i53) + ((i53 & i52) << 1)) - 2;
            $10 = ($11 + 77) % 128;
            i37 = i37;
        }
        while (true) {
            int i54 = ((i39 | (-8)) << 1) - (i39 ^ (-8));
            i39 = (i54 ^ 9) + ((i54 & 9) << 1);
            bArr2[i39] = (byte) i24;
            int i55 = (i37 & 1) + (i37 | 1);
            if (i39 == i38) {
                return new String(bArr2, 0);
            }
            byte b6 = bArr[i55];
            int i56 = b6 * 71;
            int i57 = i24 * (-69);
            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
            int i59 = ~b6;
            int i60 = (i59 & i24) | (i59 ^ i24);
            int i61 = ~i60;
            int i62 = ~(i24 | i6);
            int i63 = -(-(((i61 & i62) | (i61 ^ i62)) * (-140)));
            int i64 = (i58 & i63) + (i63 | i58);
            int i65 = b6 | i24;
            int i66 = i64 + ((~((i65 & i6) | (i65 ^ i6))) * 70);
            int i67 = ((~(b6 | i6)) | (~((~i24) | b6)) | (~i60)) * 70;
            i24 = ((i66 ^ i67) + ((i67 & i66) << 1)) - 2;
            $10 = ($11 + 77) % 128;
            i37 = i55;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 7532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.<clinit>():void");
    }

    private AFa1vSDK() {
    }

    public static int getMediationNetwork(int i6) {
        int i7 = $10;
        int i8 = i7 + 87;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        Object obj = unregisterClient;
        $11 = ((i7 & 103) + (i7 | 103)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i6)};
            byte[] bArr = $$a;
            byte b6 = bArr[26];
            byte b7 = bArr[146];
            int intValue = ((Integer) Class.forName($$c(b6, b7, (short) ((b7 ^ 592) | (b7 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[182], bArr[5]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i9 = $10;
            int i10 = (i9 ^ 57) + ((i9 & 57) << 1);
            $11 = i10 % 128;
            if (i10 % 2 != 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMonetizationNetwork(Object obj) {
        int i6 = ($10 + 9) % 128;
        $11 = i6;
        Object obj2 = unregisterClient;
        $10 = ((i6 & 23) + (i6 | 23)) % 128;
        $10 = (((i6 | 43) << 1) - (i6 ^ 43)) % 128;
        try {
            byte[] bArr = $$a;
            byte b6 = bArr[26];
            byte b7 = bArr[146];
            return ((Integer) Class.forName($$c(b6, b7, (short) ((b7 ^ 592) | (b7 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[8], bArr[940]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getRevenue(int i6, int i7, char c6) {
        int i8 = $10 + 23;
        int i9 = i8 % 128;
        $11 = i9;
        if (i8 % 2 == 0) {
            throw null;
        }
        Object obj = unregisterClient;
        int i10 = (i9 + 71) % 128;
        $10 = i10;
        $11 = (i10 + 3) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i6), Integer.valueOf(i7), Character.valueOf(c6)};
            byte[] bArr = $$a;
            byte b6 = bArr[26];
            byte b7 = bArr[146];
            Class<?> cls = Class.forName($$c(b6, b7, (short) (b7 | 592)), true, (ClassLoader) AFLogger);
            String $$c = $$c(bArr[50], bArr[4], bArr[105]);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i11 = $11;
            int i12 = (i11 ^ 53) + ((i11 & 53) << 1);
            $10 = i12 % 128;
            if (i12 % 2 == 0) {
                return invoke;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        $10 = ($11 + 119) % 128;
        byte[] bArr = new byte[1140];
        System.arraycopy("\u0019N¹&\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒKÛó\t\n\u0002\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f\u000fø\u0010ÿüýÌ5\u0011\u0002À\u0015$\u0013÷\u000fõ\r\u0007Ý\u0016\fõþ\u0005\u0014ÿ\u0002õ\u000b\bÏ1\u0002þÿü\u0000\u0015÷\b\u0001\u000fø\u0010ÿüýÌ5\u0011\u0002À\u00151\u0002Ù'\u0005õ\u0001\r\t\u0000\u0011×'ý\r÷ú\r×1\u0002þÿü\u0000\u0015÷\b\u0001\u0000\u0011Ô%\u0005û\u0010Ó'\u000b\u0000\u0011Ñ.÷\u0003à \u0004\u0007ÿá'\u000b\u0000\u0011Ñ \u0004\u0007ÿá'\u000b7ÿ\u0015ïÐ7ÿ\u0015ïÐù\u0017íÏ=\bÁ\u001a%\u0005ûù\u0017íÏ=\bÁHû\u0005ö\u0007\u000bù\u0017íÏ@÷\u000fûÉ'(ü\u0003ó\n\u0000\u0011Þ$ÿ\u0003÷\u000f\u0004\u0007\u000e÷\u0003ü\u0006\u0000\u0004\u0007ÿ\u000fø\u0010ÿüýÌC\u0006½\u00165ö\u0005úÂ4ñ\u000f\u0003ø\b\u0001ó\t\u0016ì\u0007\b\u0000\u000fë\u001dù\róí\bì\nù\u0017íÏ=\bÁ\u001d\bø5í\u0004\r\u0006÷\b\u0001\u0014ÿ\u0002õ\u000b\bâ\u0017\u0006úê\u001e\u0005\u0002ÿ\fù\u0017íÏ=\bÁ\u001a%\u0005ûì(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u000b\u0005\u0006ôí\u0005ï\n4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ4Î\u0000\u0011à\u0015\u0010þ\bÿó\u0004ù\u0017íÏBù\u0011¼)ÿü\u0000\u0011Þ\u0013\u0015öù\u0017íÏ=\bÁ\u00165ó\u0002\u0001\u000fõ\u0001ç'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u001d'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u0018\u001f\u0015ïê'\u0004\u0007\u0001á#\u0000õþ\u000eõþ\u0005ä1ù\u0002\u000fù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aÒ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0013\u0002ñ\u001aì\u000e\u0003\u000b\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007'ÈEáó\t\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007\u001dÒKÛó\t\n\u0002\u0000\u0011Ñ4ÿ\u0002õ\u000b÷\u0018Ò,þÇ\u0000\u0001\b\u000e.÷\u0003ú\u0000\tõþ\u0005ô\u0011à\u0015þ\u0005í!\u0000\u000fí\u0006î\nýù\ró\u0000\u0011Ô\u0000ù\u0017íÏ=\bÁ\u001a%\u0005ûá#\u0010ò\u0011ù\t\u0006ý\u0005\b÷÷ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0018#\u0015Ð%\u0005û\u0005ô\u0005â#\u0015\u0000\u0011Ï#\u0013þÿ\u000b\u0001óí\u0013\u0015ö\u0003\tû\u0011ó\u0000\u0011Ñ+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\tÛ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0000\u0011Ü\u0019\u0015þÓ+\b\u0000\tù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\t×+\b\u0000\t\u0000\u0011á\u0018\u0013íù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aØ(\u0001þ\u0007\u0001á#\u0000õþ\u000eýÕ9ýóÞ3\u0002ñ\u001aù\u0017íÏ=\bÁ\u0017+\u0005\u0006ôþ\u0003\fûÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u001d'á\u001a\n\u0004\u0005\tÍ#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏBý\bÁ\u00169ýóß5ó\u0002\u0001\u000fù\u0017íÏ@÷\u000fûÉ\u0017+÷\u0014\u0002Û%ô\u0005\u0003\u000fýñ\u0011ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0016!\u0014ôá#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fó\u0015öæ\u001f\f\u0003õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÍ'\u000bõ\u0000\u0013ý\u0005ùþ\u0010õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÙ\u0013\u0015öß)û\nú\u000b\b\u0001\u0000\u0011Ñ.\u0000\u0005\u0001\u0001ù\u000b\bâ'ù÷í\nê\n\u0005ô\u0005á+÷\u0014\u0002\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒGßó\tÛQ4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ5Íí\të\nH\u0003³Hý\r\u0002ø\u0001\u0004\n\n¯Nû\u0003\u0010·\u0000\u0011Û$\u0001ù\u0011÷\u0013é\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011Û\u001a\u0001\u0007ú\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011à\u0015\u0013ñ\u000b\tò".getBytes("ISO-8859-1"), 0, bArr, 0, 1140);
        $$a = bArr;
        $$b = 166;
        int i6 = $11;
        $10 = ((i6 & 31) + (i6 | 31)) % 128;
    }
}
