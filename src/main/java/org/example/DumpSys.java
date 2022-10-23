package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class DumpSys {

    static boolean programRunning = true;
    static HashMap<String, String> lane = new HashMap<>();
    static Vehicle vehicle = new Vehicle();
    static Lanes lanes = new Lanes(lane, vehicle.getData());
    //static Lanes lanes = new Lanes();

    public static void run() {
        Scanner sc = new Scanner(System.in);
        generateLanes();

        while (programRunning) {

            mainMenu();
            menuChoice(sc.nextInt());
            menu();
            int choice = menuChoice(sc.nextInt());
            if (choice == 1) {
                int carriage = sc.nextInt();
                vehicleRegistry("van", carriage);

            } else if (menuChoice(choice) == 2) {


                
            }
        }
    }

    public static void generateLanes() {
        String[] laneDb = {"a", "b", "c", "d", "e"};

        for (int i = 0; i <= laneDb.length; i++) {
            lane.put(String.valueOf(i).toUpperCase(), null);
        }
    }

    public static String mainMenu() {
        return """
               1. Van.
               2. Small truck.
               3. Heavy truck. 
               """;
    }

    public static String menu() {
        return """
           1. Available lanes.
           2. Occupied lanes.
           3. I'm done dumping.
           4. Quit program.
           """;
    }

    public static int menuChoice(int choice) {
        return choice;
    }

    public static HashMap<String, String> vehicleRegistry(String vehicle, int weight) {
        DumpSys.vehicle.setWeight(weight);
        if (vehicle.contains("van")) {
                lane.put("A", DumpSys.vehicle.getData());
                lane.put("B", DumpSys.vehicle.getData());
            } else if (vehicle.contains("small")) {
                lane.put("C", DumpSys.vehicle.getData());
                lane.put("D", DumpSys.vehicle.getData());
            } else {
                lane.put("E", DumpSys.vehicle.getData());
            }
        return lane;    
    
    }
}
