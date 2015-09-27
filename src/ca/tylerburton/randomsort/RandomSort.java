/*
 * RandomSort.java
 * This file is part of RandomSort
 *
 * Copyright (C) 2015 - Tyler Burton
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package ca.tylerburton.randomsort;

import java.util.Random;

/**
 * RandomSort attempts to sort an array by randomly re-arranging elements until
 * it finds a combination that is sorted. It is a terrible idea and should
 * never actually be used for anything serious.
 * @author Tyler Burton (software@tylerburton.ca)
 */
public class RandomSort 
{
    /**
     * Sorts the array based on the class' comparator
     * @param <T> Type
     * @param a Array to sort
     */
    public static <T extends Comparable<T>> void sort(T[] a)
    {
        // Consider it sorted if there is fewer than 2 elements in the array
        if(a == null || a.length < 2)
        {
            return;
        }
        
        boolean isSorted;
        Random rng = new Random();        
        int i, j;
        T tmp;
        
        do
        {
            // Get two random positions in the array
            i = rng.nextInt(Integer.MAX_VALUE) % a.length;
            j = rng.nextInt(Integer.MAX_VALUE) % a.length;
            
            // Swap positions
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            
            // Check if it is sorted            
            isSorted = true;
            for(int idx = 1; idx < a.length; idx+= 2)
            {
                if(a[idx].compareTo(a[idx - 1]) < 0)
                {
                    isSorted = false;
                    break;
                }
            }
        }
        while(!isSorted);
    }
    
    /**
     * Sorts array of bytes
     * @param a array
     */
    public static void sort(byte[] a)
    {
        Byte[] b = new Byte[a.length];        
        for(int idx = 0; idx < a.length; idx++)
        {
            b[idx] = a[idx];
        }        
        sort(b);
    }
    
    /**
     * Sorts array of chars
     * @param a array
     */
    public static void sort(char[] a)
    {
        Character[] c = new Character[a.length];        
        for(int idx = 0; idx < a.length; idx++)
        {
            c[idx] = a[idx];
        }        
        sort(c);
    }
    
    /**
     * Sorts array of doubles
     * @param a array
     */
    public static void sort(double[] a)
    {
        Double[] d = new Double[a.length];        
        for(int idx = 0; idx < a.length; idx++)
        {
            d[idx] = a[idx];
        }        
        sort(d);
    }
    
    /**
     * Sorts array of floats
     * @param a array
     */
    public static void sort(float[] a)
    {
        Float[] f = new Float[a.length];        
        for(int idx = 0; idx < a.length; idx++)
        {
            f[idx] = a[idx];
        }        
        sort(f);
    }
    
    /**
     * Sorts array of ints
     * @param a array
     */
    public static void sort(int[] a)
    {
        Integer[] i = new Integer[a.length];        
        for(int idx = 0; idx < a.length; idx++)
        {
            i[idx] = a[idx];
        }        
        sort(i);
    }
    
    /**
     * Sorts array of longs
     * @param a array
     */
    public static void sort(long[] a)
    {
        Long[] l = new Long[a.length];        
        for(int idx = 0; idx < a.length; idx++)
        {
            l[idx] = a[idx];
        }        
        sort(l);
    }
    
    /**
     * Sorts array of shorts
     * @param a array
     */
    public static void sort(short[] a)
    {
        Short[] s = new Short[a.length];        
        for(int idx = 0; idx < a.length; idx++)
        {
            s[idx] = a[idx];
        }        
        sort(s);
    }
}