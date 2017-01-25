package com.db.chart.animation;

import android.graphics.Rect;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class AnimationTest {

    private Animation mAnimation;


    @Before
    public void setUp() {

        mAnimation = new Animation();
    }


    @Test
    public void startingPoint_BottomLeft() {

        ArrayList<float[][]> values = new ArrayList<>(1);
        values.add(new float[][]{{0f, 1f}});

        Rect area = new Rect();
        area.left = 0;
        area.top = 0;
        area.right = 10;
        area.bottom = 10;
        ArrayList<float[][]> newValues =
                mAnimation.applyStartingPosition(values, area, 0f, 0f);

        assertEquals(0, newValues.get(0)[0][0], 0f);
        assertEquals(10, newValues.get(0)[0][1], 0f);
    }


    @Test
    public void startingPoint_TopLeft() {

        ArrayList<float[][]> values = new ArrayList<>(1);
        values.add(new float[][]{{0f, 1f}});

        Rect area = new Rect();
        area.left = 0;
        area.top = 0;
        area.right = 10;
        area.bottom = 10;
        ArrayList<float[][]> newValues =
                mAnimation.applyStartingPosition(values, area, 0f, 1f);

        assertEquals(0, newValues.get(0)[0][0], 0f);
        assertEquals(0, newValues.get(0)[0][1], 0f);
    }


    @Test
    public void startingPoint_BottomRight() {

        ArrayList<float[][]> values = new ArrayList<>(1);
        values.add(new float[][]{{0f, 1f}});

        Rect area = new Rect();
        area.left = 0;
        area.top = 0;
        area.right = 10;
        area.bottom = 10;
        ArrayList<float[][]> newValues =
                mAnimation.applyStartingPosition(values, area, 1f, 0f);

        assertEquals(10, newValues.get(0)[0][0], 0f);
        assertEquals(10, newValues.get(0)[0][1], 0f);
    }


    @Test
    public void startingPoint_TopRight() {

        ArrayList<float[][]> values = new ArrayList<>(1);
        values.add(new float[][]{{0f, 1f}});

        Rect area = new Rect();
        area.left = 0;
        area.top = 0;
        area.right = 10;
        area.bottom = 10;
        ArrayList<float[][]> newValues =
                mAnimation.applyStartingPosition(values, area, 1f, 1f);

        assertEquals(10, newValues.get(0)[0][0], 0f);
        assertEquals(0, newValues.get(0)[0][1], 0f);
    }

}
