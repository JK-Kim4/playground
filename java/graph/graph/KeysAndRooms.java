package graph;

public class KeysAndRooms {

    int[][] rooms;

    int totalRoomCount = 0;

    boolean[] isVisited;

    public KeysAndRooms() {}

    public KeysAndRooms(int[][] rooms) {

        this.rooms = rooms;
        this.totalRoomCount = rooms.length;
        this.isVisited = new boolean[rooms.length];

    }

    public void visit(){

        for(int i = 0; i < this.totalRoomCount; i++){

            for(int j = 0; j < this.rooms[i].length; j++){
                if(!this.isVisited[j]){
                    this.isVisited[j] = true;
                }else{
                    System.out.println("is already visited [room number = " + j +" ]");
                }
            }

        }

    };

    public boolean[] getIsVisited(){
        return this.isVisited;
    }

    public void viewIsVisited(){
        for(int i = 0; i < this.isVisited.length; i++){
            System.out.println("room number " + i + " is " + isVisited[i] );
        }

    }


}
