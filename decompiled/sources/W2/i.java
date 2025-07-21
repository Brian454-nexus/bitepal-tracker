package W2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class i {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends i {
        @Override // W2.i
        public h a(String str) {
            return null;
        }
    }

    public static i c() {
        return new a();
    }

    public abstract h a(String str);

    public final h b(String str) {
        h a6 = a(str);
        return a6 == null ? h.a(str) : a6;
    }
}
