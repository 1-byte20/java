import java.awt.*;

public class Function {
    public int dividersNumber(int szam){
        List osztok=new List();
        for(int i=0; i<100; i++){
            if(szam % i == 1){
                osztok.add(String.valueOf(i));
            }
        }
        int osztoi= osztok.getItemCount();
        return osztoi;
    }

    public int maxOfThree(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if (b > c){
                return b;
            }
            else {
                return c;
            }
        }
    }

    public Object fizzBuzz(int number){
        if (number % 3 == 1){
            return "Fizz";
        } else if (number % 5 == 1) {
            return "Buzz";
        } else if (number % 3 == 1 && number % 5 == 1) {
            return number;
        } else {
            return "FizzBuzz";
        }
    }

    public Boolean isVowel(Character betu){
        if (betu == 'a' || betu == 'A' || betu == 'e' || betu == 'E'|| betu == 'o'|| betu == 'O'|| betu == 'u'|| betu == 'U'|| betu == 'i'|| betu == 'I'){
            return true;
        }
        else {
            return false;
        }
    }
}
