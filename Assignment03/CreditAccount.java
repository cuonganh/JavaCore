public class CreditAccount extends Account {

    int countWithdraw = 0;
    int feeWithdraw = 0;
    int feeWithdrawTotal = 0;
    boolean priority = true;

    @Override
    public double withdrawMoney(int money) {

        //Check money can withdraw
        if (money < totalMoney && totalMoney > 0) {

            //Check the number of withdraw is less than 4th first time
            if (countWithdraw < 4 && priority == true) {

                //withdraw with feeWithdraw = 0
                totalMoney = totalMoney - money;
                countWithdraw = countWithdraw + 1;

            } else {

                //withdraw with feeWithdraw = 2 but not sub now
                totalMoney = totalMoney - money;
                feeWithdrawTotal = feeWithdrawTotal + 2;
                countWithdraw = countWithdraw + 1;
                priority = false;

            }

        } else {

            System.out.println("Do not have enough money to withdraw");

        }
        return totalMoney;

        
    }

    //Sub feeWithdrawTotal and reset countWithdraw but not free when withdraw
    public double subFeeWithdrawTotal() {
        
        totalMoney = totalMoney - feeWithdrawTotal;
        countWithdraw = 0;
        priority = false;

        return totalMoney;
    }

}
