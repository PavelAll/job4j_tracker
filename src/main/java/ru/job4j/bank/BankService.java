package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (accounts.size() != 0) {
            for (Account list : accounts) {
                if (!list.equals(account)) {
                    accounts.add(account);
                    break;
                }
            }
        } else {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        for (User user: users.keySet()) {
            List<Account> lists = users.get(user);
            if (user.getPassport().equals(passport)) {
                for (Account list : lists) {
                    if (list.getRequisite().equals(requisite)) {
                        return list;
                    }
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String requisite, String destPassport, String destRequisite, double amount ) {
        boolean rsl = false;
        User srcPass = findByPassport(srcPassport);
        User destPass = findByPassport(destPassport);
        if (srcPass != null && destPass != null) {
            List<Account> srcAccounts = users.get(srcPass);
            List<Account> destAccounts = users.get(destPass);
            if (srcAccounts.size() != 0 && destAccounts.size() != 0) {
                for (Account listSrc : srcAccounts) {
                    if (listSrc.getRequisite().equals(requisite) && listSrc.getBalance() >= 0) {

                        for (Account listDest : destAccounts) {
                            if (listDest.getRequisite().equals(destRequisite)) {
                                listSrc.setBalance(listSrc.getBalance() - amount);
                                listDest.setBalance(listDest.getBalance() + amount);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return rsl;
    }
}
