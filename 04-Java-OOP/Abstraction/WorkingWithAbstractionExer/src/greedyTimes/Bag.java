package greedyTimes;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private Gold gold;
    private List<Gems> gems;
    private  List<Cash>cash;
    private long capacity;

    public Bag(long capacity){
        this.capacity = capacity;
        this.gems = new ArrayList<>();
        this.cash = new ArrayList<>();


    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public List<Gems> getGems() {
        return gems;
    }

    public void setGems(List<Gems> gems) {
        this.gems = gems;
    }

    public List<Cash> getCash() {
        return cash;
    }

    public void setCash(List<Cash> cash) {
        this.cash = cash;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
    public boolean isGemsContainsName(String name){
        for (Gems current : this.getGems()) {
            if(current.getName().equals(name)){
                return true;
            }

        }
            return false;
    }
    public long totalGems(){
        return this.getGems().stream().mapToLong(Gems::getValue)
                .sum();
    }

    public boolean isCashContainsName(String name) {
        for (Cash current : this.getCash()) {
            if(current.getName().equals(name)){
                return true;
            }
            
        }
        return false;
    }
    public long totalCash(){
        return this.getCash().stream()
                .mapToLong(Cash::getValue)
                .sum();
    }
    public Gems findByName(String name) {
        Gems gem = null;
        for (Gems current : getGems()) {
            if(current.getName().equals(name))
            gem = current;
        }

    return gem;
    }
    public Cash findCashByName(String name ){
        Cash cash = null;
        for (Cash current : getCash()) {
            if (current.getName().equals(name))
                cash = current;
        }
    return cash;
    }

}
