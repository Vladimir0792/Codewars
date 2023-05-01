package convert;
//Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.

//My solutions
public class Convert {
    public static String boolToWord(boolean b)
    {
        if(b==true){
            return "Yes";
        }
        if(b==false){
            return "No";
        }
        return "not value";
    }
    public static void main(String[] args) {

    }

}

