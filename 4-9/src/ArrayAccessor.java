public class ArrayAccessor {
    public ArrayAccessor(int[] numbers) {
    }

    public int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}
