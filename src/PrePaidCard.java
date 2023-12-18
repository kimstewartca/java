//-------------------------------------------------------
// Assignment 4
// Written by: Kim Stewart, Student ID: 40225973
// For COMP 248 Section T 2232 – Fall 2023
//--------------------------------------------------------

// CostLessBites Catering

public class PrePaidCard {
    // Attributes
    String type;
    int id;
    int expireDay;
    int expireMonth;

    // Default constructor
    public PrePaidCard(){}

    // Constructor with 4 parameters
    public PrePaidCard(String type, int id, int expireDay, int expireMonth) {

    }

    // Copy constructor
    public PrePaidCard(PrePaidCard prePaidCard) {

    }

    // Access methods for all attributes
    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getExpireDay() {
        return expireDay;
    }

    public int getExpireMonth() {
        return expireMonth;
    }

    // Mutator methods for due date and due month
    public void setExpireDay(int expireDay) {
        this.expireDay = expireDay;
    }

    public void setExpireMonth(int expireMonth) {
        this.expireMonth = expireMonth;
    }

    // toString() method
    public String toString(String type, int expireDay, int expireMonth) {
        String result = type + ", " + expireDay + "/" + expireMonth;
        return result;
    }

    // equals() method
    public boolean equals(PrePaidCard first, PrePaidCard second){
        if (first.equals(second)) return true;
        else return false;
    }
}
