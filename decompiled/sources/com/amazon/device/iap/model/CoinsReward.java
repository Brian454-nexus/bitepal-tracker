package com.amazon.device.iap.model;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class CoinsReward {
    private final int amount;

    public CoinsReward(int i6) {
        this.amount = i6;
    }

    public static final CoinsReward from(int i6) {
        if (i6 > 0) {
            return new CoinsReward(i6);
        }
        return null;
    }

    public int getAmount() {
        return this.amount;
    }
}
