package UI;

import Model.Dictionary;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {

    @org.junit.jupiter.api.Test
    void translate() {
        assertEquals("*The*gato",Dictionary.translate("The cat","Red Black Tree"));
    }

    @org.junit.jupiter.api.Test
    void fillTree() {
        Dictionary.fillTree("Red Black Tree");
    }
}