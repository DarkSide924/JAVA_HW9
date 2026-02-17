package ru.netology.radio;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadiostation = 0;
    private int currentRadioStation = minRadiostation;
    private int countRadioStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
        this.maxRadioStation = this.countRadioStation - 1;
    }

    public Radio() {
    }


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadiostation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadiostation;
        }
        int target = currentRadioStation;
        setCurrentRadioStation(target);
    }

    public void back() {
        if (currentRadioStation > minRadiostation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        int target = currentRadioStation;
        setCurrentRadioStation(target);
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
        int target = currentVolume;
        setCurrentVolume(target);
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
        int target = currentVolume;
        setCurrentVolume(target);
    }
}






