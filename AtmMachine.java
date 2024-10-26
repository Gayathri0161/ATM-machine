package atmmachine.com;

public interface AtmMachine {
     void viewAvailableBalance();
     void withdrawAmount(double withoutAmount);
     void depositAmount(double depositAmount);
     void viewMiniStatement();

}
