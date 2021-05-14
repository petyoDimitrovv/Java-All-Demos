import java.util.*;
import java.util.stream.Collectors;

public class ChainblockImpl implements Chainblock{

    private Map<Integer, Transaction> dataBase;

    public ChainblockImpl(){
        this.dataBase = new HashMap<>();
    }


    public int getCount() {
        return dataBase.size();
    }

    public void add(Transaction transaction) {
        if(!contains(transaction)) {
            dataBase.put(transaction.getId(), transaction);
        }
    }

    public boolean contains(Transaction transaction) {
        return contains(transaction.getId());
    }

    public boolean contains(int id) {
        return this.dataBase.containsKey(id);
    }

    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        if(!contains(id)){
            throw new IllegalArgumentException();
        }
        Transaction transaction = this.getById(id);
        transaction.setStatus(newStatus);

    }

    public void removeTransactionById(int id) {
        if(!contains(id)){
            throw new IllegalArgumentException();
        }
        this.dataBase.remove(id);

    }

    public Transaction getById(int id) {
        if(!contains(id)){
            throw new IllegalArgumentException();
        }
        return this.dataBase.get(id);
    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {

        List<Transaction> transactions = this.dataBase.values().stream()
                .filter(t -> t.getStatus() == status)
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());

        if(transactions.isEmpty()){
            throw new IllegalArgumentException();
        }

        return transactions;
    }

    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        List<Transaction> transactions = this.dataBase.values().stream()
                .filter(t -> t.getStatus() == status)
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());

        if(transactions.isEmpty()){
            throw new IllegalArgumentException();
        }

        return transactions.stream()
                .map(Transaction::getFrom)
                .collect(Collectors.toList());

    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        List<Transaction> transactions = this.dataBase.values().stream()
                .filter(t -> t.getStatus() == status)
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());

        if(transactions.isEmpty()){
            throw new IllegalArgumentException();
        }

        return transactions.stream()
                .map(Transaction::getTo)
                .collect(Collectors.toList());
    }

    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {

        return this.dataBase.values()
                .stream()
                .sorted((t1,t2) -> {
                    if(t1.getAmount() == t2.getAmount()){
                        return Integer.compare(t1.getId(), t2.getId());
                    }
                  return Double.compare(t2.getAmount(), t1.getAmount());
                })
                .collect(Collectors.toList());

    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        List<Transaction> transactions = this.dataBase.values()
                .stream()
                .filter(t -> t.getFrom().equals(sender))
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        if (transactions.isEmpty()){
            throw new IllegalArgumentException();
        }
        return transactions;
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        List<Transaction> transactions = this.dataBase.values()
                .stream()
                .filter(t -> t.getTo().equals(receiver))
                .sorted((t1, t2) -> {
                    if (t1.getAmount() == t2.getAmount()) {
                        return Integer.compare(t1.getId(), t2.getId());
                    }
                    return Double.compare(t2.getAmount(), t1.getAmount());
                })
                .collect(Collectors.toList());
        if(transactions.isEmpty()){
            throw new IllegalArgumentException();
        }
        return transactions;
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        List<Transaction> transactions = this.dataBase.values()
                .stream()
                .filter(t -> t.getStatus().equals(status) && t.getAmount() <= amount )
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        if(transactions.isEmpty()){
            return new ArrayList<>();
        }
        return transactions;
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        List<Transaction> transactions = this.dataBase.values()
                .stream()
                .filter(t -> t.getFrom().equals(sender) && t.getAmount() >= amount )
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        if(transactions.isEmpty()){
            return new ArrayList<>();
        }
        return transactions;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        List<Transaction> transactions = this.dataBase.values()
                .stream()
                .filter(t -> t.getTo().equals(receiver) && (t.getAmount() >= lo && t.getAmount() <= hi  ))
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        if(transactions.isEmpty()){
            return new ArrayList<>();
        }
        return transactions;
    }


    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        List<Transaction> transactions = this.dataBase.values()
                .stream()
                .filter( t -> t.getAmount() >= lo && t.getAmount() <= hi)
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());
        if(transactions.isEmpty()){
            return new ArrayList<>();
        }
        return transactions;
    }


    public Iterator<Transaction> iterator() {
        return new Iterator<Transaction>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return dataBase.size() < index;
            }

            @Override
            public Transaction next() {
                return dataBase.get(index++);
            }
        };
    }
}
