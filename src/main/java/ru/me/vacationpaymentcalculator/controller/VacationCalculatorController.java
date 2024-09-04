package ru.me.vacationpaymentcalculator.controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.me.vacationpaymentcalculator.models.VacationResponse;
import ru.me.vacationpaymentcalculator.service.VacationCalculatorService;

import java.time.LocalDate;

@RestController
@RequestMapping("/calculate")
@AllArgsConstructor
public class VacationCalculatorController {


    private VacationCalculatorService vacationCalculatorService;

    @GetMapping
    public VacationResponse calculateVacation(@RequestParam double averageSalary,
                                              @RequestParam int vacationDays,
                                              @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                              @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        double vacationPay;
        if (startDate != null && endDate != null) {
            vacationPay = vacationCalculatorService.calculateVacationPayWithDates(averageSalary, startDate, endDate);
        } else {
            vacationPay = vacationCalculatorService.calculateVacationPay(averageSalary, vacationDays);
        }
        return new VacationResponse(vacationPay);
    }
}
