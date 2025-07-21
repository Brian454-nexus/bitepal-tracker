package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFa1ySDK {
    private static AFa1ySDK getMonetizationNetwork;
    private final Map<String, String> AFAdRevenueData = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFa1ySDK.1
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String AFAdRevenueData;

        AFa1uSDK(String str) {
            this.AFAdRevenueData = str;
        }
    }

    /* renamed from: com.appsflyer.internal.AFa1ySDK$AFa1ySDK, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum EnumC0182AFa1ySDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMonetizationNetwork;

        EnumC0182AFa1ySDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    private static String AFAdRevenueData() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i6 = 0;
            int i7 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i7 <= 2) {
                        i7++;
                        sb.append(AFa1uSDK.XPOSED.AFAdRevenueData);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb.append("+h");
                        }
                        sb.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i6++;
                    }
                }
            }
            if (i6 > 1) {
                sb.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            StringBuilder sb2 = new StringBuilder("/proc/");
            sb2.append(Process.myPid());
            sb2.append("/maps");
            if (AFAdRevenueData(sb2.toString(), "frida")) {
                sb.append(AFa1uSDK.FRIDA.AFAdRevenueData);
                if (Build.VERSION.SDK_INT < 29 && AFAdRevenueData("/proc/net/tcp", "69A2")) {
                    sb.append("+prt");
                }
            }
        } catch (Exception e6) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e6);
            sb.append(e6.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb.append(";");
        return sb.toString();
    }

    private AFa1lSDK getCurrencyIso4217Code() {
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        try {
            for (Map.Entry<String, String> entry : this.AFAdRevenueData.entrySet()) {
                String currencyIso4217Code = getCurrencyIso4217Code(entry.getValue());
                if (currencyIso4217Code != null && !currencyIso4217Code.equals("")) {
                    aFa1lSDK.getCurrencyIso4217Code(entry.getKey(), currencyIso4217Code);
                }
            }
        } catch (Exception e6) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e6);
        }
        return aFa1lSDK;
    }

    public static AFa1ySDK getMediationNetwork() {
        if (getMonetizationNetwork == null) {
            getMonetizationNetwork = new AFa1ySDK();
        }
        return getMonetizationNetwork;
    }

    private AFa1lSDK getMonetizationNetwork(Context context) {
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        try {
            aFa1lSDK.getCurrencyIso4217Code(EnumC0182AFa1ySDK.HOOKING.getMonetizationNetwork, AFAdRevenueData());
            aFa1lSDK.getMediationNetwork.put(AFa1lSDK.getCurrencyIso4217Code(EnumC0182AFa1ySDK.DEBUGGABLE.getMonetizationNetwork), Boolean.valueOf(getMediationNetwork(context)));
            return aFa1lSDK;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
            return aFa1lSDK;
        }
    }

    public final Object getRevenue(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
                if (!getMediationNetwork(str)) {
                }
                AFa1lSDK aFa1lSDK = new AFa1lSDK();
                aFa1lSDK.getCurrencyIso4217Code("pr", getCurrencyIso4217Code());
                aFa1lSDK.getCurrencyIso4217Code("an", getMonetizationNetwork(context));
                return aFa1lSDK;
            } catch (Exception e6) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e6);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFa1lSDK aFa1lSDK2 = new AFa1lSDK();
        aFa1lSDK2.getCurrencyIso4217Code("pr", getCurrencyIso4217Code());
        aFa1lSDK2.getCurrencyIso4217Code("an", getMonetizationNetwork(context));
        return aFa1lSDK2;
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }

    private static boolean getMediationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    @SuppressLint({"PrivateApi"})
    private static String getCurrencyIso4217Code(String str) {
        try {
            return (String) Class.forName(com.amazon.a.a.o.b.at).getMethod(com.amazon.a.a.o.b.au, String.class).invoke(null, str);
        } catch (Exception e6) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e6);
            return null;
        }
    }

    private static boolean AFAdRevenueData(String str, String str2) {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e6) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e6);
            throw new Exception("FNF");
        } catch (IOException e7) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e7);
            throw new Exception("IOF");
        } catch (Exception e8) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e8);
            throw new Exception("GF");
        }
    }
}
