package y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class X0 {
    public static int a(int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + i6 + " can not be recognized.");
    }
}
