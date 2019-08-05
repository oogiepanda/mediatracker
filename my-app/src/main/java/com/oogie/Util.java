package com.oogie;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    public List<MediaType> retrieveMediaTypes(String... args) throws Exception {
        List<MediaType> mediaTypes = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println(text);

            String[] params = text.split("\\|");
            Class cls = Class.forName(params[0]);

            MediaType mt = (MediaType) objectMapper.readValue(params[1], cls);
            mediaTypes.add(mt);
        }
        return mediaTypes;
    }

    public void saveMediaTypes(List<MediaType> mediaTypes) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Main.MEDIA_FILE_NAME));
            ObjectMapper objectMapper = new ObjectMapper();

            for (MediaType mt : mediaTypes) {
                StringBuffer sb = new StringBuffer(mt.getClass().getName());
                sb.append("|").append(objectMapper.writeValueAsString(mt)).append("\n");
                writer.write(sb.toString());
                System.out.println(sb.toString());
            }
            if (writer != null)
                writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
