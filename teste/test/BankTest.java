/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import AC03.Bank;
import AC03.BankAccount;
import org.junit.Assert;
import org.junit.Test;

public class BankTest {
    @Test
    public void removeAccountNumberTest() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
        System.out.println(banco);
        banco.removeAccount(145);
        System.out.println(banco);
        Assert.assertEquals(123,banco.getAccounts().get(0).getAccountNumber());
    }

    @Test
    public void removeAccountTest() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
        System.out.println(banco);
        BankAccount conta  = new BankAccount(145,"999","Maria Clara",480.0);
        banco.removeAccount(conta);
        System.out.println(banco);
        Assert.assertEquals(123,banco.getAccounts().get(0).getAccountNumber());
    }

    @Test
    public void criarBancocomArquivoTest() {
        Bank banco = new Bank("entradas.txt");
        System.out.println(banco);
        BankAccount conta  = new BankAccount(145,"999","Maria Clara",480.0);
        System.out.println(banco);
        Assert.assertEquals(123,banco.getAccounts().get(0).getAccountNumber());
    }

    @Test
    public void criarBancoeoOrdena() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
/*
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
 */

        System.out.println(banco);
        banco.sort();
        System.out.println(banco);
        Assert.assertEquals(123,banco.getAccounts().get(0).getAccountNumber());
    }
}
