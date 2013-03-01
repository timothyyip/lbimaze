package com.timyip.maze.connection;

import com.google.gson.Gson;
import com.timyip.maze.model.MazeResponse;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class GsonConnector {

    public MazeResponse start() throws IOException {
        URL url = new URL("http://lbi-live-api1.pc.aspectgroup.co.uk:2013/Maze/Location/easy/start/json");
        URLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        Gson gson = new Gson();
        MazeResponse mazeResponse = gson.fromJson(new InputStreamReader(connection.getInputStream()), MazeResponse.class);
        return mazeResponse;
    }

}
