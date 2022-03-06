package ru.netology.radio;

public class Radio {

    private int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }


    public void increaseStationNext() {
        if (currentStation >= 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void increaseStationPrev() {
        if (currentStation <= 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setToMax1() {
        currentVolume = 9;
    }

    public void increaseVolume1() {
        setCurrentVolume(currentVolume + 9);
    }

    public void setToMin1() {
        currentVolume = 0;
    }

    public void increaseVolume2() {
        setCurrentVolume(currentVolume - 9);
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 9) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;

    }
}
