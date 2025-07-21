package W2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public enum u {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean b() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
