package controller;

import Service.AccountService;
import com.AccountInformation.AccountInformation.AccountDTO.AccountDTO;

import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody AccountDTO accountDto) {
        Account account = accountService.createAccount(accountDto);
        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable String id) {
        return accountService.getAccountById(id).map(account -> new ResponseEntity<>
                (account, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PutMapping("{/id}")
    public ResponseEntity<Account> updateAccount(@PathVariable String id, @RequestBody AccountDTO accountDto) {
        Account account = accountService.updateAccount(id, accountDto);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<Account> deleteAccount(@PathVariable String id) {
        accountService.deleteAccount(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
