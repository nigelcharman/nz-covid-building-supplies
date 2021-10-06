package nz.govt.covid19

import groovy.transform.Immutable

@Immutable
class Restriction {
    Region region
    AlertLevel alertLevel
}
