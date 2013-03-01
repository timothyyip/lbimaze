package com.timyip.maze.connection;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

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




}
