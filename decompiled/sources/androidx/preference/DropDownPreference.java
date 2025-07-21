package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import n2.AbstractC1816c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: W, reason: collision with root package name */
    public final Context f9490W;

    /* renamed from: X, reason: collision with root package name */
    public final ArrayAdapter f9491X;

    /* renamed from: Y, reason: collision with root package name */
    public Spinner f9492Y;

    /* renamed from: Z, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f9493Z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i6, long j6) {
            if (i6 >= 0) {
                String charSequence = DropDownPreference.this.I()[i6].toString();
                if (charSequence.equals(DropDownPreference.this.J()) || !DropDownPreference.this.a(charSequence)) {
                    return;
                }
                DropDownPreference.this.L(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1816c.f17622c);
    }

    public ArrayAdapter M() {
        return new ArrayAdapter(this.f9490W, R.layout.simple_spinner_dropdown_item);
    }

    public final void N() {
        this.f9491X.clear();
        if (G() != null) {
            for (CharSequence charSequence : G()) {
                this.f9491X.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void r() {
        super.r();
        ArrayAdapter arrayAdapter = this.f9491X;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void t() {
        this.f9492Y.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9493Z = new a();
        this.f9490W = context;
        this.f9491X = M();
        N();
    }
}
