import Dictionaries.BtreeDictionary;
import Dictionaries.HashMapDictionary;
import Dictionaries.TrieDictionary;
import Tree.BPTree;
import Tree.BTree;

public class Main
{

    public static void main(String args[])
    {
        bTreeTest();
//        btreeDictionaryTest();
//        trieDictionaryTest();
//        hashMapDictionaryTest();
    }

    private static void hashMapDictionaryTest()
    {
        HashMapDictionary hashMapDictionary = new HashMapDictionary();
        for(int i = 0; i < 10; i++)
            hashMapDictionary.insertNodeIfnotExists(String.valueOf(i));

        for(int i = 0; i < 10; i++)
            hashMapDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 9; i++)
            hashMapDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 8; i++)
            hashMapDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 7; i++)
            hashMapDictionary.insertNodeIfnotExists(String.valueOf(i));

//        System.out.println(trieDictionary);

        for(int i = 0; i < 10; i++)
            System.out.println(String.valueOf(i) + " --> " + hashMapDictionary.getHashMap().get(String.valueOf(i)));
    }

    private static void trieDictionaryTest()
    {
        TrieDictionary trieDictionary = new TrieDictionary();
        for(int i = 0; i < 10; i++)
            trieDictionary.insertNodeIfnotExists(String.valueOf(i));

        for(int i = 0; i < 10; i++)
            trieDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 9; i++)
            trieDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 8; i++)
            trieDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 7; i++)
            trieDictionary.insertNodeIfnotExists(String.valueOf(i));

//        System.out.println(trieDictionary);

        for(int i = 0; i < 10; i++)
            System.out.println(String.valueOf(i) + " --> " + trieDictionary.getTrie().get(String.valueOf(i)));
    }

    private static void btreeDictionaryTest()
    {
        BtreeDictionary btreeDictionary = new BtreeDictionary(2);
        for(int i = 0; i < 10; i++)
            btreeDictionary.insertNodeIfnotExists(String.valueOf(i));

        for(int i = 0; i < 10; i++)
            btreeDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 9; i++)
            btreeDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 8; i++)
            btreeDictionary.insertNodeIfnotExists(String.valueOf(i));
        for(int i = 0; i < 7; i++)
            btreeDictionary.insertNodeIfnotExists(String.valueOf(i));

        System.out.println(btreeDictionary);

        for(int i = 0; i < 10; i++)
            System.out.println(String.valueOf(i) + " --> " + btreeDictionary.getbTree().search(String.valueOf(i)));
    }

    private static void bTreeTest()
    {
        BTree<Integer, Integer> tree = new BTree<>(2);
        for( int i = 0; i < 100000; i++) {
            if( i == 9 )
                System.out.println("");
            tree.insert(i, i);
//            System.out.println("heap size:\t" + Runtime.getRuntime().totalMemory()/(1024*1024) + "\tfree memory:\t" + Runtime.getRuntime().freeMemory()/(1024*1024) + "\n");
        }
//        System.out.println(tree);
    }
}

