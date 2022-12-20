-- DONNEES DE TEST
INSERT INTO users(login, pwd) VALUES ('admin', 'admin');

INSERT INTO avion(matricule, image) VALUES
                                    ('1470_AV', 'image1'),
                                    ('1580_AVD', 'image2'),
                                    ('1247_AVH', 'image3');

INSERT INTO kilometrage(idavion, date_dep, deb_km, fin_km) VALUES
                                                               (1, '2022-12-01', 0, 15),(1, '2022-12-03', 15, 30),
                                                               (2, '2022-12-01', 0, 17),(2, '2022-12-03', 17, 45),
                                                               (3, '2022-12-01', 0, 20),(3, '2022-12-03', 20, 50);

INSERT INTO assurance(nom_assurance) VALUES
                                         ('ASSURANCE_1'),
                                         ('ASSURANCE_2'),
                                         ('ASSURANCE_3');

INSERT INTO assurance_avion(idassurance, idavion, date_fin) VALUES
                                                                (1, 1, '2023-01-12'), (2, 1, '2023-01-30'), (3, 1, '2023-02-01'),
                                                                (1, 2, '2023-01-14'), (2, 2, '2023-01-31'), (3, 2, '2023-02-10'),
                                                                (1, 3, '2023-01-15'), (2, 3, '2023-02-15'), (3, 3, '2023-02-25');

INSERT INTO entretien(type_entretien) VALUES
                                          ('pneu'),
                                          ('vidange'),
                                          ('moteur'),
                                          ('ailes');

INSERT INTO entretien_avion(idavion, identretien, date_entretien) VALUES
                                                                      (1, 2, '2022-12-15'),
                                                                      (2, 1, '2022-12-15'),
                                                                      (3, 4, '2022-12-15');


