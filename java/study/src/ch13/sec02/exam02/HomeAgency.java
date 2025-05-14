package ch13.sec02.exam02;

import java.awt.event.ActionListener;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent(){
        return new Home();
    }
}
