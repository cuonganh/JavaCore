
public class SaveAccount extends Account{
    
    final int laisuat = 1;

    
    public void afterMonths(int soKiHan){

        totalMoney = totalMoney * Math.pow((1 + laisuat/100), soKiHan);
    }

    
}
