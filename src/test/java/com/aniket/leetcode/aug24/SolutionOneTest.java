package com.aniket.leetcode.aug24;

import ch.qos.logback.core.subst.Token;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SolutionOneTest {
     SolutionOne so = new SolutionOne();

    @Test
    public void testgeneratePascalTraingle() {
       assertNotNull(so.generate(5));
       assertNotNull(so.generate(1));

    }
 }

