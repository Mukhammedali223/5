import java.util.ArrayList;
import java.util.List;

public class Cart
{
    private List<Item> items;

    public Cart()
    {
        items=new ArrayList<>();
    }

    public void addItem(Item it)
    {
        items.add(it);
    }

    public double getTotal()
    {
        double sum=0;
        for(Item it:items)
        {
            sum+=it.getPrice();
        }
        return sum;
    }
}
