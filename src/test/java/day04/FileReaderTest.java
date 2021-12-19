package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {


    FileReader fileReader = new FileReader();

    @Test
    void findSmallestSpread() {
        int actualDay = fileReader.findSmallestSpread("weather.dat");
        assertEquals(14, actualDay);
        //assertThrows(IllegalArgumentException.class, ()-> fileReader.findSmallestSpread("weather.dat"));
        //assertThrows("File not found", iae.getMessage());
    }

    @Test
    void findSmallestSpreadInFootball() {
        String actualTeam = fileReader.findSmallestSpreadInFootball("football.dat");
        assertEquals("Aston_Villa", actualTeam);
        /*IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> fileReader.findSmallestSpreadInFootball("football.dat"));
        assertThrows("File not found", iae.getMessage());*/
    }
}
