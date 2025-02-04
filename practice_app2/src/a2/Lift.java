package a2;

import java.util.*;

 public class Lift {
    private int currentFloor;
    private boolean goingUp;
    private int maxFloors;
    private Queue<Integer> requests;

    public Lift(int maxFloors) {
        this.currentFloor = 0;  // Assume ground floor as 0
        this.goingUp = true;    // Initially going up
        this.maxFloors = maxFloors;
        this.requests = new LinkedList<>();
    }

    // Method to add floor request
    public void requestFloor(int floor) {
        if (floor < 0 || floor > maxFloors) {
            System.out.println("Invalid floor request.");
            return;
        }
        if (!requests.contains(floor)) {
            requests.offer(floor);
            System.out.println("Floor " + floor + " requested.");
        }
    }

    // Method to simulate lift movement
    public void move() {
        while (!requests.isEmpty()) {
            int targetFloor = requests.poll();
            
            System.out.println("Moving to floor " + targetFloor + "...");

            if (targetFloor > currentFloor) {
                goingUp = true;
                for (int i = currentFloor + 1; i <= targetFloor; i++) {
                    System.out.println("Lift at floor " + i);
                    currentFloor = i;
                }
            } else if (targetFloor < currentFloor) {
                goingUp = false;
                for (int i = currentFloor - 1; i >= targetFloor; i--) {
                    System.out.println("Lift at floor " + i);
                    currentFloor = i;
                }
            }
            System.out.println("Reached floor " + currentFloor);
        }
        System.out.println("Lift is idle at floor " + currentFloor);
    }

    // Method to display lift's current status
    public void status() {
        System.out.println("Current floor: " + currentFloor);
        System.out.println("Direction: " + (goingUp ? "Up" : "Down"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lift lift = new Lift(10); // Lift that can go up to 10 floors

        while (true) {
            System.out.println("\n1. Request floor\n2. Move lift\n3. Status\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter floor number to request: ");
                    int floor = sc.nextInt();
                    lift.requestFloor(floor);
                    break;
                case 2:
                    lift.move();
                    break;
                case 3:
                    lift.status();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
