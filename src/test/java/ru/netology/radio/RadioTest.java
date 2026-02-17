package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {


    @Test
    public void insideZoomRangeRadioStation() { //Проверка значений при преключения вперед станций внутри диапазона
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outZoomRangeRadioStation() { //Проверка значений при преключения вперед станций вне диапазона
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(radio.getMaxRadioStation());

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outZoomRangeVolume() {//Проверка значений увелечения громкости вне диапазона
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insideZoomRangeVolume() {//Проверка значений увелечения громкости внутри диапазона
        Radio radio = new Radio();

        radio.setCurrentVolume(56);

        radio.volumeUp();

        int expected = 57;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insideZoomReductionVolume() {//Проверка значений уменьшения громкости внутри диапазона
        Radio radio = new Radio();

        radio.setCurrentVolume(88);

        radio.volumeDown();

        int expected = 87;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outZoomReductionVolume() {//Проверка значений уменьшения громкости вне диапазона
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insideZoomReductionRadioStation() {//Проверка значений при преключения назад станций внутри диапазона
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(7);

        radio.back();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OutZoomReductionRadioStation() {//Проверка значений при преключения назад станций вне диапазона
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(0);

        radio.back();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationGreaterMax() {
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(radio.getMaxRadioStation() + 1);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationEqualMax() {
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(radio.getMaxRadioStation());

        Assertions.assertEquals(radio.getMaxRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationLessMax() {
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(radio.getMaxRadioStation() - 1);

        Assertions.assertEquals(radio.getMaxRadioStation() - 1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationLessMin() {
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationEqualMin() {
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationGreaterMin() {
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeGreater100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeEqual100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLess100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLess0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeEqual0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeGreater0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
