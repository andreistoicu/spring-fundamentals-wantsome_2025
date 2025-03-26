package com.wantsome.layered.databases.controllers;

import com.wantsome.layered.databases.dao_repository_domain.entity.BankAccount;
import com.wantsome.layered.databases.service.BankAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {

    private final BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/newBankAccount")
    public String bankAccountForm(Model model) {
        model.addAttribute("bankAccount", new BankAccount());
        return "bankaccount/bankAccountForm";
    }

    @PostMapping("/accounts")
    public String submitBankAccount(Model model,@ModelAttribute BankAccount bankAccount) {
        bankAccountService.save(bankAccount);
        model.addAttribute("accounts", bankAccountService.findAll());

        return "bankaccount/bankAccountTable";
    }

    @GetMapping("/accounts")
    public String getBankAccounts(Model model) {
        model.addAttribute("accounts", bankAccountService.findAll());

        return "bankaccount/bankAccountTable";
    }
}
