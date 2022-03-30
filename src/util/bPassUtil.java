package util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class bPassUtil {
    public static double distanceCalc(double lat1,  double lon1,double lat2, double lon2){
        double R = 3958.8; // miles
//        double R = 6371; // metres

        double φ1 = lat1 * Math.PI / 180; // φ, λ in radians
        double φ2 = lat2 * Math.PI / 180;
        double Δφ = (lat2 - lat1) * Math.PI / 180;
        double Δλ = (lon2 - lon1) * Math.PI / 180;

        double a = Math.sin(Δφ / 2) * Math.sin(Δφ / 2) + Math.cos(φ1) * Math.cos(φ2) * Math.sin(Δλ / 2) * Math.sin(Δλ / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double d = R * c;
        return d;
    }
    public static String airportDistance(String airportCode1, String airportCode2){ //call this method, using 3 letter airport codes
        Path source = Path.of("src/util/airports.csv");
        String[] splitter;
        ArrayList<String> locations;
        ArrayList<Double> coords = new ArrayList<>();
        double distance;

        try {
            locations = new ArrayList<>(Files.readAllLines(source));
        }catch(Exception e) {
            return null;
        }
        for(String element: locations)
        {
            if(element.startsWith(airportCode1)||element.startsWith(airportCode2)) {
                splitter = element.split(",");
                coords.add(Double.parseDouble(splitter[1]));
                coords.add(Double.parseDouble(splitter[2]));
            }
        }

        return String.format("%.2f",distanceCalc(coords.get(0),coords.get(1),coords.get(2),coords.get(3)));

    }

}
