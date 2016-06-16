package Primitives;

import java.math.BigInteger;

public class WordProperties implements Sizeofable, Parsable
{
    int occurrences;
    int temp[];

    public WordProperties()
    {
        this.occurrences = 0;
    }

    public WordProperties(int occurrences)
    {
        this.occurrences = occurrences;
//        temp = new int[1000];
    }

    public int getOccurrences()
    {
        return occurrences;
    }

    public void setOccurrences(int occurrences)
    {
        this.occurrences = occurrences;
    }

    @Override
    public int sizeof()
    {
        return 4;
    }

    @Override
    public String toString()
    {
        return String.valueOf(occurrences);
    }


    public byte[] toByteArray()
    {
        BigInteger bigInteger = BigInteger.valueOf(occurrences);
        byte[] bytes = bigInteger.toByteArray();
        return bytes;
    }

    @Override
    public void parseFromByteArray(byte[] input)
    {
        BigInteger bigInteger = new BigInteger(input);
        occurrences = bigInteger.intValue();
    }
}
