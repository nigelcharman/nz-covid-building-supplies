package nz.co.hardwarehouse.covid19

enum Region {
    AUCKLAND("Auckland"),
    NORTHLAND("Northland"),
    UPPER_HAURAKI("Upper Hauraki"),
    OTHER("Other")

    String description

    private Region(String description) {
        this.description = description
    }
}
