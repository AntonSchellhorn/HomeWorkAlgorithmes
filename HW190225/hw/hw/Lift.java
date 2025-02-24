package org.telran.lecture_11_greedy_practice.practice.hw;

// Задача: вызов лифта
// В доме n лифтов, у каждого лифта своя скорость, измеряемая в сек/этаж (секунд на один этаж).
// Реализовать алгоритм отправки лифта, который приедет быстрее всего.
// Алгоритм будет применяться в домах разной этажности.
// Алгоритм будет применяться в домах с количеством > 2 лифтов
// Пример:
//  в доме 19 этажей
//  работают лифт А, лифт В и лифт C
//  лифт А находится на 4 этаже и движется со скоростью 3 сек/этаж.
//  лифт В находится на 8 этаже и движется со скоростью 2 сек/этаж.
//  лифт C находится на 5 этаже и движется со скоростью 2 сек/этаж.
//  На вход: 1 (вызываем на первый этаж)
//  результат: отправляем лифт С


public class Lift {

    private String name;

    private int currentFloor;

    private int speed;

    public Lift(String name, int currentFloor, int speed) {
        this.name = name;
        this.currentFloor = currentFloor;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArrivalTime(int targetFloor) {
        return Math.abs(currentFloor - targetFloor) * speed;
    }


}
