Požiadavky:
• Java (https://www.java.com/en/download/)

Na spustenie programu je nutné:
1. extrahovať priečinok application zo zip súboru
2. otvoriť terminál / príkazový riadok (cmd)
3. použiť príkaz java -jar CESTA_K_SUBORU_AIXMParser.jar CESTA_K_VSTUPNEMU_XML_SUBORU 
Ukážka príkazu: java -jar C:\Desktop\application\AIXMParser.jar C:\Desktop\application\AIXMParser\data\AirportHeliport.xml

-----------------------------------------------------

Priečinok application obsahuje:
	- .jar spustiteľný súbor aplikácie,
	- priečinok config, v ktorom sa nachádza konfiguračný súbor config.txt
		Súbor config.txt obsahuje v prvom riadku rodičovský XML element a v ostatných riadkoch potomkov.
		Na správny chod programu je nutné, aby konfiguračný súbor obsahoval jeden rodičovský element a minimálne jedného potomka.
	- priečinok data, v ktorom sa nachádza príkladový vstupný XML súbor (tento priečinok nie je nutný), parameter aplikácie reprezentujúci cestu k vstupnému súboru nemusí vychádzať z priečinku data

Priečinok source_codes obsahuje:
	- src priečinok s tromi súbormi obsahujúcimi zdrojové kódy aplikácie
	- priečinok config, v ktorom sa nachádza konfiguračný súbor config.txt
		Súbor config.txt obsahuje v prvom riadku rodičovský XML element a v ostatných riadkoch potomkov.
		Na správny chod programu je nutné, aby konfiguračný súbor obsahoval jeden rodičovský element a minimálne jedného potomka.
	- priečinok data, v ktorom sa nachádza príkladový vstupný XML súbor (tento priečinok nie je nutný), parameter aplikácie reprezentujúci cestu k vstupnému súboru nemusí vychádzať z priečinku data

Súbor documentation.pdf obsahuje hlavnú dokumentáciu k aplikácií počnúc zadaním a popisom riešenia.