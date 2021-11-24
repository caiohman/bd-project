-- Listagem  de  candidaturas,  considerando  ano,  nome  de  candidato
-- ou  cargo,  e  combinações destes, segundo diferentes ordenações;

-- ordenacao crescente pelo ano
SELECT ano, individuos.nome, cargos.nome
FROM Candidaturas
         FULL OUTER JOIN Individuos
                         ON Candidaturas.cpf = Individuos.cpf
         FULL OUTER JOIN Cargos
                         ON Candidaturas.idcargo = Cargos.idcargo
GROUP BY candidaturas.ano, individuos.nome, cargos.nome
HAVING individuos.nome <> 'null' AND cargos.nome <> 'null'
ORDER BY ano ASC;

-- ordenacao crescente pelo nome do candidato
SELECT individuos.nome, ano, cargos.nome
FROM Candidaturas
         FULL OUTER JOIN Individuos
                         ON Candidaturas.cpf = Individuos.cpf
         FULL OUTER JOIN Cargos
                         ON Candidaturas.idcargo = Cargos.idcargo
GROUP BY candidaturas.ano, individuos.nome, cargos.nome
HAVING individuos.nome <> 'null' AND cargos.nome <> 'null'
ORDER BY individuos.nome ASC;

-- ordenacao crescente pelo nome do cargo
SELECT individuos.nome, ano, cargos.nome
FROM Candidaturas
         FULL OUTER JOIN Individuos
                         ON Candidaturas.cpf = Individuos.cpf
         FULL OUTER JOIN Cargos
                         ON Candidaturas.idcargo = Cargos.idcargo
GROUP BY candidaturas.ano, individuos.nome, cargos.nome
HAVING individuos.nome <> 'null' AND cargos.nome <> 'null'
ORDER BY individuos.nome ASC;