package com.company.junit;

import org.junit.Test;

import static junit.framework.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class petRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() throws Exception {

        assertEquals("Rocky", rocky.getName());
    }
    @Test
    public void testUnHappyAtStart() throws Exception {
        assertFalse(rocky.isHappy());


    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Test
    public void checkPetRockToys() throws Exception {
        assertArrayEquals(rocky.getToys(),rocky.getMoreToys());
    }

    @Test
    public void checkIfNotNull() throws Exception {
        assertNotNull(rocky.getName());
        assertNotNull(rocky.getToys());
    }

    @Test
    public void checkForNull() throws Exception {
        assertNull(rocky.getNullString());

    }

    @Test
    public void checkIfSameReference() throws Exception {
        assertSame(rocky.getName(),rocky.getName());


    }
    @Test
    public void checkIfNotSameReference() throws Exception {
        assertNotSame(rocky.getName(),rocky.isHappy());
    }

    @Test
    public void checkIfEquals () throws Exception {
        assertThat(rocky.getMoreToys(), equalTo(rocky.getToys()));
    }


}