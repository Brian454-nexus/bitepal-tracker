package kotlin.reflect.jvm;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ReflectLambdaKt {
    @ExperimentalReflectionOnLambdas
    @Nullable
    public static final <R> KFunction<R> reflect(@NotNull Function<? extends R> function) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Metadata annotation = function.getClass().getAnnotation(Metadata.class);
        if (annotation == null) {
            return null;
        }
        String[] d12 = annotation.d1();
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        Pair readFunctionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(d12, annotation.d2());
        JvmNameResolver jvmNameResolver = (JvmNameResolver) readFunctionDataFrom.component1();
        ProtoBuf.Function function2 = (ProtoBuf.Function) readFunctionDataFrom.component2();
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(annotation.mv(), (annotation.xi() & 8) != 0);
        Class<?> cls = function.getClass();
        ProtoBuf.TypeTable typeTable = function2.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "proto.typeTable");
        return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, UtilKt.deserializeToDescriptor(cls, function2, jvmNameResolver, new TypeTable(typeTable), jvmMetadataVersion, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
