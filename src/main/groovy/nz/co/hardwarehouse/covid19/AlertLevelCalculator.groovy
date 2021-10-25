package nz.co.hardwarehouse.covid19

import java.text.SimpleDateFormat

class AlertLevelCalculator {
    def dateFormatter = new SimpleDateFormat('dd/MM/yyyy')
    private Map<Date, List<Restriction>> changes = [
            (dateFormatter.parse('29/06/2021')) : [new Restriction(Region.OTHER, AlertLevel.ONE)],
            (dateFormatter.parse('17/08/2021')) : [new Restriction(Region.OTHER, AlertLevel.FOUR)],
            (dateFormatter.parse('31/08/2021')) : [new Restriction(Region.AUCKLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.NORTHLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.OTHER, AlertLevel.THREE)],
            (dateFormatter.parse('02/09/2021')) : [new Restriction(Region.AUCKLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.OTHER, AlertLevel.THREE)],
            (dateFormatter.parse('07/09/2021')) : [new Restriction(Region.AUCKLAND, AlertLevel.FOUR),
                                                          new Restriction(Region.OTHER, AlertLevel.TWO)],
            (dateFormatter.parse('21/09/2021')) : [new Restriction(Region.AUCKLAND, AlertLevel.THREE),
                                                          new Restriction(Region.UPPER_HAURAKI, AlertLevel.THREE)],
            (dateFormatter.parse('25/09/2021')) : [new Restriction(Region.UPPER_HAURAKI, AlertLevel.TWO)]
    ]


    def AlertLevel calculateAlertLevel(String region, String date) {
        AlertLevel level = AlertLevel.ONE

        for (Map.Entry change : changes) {
            if (dateFormatter.parse(date) > change.key) {
                List<Restriction> restrictions = change.value
                for (Restriction restriction : restrictions) {
                    if (region.trim() == restriction.region.description || restriction.region == Region.OTHER) {
                        level = restriction.alertLevel
                        break
                    }
                }
            }
        }
        return level
    }
}
