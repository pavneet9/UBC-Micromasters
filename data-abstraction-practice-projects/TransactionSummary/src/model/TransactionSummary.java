package model;

import java.util.LinkedList;
import java.util.List;

public class TransactionSummary {

    private String name;
    private List<Transaction> transactions;

    public TransactionSummary(String name) {
        // TODO: complete the implementation of this method
        this.name = name;
        transactions = new LinkedList<>();
    }

    // getters
    public String getName() {
        // TODO: complete the implementation of this method
        return name;
    }
    public List<Transaction> getTransactions() {
        // TODO: complete the implementation of this method
        return transactions;
    }
    public int getNumTransactions() {
        // TODO: complete the implementation of this method
        return transactions.size();
    }

    // REQUIRES: t is not already within transactions
    // MODIFIES: this
    // EFFECTS: adds the given transaction t to the list of transactions
    public void addTransaction(Transaction t) {
        // TODO: complete the implementation of this method
        if (!contains(t)){
            transactions.add(t);
    }
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: computes the average amount of money spent on a transaction
    public double averageTransactionCost() {
        // TODO: complete the implementation of this method
        int totalNum = getNumTransactions();
        double sum = 0;
        for(Transaction t : transactions){
            sum += t.getAmount();
        }
        return sum / totalNum;
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS:  returns the average cost of all transactions of type specificType in this
    //           TransactionSummary
    public double specificTypeAverage(TransactionType specificType) {
        // TODO: complete the implementation of this method
        double totalCost = 0;
        int numTransactions = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals(specificType)) {
                totalCost += t.getAmount();
                numTransactions++;
            }
        }
        return totalCost / numTransactions;
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: returns the largest transaction (in terms of cost) in this TransactionSummary
    public Transaction largestTransaction() {
        // TODO: complete the implementation of this method
        Transaction largest = transactions.get(0);
        for (Transaction t: transactions) {
            if (t.getAmount() > largest.getAmount()) {
                largest = t;
            }
        }
        return largest;
    }

    // EFFECTS: returns true if the given transaction is contained within the list of transactions
    public boolean contains(Transaction t) {
        // TODO: complete the implementation of this method
        return transactions.contains(t);
    }


}
