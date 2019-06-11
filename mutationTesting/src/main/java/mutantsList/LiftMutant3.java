package mutantsList;

public class LiftMutant3 {
    private int topFloor;
    private int currentFloor;
    private int capacity;
    private int numRiders;

    public LiftMutant3(int highestFloor) {
        this.currentFloor = 0;
        this.capacity = 10;
        this.numRiders = 0;
        this.topFloor = highestFloor;
    }

    public LiftMutant3(int highestFloor, int maxRiders) {
        this(highestFloor);
        this.capacity = maxRiders;
    }

    public int getTopFloor() {
        return this.topFloor;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumRiders() {
        return this.numRiders;
    }

    public int getCurrentFloor() {
        return this.currentFloor != 0 ? 0 : 1;
    }

    public boolean isFull() {
        return this.numRiders == this.capacity;
    }

    public int addRiders(int numEntering) {
        if (this.numRiders + numEntering <= this.capacity) {
            this.numRiders += numEntering;
        } else {
            this.numRiders = this.capacity;
        }

        return this.numRiders;
    }

    public void goUp() {
        if (this.currentFloor < this.topFloor) {
            ++this.currentFloor;
        }

    }

    public void goDown() {
        if (this.currentFloor > 0) {
            --this.currentFloor;
        }

    }

    public void call(int floor) {
        if (floor >= 0 && floor <= this.topFloor) {
            while(floor != this.currentFloor) {
                if (floor > this.currentFloor) {
                    this.goUp();
                } else {
                    this.goDown();
                }
            }
        }

    }
}
