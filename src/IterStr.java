import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Hillel on 03.07.2017.
 */
public class IterStr {

    public String doIt ()
    {
        ArrayList lst = new ArrayList();
        for (int i = 0; i < 100; i++)
        {
            lst.add(i);
        }
        String res = "";
        Iterator iter = lst.iterator();

        for (int i = 0; iter.hasNext(); i++)
        {
            if (i%6 == 0)
                res += "\n";
            res += " " + iter.next().toString();
        }
        return res;
    }

}
