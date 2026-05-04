package banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp đại diện cho một tài khoản ngân hàng.
 */
public class BankAccount {
  private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
  private double balance;

  /**
   * Khởi tạo tài khoản.
   *
   * @param initialBalance Số dư ban đầu.
   */
  public BankAccount(double initialBalance) {
    if (initialBalance < 0) {
      logger.error("Không thể khởi tạo tài khoản với số dư âm: {}", initialBalance);
      throw new IllegalArgumentException("Số dư không được âm");
    }
    this.balance = initialBalance;
    logger.info("Khởi tạo tài khoản thành công với số dư: {}", initialBalance);
  }

  /**
   * Hàm nạp tiền.
   *
   * @param amount Số tiền nạp.
   */
  public void deposit(double amount) {
    if (amount <= 0) {
      logger.warn("Cảnh báo: Nạp số tiền không hợp lệ: {}", amount);
      throw new IllegalArgumentException("Số tiền nạp phải lớn hơn 0");
    }
    this.balance += amount;
    logger.info("Nạp thành công {}. Số dư hiện tại: {}", amount, balance);
  }

  /**
   * Lấy số dư hiện tại.
   *
   * @return Số dư.
   */
  public double getBalance() {
    return balance;
  }
}