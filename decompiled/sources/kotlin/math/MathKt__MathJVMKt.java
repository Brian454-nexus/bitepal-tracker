package kotlin.math;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b8\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0001H\u0007\u001a\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007\u001a\u0011\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0019\u00102\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00109\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00109\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u0010:\u001a\u00020\u0001*\u00020\u00012\u0006\u0010;\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0006*\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0087\b\u001a\r\u0010<\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010<\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010>\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0087\b\u001a\r\u0010?\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010?\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010A\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006D"}, d2 = {"absoluteValue", "", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "getSign$annotations", "getSign", "(J)I", "ulp", "getUlp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "cbrt", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", "log", "base", "log10", "log2", "max", "a", "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", "to", "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
class MathKt__MathJVMKt extends MathKt__MathHKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(double d6, double d7) {
        return Math.IEEEremainder(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(double d6) {
        return Math.abs(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(double d6) {
        return Math.acos(d6);
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d6) {
        if (d6 < 1.0d) {
            return Double.NaN;
        }
        if (d6 > Constants.upper_taylor_2_bound) {
            return Math.log(d6) + Constants.LN2;
        }
        double d7 = 1;
        double d8 = d6 - d7;
        if (d8 >= Constants.taylor_n_bound) {
            return Math.log(d6 + Math.sqrt((d6 * d6) - d7));
        }
        double sqrt = Math.sqrt(d8);
        if (sqrt >= Constants.taylor_2_bound) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return Math.sqrt(2.0d) * sqrt;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(double d6) {
        return Math.asin(d6);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d6) {
        double d7 = Constants.taylor_n_bound;
        if (d6 < d7) {
            if (d6 <= (-d7)) {
                return -asinh(-d6);
            }
            return Math.abs(d6) >= Constants.taylor_2_bound ? d6 - (((d6 * d6) * d6) / 6) : d6;
        }
        if (d6 <= Constants.upper_taylor_n_bound) {
            return Math.log(d6 + Math.sqrt((d6 * d6) + 1));
        }
        if (d6 > Constants.upper_taylor_2_bound) {
            return Math.log(d6) + Constants.LN2;
        }
        double d8 = d6 * 2;
        return Math.log(d8 + (1 / d8));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(double d6) {
        return Math.atan(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(double d6, double d7) {
        return Math.atan2(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d6) {
        if (Math.abs(d6) < Constants.taylor_n_bound) {
            return Math.abs(d6) > Constants.taylor_2_bound ? d6 + (((d6 * d6) * d6) / 3) : d6;
        }
        double d7 = 1;
        return Math.log((d7 + d6) / (d7 - d6)) / 2;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final double cbrt(double d6) {
        return Math.cbrt(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(double d6) {
        return Math.ceil(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(double d6) {
        return Math.cos(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(double d6) {
        return Math.cosh(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(double d6) {
        return Math.exp(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(double d6) {
        return Math.expm1(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(double d6) {
        return Math.floor(d6);
    }

    private static final double getAbsoluteValue(double d6) {
        return Math.abs(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d6) {
    }

    private static final double getSign(double d6) {
        return Math.signum(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d6) {
    }

    private static final double getUlp(double d6) {
        return Math.ulp(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(double d6, double d7) {
        return Math.hypot(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln(double d6) {
        return Math.log(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(double d6) {
        return Math.log1p(d6);
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d6, double d7) {
        if (d7 <= 0.0d || d7 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d6) / Math.log(d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(double d6) {
        return Math.log10(d6);
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d6) {
        return Math.log(d6) / Constants.LN2;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(double d6, double d7) {
        return Math.max(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(double d6, double d7) {
        return Math.min(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(double d6) {
        return Math.nextAfter(d6, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(double d6, double d7) {
        return Math.nextAfter(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(double d6) {
        return Math.nextUp(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d6, double d7) {
        return Math.pow(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(double d6) {
        return Math.rint(d6);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return d6 > 2.147483647E9d ? IntCompanionObject.MAX_VALUE : d6 < -2.147483648E9d ? IntCompanionObject.MIN_VALUE : (int) Math.round(d6);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(double d6) {
        return Math.signum(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(double d6) {
        return Math.sin(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(double d6) {
        return Math.sinh(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(double d6) {
        return Math.sqrt(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(double d6) {
        return Math.tan(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(double d6) {
        return Math.tanh(d6);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            return d6;
        }
        if (d6 > 0.0d) {
            return Math.floor(d6);
        }
        return Math.ceil(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d6, double d7) {
        return Math.copySign(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(float f6, float f7) {
        return (float) Math.IEEEremainder(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(float f6) {
        return Math.abs(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(float f6) {
        return (float) Math.acos(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(float f6) {
        return (float) Math.asin(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(float f6) {
        return (float) Math.atan(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(float f6, float f7) {
        return (float) Math.atan2(f6, f7);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final float cbrt(float f6) {
        return (float) Math.cbrt(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(float f6) {
        return (float) Math.ceil(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(float f6) {
        return (float) Math.cos(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(float f6) {
        return (float) Math.cosh(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(float f6) {
        return (float) Math.exp(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(float f6) {
        return (float) Math.expm1(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(float f6) {
        return (float) Math.floor(f6);
    }

    private static final float getAbsoluteValue(float f6) {
        return Math.abs(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f6) {
    }

    private static final float getSign(float f6) {
        return Math.signum(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f6) {
    }

    private static final float getUlp(float f6) {
        return Math.ulp(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(float f6, float f7) {
        return (float) Math.hypot(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln(float f6) {
        return (float) Math.log(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(float f6) {
        return (float) Math.log1p(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f6, float f7) {
        if (f7 <= 0.0f || f7 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f6) / Math.log(f7));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(float f6) {
        return (float) Math.log10(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f6) {
        return (float) (Math.log(f6) / Constants.LN2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(float f6, float f7) {
        return Math.max(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(float f6, float f7) {
        return Math.min(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(float f6) {
        return Math.nextAfter(f6, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(float f6, float f7) {
        return Math.nextAfter(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(float f6) {
        return Math.nextUp(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d6, int i6) {
        return Math.pow(d6, i6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(float f6) {
        return (float) Math.rint(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final long roundToLong(float f6) {
        return roundToLong(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(float f6) {
        return Math.signum(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(float f6) {
        return (float) Math.sin(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(float f6) {
        return (float) Math.sinh(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(float f6) {
        return (float) Math.sqrt(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(float f6) {
        return (float) Math.tan(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(float f6) {
        return (float) Math.tanh(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d6, int i6) {
        return Math.copySign(d6, i6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(int i6) {
        return Math.abs(i6);
    }

    private static final int getAbsoluteValue(int i6) {
        return Math.abs(i6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i6) {
    }

    public static int getSign(int i6) {
        return Integer.signum(i6);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(int i6, int i7) {
        return Math.max(i6, i7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(int i6, int i7) {
        return Math.min(i6, i7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f6, float f7) {
        return (float) Math.pow(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f6, float f7) {
        return Math.copySign(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(long j6) {
        return Math.abs(j6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(float f6) {
        return (float) atanh(f6);
    }

    private static final long getAbsoluteValue(long j6) {
        return Math.abs(j6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j6) {
    }

    public static int getSign(long j6) {
        return Long.signum(j6);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(long j6, long j7) {
        return Math.max(j6, j7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(long j6, long j7) {
        return Math.min(j6, j7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f6, int i6) {
        return (float) Math.pow(f6, i6);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f6) {
        double ceil;
        if (Float.isNaN(f6) || Float.isInfinite(f6)) {
            return f6;
        }
        if (f6 > 0.0f) {
            ceil = Math.floor(f6);
        } else {
            ceil = Math.ceil(f6);
        }
        return (float) ceil;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f6, int i6) {
        return Math.copySign(f6, i6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(float f6) {
        return (float) acosh(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(float f6) {
        return (float) asinh(f6);
    }
}
