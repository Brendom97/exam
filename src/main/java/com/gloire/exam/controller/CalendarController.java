package com.gloire.exam.controller;
import com.gloire.exam.repository.SearchHistoryRepository;
import com.gloire.exam.domain.SearchHistory;
import org.springframework.web.bind.annotation.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


@RestController
@RequestMapping("/services/calendar")
public class CalendarController {

    @PostMapping("/dayfinder")
    public DayOfWeekResponse findDayOfWeek(@RequestParam("date") String dateString) {
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        saveSearchHistory(date);
        return new DayOfWeekResponse(date, dayOfWeek);
    }

    private void saveSearchHistory(LocalDate date) {

    }

    public static class DayOfWeekResponse {
        private String date;
        private String dayOfWeek;

        public DayOfWeekResponse(LocalDate date, DayOfWeek dayOfWeek) {
            this.date = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            this.dayOfWeek = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.FRENCH);
        }

        // Getters and setters
    }
}
