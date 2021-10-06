# Supplies under COVID-19 Restrictions

New Zealand has four alert levels that specify the health and social measures to be taken to fight COVID-19. These are mandated by the [COVID-19 legislation](http://www.pco.govt.nz/covid-19-legislation/).

| Alert Level        | Risk                                |
|--------------------|-------------------------------------|
| Level 4 - Lockdown | Likely the disease is not contained |
| Level 3 - Restrict | Medium risk of community transmission - active but managed clusters |
| Level 2 - Reduce   | The disease is contained, but the risk of community transmission remains |
| Level 1 - Prepare  | The disease is contained in New Zealand |

Different parts of the country may be at different alert levels. We can move up and down alert levels.

Restrictions to supplies depend on the:

* alert levels in place (date of supply), 
* customer type (trade or public),
* customer address, and
* store address

Under the current Delta outbreak, the Alert Levels around NZ are: 

| Supply Date from    | Location       | Alert Level   | 
| ------------------- | -------------- | ------------- |
| 29/06/2021 23:59:00 | NZ             | Alert Level 1 |
| 17/08/2021 23:59:00 | NZ             | Alert Level 4 |
| 31/08/2021 23:59:00 | Auckland       | Alert Level 4 |
| 31/08/2021 23:59:00 | Northland      | Alert Level 4 |
| 31/08/2021 23:59:00 | The rest of NZ | Alert Level 3 |
| 02/09/2021 23:59:00 | Northland      | Alert Level 2 |
| 07/09/2021 23:59:00 | Auckland       | Alert Level 4 |
| 07/09/2021 23:59:00 | The rest of NZ | Alert Level 2 |
| 21/09/2021 23:59:00 | Auckland       | Alert Level 3 |
| 21/09/2021 23:59:00 | Upper Hauraki  | Alert Level 3 |
| 25/09/2021 23:59:00 | Upper Hauraki  | Alert Level 2 |

## Examples
Given I live in [Miranda](- "#customerTown"), in the Upper Hauraki region

When I attempt to order hardware supplies on the following date

Then I am subject to the Alert Level restrictions

| [ ](- "#alertLevel=getAlertLevel(#customerTown, #supplyDate)") [Supply Date](- "#supplyDate") | [Alert Level](- "?=#alertLevel")   |
| ----------- | ------------- |
| 17/08/2021  | 1 |
| 18/08/2021  | 4 |
| 31/08/2021  | 4 |
| 01/09/2021  | 3 |
| 07/09/2021  | 3 |
| 08/09/2021  | 2 |
| 21/09/2021  | 2 |
| 22/09/2021  | 3 |
| 25/09/2021  | 3 |
| 26/09/2021  | 2 |

