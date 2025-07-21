package S1;

import Z0.w;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.List;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f4686b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4687c;

    /* renamed from: d, reason: collision with root package name */
    public final w f4688d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i6) {
            return new n[i6];
        }
    }

    public /* synthetic */ n(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (AbstractC1117K.c(this.f4674a, nVar.f4674a) && AbstractC1117K.c(this.f4686b, nVar.f4686b) && this.f4688d.equals(nVar.f4688d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (527 + this.f4674a.hashCode()) * 31;
        String str = this.f4686b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f4688d.hashCode();
    }

    @Override // Z0.x.b
    public void i(w.b bVar) {
        String str = this.f4674a;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c6 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c6 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c6 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c6 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c6 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c6 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c6 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c6 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c6 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c6 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c6 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c6 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c6 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c6 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c6 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c6 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c6 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c6 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c6 = 22;
                    break;
                }
                break;
        }
        try {
            switch (c6) {
                case 0:
                case '\n':
                    bVar.O((CharSequence) this.f4688d.get(0));
                    return;
                case 1:
                case 11:
                    bVar.T((CharSequence) this.f4688d.get(0));
                    return;
                case 2:
                case '\r':
                    String str2 = (String) this.f4688d.get(0);
                    bVar.g0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).f0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    return;
                case 3:
                case 18:
                    bVar.P((CharSequence) this.f4688d.get(0));
                    return;
                case 4:
                case 19:
                    bVar.N((CharSequence) this.f4688d.get(0));
                    return;
                case 5:
                case 20:
                    bVar.U((CharSequence) this.f4688d.get(0));
                    return;
                case 6:
                case 21:
                    String[] d12 = AbstractC1117K.d1((String) this.f4688d.get(0), "/");
                    bVar.q0(Integer.valueOf(Integer.parseInt(d12[0]))).p0(d12.length > 1 ? Integer.valueOf(Integer.parseInt(d12[1])) : null);
                    return;
                case 7:
                case 17:
                    bVar.n0((CharSequence) this.f4688d.get(0));
                    return;
                case '\b':
                case 16:
                    bVar.r0((CharSequence) this.f4688d.get(0));
                    return;
                case '\t':
                case 22:
                    bVar.h0(Integer.valueOf(Integer.parseInt((String) this.f4688d.get(0))));
                    return;
                case '\f':
                    Integer n6 = C6.g.n((String) this.f4688d.get(0));
                    if (n6 == null) {
                        bVar.b0((CharSequence) this.f4688d.get(0));
                        return;
                    }
                    String a6 = j.a(n6.intValue());
                    if (a6 != null) {
                        bVar.b0(a6);
                        return;
                    }
                    return;
                case 14:
                    List a7 = a((String) this.f4688d.get(0));
                    int size = a7.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                bVar.f0((Integer) a7.get(2));
                            }
                        }
                        bVar.g0((Integer) a7.get(1));
                    }
                    bVar.h0((Integer) a7.get(0));
                    return;
                case 15:
                    List a8 = a((String) this.f4688d.get(0));
                    int size2 = a8.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                bVar.i0((Integer) a8.get(2));
                            }
                        }
                        bVar.j0((Integer) a8.get(1));
                    }
                    bVar.k0((Integer) a8.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // S1.i
    public String toString() {
        return this.f4674a + ": description=" + this.f4686b + ": values=" + this.f4688d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f4674a);
        parcel.writeString(this.f4686b);
        parcel.writeStringArray((String[]) this.f4688d.toArray(new String[0]));
    }

    public n(String str, String str2, List list) {
        super(str);
        AbstractC1119a.a(!list.isEmpty());
        this.f4686b = str2;
        z6.w s6 = z6.w.s(list);
        this.f4688d = s6;
        this.f4687c = (String) s6.get(0);
    }

    public n(Parcel parcel) {
        this((String) AbstractC1119a.e(parcel.readString()), parcel.readString(), z6.w.t((String[]) AbstractC1119a.e(parcel.createStringArray())));
    }
}
