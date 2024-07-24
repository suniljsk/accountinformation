package Service;
import Repository.AccountRepository;
import com.AccountInformation.AccountInformation.AccountDTO.AccountDTO;
import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(AccountDTO accountDTO) {
        Account account=new Account();
        account.setName(accountDTO.getName());
        account.setIndustry(accountDTO.getIndustry());
        account.setRevenue(accountDTO.getRevenue());
        account.setAccountManager(accountDTO.getAccountManager());
        return accountRepository.save(account);


    }
    public Optional<Account> getAccountById(String id) {
        return accountRepository.findById(id);

    }
    public Account updateAccount(String Id,AccountDTO accountDTO) {
        Optional<Account> optionalaccount=accountRepository.findById(Id);
        if(optionalaccount.isPresent()) {
            Account account=optionalaccount.get();
            account.setName(accountDTO.getName());
            account.setIndustry(accountDTO.getIndustry());
            account.setRevenue(accountDTO.getRevenue());
            account.setAccountManager(accountDTO.getAccountManager());
            return accountRepository.save(account);
        }
        return null;
    }
    public void deleteAccount(String Id) {
        accountRepository.deleteById(Id);
    }

}
