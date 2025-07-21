package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;

    @NotNull
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i6) {
        this.size = i6;
        this.spreads = (T[]) new Object[i6];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i6 = this.position;
        this.position = i6 + 1;
        tArr[i6] = spreadArgument;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(@NotNull T t6);

    public final void setPosition(int i6) {
        this.position = i6;
    }

    public final int size() {
        int i6 = this.size - 1;
        int i7 = 0;
        if (i6 >= 0) {
            int i8 = 0;
            while (true) {
                T t6 = this.spreads[i8];
                i7 += t6 != null ? getSize(t6) : 1;
                if (i8 == i6) {
                    break;
                }
                i8++;
            }
        }
        return i7;
    }

    @NotNull
    public final T toArray(@NotNull T values, @NotNull T result) {
        int i6;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i7 = this.size - 1;
        int i8 = 0;
        if (i7 >= 0) {
            int i9 = 0;
            int i10 = 0;
            i6 = 0;
            while (true) {
                T t6 = this.spreads[i9];
                if (t6 != null) {
                    if (i10 < i9) {
                        int i11 = i9 - i10;
                        System.arraycopy(values, i10, result, i6, i11);
                        i6 += i11;
                    }
                    int size = getSize(t6);
                    System.arraycopy(t6, 0, result, i6, size);
                    i6 += size;
                    i10 = i9 + 1;
                }
                if (i9 == i7) {
                    break;
                }
                i9++;
            }
            i8 = i10;
        } else {
            i6 = 0;
        }
        int i12 = this.size;
        if (i8 < i12) {
            System.arraycopy(values, i8, result, i6, i12 - i8);
        }
        return result;
    }
}
