package com.techymonk.happyzone.interfaces;

public interface AdsCallback {

    void adLoadingFailed();

    void adClose();

    void startNextScreen();

    void onLoaded();
}