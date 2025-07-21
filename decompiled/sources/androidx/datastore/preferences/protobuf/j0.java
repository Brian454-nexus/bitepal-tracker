package androidx.datastore.preferences.protobuf;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j0 {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1030g f8793a;

        public a(AbstractC1030g abstractC1030g) {
            this.f8793a = abstractC1030g;
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public byte a(int i6) {
            return this.f8793a.b(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public int size() {
            return this.f8793a.size();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        byte a(int i6);

        int size();
    }

    public static String a(AbstractC1030g abstractC1030g) {
        return b(new a(abstractC1030g));
    }

    public static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i6 = 0; i6 < bVar.size(); i6++) {
            byte a6 = bVar.a(i6);
            if (a6 == 34) {
                sb.append("\\\"");
            } else if (a6 == 39) {
                sb.append("\\'");
            } else if (a6 != 92) {
                switch (a6) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a6 < 32 || a6 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a6 >>> 6) & 3) + 48));
                            sb.append((char) (((a6 >>> 3) & 7) + 48));
                            sb.append((char) ((a6 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a6);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(AbstractC1030g.l(str));
    }
}
