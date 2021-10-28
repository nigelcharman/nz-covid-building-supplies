# Level 4 - Public customers

As a public customer under level 4, I want to buy essential goods so that I can make some essential repairs.

## Essential goods

I can buy an essential good in stock online.

The government relies on businesses to determine which goods are essential.

Essential goods include:

* urgently required white ware and appliances: such as fridges, heaters, washing machines and dryers, vacuum cleaners, fans and dehumidifiers
* urgently required cooking, cleaning and laundry equipment
* materials for urgent home repair

Non-essential goods include:

* entertainment and hobby products: such as gaming consoles and swings

See [operating-at-alert-levels](https://www.business.govt.nz/covid-19/operating-at-alert-levels/)

### [Under AL4, I can buy a heater](-)

Given I am a [Public](- "#customerType") customer operating under Alert Level [4](- "#alertLevel")

When I attempt to buy a [heater](- "#result = canBuy(#customerType, #alertLevel, #TEXT)")

Then I am [allowed](- "?=#result") to buy it 

<!--
### [Under AL4, I can buy a heater](-)

Given I am a [Public](- "#customerType") customer operating under Alert Level [4](- "#alertLevel")

When I attempt to buy a [heater](- "#result = canBuy(#customerType, #alertLevel, #TEXT)")

Then I am [allowed](- "?=#result") to buy it
-->

## Non-essential goods

I can't buy non-essential goods.

**TBC**

## Delivery

I can only choose contactless delivery.

**TBC**
