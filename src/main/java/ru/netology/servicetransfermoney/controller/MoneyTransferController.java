package ru.netology.servicetransfermoney.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.servicetransfermoney.service.MoneyTransferService;

@RestController
@AllArgsConstructor
public class MoneyTransferController {
    private final MoneyTransferService service;
}
