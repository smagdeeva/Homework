package lesson6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Atm implements AccountService {

    private BufferedReader bufferedReader;
    private Map<Integer, Account> accounts = new HashMap<>();

    public Atm(BufferedReader bufferedReader, boolean Exist) throws IOException {
        this.bufferedReader = bufferedReader;
        if (!Exist) {
            stuffAccount();
        } else {
            readFile();
        }
    }


    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = accounts.get(accountId);
        if (account != null) {
            if (account.getAmount() >= amount) {
                account.setAmount(account.getAmount() - amount);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownAccountException(accountId);
        }

    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        if (accounts.get(accountId) != null) {
            System.out.println(accounts.get(accountId).getAmount());
        } else {
            throw new UnknownAccountException(accountId);
        }

    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = accounts.get(accountId);
        if (account != null) {
            account.setAmount(account.getAmount() + amount);
        } else {
            throw new UnknownAccountException(accountId);
        }

    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account Account1 = accounts.get(from);
        Account Account2 = accounts.get(to);
        if (Account1 != null && Account2 != null) {
            if (Account1.getAmount() >= amount) {
                Account2.setAmount(Account2.getAmount() + amount);
                Account1.setAmount(Account1.getAmount() - amount);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            if (Account1 == null) {
                throw new UnknownAccountException(from);
            } else {
                throw new UnknownAccountException(to);
            }
        }

    }

    public void readFile() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            accounts.put(id, new Account(id, arr[1], Double.parseDouble(arr[2])));
        }
    }


    public void writeFile(PrintWriter printWriter) {
        for (Integer id : accounts.keySet()) {
            printWriter.println(accounts.get(id));
        }
    }


    private void stuffAccount() {
        for (int i = 0; i < 10; i++) {
            Account account = new Account(i + 1, "Holder №" + (i + 1), Math.round(Math.random() * 100));
            accounts.put(i + 1, account);
        }
    }


}
