package q;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: q.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1987k {

    /* renamed from: a, reason: collision with root package name */
    public TextView f18550a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f18551b;

    public C1987k(TextView textView) {
        this.f18550a = (TextView) y0.g.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f18551b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f18550a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f18551b = textClassifier;
    }
}
