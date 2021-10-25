package hardwarehouse.covid

import nz.co.hardwarehouse.TradeAccountValidator

class MockTradeAccountValidator implements TradeAccountValidator {

    @Override
    boolean isValidAccount(String accountNumber, String password) {
        return (accountNumber == '1011506' && password == 'B0bTheBu!lder')
    }
}
