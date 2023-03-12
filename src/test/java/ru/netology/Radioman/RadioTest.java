package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void showCurrentStation() {
        Radio radio = new Radio(9, 0, 5, 100, 0, 5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void changeOverNextStation() {
        Radio radio = new Radio(9, 0, 9, 100, 0, 5);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUnderMinStation() {
        Radio radio = new Radio(9, 0, 0, 100, 0, 5);
       radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(9, 0, 8, 100, 0, 5);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(9, 0, 1, 100, 0, 5);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMaxStation() {
        Radio radio = new Radio(9, 0, 10, 100, 0, 5);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderMinStation() {
        Radio radio = new Radio(9, 0, -1, 100, 0, 5);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeOverMax() {
        Radio radio = new Radio(9, 0, 5, 100, 0, 101);
       radio.getMaxVolume();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio(9, 0, 5, 100, 0, -1);
        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void plusVolume() {
        Radio radio = new Radio(9, 0, 5, 100, 0, 50);
        radio.pressPlusVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio(9, 0, 5, 100, 0, 50);
       radio.pressMinusVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
