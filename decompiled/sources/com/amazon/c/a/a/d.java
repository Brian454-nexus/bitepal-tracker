package com.amazon.c.a.a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11412a = "Kiwi__Version__Obfuscator";

    private d() {
    }

    public static String a(String str) {
        b(str, "text");
        return c.a(a(str.getBytes()));
    }

    public static String b(String str) {
        b(str, "text");
        return new String(a(c.c(str.getBytes())), "UTF-8");
    }

    public static String c(String str) {
        b(str, "file");
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            try {
                String readLine = bufferedReader2.readLine();
                try {
                    bufferedReader2.close();
                } catch (IOException unused) {
                }
                return new String(a(c.c(readLine.getBytes())), "UTF-8");
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(String str, String str2) {
        b(str, "text");
        b(str2, "file");
        String a6 = c.a(a(str.getBytes()));
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str2));
            try {
                bufferedWriter2.write(a6);
                bufferedWriter2.flush();
                try {
                    bufferedWriter2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("input '" + str2 + "' cannot be null or empty");
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        byte[] bytes = f11412a.getBytes();
        int i6 = 0;
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = (byte) (bArr[i7] ^ bytes[i6]);
            i6++;
            if (i6 >= bytes.length) {
                i6 = 0;
            }
        }
        return bArr2;
    }

    public static void a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            if (strArr.length > 1) {
                a(strArr[0], strArr[1]);
                return;
            } else {
                System.out.println(a(strArr[0]));
                return;
            }
        }
        System.out.println("Usage: com.amazon.mas.kiwi.util.KiwiVersionEncrypter <textToBeEncrypted> [<encryptToFileName>]");
    }
}
