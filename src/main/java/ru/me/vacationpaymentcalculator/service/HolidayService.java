package ru.me.vacationpaymentcalculator.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HolidayService {
    public List<LocalDate> getHolidays() {
        return List.of(LocalDate.of(2024, 1, 1),  // Новый год
                LocalDate.of(2024, 1, 2),  // Новогодние каникулы
                LocalDate.of(2024, 1, 3),  // Новогодние каникулы
                LocalDate.of(2024, 1, 4),  // Новогодние каникулы
                LocalDate.of(2024, 1, 5),  // Новогодние каникулы
                LocalDate.of(2024, 1, 6),  // Новогодние каникулы
                LocalDate.of(2024, 1, 7),  // Рождество Христово
                LocalDate.of(2024, 2, 23), // День защитника Отечества
                LocalDate.of(2024, 3, 8),  // Международный женский день
                LocalDate.of(2024, 5, 1),  // Праздник Весны и Труда
                LocalDate.of(2024, 5, 9),  // День Победы
                LocalDate.of(2024, 6, 12), // День России
                LocalDate.of(2024, 11, 4)  // День народного единства
        );
    }
}
