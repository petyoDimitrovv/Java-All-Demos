package course.springdata.intro.service.impl;

import course.springdata.intro.dao.AccountRepository;
import course.springdata.intro.entity.Account;
import course.springdata.intro.entity.User;
import course.springdata.intro.exeption.InvalidAccountOperationException;
import course.springdata.intro.exeption.NonExistingEntityException;
import course.springdata.intro.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepo;

    @Autowired
    public void setAccountRepo(AccountRepository accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public Account createUserAccount(User user, Account account) {
        account.setId(null);
        account.setUser(user);
        user.getAccounts().add(account);
        return accountRepo.save(account);
    }

    @Override
    public void depositMoney(BigDecimal amount, Long accountId) {
        Account account = accountRepo.findById(accountId).orElseThrow(() ->
                new NonExistingEntityException(
                        String.format("Entity with ID: %d does not exist.", accountId)
                ));

        account.setBalance(account.getBalance().add(amount));

    }
//check long -> %d or %s
    @Override
    public void withdrawMoney(BigDecimal amount, Long accountId) {
        Account account = accountRepo.findById(accountId).orElseThrow(() ->
                new NonExistingEntityException(
                        String.format("Entity with ID: %d does not exist.", accountId)
                ));
        if (account.getBalance().compareTo(amount) < 0){
            throw new InvalidAccountOperationException(
                    String.format("Account with ID: %d balance(%s) is less than required withdraw (%s) ."
                            , accountId, account.getBalance(), amount)
            );
        }
        account.setBalance(account.getBalance().subtract(amount));

    }

    @Override
    public void transferMoney(BigDecimal amount, Long fromAccountID, Long toAccountID) {
        depositMoney(amount, toAccountID);
        withdrawMoney(amount, fromAccountID);

    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }
}
