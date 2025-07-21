package F;

import I.O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class A {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements I.M {

        /* renamed from: a, reason: collision with root package name */
        public final List f1226a;

        public a(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f1226a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // I.M
        public List a() {
            return this.f1226a;
        }
    }

    public static I.M a(I.O... oArr) {
        return new a(Arrays.asList(oArr));
    }

    public static I.M b() {
        return a(new O.a());
    }
}
