package com.javarticles.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParam {

    @Parameters({"param1", "param2"})
    @Test
    public void t(String p1, String p2) {
        System.out.println("t(" + p1 + ", " + p2 + ")" );
    }        
}
