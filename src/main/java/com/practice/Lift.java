package com.practice;

class Lift{

    private int topFloor;
    private int currentFloor=0; // default
    private int capacity = 10;    // default
    private int numRiders = 0;    // default

    public Lift(int highestFloor) {
        topFloor = highestFloor;
    }

    public Lift(int highestFloor, int maxRiders) {
        this(highestFloor);
        capacity = maxRiders;
    }

    public int getTopFloor() {
        return topFloor;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getNumRiders() {
        return numRiders;
    }
    public int getCurrentFloor() {
        //System.out.println("hi");
        return currentFloor;
    }
    public boolean isFull() {
        return numRiders == capacity;
    }
    public int addRiders(int numEntering) {
        if (numRiders + numEntering <= capacity) {
            numRiders += numEntering;
        } else {
            numRiders = capacity;
        }
         return numRiders;
    }

    public void goUp() {
        if (currentFloor < topFloor)
         currentFloor++;

    }
    public void goDown() {
        if (currentFloor > 0)
           currentFloor--;
    }
    public void call(int floor) {
      //  System.out.println("hi");
        if (floor >= 0 && floor <= topFloor) {
            while (floor != currentFloor) {
                if (floor > currentFloor)
                    goUp();
                else
                    goDown();
            }
        }
    }
}
/**public class LiftMain{
    public static void main(String[] args){
       // Lift obj = new Lift(20,10);
       // System.out.println("the number of udated riders is " +obj.addRiders(3));
         Lift obj1 = new Lift(20);
         // obj.isFull();
        // obj.addRiders(2);
         obj1.call(5);
       //  obj1.goUp();

        System.out.println(obj1.getCurrentFloor());
    }
}**/