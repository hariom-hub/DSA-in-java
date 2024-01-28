import java.util.*;

public class java {

  public static float getPath(String str){
    
    for(int i=0;i<str.length();i++){
      
      char direction = str.charAt(i);

      if(direction == "N"){
        y++;
      }else if(direction == "S"){
        y--;
      }else if(direction = "E"){
        x++;
      }else{
        x--;
      }
      
    }
    int sqr_x = x*x;
    int sqr_y = y*y;

    return (float)Math.sqrt(sqr_x + sqr_y);  
  }
  public static void main(String[] args){

  String dirction = "NSSNSWNSSWNEESENS";
    System.out.println(getPath(direction));
  }
}
  
