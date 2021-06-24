package generic.impl;

import generic.Account;
import generic.BaseDAO;

public class AccountDAOImpl implements BaseDAO<Account> {
    @Override
    public Account getAllItems() {
        return null;
    }

    @Override
    public boolean save(Account entity) {
        return false;
    }
}
