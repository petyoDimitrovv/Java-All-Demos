package com.company.skils;

public class Invoker {


    public void castSpell(String clazz){
        if(clazz.equalsIgnoreCase("mage")){
            new FireBall().execute();
        }else if(clazz.equalsIgnoreCase("rogue")){
            new Ambush().execute();
        }
    }

}
