package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String MEDIA_FILE_NAME = "target/mediafiles.txt";

    public static void main(String[] args) {
        Util util = new Util();

        List<MediaType> mediaTypes1 = new ArrayList<>();
        Book book = new Book("Of Mice and Men", 1994, "Scholastic", 180);
        Movie movie = new Movie("King Kong", 2006, "Universal Studios");
        TV tv = new TV("Transformers", 1980, 65);

        mediaTypes1.add(book);
        mediaTypes1.add(movie);
        mediaTypes1.add(tv);

        util.saveMediaTypes(mediaTypes1);
    }
}
