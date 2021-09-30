package first;

import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private List<Record> recordList;

    public PhoneBook(List<Record> recordList) {
        setRecordList(recordList);
    }

    private void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

    public List<Record> getAllRecords() {
        return recordList;
    }

    public void createRecord(Record record) {
        try {
            for (Record rec : recordList) {
                if (Objects.equals(rec.getPhoneNumber(), record.getPhoneNumber())) {
                    throw new PhoneNumberAlreadyExists();
                }
            }
        } catch (PhoneNumberAlreadyExists exists) {
            System.out.println("Phone number already exists :)");
        }
    }

    public void updateRecord(Record record) {
            boolean exists = false;
            for (Record rec : recordList) {
                if (rec.getId_() == record.getId_()) {
                    exists = true;
                    try {
                        if (rec.getName() == null || Objects.equals(rec.getName(), "") || rec.getPhoneNumber() == null
                                || Objects.equals(rec.getPhoneNumber(), "")) {
                            throw new RecordNotValid();
                        } else {
                            int index = recordList.indexOf(rec);
                            recordList.set(index, record);
                            break;
                        }
                    } catch (RecordNotValid recordNotValid) {
                        System.out.println("Record is not valid :(");
                    }
                }
            }
            if (!exists) {
                throw new RecordNotFound();
            }
    }

    public void deleteRecord(long id) {
        try {
            boolean exists = false;
            for (Record rec : recordList) {
                if (rec.getId_() == id) {
                    exists = true;
                    int index = recordList.indexOf(rec);
                    recordList.remove(index);
                    break;
                }
            }
            if (!exists) {
                throw new RecordNotFound();
            }
        } catch (RecordNotFound notFound) {
            System.out.println("Record with this id doesn't exist :(");
        }
    }

}

/// если  null или пустая строка – выбрасывает исключение