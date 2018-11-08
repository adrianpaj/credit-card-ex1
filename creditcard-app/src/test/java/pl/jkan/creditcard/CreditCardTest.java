package pl.jkan.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void assignCreditLimitToCard() {
        CreditCard card = new CreditCard();

        card.assignLimit(2000);

        Assert.assertTrue(card.getLimit() == 2000);
    }

    @Test

    public void canBlockCreditCard() {
        CreditCard card = new CreditCard();

        card.Block();

        Assert.assertTrue(card.isBlocked());
    }
        @Test
        public void withdrawedDecreaseAvailableFounds () {
            CreditCard card = new CreditCard();

            card.assignLimit(2000);

            card.withdraw(1000);

            Assert.assertTrue(card.getCountBalance() == 1000);

        }

       @Test
        public void canGetCredit(){
        CreditCard card = new CreditCard();

        card.assignLimit(1000);
        card.newCredit(200);

        Assert.assertTrue(card.getCountBalance() == 1200);

       }

       @Test
        public void canRepay(){
        CreditCard card = new CreditCard();

        card.assignLimit(1000);
        card.newCredit(200);

           try {
               card.repay(200);
           } catch (NoEnaughtMoneyException e) {
               e.printStackTrace();
           }

        Assert.assertTrue(card.getCredit()==0&&card.getCountBalance()==1000);

       }

    }
