INSERT INTO public.individuos VALUES('123.456.789-40', 'Rafael Silva', 'SP', 'São Paulo', '20/11/1995',null, 'CANDIDATO');--
INSERT INTO public.individuos VALUES('100.200.454-57', 'Fernanda Almeida', 'RJ', 'Petrópolis', '20/10/1950', null, 'CANDIDATO');
INSERT INTO public.individuos VALUES('481.596.621-25', 'Adalberto Nobre', 'MG', 'Belo Horizonte', '25/05/1980', FALSE, 'CANDIDATO');
INSERT INTO public.individuos VALUES('447.556.999-50', 'Guilherme Oliveira', 'RS', 'Porto Alegre', '15/12/1945', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES('697.562.999-50', 'Ariomar Neves', 'SP', 'São Carlos', '10/09/1990', null, 'CANDIDATO');
INSERT INTO public.individuos VALUES('553.595.952-64', 'Monica Oliveira', 'RS', 'Porto Alegre', '15/12/1995', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES('559.485.486-60', 'Severino Campos', 'SP', 'Sorocaba', '15/12/1995', TRUE, 'EQUIPE');
INSERT INTO public.individuos VALUES('448.558.694-54', 'Arthur Nogueira', 'BA', 'Salvador', '04/03/2000', null, 'EQUIPE');
INSERT INTO public.individuos VALUES('431.551.654-57', 'Reinaldo Lopes', 'BA', 'Salvador', '04/03/1983', null, 'EQUIPE');
INSERT INTO public.individuos VALUES('548.639.485-61', 'Eduardo Gomes', 'SP', 'São Paulo', '06/03/1983', TRUE, 'DOADOR');
INSERT INTO public.individuos VALUES('785.483.145-91', 'Norberto Silva', 'SP', 'São Paulo', '06/07/1993', null, 'DOADOR');
INSERT INTO public.individuos VALUES('695.785.145-52', 'Elenir Neves', 'RJ', 'Rio de Janeiro', '06/03/1975', null, 'DOADOR');


INSERT INTO public.partidos VALUES('PSOL', 'Partido Socialimos e Liberdade', 'Sociedade igualitária, combater desigualdades...' );
INSERT INTO public.partidos VALUES('PDT', 'Partido Democrático Trabalhista', 'Alinhado às ideologias trabalhista, socialista democrática e social-democrata.' );
INSERT INTO public.partidos VALUES('NOVO', 'Partido Novo', 'O Partido Novo é um partido político brasileiro de direita fundado em 2011 e registrado oficialmente em 2015, similar ao Partido Libertário.' );
INSERT INTO public.partidos VALUES('PT', 'Partido Dos Trabalhadores', 'O Partido dos Trabalhadores é um partido político brasileiro. Fundado em 1980, integra um dos maiores e mais importantes movimentos...' );

INSERT INTO public.candidatos VALUES('123.456.789-40', TRUE, 'Fernando Silva', 'PSOL');
INSERT INTO public.candidatos VALUES('100.200.454-57', FALSE, null, 'PDT');
INSERT INTO public.candidatos VALUES('481.596.621-25', FALSE, null, 'NOVO');
INSERT INTO public.candidatos VALUES('447.556.999-50', TRUE, 'Ronaldo Costa', 'NOVO');
INSERT INTO public.candidatos VALUES('697.562.999-50', FALSE, null, 'PT');
INSERT INTO public.candidatos VALUES('553.595.952-64', TRUE, 'Edson Silva', 'PDT');

INSERT INTO public.cargos VALUES(1, 'DEPUTADO - SP', 'ESTADO', 'SP', 94);
INSERT INTO public.cargos VALUES(2, 'PREFEITURA - PETROPOLIS', 'CIDADE', 'Petropolis', 1);
INSERT INTO public.cargos VALUES(3, 'DEPUTADO - MG', 'ESTADO', 'MG', 77);
INSERT INTO public.cargos VALUES(4, 'PRESIDENCIA DA REPUBLICA', 'FEDERACAO', 'BRASIL', 1);

INSERT INTO public.candidaturas VALUES(1, '123.456.789-40', 1, 2018, 50);
INSERT INTO public.candidaturas VALUES(2, '100.200.454-57', 2, 2020, 10000);
INSERT INTO public.candidaturas VALUES(3, '481.596.621-25', 3, 2018, 5000);

INSERT INTO public.equipeApoio VALUES(1, 'Equipe Rafael Silva', 1);
INSERT INTO public.equipeApoio VALUES(2, 'Equipe Fernanda Almeida', 2);
INSERT INTO public.equipeApoio VALUES(3, 'Equipe Adalberto Nobre', 3);

INSERT INTO public.participantesEquipe VALUES('559.485.486-60', 2018, 1);
INSERT INTO public.participantesEquipe VALUES('448.558.694-54', 2018, 1);
INSERT INTO public.participantesEquipe VALUES('431.551.654-57', 2016, 2);

INSERT INTO public.doadores VALUES('548.639.485-61', 'Fundo de Investimentos');
INSERT INTO public.doadores VALUES('785.483.145-91', 'CEO');
INSERT INTO public.doadores VALUES('695.785.145-52', 'Juiz');

INSERT INTO public.doadorCandidatura VALUES('548.639.485-61', 1, '08/11/2018', 300.05);
INSERT INTO public.doadorCandidatura VALUES('785.483.145-91', 2, '06/07/2020', 1000);
INSERT INTO public.doadorCandidatura VALUES('695.785.145-52', 3, '20/11/2018', 1986.50);

INSERT INTO public.empresas VALUES('19.100.123/0001-10', 'Jau Supermercados', 'SP', 'São Paulo', '15/07/1995', 1, '10/05/2018', 50000); 
INSERT INTO public.empresas VALUES('15.195.423/1411-09', 'Óticas Carol', 'RJ', 'Petropolis', '15/07/1998', 3, '10/05/2020', 50000);
INSERT INTO public.empresas VALUES('18.565.583/4921-19', 'Renner', 'MG', 'Belo Horizonte', '15/07/1980', 2, '10/05/2018', 50000);

INSERT INTO public.processosjudiciais VALUES(1, TRUE, FALSE, null, '123.456.789-40');
INSERT INTO public.processosjudiciais VALUES(2, false, TRUE, '20/11/2015', '100.200.454-57');
INSERT INTO public.processosjudiciais VALUES(3, FALSE, FALSE, null, '481.596.621-25');

