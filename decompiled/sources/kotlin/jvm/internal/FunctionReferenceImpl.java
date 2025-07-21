package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i6, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i6, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i6, Class cls, String str, String str2, int i7) {
        super(i6, CallableReference.NO_RECEIVER, cls, str, str2, i7);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i6, Object obj, Class cls, String str, String str2, int i7) {
        super(i6, obj, cls, str, str2, i7);
    }
}
