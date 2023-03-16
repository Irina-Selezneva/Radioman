package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio2 = new Radio(20);


    @Test
    public void showCurrentStation() {
        radio.setCurrentStation(5);
        radio.getCurrentStation();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void changeOverNextStation() {
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUnderMinStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStation() {
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMaxStation() {
        radio.setCurrentStation(10);
        radio.getCurrentStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderMinStation() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeOverMax() {
        radio.setCurrentVolume(101);
        radio.getMaxVolume();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentVolume(-1);
        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(50);
        radio.pressPlusVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(50);
        radio.pressMinusVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showCurrentStation2() {
        radio2.setCurrentStation(15);
        radio2.getCurrentStation();
        int expected = 15;
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUnderMinStation2() {
        radio2.setCurrentStation(0);
        radio2.prevStation();
        int expected = 19;
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeOverNextStation2() {
        radio2.setCurrentStation(19);
        radio2.nextStation();
        int expected = 0;
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        radio2.setCurrentStation(15);
        radio2.nextStation();
        int expected = 16;
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        radio2.setCurrentStation(15);
        radio2.prevStation();
        int expected = 14;
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMaxStation2() {
        radio2.setCurrentStation(25);
        radio2.getCurrentStation();
        int expected = 0;
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderMinStation2() {
        radio2.setCurrentStation(-1);
        radio2.prevStation();
        int expected = 19;
        int actual = radio2.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}