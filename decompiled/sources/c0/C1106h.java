package c0;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1106h implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10538a = Arrays.asList("SM-N9208", "SM-G920V");

    public static boolean d() {
        return f10538a.contains(Build.MODEL.toUpperCase());
    }
}
