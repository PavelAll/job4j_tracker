package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу
 * @author Pavel Alekseev
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей банка осуществляется в коллекции типа HashMap
     * Обьект класса User - ключ, Обьекты класса Account хранятся в списке List<Account> - значения
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход клиента банка и добавляет если его не существуе в HashMap
     * и создает новую заявку, обьект класса {@link Account} и помещает его в
     * список - {@link ArrayList}
     * @param user - клиент банка
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает два параметра номер паспорта и номер счета клиента банка по которым
     * ищет в базе по номеру пасспорта, клиента. Если клиент не найден в базе HashMap то добавляет
     * его в базу.
     * @param passport - номер пасспорта клиента банка
     * @param account - номер счета клиента банка
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя банка по пришедшему в качестве параметра пасспорту
     * Получает из базы все ключи - обьекты User и в цикле foreach сравнивает пасспорт пришедший
     * на вход методу с полем passport обьеков содержащихся в базе, с помощью
     * метода getPassport() если поля равны то метод возвращает обьект найденого пользователя - User
     * @param passport - номер пасспорта клиента банка
     * @return user - обьект найденый по параметру passport
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет клиента по реквизиту и пасспорту клиена принятых как параметры
     * По пасспорту сначало находит клиента(user) и далее если метод findByPassport(passport)
     * вернул не null получает из базы users все счета по обьекту user переданному
     * в метод users.get(user) в список ArrayList и с помощью цикла foreach бежит по счетам
     * данного клиента сравнивая параметр пришедший на вход методу requisite с счетами
     * находящимися в базе users и если счет находит, то возвращает его обьект в качестве
     * возвращаемого значения метода.
     *
     * @param passport - номер пасспорта клиента
     * @param requisite - номер счета клиента
     * @return account - конкретный счет клиента, рублевый или долларовый.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит накопления между счетами клиентов или своими, для передачи денег метод
     * принимает 5 параметров, источник номер пасспорта и номер счета клиента от куда будут
     * переведенны средства и номер пасспората клиента и номер счета приемника, куда будут
     * переведены деньги. Ищется источник счета с помощью метода findByRequisite() по пасспорту
     * и реквизитам. Ищется счет на котороый будут переведены деньги, по тому же принципу что и
     * источник счета Если оба источника не null и с которого переводят баланс не больше суммы
     * запрощенного перевода, то с помощью метода setBalance() деньги списываются у источника и
     * Устанавливаются у счета приемника с помощью все того же метода setBalance().
     * Возвращаемое значение true или false, сигнализирует об успешноси операции
     *
     * @param srcPass - источник номер пасспорта клиента
     * @param srcRequ - источник номер реквезита клиента
     * @param destPass - приемник номер пасспорта клиента
     * @param destRequ - приемник номер реквезита клиента
     * @param amount - сумма которую передают от источника к приемнику
     * @return true или false - успешность операции
     */
    public boolean transferMoney(String srcPass, String srcRequ, String destPass,
                                 String destRequ, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPass, srcRequ);
        Account destAccount = findByRequisite(destPass, destRequ);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
