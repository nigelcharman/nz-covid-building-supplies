package nz.govt.covid19

import java.text.SimpleDateFormat

class AlertLevelCalculator {
    def dateFormatter = new SimpleDateFormat('dd/MM/yyyy')
    private Map<Date, List<Restriction>> changes = [
            (dateFormatter.parse('01/06/2021')) : [new Restriction(Region.OTHER, AlertLevel.ONE)],
            (dateFormatter.parse('17/08/2021')) : [new Restriction(Region.OTHER, AlertLevel.FOUR)],
            (dateFormatter.parse('31/08/2021')) : [new Restriction(Region.AUCKLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.NORTHLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.OTHER, AlertLevel.THREE)],
            (dateFormatter.parse('02/09/2021')) : [new Restriction(Region.AUCKLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.OTHER, AlertLevel.THREE)],
            (dateFormatter.parse('07/09/2021')) : [new Restriction(Region.AUCKLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.OTHER, AlertLevel.TWO)],
            (dateFormatter.parse('21/09/2021')) : [new Restriction(Region.UPPER_HAURAKI, AlertLevel.THREE)],
            (dateFormatter.parse('25/09/2021')) : [new Restriction(Region.UPPER_HAURAKI, AlertLevel.TWO)]
    ]
    Locator locator

    AlertLevelCalculator(Locator locator) {
        this.locator = locator
    }
//    29/06/2021 23:59:00	NZ	Alert Level 1
//            17/08/2021 23:59:00	NZ	Alert Level 4
//            31/08/2021 23:59:00	Auckland	Alert Level 4
//            31/08/2021 23:59:00	Northland	Alert Level 4
//            31/08/2021 23:59:00	The rest of NZ	Alert Level 3
//            07/09/2021 23:59:00	The rest of NZ	Alert Level 2
//            21/09/2021 23:59:00	Auckland	Alert Level 3
//            21/09/2021 23:59:00	Upper Hauraki	Alert Level 3
//            25/09/2021 23:59:00	Upper Hauraki	Alert Level 2


    def AlertLevel calculateAlertLevel(String town, String date) {
        AlertLevel level = AlertLevel.ONE
        Region region = locator.townToRegion(town);

        for (Map.Entry change : changes) {
            if (dateFormatter.parse(date) > change.key) {
                List<Restriction> restrictions = change.value
                for (Restriction restriction : restrictions) {
                    if (region == restriction.region || restriction.region == Region.OTHER) {
                        level = restriction.alertLevel
                        break
                    }
                }
            }
        }
        return level
    }
}
