/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Seat {
    String seat_name;
    boolean seat_available;
    LocalDateTime seat_booked_time;

    Seat(String name) {
        this.seat_name = name;
        this.seat_available = true;
    }
    public String getName() {
        return this.seat_name;
    }
    public boolean getStatus() {
        return this.seat_available;
    }
    public LocalDateTime getBookedTime() {
        return this.seat_booked_time;
    }
    public void buy() {
        this.seat_available = false;
        this.seat_booked_time = LocalDateTime.now();
    }
}

class ShowTime {
    String time;
    int price;
    public ArrayList<Seat> seatList = new ArrayList<Seat>();

    ShowTime(String time, int price) {
        this.time = time;
        this.price = price;
        for(int i=0; i < 6; i++) {
            Seat newseat = new Seat('A' + Integer.toString(i+1));
            this.seatList.add(newseat);
        }
        for(int i=0; i < 6; i++) {
            Seat newseat = new Seat('B' + Integer.toString(i+1));
            this.seatList.add(newseat);
        }
        for(int i=0; i < 6; i++) {
            Seat newseat = new Seat('C' + Integer.toString(i+1));
            this.seatList.add(newseat);
        }
        for(int i=0; i < 6; i++) {
            Seat newseat = new Seat('D' + Integer.toString(i+1));
            this.seatList.add(newseat);
        }
    }
    public String getTime() {
        return this.time;
    }
    public int getPrice() {
        return this.price;
    }
}

class Film {
    String name;
    public ArrayList<ShowTime> timeList = new ArrayList<ShowTime>();

    Film(String name) {
        this.name = name;
        
        ShowTime time;
        time = new ShowTime("13:00", 35000);
        timeList.add(time);
        time = new ShowTime("16:00", 35000);
        timeList.add(time);
        time = new ShowTime("20:00", 50000);
        timeList.add(time);
    }
    public String getName() {
        return this.name;
    }
}

class Transaksi {
    public LocalDateTime time;
    public String filmName;
    public String showTime;
    public int pricePerSeat;
    public int priceTotal;
    public ArrayList<String> seats;
}

/**
 *
 * @author DELTA
 */
public class FilmData {
    public static void main(String[] args) {
        
    }
}
