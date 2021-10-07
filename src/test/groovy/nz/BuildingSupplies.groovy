package nz

import nz.govt.covid19.AlertLevelCalculator
import org.concordion.api.extension.Extensions
import org.concordion.ext.inputstyle.InputStyleExtension
import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

@RunWith(ConcordionRunner.class)
@Extensions(InputStyleExtension.class)
class BuildingSupplies {

//    static locator = mock(Locator.class);
//
//    BuildingSupplies() {
//        when(locator.townToRegion('Miranda')).thenReturn(Region.UPPER_HAURAKI)
//    }

    int getAlertLevel(String customerTown, String supplyDate) {
        return new AlertLevelCalculator().calculateAlertLevel(customerTown, supplyDate).id;
    }
}
