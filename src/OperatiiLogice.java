/**
 * Created by User on 24.01.2018.
 */
public class OperatiiLogice {

    public int compareNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }
    public String containText (String text){
        if (text.equals("FastTrack")){
            return "Learning text comparison";
        }else { return "Got to try some more";
    }
    }
}