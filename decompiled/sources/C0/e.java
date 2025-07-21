package C0;

import android.widget.ListView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e extends a {

    /* renamed from: s, reason: collision with root package name */
    public final ListView f453s;

    public e(ListView listView) {
        super(listView);
        this.f453s = listView;
    }

    @Override // C0.a
    public boolean a(int i6) {
        return false;
    }

    @Override // C0.a
    public boolean b(int i6) {
        ListView listView = this.f453s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i7 = firstVisiblePosition + childCount;
        if (i6 > 0) {
            if (i7 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i6 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // C0.a
    public void j(int i6, int i7) {
        this.f453s.scrollListBy(i7);
    }
}
