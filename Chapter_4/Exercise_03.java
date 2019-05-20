package Chapter4_Exercises;

/**
 * Created by Gary Kasameyer on 9/15/2017.

 (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
 Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
 distance between two cities. Divide the polygon into two triangles and use the
 formula in Programming Exercise 2.19 to compute the area of a triangle.)

 Atlanta, Georgia = -84.3879712 33.7476288
 Orlando, Florida = -81.3797128 28.5376860
 Savannah, Georgia = -81.0996607 32.0823587
 Charlotte, North Carolina = -80.8435231 35.2273723

 */
public class Exercise_03 {
    public static void main(String[] args) {
        double atl_Y = Math.toRadians(-84.3879712), atl_X = Math.toRadians(33.7476288),
                orl_Y = Math.toRadians(-81.3797128), orl_X = Math.toRadians(28.5376860),
                sav_Y = Math.toRadians(-81.0996607), sav_X = Math.toRadians(32.0823587),
                char_Y = Math.toRadians(-80.8435231), char_X = Math.toRadians(35.2273723),
                distance_Atl_Orl, distance_Orl_Sav, distance_Sav_Char, distance_Char_Atl, distance_Atl_Sav, s1, s2, area1, area2, totalArea;
        final double RADIUS = 6371.01;

        // Calculate distances between cities
        // RADIUS * Math.acos(Math.sin(p1_X) * Math.sin(p2_X) + Math.cos(p1_X) * Math.cos(p2_X) * Math.cos(p1_Y - p2_Y));
        distance_Atl_Orl = RADIUS * Math.acos(Math.sin(atl_X) * Math.sin(orl_X) + Math.cos(atl_X) * Math.cos(orl_X) * Math.cos(atl_Y - orl_Y));
        distance_Orl_Sav = RADIUS * Math.acos(Math.sin(orl_X) * Math.sin(sav_X) + Math.cos(orl_X) * Math.cos(sav_X) * Math.cos(orl_Y - sav_Y));
        distance_Sav_Char = RADIUS * Math.acos(Math.sin(sav_X) * Math.sin(char_X) + Math.cos(sav_X) * Math.cos(char_X) * Math.cos(sav_Y - char_Y));
        distance_Char_Atl = RADIUS * Math.acos(Math.sin(char_X) * Math.sin(atl_X) + Math.cos(char_X) * Math.cos(atl_X) * Math.cos(char_Y - atl_Y));
        distance_Atl_Sav = RADIUS * Math.acos(Math.sin(atl_X) * Math.sin(sav_X) + Math.cos(atl_X) * Math.cos(sav_X) * Math.cos(atl_Y - sav_Y));

        //System.out.println("triangle 1: " + distance_Atl_Orl + " -- " + distance_Orl_Sav + " -- " + distance_Atl_Sav);
        //System.out.println("triangle 2: " + distance_Sav_Char + " -- " + distance_Char_Atl + " -- " + distance_Atl_Sav);

        // calculate sides
        s1 = (distance_Atl_Orl + distance_Orl_Sav + distance_Atl_Sav) / 2.0;
        area1 = Math.sqrt(s1 * (s1 - distance_Atl_Orl) * (s1 - distance_Orl_Sav) * (s1 - distance_Atl_Sav));

        s2 = (distance_Sav_Char + distance_Char_Atl + distance_Atl_Sav) / 2.0;
        area2 = Math.sqrt(s2 * (s2 - distance_Sav_Char) * (s2 - distance_Char_Atl) * (s2 - distance_Atl_Sav));

        // Display the final result
        totalArea = area1 + area2;
        System.out.print("The total area is " + totalArea);
    }
}
