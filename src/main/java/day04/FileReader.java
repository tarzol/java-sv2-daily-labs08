package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FileReader {

    public int findSmallestSpread(String fileName) {

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/datamunging/"+fileName));
        }
        catch (IOException ioe) {
            //ioe.printStackTrace();
            throw new IllegalStateException("File not found", ioe);
        }
        return findSmallestDifference(lines);
    }

    public String findSmallestSpreadInFootball(String fileName) {

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/datamunging/"+fileName));
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return findSmallestDifferenceInFootball(lines);
    }

    private int findSmallestDifference(List<String> lines) {
        int smallestDiff = 100;
        int actualDay = 0;

        for (int i=2 ; i<lines.size()-1; i++) {
            int day = Integer.parseInt(lines.get(i).substring(2, 4).trim());
            int maxValue = Integer.parseInt(lines.get(i).substring(6, 8).trim());
            int minValue = Integer.parseInt(lines.get(i).substring(12, 14).trim());
            if ((maxValue - minValue) < smallestDiff) {
                smallestDiff =maxValue - minValue;
                actualDay = day;
            }
        }
        return actualDay;
    }

    private String findSmallestDifferenceInFootball(List<String> lines) {
        int smallestDiff = 100;
        String actualTeam = "";

        for (int i=1 ; i<lines.size(); i++) {
            if ( i == 18 ) {
                continue;
            }
            String team = lines.get(i).substring(7, 23).trim();
            int kicked = Integer.parseInt(lines.get(i).substring(43, 45).trim());
            int received = Integer.parseInt(lines.get(i).substring(50, 53).trim());

            if (Math.abs(kicked - received) < smallestDiff) {
                smallestDiff = Math.abs(kicked - received);
                actualTeam = team;
            }
        }
        return actualTeam;
    }

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();

        int actualDay = fileReader.findSmallestSpread("weather.dat");
        System.out.println("Legkisebb hőmérséklet különbség napja: "+actualDay+".");

        String actualTeam = fileReader.findSmallestSpreadInFootball("football.dat");
        System.out.println("Legkisebb gólkülömbség - csapat: "+actualTeam+".");
    }
}

