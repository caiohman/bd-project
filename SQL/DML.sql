INSERT INTO public.individuos VALUES(12345678940, 'Rafael Silva', 'SP', 'São Paulo', '20/11/1995', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES(10020045457, 'Fernanda Almeida', 'RJ', 'Petrópolis', '20/10/1950', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES(48159662125, 'Adalberto Nobre', 'MG', 'Belo Horizonte', '25/05/1980', FALSE, 'CANDIDATO');
INSERT INTO public.individuos VALUES(44755699950, 'Guilherme Oliveira', 'RS', 'Porto Alegre', '15/12/1945', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES(69756299950, 'Ariomar Neves', 'SP', 'São Carlos', '10/09/1990', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES(55359595264, 'Monica Oliveira', 'RS', 'Porto Alegre', '15/12/1995', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES(55948548660, 'Severino Campos', 'SP', 'Sorocaba', '15/12/1995', TRUE, 'EQUIPE');
INSERT INTO public.individuos VALUES(44855869454, 'Arthur Nogueira', 'BA', 'Salvador', '04/03/2000', TRUE, 'EQUIPE');
INSERT INTO public.individuos VALUES(43155165457, 'Reinaldo Lopes', 'BA', 'Salvador', '04/03/1983', TRUE, 'EQUIPE');
INSERT INTO public.individuos VALUES(54863948561, 'Eduardo Gomes', 'SP', 'São Paulo', '06/03/1983', TRUE, 'DOADOR');
INSERT INTO public.individuos VALUES(78548314591, 'Norberto Silva', 'SP', 'São Paulo', '06/07/1993', TRUE, 'DOADOR');
INSERT INTO public.individuos VALUES(69578514552, 'Elenir Neves', 'RJ', 'Rio de Janeiro', '06/03/1975', TRUE, 'DOADOR');

-- PARA TESTAR NO POSTMAN
INSERT INTO public.individuos VALUES(45000238788 , 'Oswaldo Aparecido dos Anjos' , 'MS' , 'Campo Grande', '08/09/1993' , TRUE , 'DOADOR');
INSERT INTO public.individuos VALUES(96738956700 , 'Joao Gomes da Costa' , 'MG' , 'Uberaba' , '11/06/2000', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES(23488889006 , 'Timoteo Arruda' , 'PA' , 'Belém' , '06/05/1987' , TRUE , 'CANDIDATO');
INSERT INTO public.individuos VALUES(66540022334, 'Jorge Henrique', 'BA', 'Salvador', '06/07/1998', TRUE, 'EQUIPE');
INSERT INTO public.individuos VALUES(35930211129, 'Moacir Moura', 'SP', 'São Carlos', '12/07/1985', TRUE, 'DOADOR');

INSERT INTO public.partidos VALUES('PSOL', 'Partido Socialimos e Liberdade', 'Sociedade igualitária, combater desigualdades...' );
INSERT INTO public.partidos VALUES('PDT', 'Partido Democrático Trabalhista', 'Alinhado às ideologias trabalhista, socialista democrática e social-democrata.' );
INSERT INTO public.partidos VALUES('NOVO', 'Partido Novo', 'O Partido Novo é um partido político brasileiro de direita fundado em 2011 e registrado oficialmente em 2015, similar ao Partido Libertário.' );
INSERT INTO public.partidos VALUES('PT', 'Partido Dos Trabalhadores', 'O Partido dos Trabalhadores é um partido político brasileiro. Fundado em 1980, integra um dos maiores e mais importantes movimentos...' );
INSERT INTO public.partidos VALUES('PSDB' , 'Partido Social Democrata Brasileiro' , 'O PSDB foi fundado em 25 de junho.');


INSERT INTO public.candidatos VALUES(12345678940, TRUE, 'Fernando Silva', 'PSOL');
INSERT INTO public.candidatos VALUES(10020045457, FALSE, null, 'PDT');
INSERT INTO public.candidatos VALUES(44755699950, TRUE, 'Ronaldo Costa', 'NOVO');
INSERT INTO public.candidatos VALUES(69756299950, FALSE, null, 'PT');
INSERT INTO public.candidatos VALUES(55359595264, TRUE, 'Edson Silva', 'PDT');

INSERT INTO public.candidatos VALUES(23488889006 , TRUE, 'Iara Maria' , 'PSDB');

INSERT INTO public.cargos VALUES(1, 'DEPUTADO - SP', 'ESTADO', 'SP', 94);
INSERT INTO public.cargos VALUES(2, 'PREFEITURA - PETROPOLIS', 'CIDADE', 'Petropolis', 1);
INSERT INTO public.cargos VALUES(3, 'DEPUTADO - MG', 'ESTADO', 'MG', 77);
INSERT INTO public.cargos VALUES(4, 'PRESIDENCIA DA REPUBLICA', 'FEDERACAO', 'BRASIL', 1);

INSERT INTO public.cargos VALUES(5, 'VEREADOR - PA' , 'CIDADE' , 'SP' , 55);


INSERT INTO public.candidaturas VALUES(1, 12345678940, 1, 2018, 50);
INSERT INTO public.candidaturas VALUES(2, 10020045457, 2, 2020, 10000);
INSERT INTO public.candidaturas VALUES(3, 44755699950, 3, 2018, 5000);
INSERT INTO public.candidaturas VALUES(4, 69756299950, 3, 2018, 6500);


INSERT INTO public.equipeApoio VALUES(1, 'Equipe Rafael Silva', 1);
INSERT INTO public.equipeApoio VALUES(2, 'Equipe Fernanda Almeida', 2);
INSERT INTO public.equipeApoio VALUES(3, 'Equipe Adalberto Nobre', 3);

INSERT INTO public.participantesEquipe VALUES(55948548660, 2018, 1);
INSERT INTO public.participantesEquipe VALUES(44855869454, 2018, 1);
INSERT INTO public.participantesEquipe VALUES(43155165457, 2016, 2);

INSERT INTO public.doadores VALUES(54863948561, 'Fundo de Investimentos');
INSERT INTO public.doadores VALUES(78548314591, 'CEO');
INSERT INTO public.doadores VALUES(69578514552, 'Juiz');
INSERT INTO public.doadores VALUES(35930211129, 'CTO');

INSERT INTO public.doacaoIndividuo VALUES(54863948561, 1, '08/11/2018', 300.05);
INSERT INTO public.doacaoIndividuo VALUES(78548314591, 2, '06/07/2020', 1000);
INSERT INTO public.doacaoIndividuo VALUES(69578514552, 3, '20/11/2018', 1986.50);

INSERT INTO public.empresas VALUES(19100123000110, 'Jau Supermercados', 'SP', 'São Paulo', '15/07/1995');
INSERT INTO public.empresas VALUES(15195423141109, 'Óticas Carol', 'RJ', 'Petropolis', '15/07/1998');
INSERT INTO public.empresas VALUES(18565583492119, 'Renner', 'MG', 'Belo Horizonte', '15/07/1980');

INSERT INTO public.doacaoEmpresa VALUES(19100123000110, 1, 2018, 50000);
INSERT INTO public.doacaoEmpresa VALUES(15195423141109, 3, 2020, 50000);
INSERT INTO public.doacaoEmpresa VALUES(18565583492119, 2, 2018, 50000);

INSERT INTO public.processosjudiciais VALUES(1, TRUE, FALSE, '20/11/2015', 12345678940);
INSERT INTO public.processosjudiciais VALUES(2, FALSE, TRUE, '20/11/2015', 10020045457);
INSERT INTO public.processosjudiciais VALUES(3, FALSE, FALSE, '20/11/2015', 48159662125);


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