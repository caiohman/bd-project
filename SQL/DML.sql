INSERT INTO public.individuos VALUES('123.456.789-40', 'Rafael Silva', 'SP', 'São Paulo', '20/11/1995',null, 'CANDIDATO');--
INSERT INTO public.individuos VALUES('100.200.454-57', 'Fernanda Almeida', 'RJ', 'Petrópolis', '20/10/1950', null, 'CANDIDATO');
INSERT INTO public.individuos VALUES('481.596.621-25', 'Adalberto Nobre', 'MG', 'Belo Horizonte', '25/05/1980', FALSE, 'CANDIDATO');
INSERT INTO public.individuos VALUES('447.556.999-50', 'Guilherme Oliveira', 'RS', 'Porto Alegre', '15/12/1945', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES('697.562.999-50', 'Ariomar Neves', 'SP', 'São Carlos', '10/09/1990', null, 'CANDIDATO');
INSERT INTO public.individuos VALUES('553.595.952-64', 'Monica Oliveira', 'RS', 'Porto Alegre', '15/12/1995', TRUE, 'CANDIDATO');
INSERT INTO public.individuos VALUES('559.485.486-60', 'Severino Campos', 'SP', 'Sorocaba', '15/12/1995', TRUE, 'EQUIPE');
INSERT INTO public.individuos VALUES('448.558.694-54', 'Arthur Nogueira', 'BA', 'Salvador', '04/03/2000', null, 'EQUIPE');
INSERT INTO public.individuos VALUES('431.551.654-57', 'Reinaldo Lopes', 'BA', 'Salvador', '04/03/1983', null, 'EQUIPE');

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

--INSERT INTO public.equipe_apoio VALUES(1, 'Equipe Rafael Silva');
--INSERT INTO public.equipe_apoio VALUES(2, 'Equipe Fernanda Almeida');
--INSERT INTO public.equipe_apoio VALUES(3, 'Equipe Adalberto Nobre');

--INSERT INTO public.participantes_equipe VALUES('559.485.486-60', 2018, 1);
--INSERT INTO public.participantes_equipe VALUES('448.558.694-54', 2018, 1);
--INSERT INTO public.participantes_equipe VALUES('431.551.654-57', 2016, 2);

INSERT INTO public.cargos VALUES(1, 'DEPUTADO - SP', 'ESTADO', 'SP', 94);
INSERT INTO public.cargos VALUES(2, 'PREFEITURA - PETROPOLIS', 'CIDADE', 'Petropolis', 1);
INSERT INTO public.cargos VALUES(3, 'DEPUTADO - MG', 'ESTADO', 'MG', 77);
INSERT INTO public.cargos VALUES(4, 'PRESIDENCIA DA REPUBLICA', 'FEDERACAO', 'BRASIL', 1);

INSERT INTO public.candidaturas VALUES(1, '123.456.789-40', 1, 2018)


