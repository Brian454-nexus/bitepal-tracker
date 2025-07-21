package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import n2.AbstractC1816c;
import n2.AbstractC1820g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: D, reason: collision with root package name */
    public int f9546D;

    /* renamed from: E, reason: collision with root package name */
    public int f9547E;

    /* renamed from: F, reason: collision with root package name */
    public int f9548F;

    /* renamed from: G, reason: collision with root package name */
    public int f9549G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9550H;

    /* renamed from: I, reason: collision with root package name */
    public SeekBar f9551I;

    /* renamed from: J, reason: collision with root package name */
    public TextView f9552J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f9553K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f9554L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f9555M;

    /* renamed from: V, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f9556V;

    /* renamed from: W, reason: collision with root package name */
    public final View.OnKeyListener f9557W;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i6, boolean z6) {
            if (z6) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f9555M || !seekBarPreference.f9550H) {
                    seekBarPreference.I(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.J(i6 + seekBarPreference2.f9547E);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f9550H = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f9550H = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f9547E != seekBarPreference.f9546D) {
                seekBarPreference.I(seekBar);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i6, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f9553K && (i6 == 21 || i6 == 22)) || i6 == 23 || i6 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f9551I;
            if (seekBar != null) {
                return seekBar.onKeyDown(i6, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.f9556V = new a();
        this.f9557W = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17638C0, i6, i7);
        this.f9547E = obtainStyledAttributes.getInt(AbstractC1820g.f17644F0, 0);
        F(obtainStyledAttributes.getInt(AbstractC1820g.f17640D0, 100));
        G(obtainStyledAttributes.getInt(AbstractC1820g.f17646G0, 0));
        this.f9553K = obtainStyledAttributes.getBoolean(AbstractC1820g.f17642E0, true);
        this.f9554L = obtainStyledAttributes.getBoolean(AbstractC1820g.f17648H0, false);
        this.f9555M = obtainStyledAttributes.getBoolean(AbstractC1820g.f17650I0, false);
        obtainStyledAttributes.recycle();
    }

    public final void F(int i6) {
        int i7 = this.f9547E;
        if (i6 < i7) {
            i6 = i7;
        }
        if (i6 != this.f9548F) {
            this.f9548F = i6;
            r();
        }
    }

    public final void G(int i6) {
        if (i6 != this.f9549G) {
            this.f9549G = Math.min(this.f9548F - this.f9547E, Math.abs(i6));
            r();
        }
    }

    public final void H(int i6, boolean z6) {
        int i7 = this.f9547E;
        if (i6 < i7) {
            i6 = i7;
        }
        int i8 = this.f9548F;
        if (i6 > i8) {
            i6 = i8;
        }
        if (i6 != this.f9546D) {
            this.f9546D = i6;
            J(i6);
            A(i6);
            if (z6) {
                r();
            }
        }
    }

    public void I(SeekBar seekBar) {
        int progress = this.f9547E + seekBar.getProgress();
        if (progress != this.f9546D) {
            if (a(Integer.valueOf(progress))) {
                H(progress, false);
            } else {
                seekBar.setProgress(this.f9546D - this.f9547E);
                J(this.f9546D);
            }
        }
    }

    public void J(int i6) {
        TextView textView = this.f9552J;
        if (textView != null) {
            textView.setText(String.valueOf(i6));
        }
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i6) {
        return Integer.valueOf(typedArray.getInt(i6, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public SeekBarPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1816c.f17627h);
    }
}
