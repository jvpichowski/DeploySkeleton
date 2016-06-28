package com.example.deploy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jan on 28.06.16.
 */
public class ExampleLibraryUnitTest {

    @Test
    public void getMessage(){
        assertEquals("Hello World!", ExampleLibrary.getMessage("World"));
    }

}
