-- VUE
CREATE OR REPLACE VIEW v_kilometrage_avion AS
SELECT
    k.*, a.matricule, a.image
FROM
    avion AS a JOIN kilometrage AS k on a.id = k.idavion;


CREATE OR REPLACE VIEW v_assurance_avion AS
SELECT
    aa.*, a2.nom_assurance, a.matricule, a.image
FROM
    avion AS a JOIN assurance_avion aa on a.id = aa.idavion JOIN assurance a2 on aa.idassurance = a2.id;

CREATE OR REPLACE VIEW v_entretien_avion AS
SELECT
    ea.*, a.matricule, e.type_entretien, a.image
FROM
    avion AS a JOIN entretien_avion AS ea ON a.id = ea.idavion JOIN entretien AS e ON e.id = ea.identretien;
