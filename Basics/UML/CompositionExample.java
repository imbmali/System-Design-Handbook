import java.util.ArrayList;
import java.util.List;

// Room class
class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// House class (Composition relationship)
class House {
    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }
}



public class CompositionExample {
    public static void main(String[] args) {
        House house = new House();
        // If the house is destroyed, the rooms are also destroyed
        house.showRooms();
        // Output:
        // Living Room
        // Bedroom
    }
}