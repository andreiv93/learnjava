public class ListOfInt {
    private int bufferSize;
    private int[] listOfInt;

    private int indexOfLastAdded;

    public ListOfInt(int bufferSize) throws Exception {
        this.bufferSize = bufferSize;
        this.listOfInt = new int[bufferSize];
        this.indexOfLastAdded = -1;

        if (bufferSize <= 0) {
            throw new Exception("buffer size less then 1");
        }
    }

    public void addElem(int elem) throws IndexOutOfBoundsException {
        int indexOfThisElem;

        if (this.indexOfLastAdded == -1) {
            indexOfThisElem = 0;
            this.indexOfLastAdded = 0;
        } else {
            indexOfThisElem = this.indexOfLastAdded + 1;
            this.indexOfLastAdded++;
        }

        if (indexOfThisElem >= this.listOfInt.length) {
            int[] newArray = this.copy(this.listOfInt, this.listOfInt.length + this.bufferSize);
            newArray[indexOfThisElem] = elem;
            this.listOfInt = newArray;
        } else {
            this.listOfInt[indexOfThisElem] = elem;
        }
    }

    public void addElemIndex(int elem, int index) throws IndexOutOfBoundsException {
        if (index == this.indexOfLastAdded + 1) {
            addElem(elem);
        } else if (0 <= index && index <= this.indexOfLastAdded){
            int[] result = this.copy(this.listOfInt, this.listOfInt.length + 1);
            for (int i = result.length-1; i > index; i--) {
                result[i] = result[i-1];
            }
            result[index] = elem;
            this.listOfInt = result;
            this.indexOfLastAdded++;

        } else {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
    }

    public int getElemIndex(int index) {
        if (index > this.indexOfLastAdded || index < 0){
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        return this.listOfInt[index];
    }

    public void setElemIndex(int elem, int index) {
        if (index > this.indexOfLastAdded || index < 0) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        this.listOfInt[index] = elem;
    }

    public void remElemIndex(int index) {
        if (index < 0 || index > this.indexOfLastAdded) {
            throw new IndexOutOfBoundsException("index array out of bounds");
        }
        for(int i = index; i < this.listOfInt.length-1; i++) {
            listOfInt[i] = listOfInt[i+1];
        }
        this.listOfInt[this.indexOfLastAdded] = 0;
        this.indexOfLastAdded--;
    }

    public void changeBuffer(int newBufferSize) throws Exception {
        if (newBufferSize <= 0) {
            throw new Exception("Buffer size is less than 1");
        }
        this.bufferSize = newBufferSize;
    }

    private int[] copy(int[] array, int size) throws IndexOutOfBoundsException {
        if (size < array.length) {
            throw new IndexOutOfBoundsException("Size is less than first array size");
        }

        int[] result = new int[size];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public int getSize() {
        return this.indexOfLastAdded + 1;
    }
}
