//uppercasing after space

public class upperCasingfirstCharacter {


    public static StringBuilder UpperCasing(String str){

        StringBuilder sb = new StringBuilder("");        //creating a new string builder to store new string

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);                                         //appending the first character of string

        for(int i=1;i<str.length();i++){

            if(str.charAt(i) == ' '&& i<str.length()-1){
                sb.append(str.charAt(i));                           //appending the space        
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));     //appending space and characters and uppercasing them
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb;                                                 //returning uppercased string
    }
    public static void main(String[] args){

        String str = "hariom singh thakur";
        System.out.println(UpperCasing(str));
    }
}
