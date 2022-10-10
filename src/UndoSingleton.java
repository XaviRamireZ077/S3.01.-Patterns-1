import java.util.ArrayList;
import java.util.List;

public class UndoSingleton {

    private static UndoSingleton mInstance;
    private ArrayList<String> paraules = new ArrayList<>();

    public static UndoSingleton getInstance() {
        if (mInstance == null)
            mInstance = new UndoSingleton();

        return mInstance;
    }

    private UndoSingleton() {
        paraules = new ArrayList<String>();
    }

    //Add element to array
    public void addToArray(String value) {
        paraules.add(value);

    }

    public boolean removeToarray (int value) {

        try {
            paraules.remove(value);

        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;

    }

    public List<String> getArray () {

        return new ArrayList<>(paraules);
    }
}







