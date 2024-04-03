package com.gloire.exam.service;


import com.gloire.exam.entity.Date;

import java.util.ArrayList;
import java.util.List;

public class DateServiceImp implements IDateService{

    private List<Date> dates;
    public DateServiceImp(){
        dates = new ArrayList<Date>();

    }
    @Override
    public List<Date> getDates() {
        return dates;
    }

    @Override
    public void addDate(Date date) {

        dates.add(date);
    }
}
