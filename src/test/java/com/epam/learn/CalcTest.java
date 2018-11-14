package com.epam.learn;

import com.epam.learn.Calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CalcTest
{
    @Test
    public void add() {
        Calc calc = new Calc(2);
        assertEquals(5, calc.add(3));
    }
}
