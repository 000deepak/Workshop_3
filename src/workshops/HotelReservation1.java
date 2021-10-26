package workshops;

import java.util.ArrayList;
/*
 * @Welcome -The  program implements an application for hotel reservation system
 * @author  -deepak
 * @version -1.0
 * @since   -26/10/21
 */

public class HotelReservation1 {
    static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    /*
    *this method takes name and price as input
    *this method adds hotel to hotelList
     * */

    public static void addHotel(String name, int rate) {
        Hotel hotel = new Hotel(name, rate);
        hotelList.add(hotel);
    }

    /*main method*/
    public static void main(String[] args) {
        System.out.println("-----------Welcome to Hotel reservation system--------------------");
        Hotel anand = new Hotel("Anand", 110);
    }


}
