package org.example;

public class Payment {
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    private double amount;
    private boolean status;
    private int transactionID;
    private String receipt;
    private String paymentDate;
    private int score;



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Payment(double amount, boolean status, int transactionID, String receipt, String paymentDate, int score) {
        this.amount = amount;
        this.status = status;
        this.transactionID = transactionID;
        this.receipt = receipt;
        this.paymentDate = paymentDate;
        this.score = score;
    }
//وضعیت پرداخت را به پرداخت شده تغییر دهد
    public void processPayment(){
        this.status = true;
    }
    //وضعیت پرداخت را به پرداخت نشده تغییر دهد
    public void refundPayment(){
        this.status = false;
    }
    public String generateReceipt(){
        String receipt = "";
        receipt+="amount : "+this.amount+"\n";
        receipt+="status : "+this.status+"\n";
        receipt+="transactionID : "+this.transactionID+"\n";
        receipt+="paymentDate : "+this.paymentDate+"\n";
        this.receipt = receipt;
        return this.receipt;

    }
    public void applyDiscount(int score){
        this.amount -= score * 3;

    }
    public String getPaymentInfo(){
        String result = "---------------------------------------------------------------\n";
        result += "amount" + this.getAmount() + "\n";
        result += "status" + this.isStatus() + "\n";
        result += "transactionID" + this.getTransactionID()+ "\n";
        result += "receipt" + this.getReceipt() + "\n";
        result += "paymentDate" + this.getPaymentDate() + "\n";
        result += "score" + this.getScore() + "\n";
        result+= "---------------------------------------------------------------\n";

        return result;


    }
    }


