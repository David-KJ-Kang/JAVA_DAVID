package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultiConditionSort 
{
	public static void main(String[] args) 
	{
		List<Item> items = new ArrayList<>();
        items.add(new Item(20, "c"));
        items.add(new Item(15, "z"));
        items.add(new Item(11, "a"));
        items.add(new Item(19, "b"));
        items.add(new Item(20, "b"));
        items.add(new Item(10, "z"));
        items.add(new Item(20, "a"));
        items.add(new Item(10, "x"));
        items.add(new Item(30, "b"));

        System.out.println("Origin: " + items);

        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.price < o2.price) return -1;
                if (o1.price > o2.price) return 1;

                if (o1.name.compareTo(o2.name) < 0) return -1;
                if (o1.name.compareTo(o2.name) > 0) return 1;

                return 0;
            }
        });

        System.out.println("Sorted: " + items);
	}
	
	
}


class Item 
{
    int price;
    String name;

    public Item(int price, String name) 
    {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() 
    {
        return "[" + price + ", " + name + "]";
    }
}
