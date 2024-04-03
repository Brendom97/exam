package com.gloire.exam.service;

import com.gloire.exam.entity.Date;
import java.util.List;

public interface IDateService {

    List<Date> getDates();
    void addDate(Date date);
}
