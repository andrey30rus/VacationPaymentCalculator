package ru.me.vacationpaymentcalculator.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


public class VacationRequest {
    private double averageSalary;
    private int countOfVacationDays;
    private LocalDate vacationStart;
    private LocalDate vacationEnd;

}
