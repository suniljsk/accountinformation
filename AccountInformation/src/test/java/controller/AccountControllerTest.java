package controller;

import Service.AccountService;
import com.AccountInformation.AccountInformation.AccountDTO.AccountDTO;
import model.Account;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.verification.VerificationMode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

class AccountControllerTest {
    @InjectMocks
    private AccountController accountController;
    @Mock
    private AccountService accountService;

    @Test
    void testcreateAccount() {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setName("Test Account");
        accountDTO.setIndustry("Tech");
        accountDTO.setRevenue(1000000);
        accountDTO.setAccountManager("John Doe");

        Account account = new Account();
        account.setId(1);
        account.setName("Test Account");
        account.setIndustry("Tech");
        account.setRevenue(1000000);
        account.setAccountManager("John Doe");

        when(accountService.createAccount(any(AccountDTO.class))).thenReturn(account);

        ResponseEntity<Account> responseEntity = accountController.createAccount(accountDTO);

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals(account, responseEntity.getBody());
        verify(accountService,times(1)).createAccount(any(AccountDTO.class));
    }

    private AccountService verify(AccountService accountService, VerificationMode times) {
        return null;
    }

    private AccountDTO any(Class<AccountDTO> accountDTOClass) {
        return null;
    }

    @Test
    void getAccountById() {
    }

    @Test
    void updateAccount() {
    }

    @Test
    void deleteAccount() {
    }
}