//-------------------------------------------------------
// Assignment 4
// Written by: Kim Stewart, Student ID: 40225973
// For COMP 248 Section T 2232 – Fall 2023
//--------------------------------------------------------

// CostLessBites Catering

public class PoS {
    // Attributes
    Sales sales;
    PrePaidCard[] prePaidCard;

    // Default constructor
    public PoS(){}

    // Constructor with 2 parameters
    public PoS(Sales sales, PrePaidCard prePaidCard){}

    // checkEqualSales method
    public boolean checkEqualSales(PoS first, PoS second) {
        if (first.equals(second)) return true;
        else return false;
    }

    // checkEqualCategory method
    public boolean checkEqualCategory(PoS first, PoS second) {
        if (first.equals(second)) return true;
        else return false;
    }

    // totalSales method `
    public double totalSales(double sales) {
        return sales;
    }

    // totalPrePaidCards method
    public int totalPrepaidCards(int total) {
        return total;
    }

    // addPrePaidCard method
    public int addPrePaidCard(int add){
        return add;
    }

    // removePrePaidCard method
    public boolean removePrePaidCard(){
        // if array ! empty
        return true;
        // if array empty, return false;
    }

    // updateExpiryDate method
    public void updateExpiryDate(){}

    // addSales method
    public double addSales(int junior, int teen, int medium, int big, int family) {
        return 0.0;
        //returns the new total sales value payments of the PoS.
    }

    // equals method
    public boolean equals(){
        return true;
        // true if the total $ amount sales value and the number
        //of pre-paid card of two PoS objects are equal, and false otherwise.
    }

    // toString method override
    public String toString(){
        return "";
        //return a string clearly indicating the number of each meal sales
        //category as well as the details of each pre-paid card of the PoS. It is possible for a PoS to have
        //no pre-paid card, in which case “No pre-paid cards” should be indicated.
    }

    // salesBreakdown method
    public String salesBreakdown(){
        return "";
        // method which will return a string with just the breakdown of the sales.
    }




}
