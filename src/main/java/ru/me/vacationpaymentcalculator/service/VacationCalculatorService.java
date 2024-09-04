package ru.me.vacationpaymentcalculator.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.me.vacationpaymentcalculator.utils.DateUtils;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class VacationCalculatorService {

    private HolidayService holidayService;

    public double calculateVacationPay(double averageSalary, int countOfVacationDays) {
        return (averageSalary / 29.3) * countOfVacationDays;
    }

    public double calculateVacationPayWithDates(double averageSalary, LocalDate start, LocalDate end) {
        int totalDays = DateUtils.calculateBusinessDaysBetween(start, end, holidayService.getHolidays());
        return calculateVacationPay(averageSalary, totalDays);
    }
}
