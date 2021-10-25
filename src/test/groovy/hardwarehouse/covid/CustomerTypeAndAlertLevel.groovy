package hardwarehouse.covid

import nz.co.hardwarehouse.CustomerType
import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

@RunWith(ConcordionRunner.class)
class CustomerTypeAndAlertLevel {

    CustomerType getValidatedCustomerType(String customerTypeEntered, String tradeAccountNumber, String password) {
        CustomerType customerType = customerTypeEntered.toUpperCase()

        switch (customerType) {
            case CustomerType.TRADE:
                if (new MockTradeAccountValidator().isValidAccount(tradeAccountNumber, password)) {
                    return CustomerType.TRADE
                }
        }
    }
}
