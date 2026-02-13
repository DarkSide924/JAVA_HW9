package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        int target = currentRadioStation;
        setCurrentRadioStation(target);
    }

    public void back() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
        int target = currentRadioStation;
        setCurrentRadioStation(target);
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
        int target = currentVolume;
        setCurrentVolume(target);
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
        int target = currentVolume;
        setCurrentVolume(target);
    }
}






