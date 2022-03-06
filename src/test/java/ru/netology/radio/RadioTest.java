package ru.netology.radio;

import org.junit.jupiter.api.Test;

class RadioTest {


    @Test
    public void RadioTest() {
        Radio radio = new Radio();


        radio.setCurrentStation(10); // тестируемое действие

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrentStation(); // фактический результат

        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {
    }


    @Test
    public void setToNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStationNext();


        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setToNext2() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.increaseStationNext();


        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setToPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.increaseStationPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setToPrev2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseStationPrev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void TestVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(8);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.setToMax1();
        volume.increaseVolume1();


        int expected = 9;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        volume.setToMin1();
        volume.increaseVolume2();


        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }


}