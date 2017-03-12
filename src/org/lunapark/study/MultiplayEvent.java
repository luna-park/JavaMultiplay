package org.lunapark.study;

/**
 * Created by znak on 13.03.2017.
 */
public interface MultiplayEvent {
    void onFailure(String reason);

    void onSuccessConnection();

    void onConnectionChange();

    void onChangeDeviceList();

    void onReceiveData();
}
