package first;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Record rec1 = new Record(1, "+79230000000", "first");
        Record rec2 = new Record(2, "+79231111111", "second");
        Record rec3 = new Record(3, "+79232222222", "third");

        List<Record> recList = new ArrayList<>();
        recList.add(rec1);
        recList.add(rec2);
        recList.add(rec3);

        PhoneBook phoneBook = new PhoneBook(recList);
        System.out.println(phoneBook.getAllRecords());

        Record recExists = new Record(4, "+79230000000", "forth");
        phoneBook.createRecord(recExists);

        Record recNotFound = new Record(5, "+79233333333", "fifth");
        phoneBook.updateRecord(recNotFound);
    }



}
