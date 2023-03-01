

--INSERT DATA TO COUNTRY TABLE
INSERT INTO country (country_code, name) VALUES ('ZA', 'South Africa');
INSERT INTO country (country_code, name) VALUES ('MZ', 'Mozambique');
INSERT INTO country (country_code, name) VALUES ('NA', 'Namibia');


--INSERT DATA TO PROVINCES TABLE FOR SOUTH AFRICA
INSERT INTO province (province_code, country_code, name) VALUES ('EC', 'ZA', 'Eastern Cape');
INSERT INTO province (province_code, country_code, name) VALUES ('WC', 'ZA', 'Western Cape');
INSERT INTO province (province_code, country_code, name) VALUES ('GP', 'ZA', 'Gauteng');

--INSERT DATA TO PROVINCES TABLE FOR MOZAMBIQUE
INSERT INTO province (province_code, country_code, name) VALUES ('MA', 'MZ', 'Maputo');
INSERT INTO province (province_code, country_code, name) VALUES ('NA', 'MZ', 'Nampula');
INSERT INTO province (province_code, country_code, name) VALUES ('IN', 'MZ', 'Inhambane');

--INSERT DATA TO PROVINCES TABLE FOR NAMIBIA
INSERT INTO province (province_code, country_code, name) VALUES ('CA', 'NA', 'Caprivi');
INSERT INTO province (province_code, country_code, name) VALUES ('ER', 'NA', 'Erongo');
INSERT INTO province (province_code, country_code, name) VALUES ('HA', 'NA', 'Hardap');