package v0;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Continuation<Object> f19285a;

    public g(Continuation continuation) {
        super(false);
        this.f19285a = continuation;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.f19285a;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f19285a.resumeWith(Result.constructor-impl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
