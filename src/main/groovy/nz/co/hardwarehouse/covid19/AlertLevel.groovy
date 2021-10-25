package nz.co.hardwarehouse.covid19

enum AlertLevel {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4)

    final int id

    private AlertLevel(int id) {
        this.id = id
    }
}