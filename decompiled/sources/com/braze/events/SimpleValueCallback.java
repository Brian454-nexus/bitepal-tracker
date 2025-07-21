package com.braze.events;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/braze/events/SimpleValueCallback;", "T", "Lcom/braze/events/IValueCallback;", "<init>", "()V", "onSuccess", "", com.amazon.a.a.o.b.f11195Y, "(Ljava/lang/Object;)V", "onError", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class SimpleValueCallback<T> implements IValueCallback<T> {
    @Override // com.braze.events.IValueCallback
    public void onError() {
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(T value) {
    }
}
