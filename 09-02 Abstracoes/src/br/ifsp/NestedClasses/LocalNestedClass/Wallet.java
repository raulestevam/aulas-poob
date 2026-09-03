package br.LocalNestedClass;

public class Wallet {
    void processPayment(){
        class Transaction {
            void validate(){
                System.out.println("Valid Transaction");
            }
        }
        Transaction ts = new Transaction();
        ts.validate();
    }
}
