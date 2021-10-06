package nz


import nz.govt.covid19.AlertLevelCalculator
import nz.govt.covid19.Locator
import nz.govt.covid19.Region
import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

import static org.mockito.Mockito.mock
import static org.mockito.Mockito.when

@RunWith(ConcordionRunner.class)
class BuildingSupplies {
    static locator = mock(Locator.class);

    BuildingSupplies() {
        when(locator.townToRegion('Miranda')).thenReturn(Region.UPPER_HAURAKI)
    }


    int getAlertLevel(String customerTown, String supplyDate) {
        return new AlertLevelCalculator(locator).calculateAlertLevel(customerTown, supplyDate).id;
    }
}
