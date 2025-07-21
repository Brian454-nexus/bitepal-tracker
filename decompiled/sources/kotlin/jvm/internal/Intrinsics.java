package kotlin.jvm.internal;

import com.amazon.a.a.o.c.a.b;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class Intrinsics {

    @SinceKotlin(version = "1.4")
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class Kotlin {
        private Kotlin() {
        }
    }

    private Intrinsics() {
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str + " must not be null")));
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
    }

    public static void checkHasClass(String str) {
        String replace = str.replace('/', b.f11260a);
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e6) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e6)));
        }
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullNPE(str);
        }
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullIAE(str);
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
    }

    public static int compare(int i6, int i7) {
        if (i6 < i7) {
            return -1;
        }
        return i6 == i7 ? 0 : 1;
    }

    private static String createParameterIsNullExceptionMessage(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i6 = 0;
        while (!stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        while (stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        StackTraceElement stackTraceElement = stackTrace[i6];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i6, String str) {
        throwUndefinedForReified();
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t6) {
        return (T) sanitizeStackTrace(t6, Intrinsics.class.getName());
    }

    public static String stringPlus(String str, Object obj) {
        return str + obj;
    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe() {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException()));
    }

    public static void throwNpe() {
        throw sanitizeStackTrace(new KotlinNullPointerException());
    }

    private static void throwParameterIsNullIAE(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(createParameterIsNullExceptionMessage(str))));
    }

    private static void throwParameterIsNullNPE(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(createParameterIsNullExceptionMessage(str))));
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUninitializedProperty(String str) {
        throw sanitizeStackTrace(new UninitializedPropertyAccessException(str));
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d6, Double d7) {
        return d6 == null ? d7 == null : d7 != null && d6.doubleValue() == d7.doubleValue();
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static int compare(long j6, long j7) {
        if (j6 < j7) {
            return -1;
        }
        return j6 == j7 ? 0 : 1;
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    public static void reifiedOperationMarker(int i6, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    public static <T extends Throwable> T sanitizeStackTrace(T t6, String str) {
        StackTraceElement[] stackTrace = t6.getStackTrace();
        int length = stackTrace.length;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(stackTrace[i7].getClassName())) {
                i6 = i7;
            }
        }
        t6.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i6 + 1, length));
        return t6;
    }

    public static void throwAssert(String str) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(str)));
    }

    public static void throwIllegalArgument(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
    }

    public static void throwIllegalState(String str) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str)));
    }

    public static void throwNpe(String str) {
        throw sanitizeStackTrace(new KotlinNullPointerException(str));
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d6, double d7) {
        return d6 != null && d6.doubleValue() == d7;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(double d6, Double d7) {
        return d7 != null && d6 == d7.doubleValue();
    }

    public static void checkHasClass(String str, String str2) {
        String replace = str.replace('/', b.f11260a);
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e6) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e6)));
        }
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f6, Float f7) {
        return f6 == null ? f7 == null : f7 != null && f6.floatValue() == f7.floatValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f6, float f7) {
        return f6 != null && f6.floatValue() == f7;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(float f6, Float f7) {
        return f7 != null && f6 == f7.floatValue();
    }
}
