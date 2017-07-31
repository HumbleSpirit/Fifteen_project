
package fifteen_project;
import java.util.ArrayList;

class Bank <T> //Параметризированный тип
{
    T[] clients;
    public Bank()
    {
        
    }
    public Bank (T[] clients)
    {
        this.clients = clients;
    }
}



public class Fifteen_project {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 44;
        String y = "Hello";
        ArrayList list = new ArrayList();
        list.add(x);
        list.add(y);
        int z = (int)list.get(0);
        //System.out.println(z);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        Bank<Integer> bank1;
        bank1 = new Bank(new Integer[]{1,2,3});
        Bank<String> bank2;
        bank2 = new Bank(new String[]{"1", "2", "3"});
                
    }
    
}
