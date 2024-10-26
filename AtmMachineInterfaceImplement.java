package atmmachine.com;

import java.util.HashMap;
import java.util.Map;

public class AtmMachineInterfaceImplement implements AtmMachine{
    ATM atm = new ATM();
    Map<Double, String> ministatement = new HashMap<Double, String>();
    @Override
    public void viewAvailableBalance() {
        System.out.println("Available Balance is: "+ atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministatement.put(withdrawAmount, "Amount Withdrawn");
                System.out.println("Please collect your cash: " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewAvailableBalance();
            } else {
                System.out.println("Insufficient Balance.");
            }
        }
        else{
            System.out.println("Please enter multiples of 500 only.");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministatement.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewAvailableBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m : ministatement.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
