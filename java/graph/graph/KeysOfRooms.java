package graph;

public class KeysOfRooms {

    private int[][] roomsAndKeys;

    private int numberOfRooms;

    private boolean[] visited;


    public KeysOfRooms() {}

    public KeysOfRooms(int[][] roomsAndKeys) {
        this.roomsAndKeys = roomsAndKeys;
        this.numberOfRooms = roomsAndKeys.length;
        this.visited = new boolean[numberOfRooms];
    }

    public void visitAvailableRooms(int roomNumber){
        //방문 처리
        int[] roomKeys = roomsAndKeys[roomNumber];
        this.visited[roomNumber] = true;

        for(int i : roomKeys){
            if(!visited[i]){this.visitAvailableRooms(i);}
        }
    }

    public void printVisitResult(){
        for(int i = 0; i < visited.length; i++){
            System.out.println("room number " + i + ", result = " +visited[i]);
        }
    }

}
