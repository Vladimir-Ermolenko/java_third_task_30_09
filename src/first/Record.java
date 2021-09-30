package first;

public class Record {
    private long id_;
    private String phoneNumber;
    private String name;

    public Record(int id_, String phoneNumber, String name) {
        setId_(id_);
        setPhoneNumber(phoneNumber);
        setName(name);
    }

    public String toString() {
        return id_ + " " + phoneNumber + " " + name;
    }

    public long getId_() {
        return id_;
    }

    private void setId_(long id_) {
        this.id_ = id_;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}
