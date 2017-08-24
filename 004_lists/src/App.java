public class App {

    //  Create a class named ListOfInt who will take a param in constructor which will be buffer size;
    //      adds a element at end of list
    //      add elem at index
    //      get element at index
    //      set elem at index
    //      remove a elem from index
    //      contains a element
    //      change buffersize

    public static void main(String[] args) throws Exception {
        ListOfInt list = new ListOfInt(3);

        list.addElem(5);
        list.addElem(-3);
        list.addElem(500);
        list.addElem(222);

        list.addElemIndex(100, 0);
        list.addElemIndex(123, 5);
        list.addElemIndex(333, 5);
        list.addElemIndex(99, 3);

        if(list.getElemIndex(3) != 99) {
            throw new Exception("cod prost");
        }
        if(list.getElemIndex(0) != 100) {
            throw new Exception("cod prost");
        }
        if(list.getElemIndex(7) != 123) {
            throw new Exception("cod prost");
        }

        list.setElemIndex(22, 0);
        if(list.getElemIndex(0) != 22) {
            throw new Exception("cod prost");
        }
        list.setElemIndex(15, 7);
        if(list.getElemIndex(7) != 15) {
            throw new Exception("cod prost");
        }
        list.setElemIndex(100, 5);
        if(list.getElemIndex(5) != 100) {
            throw new Exception("cod prost");
        }

        list.remElemIndex(0);
        if(list.getElemIndex(0) != 5) {
            throw new Exception("cod prost");
        }
        list.remElemIndex(6);
        if(list.getSize() != 6) {
            throw new Exception("cod prost");
        }
        list.remElemIndex(2);
        if(list.getElemIndex(2) != 500) {
            throw new Exception("cod prost");
        }

        if(list.getSize() != 5) {
            throw new Exception("cod prost");
        }

        int x = 9;

    }

}
