package com.example.memorytest;

import android.content.Context;

public class PendingOrderManager {
    private static PendingOrderManager instance;

    private Context mContext;

    public PendingOrderManager(Context context) {
        this.mContext = context;
    }

    public static PendingOrderManager getInstance(Context context) {
        if (instance == null) {
            instance = new PendingOrderManager(context);
        }
        return instance;
    }

}

