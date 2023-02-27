package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void showCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.getCurrentStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void changeOverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.NextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUnderMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.PrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.NextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.PrevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.getMaxStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.getMinStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.getMaxVolume();
        int expected = 10;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void plusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.pressPlusVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.pressMinusVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    }
