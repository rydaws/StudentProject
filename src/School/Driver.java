package School;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Student> db = new ArrayList<>();

        Tester test = new Tester();
        db = test.fillDB(db);
        test.run(db);
    }

}
