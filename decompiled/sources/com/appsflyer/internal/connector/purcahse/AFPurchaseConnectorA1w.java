package com.appsflyer.internal.connector.purcahse;

import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AFPurchaseConnectorA1w {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map PurchaseClientCompanion;
    private static long PurchaseClientInAppPurchaseValidationResultListener;
    private static long PurchaseClientPurchaseEventDataSource;
    private static long PurchaseClientSubscriptionPurchaseEventDataSource;
    private static byte[] build;
    private static Object getVERSION_NAMEannotations;
    private static byte onNewPurchases;
    private static byte[] setAfClient;
    private static Object setConnector;
    public static final Map setSubscriptionValidationResultListener;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0076 -> B:6:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r11, int r12, short r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.$$c(byte, int, short):java.lang.String");
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
            Method dump skipped, instructions count: 8264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.<clinit>():void");
    }

    private AFPurchaseConnectorA1w() {
    }

    public static int getQuantity(int i6) {
        int i7 = $10;
        Object obj = getVERSION_NAMEannotations;
        $11 = (((i7 | 21) << 1) - (i7 ^ 21)) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[19]), r0[261], (short) 645), true, (ClassLoader) setConnector).getMethod($$c(r0[91], r0[66], r0[7]), Integer.TYPE).invoke(obj, Integer.valueOf(i6))).intValue();
            int i8 = $11;
            int i9 = ((i8 | 73) << 1) - (i8 ^ 73);
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 77 / 0;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i6;
        int i7 = $10;
        int i8 = ((i7 | 57) << 1) - (i7 ^ 57);
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            byte[] bArr = new byte[1301];
            System.arraycopy("tQ(è\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006\u000eö\u0003\f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ5Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0014\u0003ò\u001bí\u000f\u0004\f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006Òó:\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003þÞ,ÿ\u0002â\u0017\u0012û\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóI°N5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ6Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸(Ö2\u0003ã(\u0000ô\bü\u0015õã4ò\f\t\u0001\u0012à'ï\u0010\tø\u000e\b".getBytes("ISO-8859-1"), 0, bArr, 0, 1301);
            $$a = bArr;
            i6 = 21749;
        } else {
            byte[] bArr2 = new byte[1301];
            System.arraycopy("tQ(è\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006\u000eö\u0003\f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ5Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0014\u0003ò\u001bí\u000f\u0004\f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006Òó:\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003þÞ,ÿ\u0002â\u0017\u0012û\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóI°N5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ6Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸(Ö2\u0003ã(\u0000ô\bü\u0015õã4ò\f\t\u0001\u0012à'ï\u0010\tø\u000e\b".getBytes("ISO-8859-1"), 0, bArr2, 0, 1301);
            $$a = bArr2;
            i6 = 167;
        }
        $$b = i6;
    }

    public static int toJsonMap(Object obj) {
        int i6 = $10;
        int i7 = (i6 ^ 119) + ((i6 & 119) << 1);
        int i8 = i7 % 128;
        $11 = i8;
        if (i7 % 2 == 0) {
            throw null;
        }
        Object obj2 = getVERSION_NAMEannotations;
        $10 = (i8 + 73) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[19]), r0[261], (short) 645), true, (ClassLoader) setConnector).getMethod($$c(r0[91], r0[66], r0[7]), Object.class).invoke(obj2, obj)).intValue();
            int i9 = $11 + 97;
            $10 = i9 % 128;
            if (i9 % 2 == 0) {
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

    public static Object getQuantity(int i6, int i7, char c6) {
        int i8 = $11;
        Object obj = getVERSION_NAMEannotations;
        int i9 = (((i8 | 117) << 1) - (i8 ^ 117)) % 128;
        $10 = i9;
        $11 = ((i9 ^ 113) + ((i9 & 113) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i6), Integer.valueOf(i7), Character.valueOf(c6)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[19]), bArr[261], (short) 645), true, (ClassLoader) setConnector);
            byte b6 = bArr[2];
            byte b7 = bArr[6];
            String $$c = $$c(b6, b7, b7);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i10 = $11;
            int i11 = ((i10 | 25) << 1) - (i10 ^ 25);
            $10 = i11 % 128;
            if (i11 % 2 == 0) {
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
}
