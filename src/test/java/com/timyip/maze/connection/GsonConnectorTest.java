package com.timyip.maze.connection;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GsonConnectorTest {

    public static final String EASY_START_LOCATION = "792697d9-5da4-4100-a523-ffa390f6006c";
    private GsonConnector gsonConnector;

    @Before
    public void setup(){
        gsonConnector = new GsonConnector();

    }

    @Test
    public void canGetCurrentLocation() throws IOException {
        assertEquals(EASY_START_LOCATION, gsonConnector.start().getLocationId());
    }

    @Test
    public void canGetCurrentLocationType() throws IOException {
        assertNotNull(gsonConnector.start().getLocationType());
    }

    @Test
    public void locationTypeIsOneOfTheFourInput() throws IOException {
        List<String> possibleLocationType = new ArrayList<String>();
        possibleLocationType.add("Start");
        possibleLocationType.add("Normal");
        possibleLocationType.add("Exit");
        possibleLocationType.add("PowerPill");

        assertTrue(possibleLocationType.contains(gsonConnector.start().getLocationType()));
    }


}
