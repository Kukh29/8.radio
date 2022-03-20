package ru.netology.radio;

public class Radio {


    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int countStation = 10;

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void increaseStationNext() {
        if (currentStation >= countStation - 1) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void increaseStationPrev() {
        if (currentStation <= 0) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > countStation - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
