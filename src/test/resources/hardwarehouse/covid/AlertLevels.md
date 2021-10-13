# Alert Levels

Under the current Delta outbreak, the Alert Levels around NZ are: 

| Date from    | Location       | Alert Level   | 
| ------------------- | -------------- | ------------- |
| 29/06/2021 23:59:00 | NZ             | Alert Level 1 |
| 17/08/2021 23:59:00 | NZ             | Alert Level 4 |
| 31/08/2021 23:59:00 | Auckland       | Alert Level 4 |
| 31/08/2021 23:59:00 | Northland      | Alert Level 4 |
| 31/08/2021 23:59:00 | The rest of NZ | Alert Level 3 |
| 02/09/2021 23:59:00 | Northland      | Alert Level 3 |
| 07/09/2021 23:59:00 | Auckland       | Alert Level 4 |
| 07/09/2021 23:59:00 | The rest of NZ | Alert Level 2 |
| 21/09/2021 23:59:00 | Auckland       | Alert Level 3 |
| 21/09/2021 23:59:00 | Upper Hauraki  | Alert Level 3 |
| 25/09/2021 23:59:00 | Upper Hauraki  | Alert Level 2 |

## Examples

### Upper Hauraki
Given I live in the [Upper Hauraki](- "#customerRegion") region

When I attempt to order hardware supplies on the following date

Then I am subject to the Alert Level restrictions

| [ ](- "#alertLevel=getAlertLevel(#customerRegion, #supplyDate)") [Supply Date](- "#supplyDate") | [Alert Level](- "?=#alertLevel")   |
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


### On 1st September 2021

On [01/09/2021](- "#supplyDate"), given I live in the specified region then I am at alert level:

| [ ](- "#alertLevel=getAlertLevel(#customerRegion, #supplyDate)") [Customer Region](- "#customerRegion") | [Alert Level](- "?=#alertLevel")   |
| ----------- | ------------- |
| Auckland      | 4 |
| Northland     | 4 |
| Upper Hauraki | 3 |
| Wellington    | 3 |
