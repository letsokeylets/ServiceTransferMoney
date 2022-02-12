package ru.netology.servicetransfermoney.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.servicetransfermoney.repository.MoneyTransferRepository;

@Service
@AllArgsConstructor
public class MoneyTransferService {
    private final MoneyTransferRepository userRepository;
}
