import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
          HashSet<Integer> set = new HashSet<>();
          for (int i = 0; i < 20; i++ ){
              set.add(i);
          }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
    Iterator<Integer> iterator = set.iterator();//получение итератора для списка

    while (iterator.hasNext())      //проверка, есть ли ещё элементы
            {
        //получение текущего элемента и переход на следующий

        
        if (iterator.next()  < 10){
            iterator.remove();
                     }
        
            }  
         return set;    
            
    }

    public static void main(String[] args) {

    }
}
