package nz.co.hardwarehouse

interface TradeAccountValidator {
    boolean isValidAccount(String accountNumber, String password);
}