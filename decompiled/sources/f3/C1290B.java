package f3;

import W2.b;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f3.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1290B {

    /* renamed from: a, reason: collision with root package name */
    public static final C1290B f14075a = new C1290B();

    /* renamed from: f3.B$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14076a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14077b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f14078c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f14079d;

        static {
            int[] iArr = new int[W2.u.values().length];
            try {
                iArr[W2.u.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W2.u.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[W2.u.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[W2.u.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[W2.u.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[W2.u.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f14076a = iArr;
            int[] iArr2 = new int[W2.a.values().length];
            try {
                iArr2[W2.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[W2.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f14077b = iArr2;
            int[] iArr3 = new int[W2.l.values().length];
            try {
                iArr3[W2.l.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[W2.l.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[W2.l.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[W2.l.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[W2.l.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f14078c = iArr3;
            int[] iArr4 = new int[W2.o.values().length];
            try {
                iArr4[W2.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[W2.o.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f14079d = iArr4;
        }
    }

    public static final int a(W2.a backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i6 = a.f14077b[backoffPolicy.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Set b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i6 = 0; i6 < readInt; i6++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    Intrinsics.checkNotNullExpressionValue(uri, "uri");
                    linkedHashSet.add(new b.c(uri, readBoolean));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectInputStream, null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static final W2.a c(int i6) {
        if (i6 == 0) {
            return W2.a.EXPONENTIAL;
        }
        if (i6 == 1) {
            return W2.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i6 + " to BackoffPolicy");
    }

    public static final W2.l d(int i6) {
        if (i6 == 0) {
            return W2.l.NOT_REQUIRED;
        }
        if (i6 == 1) {
            return W2.l.CONNECTED;
        }
        if (i6 == 2) {
            return W2.l.UNMETERED;
        }
        if (i6 == 3) {
            return W2.l.NOT_ROAMING;
        }
        if (i6 == 4) {
            return W2.l.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i6 == 5) {
            return W2.l.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i6 + " to NetworkType");
    }

    public static final W2.o e(int i6) {
        if (i6 == 0) {
            return W2.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i6 == 1) {
            return W2.o.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i6 + " to OutOfQuotaPolicy");
    }

    public static final W2.u f(int i6) {
        if (i6 == 0) {
            return W2.u.ENQUEUED;
        }
        if (i6 == 1) {
            return W2.u.RUNNING;
        }
        if (i6 == 2) {
            return W2.u.SUCCEEDED;
        }
        if (i6 == 3) {
            return W2.u.FAILED;
        }
        if (i6 == 4) {
            return W2.u.BLOCKED;
        }
        if (i6 == 5) {
            return W2.u.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i6 + " to State");
    }

    public static final int g(W2.l networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i6 = a.f14078c[networkType.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 3) {
            return 2;
        }
        if (i6 == 4) {
            return 3;
        }
        if (i6 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == W2.l.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int h(W2.o policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i6 = a.f14079d[policy.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final byte[] i(Set triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    b.c cVar = (b.c) it.next();
                    objectOutputStream.writeUTF(cVar.a().toString());
                    objectOutputStream.writeBoolean(cVar.b());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    public static final int j(W2.u state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f14076a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
