package telephone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable{
  private List<String> numbers;
  private List<String> urls;

   public Smartphone(List<String> numbers, List<String> urls ){
       this.numbers =  numbers;
       this.urls = urls;
   }



    @Override
    public String browse() {
       StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if(!isUrlValid(url)){
                sb.append("Invalid URL!");
            }else {
                sb.append(String.format("Browsing: %s!",url));
            }
            sb.append(System.lineSeparator());

        }

        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String numb : numbers) {
            if(isNumberValid(numb)){
                sb.append(String.format("Calling... %s", numb));
            }else{
                sb.append("Invalid number!");
            }
            sb.append(System.lineSeparator());

        }
        return sb.toString();
    }
    private boolean isNumberValid(String number){
        for (int i = 0; i <number.length() ; i++) {
            if (!Character.isDigit(number.charAt(i))){
                return false;
            }

        }
        return true;

        }
       private boolean isUrlValid(String url){
            for (int i = 0; i <url.length() ; i++) {
                if(Character.isDigit(url.charAt(i)))
                return false;
            }
            return true;
        }
    }

