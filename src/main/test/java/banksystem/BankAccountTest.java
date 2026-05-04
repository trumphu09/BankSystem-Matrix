package banksystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

  @Test
  public void testDepositSuccess() {
    BankAccount account = new BankAccount(100);
    account.deposit(50);
    // Kiểm tra xem 100 + 50 có đúng bằng 150 không
    assertEquals(150, account.getBalance()); 
  }
}