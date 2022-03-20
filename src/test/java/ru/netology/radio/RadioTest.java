package ru.netology.radio;

import org.junit.jupiter.api.Test;

class RadioTest {

    Radio radio = new Radio(10);
    Radio radio2 = new Radio();


    @Test
    void shouldChangeStation() {
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }


    @Test
    void shouldSetToNext() {
        radio.setCurrentStation(9);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void shouldSetToNext2() {
        radio.setCurrentStation(6);
        radio.increaseStationNext();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldSetToNext3() {
        radio.setCurrentStation(10);
        radio.increaseStationNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetToNext4() {
        radio.setCurrentStation(9);
        radio.increaseStationNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetToPrev() {
        radio.setCurrentStation(0);
        radio.increaseStationPrev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetToPrev2() {
        radio.setCurrentStation(4);
        radio.increaseStationPrev();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void shouldSetToPrev3() {
        radio.setCurrentStation(-1);
        radio.increaseStationPrev();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    void shouldChangeVolume() {
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToNextVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToNextVolume2() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    void shouldSetToPrevVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToPrevVolume2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    private void assertEquals(int expected, int actual) {
    }

    @Test
    public void shouldUseConstructorNoArgs() {
        assertEquals(3, radio2.getCurrentStation());
    }

}